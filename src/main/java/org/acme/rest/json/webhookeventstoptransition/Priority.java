
package org.acme.rest.json.webhookeventstoptransition;

import java.util.HashMap;
import java.util.Map;

public class Priority {

    private String self;
    private String iconUrl;
    private String name;
    private String id;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Priority{" +
                "self='" + self + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
