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
package net.holmes.core.media.dao;

import java.util.Set;

import net.holmes.core.model.AbstractNode;

/**
 * The Interface IMediaDao.
 */
public interface IMediaDao
{

    /**
     * Gets the node.
     *
     * @param nodeId the node id
     * @return the node
     */
    public abstract AbstractNode getNode(String nodeId);

    /**
     * Adds the node.
     *
     * @param node the node
     */
    public abstract void addNode(AbstractNode node);

    /**
     * Removes the node.
     *
     * @param nodeId the node id
     */
    public abstract void removeNode(String nodeId);

    /**
     * Gets the node ids.
     *
     * @return the node ids
     */
    public abstract Set<String> getNodeIds();

    /**
     * Flush.
     */
    public abstract void flush();

    /**
     * Adds the child node.
     *
     * @param containerNodeId the container node id
     * @param childNodeId the child node id
     */
    public abstract void addChildNode(String containerNodeId, String childNodeId);

    /**
     * Removes the child node.
     *
     * @param containerNodeId the container node id
     * @param childNodeId the child node id
     */
    public abstract void removeChildNode(String containerNodeId, String childNodeId);

    /**
     * Update node modified date.
     *
     * @param nodeId the node id
     * @param date the date
     */
    public abstract void updateNodeModifiedDate(String nodeId, String date);
}