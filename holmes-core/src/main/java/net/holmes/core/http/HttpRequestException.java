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
package net.holmes.core.http;

import org.jboss.netty.handler.codec.http.HttpResponseStatus;

public final class HttpRequestException extends Exception {
    private static final long serialVersionUID = 1022835130881123877L;

    private HttpResponseStatus status;

    public HttpRequestException(String message, HttpResponseStatus status) {
        super(message);
        this.status = status;
    }

    public HttpResponseStatus getStatus() {
        return status;
    }
}
