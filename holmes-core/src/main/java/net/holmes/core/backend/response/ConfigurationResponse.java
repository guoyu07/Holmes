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
package net.holmes.core.backend.response;

public class ConfigurationResponse {
    private String serverName;
    private Integer httpServerPort;
    private Boolean prependPodcastItem;

    public ConfigurationResponse(String serverName, Integer httpServerPort, Boolean prependPodcastItem) {
        super();
        this.serverName = serverName;
        this.httpServerPort = httpServerPort;
        this.prependPodcastItem = prependPodcastItem;
    }

    public String getServerName() {
        return serverName;
    }

    public Integer getHttpServerPort() {
        return httpServerPort;
    }

    public Boolean getPrependPodcastItem() {
        return prependPodcastItem;
    }
}
