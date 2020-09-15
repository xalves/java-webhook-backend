
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.Map;

public class Status {

    private String self;
    private String description;
    private String iconUrl;
    private String name;
    private String id;
    private StatusCategory statusCategory;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StatusCategory getStatusCategory() {
        return statusCategory;
    }

    public void setStatusCategory(StatusCategory statusCategory) {
        this.statusCategory = statusCategory;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Status{" +
                "self='" + self + '\'' +
                ", description='" + description + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", statusCategory=" + statusCategory +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
