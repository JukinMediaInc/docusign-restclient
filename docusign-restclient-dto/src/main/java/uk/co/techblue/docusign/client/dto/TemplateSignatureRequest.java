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
package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The class to send data for signature request via template.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class TemplateSignatureRequest extends SignatureRequest {
    
    /** The template id. */
    @JsonProperty("templateId")
    private String templateId;

    /** The template roles. */
    @JsonProperty("templateRoles")
    private List<TemplateRole> templateRoles;


    /**
     * Gets the template roles.
     * 
     * @return the template roles
     */
    public List<TemplateRole> getTemplateRoles() {
        return templateRoles;
    }

    /**
     * Sets the template roles.
     * 
     * @param templateRoles
     *            the new template roles
     */
    public void setTemplateRoles(List<TemplateRole> templateRoles) {
        this.templateRoles = templateRoles;
    }

    /**
     * Gets the template id.
     * 
     * @return the template id
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the template id.
     * 
     * @param templateId
     *            the new template id
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
}
