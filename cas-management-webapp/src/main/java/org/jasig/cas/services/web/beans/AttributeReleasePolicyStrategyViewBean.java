/*
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.cas.services.web.beans;

/**
 * The attribute release strategy used for views.
 * @author Misagh Moayyed
 * @since 4.1
 */
public class AttributeReleasePolicyStrategyViewBean {

    /**
     * The enum Types.
     */
    public enum Types {
        /** Refuse type. */
        ALL("all"),

        /** Mapped type. */
        MAPPED("mapped"),

        /** None type. */
        NONE("none"),

        /** Allow type. */
        ALLOWED("allowed");

        private final String value;

        /**
         * Instantiates a new Types.
         *
         * @param value the value
         */
        Types(final String value) {
            this.value = value;
        }
    }

    private String type;

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
