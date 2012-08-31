/*******************************************************************************
 * Copyright 2012 Technology Blueprint Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.co.techblue.docusign.client.exception;

/**
 * The Class ServiceInitException.
 */
public class ServiceInitException extends DocuSignException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4361409894420782726L;

    /**
     * Instantiates a new service init exception.
     * 
     * @param message
     *            the message
     */
    public ServiceInitException(String message) {
        super(message);
    }

    /**
     * Instantiates a new service init exception.
     * 
     * @param throwable
     *            the throwable
     */
    public ServiceInitException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Instantiates a new service init exception.
     * 
     * @param message
     *            the message
     * @param throwable
     *            the throwable
     */
    public ServiceInitException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
