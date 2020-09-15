
package org.acme.rest.json.webhookeventstoptransition;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;
import java.util.Map;

@Entity
public class StatusCategory {

    private Integer statusCategoryId;
    private String self;
    private Integer id;
    private String key;
    private String colorName;
    private String name;
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getStatusCategoryId() {
        return statusCategoryId;
    }

    public void setStatusCategoryId(Integer statusCategoryId) {
        this.statusCategoryId = statusCategoryId;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "StatusCategory{" +
                "self='" + self + '\'' +
                ", id=" + id +
                ", key='" + key + '\'' +
                ", colorName='" + colorName + '\'' +
                ", name='" + name + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
