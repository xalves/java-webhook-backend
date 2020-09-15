
package org.acme.rest.json.webhookevent;

import org.acme.rest.json.webhookeventstoptransition.Issue;
import org.acme.rest.json.webhookeventstoptransition.User;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class WebhookEvent {

    private long timestamp;
    private String webhookEvent;
    private String issueEventTypeName;
    private User user;
    private Issue issue;
    private Changelog changelog;
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Id
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getWebhookEvent() {
        return webhookEvent;
    }

    public void setWebhookEvent(String webhookEvent) {
        this.webhookEvent = webhookEvent;
    }

    public String getIssueEventTypeName() {
        return issueEventTypeName;
    }

    public void setIssueEventTypeName(String issueEventTypeName) {
        this.issueEventTypeName = issueEventTypeName;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "WEBHOOKEVENT_USER",
            joinColumns = @JoinColumn(name = "WEBHOOKEVENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "USER_ID"))
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "WEBHOOKEVENT_ISSUE",
            joinColumns = @JoinColumn(name = "WEBHOOKEVENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "ISSUE_ID"))
    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "WEBHOOKEVENT_CHANGELOG",
            joinColumns = @JoinColumn(name = "WEBHOOKEVENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CHANGELOG_ID"))
    public Changelog getChangelog() {
        return changelog;
    }

    public void setChangelog(Changelog changelog) {
        this.changelog = changelog;
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
        return "WebhookEvent{" +
                "timestamp=" + timestamp +
                ", webhookEvent='" + webhookEvent + '\'' +
                ", issueEventTypeName='" + issueEventTypeName + '\'' +
                ", user=" + user +
                ", issue=" + issue +
                ", changelog=" + changelog +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
