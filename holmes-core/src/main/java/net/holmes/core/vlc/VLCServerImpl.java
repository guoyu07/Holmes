/**
* Copyright (c) 2012 Cedric Cheneau
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
*/
package net.holmes.core.vlc;

import java.io.UnsupportedEncodingException;

import net.holmes.core.configuration.IConfiguration;
import net.holmes.core.model.AbstractNode;
import net.holmes.core.model.ContentNode;
import net.holmes.core.service.IMediaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.manager.MediaManager;

import com.google.inject.Inject;

/**
 * The Class VlcServerImpl.
 */
public class VLCServerImpl implements IVLCServer
{
    /** The logger. */
    private static Logger logger = LoggerFactory.getLogger(VLCServerImpl.class);

    /** The media manager. */
    private MediaManager mediaManager = null;

    /** The media player factory. */
    private MediaPlayerFactory mediaPlayerFactory = null;

    /** The configuration. */
    @Inject
    private IConfiguration configuration;

    /** The media service. */
    @Inject
    private IMediaService mediaService;

    /* (non-Javadoc)
     * @see net.holmes.core.common.IServer#init()
     */
    @Override
    public void init()
    {
        if (configuration.getConfig().isVlcEnabled())
        {
            // Initializes VLC media server
            System.setProperty("jna.library.path", configuration.getConfig().getVlcPath());
            System.setProperty("vlcj.log", "DEBUG");
            String[] vlcArgs = { "--rtsp-port=" + configuration.getConfig().getStreamingPort() };

            mediaPlayerFactory = new MediaPlayerFactory(vlcArgs);
            mediaManager = mediaPlayerFactory.newMediaManager();

            // Add medias to VLC
            if (mediaService.getNodeIds() != null)
            {
                for (String nodeId : mediaService.getNodeIds())
                {
                    addMedia(nodeId);
                }
            }

            // Add listener to mediaService
            mediaService.addAddContentNodeListener(new AddNodeListener(this));
        }
    }

    /* (non-Javadoc)
     * @see net.holmes.core.common.IServer#start()
     */
    @Override
    public void start()
    {
    }

    /* (non-Javadoc)
     * @see net.holmes.core.common.IServer#stop()
     */
    @Override
    public void stop()
    {
        if (mediaManager != null) mediaManager.release();
        if (mediaPlayerFactory != null) mediaPlayerFactory.release();
    }

    /* (non-Javadoc)
     * @see net.holmes.core.common.IServer#restart()
     */
    @Override
    public void restart()
    {
        stop();
        start();
    }

    /* (non-Javadoc)
     * @see net.holmes.core.common.IServer#status()
     */
    @Override
    public boolean status()
    {
        if (configuration.getConfig().isVlcEnabled())
        {
            return mediaManager != null;
        }
        else
        {
            return true;
        }
    }

    /* (non-Javadoc)
     * @see net.holmes.core.vlc.IVlcServer#addMedia(java.lang.String)
     */
    @Override
    public void addMedia(String nodeId)
    {
        if (configuration.getConfig().isVlcEnabled())
        {
            AbstractNode node = mediaService.getNode(nodeId);
            if (mediaManager != null && node != null && node instanceof ContentNode)
            {
                ContentNode contentNode = (ContentNode) node;
                if (contentNode.getContentType().isVideo())
                {
                    if (logger.isDebugEnabled()) logger.debug("addMedia " + nodeId + " " + contentNode.getPath());

                    try
                    {
                        String mrl = new String(contentNode.getPath().getBytes("UTF-8"), "ISO-8859-1");
                        mediaManager.addVideoOnDemand(nodeId, mrl, true, null);
                    }
                    catch (UnsupportedEncodingException e)
                    {
                        logger.error(e.getMessage(), e);
                    }
                }
            }
        }
    }
}
