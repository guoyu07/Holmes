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
package net.holmes.core;

import net.holmes.core.configuration.IConfiguration;
import net.holmes.core.configuration.XmlConfigurationImpl;
import net.holmes.core.model.ContentTypeFactoryImpl;
import net.holmes.core.model.IContentTypeFactory;
import net.holmes.core.service.IMediaService;
import net.holmes.core.service.MediaServiceImpl;
import net.holmes.core.service.dao.IMediaDao;
import net.holmes.core.service.dao.XmlMediaDaoImpl;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * The Class TestModule.
 */
public class TestModule extends AbstractModule
{

    /* (non-Javadoc)
     * @see com.google.inject.AbstractModule#configure()
     */
    @Override
    protected void configure()
    {
        bind(IConfiguration.class).to(XmlConfigurationImpl.class).in(Singleton.class);

        bind(IMediaService.class).to(MediaServiceImpl.class).in(Singleton.class);
        bind(IMediaDao.class).to(XmlMediaDaoImpl.class).in(Singleton.class);

        bind(IContentTypeFactory.class).to(ContentTypeFactoryImpl.class).in(Singleton.class);

    }

}
