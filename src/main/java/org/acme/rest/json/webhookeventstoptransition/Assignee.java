
package org.acme.rest.json.webhookeventstoptransition;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Assignee {

    private Integer id;
    private String self;
    private String name;
    private String key;
    private String emailAddress;
    private AvatarUrls avatarUrls;
    private String displayName;
    private Boolean active;
    private String timeZone;
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "ASSIGNEE_AVATARURLS",
            joinColumns = @JoinColumn(name = "ASSIGNEE_ID"),
            inverseJoinColumns = @JoinColumn(name = "AVATARURLS_ID"))
    public AvatarUrls getAvatarUrls() {
        return avatarUrls;
    }

    public void setAvatarUrls(AvatarUrls avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
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
        return "Assignee{" +
                "self='" + self + '\'' +
                ", name='" + name + '\'' +
                ", key='" + key + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", avatarUrls=" + avatarUrls +
                ", displayName='" + displayName + '\'' +
                ", active=" + active +
                ", timeZone='" + timeZone + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
