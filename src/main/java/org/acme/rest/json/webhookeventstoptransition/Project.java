
package org.acme.rest.json.webhookeventstoptransition;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Project {

    private Integer projectId;
    private String self;
    private String id;
    private String key;
    private String name;
    private AvatarUrls avatarUrls;
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "PROJECT_AVATARURLS",
            joinColumns = @JoinColumn(name = "PROJECT_ID"),
            inverseJoinColumns = @JoinColumn(name = "AVATARURLS_ID"))
    public AvatarUrls getAvatarUrls() {
        return avatarUrls;
    }

    public void setAvatarUrls(AvatarUrls avatarUrls) {
        this.avatarUrls = avatarUrls;
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
        return "Project{" +
                "self='" + self + '\'' +
                ", id='" + id + '\'' +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", avatarUrls=" + avatarUrls +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
