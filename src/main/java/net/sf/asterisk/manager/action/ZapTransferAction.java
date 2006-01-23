/*
 * Copyright  2004-2005 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package net.sf.asterisk.manager.action;

/**
 * The ZapTransferAction transfers a zap channel.
 * 
 * @author srt
 * @version $Id: ZapTransferAction.java,v 1.3 2005/07/16 13:19:33 srt Exp $
 */
public class ZapTransferAction extends AbstractManagerAction
{
    /**
     * Serializable version identifier
     */
    private static final long serialVersionUID = -2802091639000800786L;
    private Integer zapChannel;

    /**
     * Returns the name of this action, i.e. "ZapTransfer".
     */
    public String getAction()
    {
        return "ZapTransfer";
    }

    /**
     * Returns the number of the zap channel to transfer.
     */
    public Integer getZapChannel()
    {
        return zapChannel;
    }

    /**
     * Sets the number of the zap channel to transfer.<br>
     * This property is mandatory.
     */
    public void setZapChannel(Integer channel)
    {
        this.zapChannel = channel;
    }
}