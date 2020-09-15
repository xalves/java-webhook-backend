
package org.acme.rest.json.webhookeventstoptransition;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Status {

    private Integer statusId;
    private String self;
    private String description;
    private String iconUrl;
    private String name;
    private String id;
    private StatusCategory statusCategory;
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "STATUS_STATUSCATEGORY",
            joinColumns = @JoinColumn(name = "STATUS_ID"),
            inverseJoinColumns = @JoinColumn(name = "STATUSCATEGORY_ID"))
    public StatusCategory getStatusCategory() {
        return statusCategory;
    }

    public void setStatusCategory(StatusCategory statusCategory) {
        this.statusCategory = statusCategory;
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
