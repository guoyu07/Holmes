/**
* Copyright (C) 2012  Cedric Cheneau
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package net.holmes.core.test;

import javax.inject.Inject;

import junit.framework.TestCase;
import net.holmes.core.TestModule;
import net.holmes.core.util.mimetype.IMimeTypeFactory;
import net.holmes.core.util.mimetype.MimeType;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MimeTypeTest extends TestCase {
    private static final Logger logger = LoggerFactory.getLogger(MimeTypeTest.class);

    @Inject
    private IMimeTypeFactory mimeTypeFactory;

    @Override
    @Before
    public void setUp() {
        Injector injector = Guice.createInjector(new TestModule());
        injector.injectMembers(this);
    }

    /**
     * Test mime type.
     */
    @Test
    public void testMimeType() {
        try {
            String fileName = "movie.avi";

            MimeType mimeType = mimeTypeFactory.getMimeType(fileName);

            assertNotNull(mimeType);
            logger.debug(mimeType.toString());
            assertEquals("video", mimeType.getType());
            assertEquals("video/x-msvideo", mimeType.getMimeType());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
     * Test wrong mime type.
     */
    @Test
    public void testWrongMimeType() {
        try {
            String fileName = "movie.blabla";

            MimeType mimeType = mimeTypeFactory.getMimeType(fileName);

            assertNull(mimeType);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
