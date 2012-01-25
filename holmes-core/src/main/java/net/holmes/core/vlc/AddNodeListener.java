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

import net.holmes.core.common.INodeListener;

/**
 * The listener interface for receiving addNode events.
 * The class that is interested in processing a addNode
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addAddNodeListener<code> method. When
 * the addNode event occurs, that object's appropriate
 * method is invoked.
 *
 * @see AddNodeEvent
 */
public class AddNodeListener implements INodeListener
{

    /** The vlc server. */
    IVLCServer vlcServer;

    /**
     * Instantiates a new adds the node listener.
     *
     * @param vlcServer the vlc server
     */
    public AddNodeListener(IVLCServer vlcServer)
    {
        this.vlcServer = vlcServer;
    }

    /* (non-Javadoc)
     * @see net.holmes.core.common.IListener#actionPerformed(java.lang.String)
     */
    @Override
    public void actionPerformed(String nodeId)
    {
        vlcServer.addMedia(nodeId);
    }

}
