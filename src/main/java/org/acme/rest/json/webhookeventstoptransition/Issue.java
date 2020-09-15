
package org.acme.rest.json.webhookeventstoptransition;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Issue {

    private Integer issueId;
    private String id;
    private String self;
    private String key;
    private Fields fields;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "ISSUE_FIELDS",
            joinColumns = @JoinColumn(name = "ISSUE_ID"),
            inverseJoinColumns = @JoinColumn(name = "FIELDS_ID"))
    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
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
        return "Issue{" +
                "id='" + id + '\'' +
                ", self='" + self + '\'' +
                ", key='" + key + '\'' +
                ", fields=" + fields +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
