
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.Map;

public class Resolution {

    private String self;
    private String id;
    private String description;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Resolution{" +
                "self='" + self + '\'' +
                ", id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
