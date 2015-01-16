/*
 * (C) Copyright 2014 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Thibaud arguillere
 */
package org.nuxeo.cm.demo;

/**
 * @since 7.1
 */
public class MiscUtils {

    public static int randomInt(int inMin, int inMax) {
        return inMin + (int) (Math.random() * ((inMax - inMin) + 1));
    }
    
    /**
     * Utility which uses <code>info()</code> if the INFO log level is enabled,
     * else log as <code>warn()</code>
     *
     * @param inLog
     * @param inWhat
     *
     * @since TODO
     */
    public static void forceLogInfo(org.apache.commons.logging.Log inLog, String inWhat) {
        if (inLog.isInfoEnabled()) {
            inLog.info(inWhat);
        } else {
            inLog.warn(inWhat);
        }
    }
}
