
package org.acme.rest.json.webhookeventstoptransition;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class WebhookEventStopTransition {

    private Transition transition;
    private String comment;
    private User user;
    private Issue issue;
    private long timestamp;
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "WEBHOOKEVENTSTOPTRANSITION_TRANSITION",
            joinColumns = @JoinColumn(name = "WEBHOOKEVENTSTOPTRANSITION_ID"),
            inverseJoinColumns = @JoinColumn(name = "TRANSITION_ID"))
    public Transition getTransition() {
        return transition;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "WEBHOOKEVENTSTOPTRANSITION_USER",
            joinColumns = @JoinColumn(name = "WEBHOOKEVENTSTOPTRANSITION_ID"),
            inverseJoinColumns = @JoinColumn(name = "USER_ID"))
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "WEBHOOKEVENTSTOPTRANSITION_ISSUE",
            joinColumns = @JoinColumn(name = "WEBHOOKEVENTSTOPTRANSITION_ID"),
            inverseJoinColumns = @JoinColumn(name = "ISSUE_ID"))
    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    @Id
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
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
        return "WebhookEventStopTransition{" +
                "transition=" + transition +
                ", comment='" + comment + '\'' +
                ", user=" + user +
                ", issue=" + issue +
                ", timestamp=" + timestamp +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
