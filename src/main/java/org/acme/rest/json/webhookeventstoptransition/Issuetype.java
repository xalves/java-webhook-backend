
package org.acme.rest.json.webhookeventstoptransition;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Issuetype {

    private Integer Issuetype;
    private String self;
    private String id;
    private String description;
    private String iconUrl;
    private String name;
    private Boolean subtask;
    private Integer avatarId;
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getIssuetype() {
        return Issuetype;
    }

    public void setIssuetype(Integer issuetype) {
        Issuetype = issuetype;
    }

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

    public Boolean getSubtask() {
        return subtask;
    }

    public void setSubtask(Boolean subtask) {
        this.subtask = subtask;
    }

    public Integer getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(Integer avatarId) {
        this.avatarId = avatarId;
    }

    @Transient
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Issuetype{" +
                "self='" + self + '\'' +
                ", id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", name='" + name + '\'' +
                ", subtask=" + subtask +
                ", avatarId=" + avatarId +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
