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
package net.holmes.core.media.node;

import net.holmes.core.util.mimetype.MimeType;

public final class ContentNode extends AbstractNode {
    private MimeType mimeType;
    private Long size;
    private String path;
    private String resolution;

    public ContentNode() {
        type = NodeType.TYPE_CONTENT;
    }

    public MimeType getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(MimeType mimeType) {
        this.mimeType = mimeType;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ContentNode [mimeType=");
        builder.append(mimeType);
        builder.append(", size=");
        builder.append(size);
        builder.append(", path=");
        builder.append(path);
        builder.append(", resolution=");
        builder.append(resolution);
        builder.append(", id=");
        builder.append(id);
        builder.append(", parentId=");
        builder.append(parentId);
        builder.append(", name=");
        builder.append(name);
        builder.append(", modifedDate=");
        builder.append(modifedDate);
        builder.append(", type=");
        builder.append(type);
        builder.append(", iconUrl=");
        builder.append(iconUrl);
        builder.append("]");
        return builder.toString();
    }
}
