
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.Map;

public class UpdateAuthor_ {

    private String self;
    private String name;
    private String key;
    private String emailAddress;
    private AvatarUrls________ avatarUrls;
    private String displayName;
    private Boolean active;
    private String timeZone;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public AvatarUrls________ getAvatarUrls() {
        return avatarUrls;
    }

    public void setAvatarUrls(AvatarUrls________ avatarUrls) {
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "UpdateAuthor_{" +
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
