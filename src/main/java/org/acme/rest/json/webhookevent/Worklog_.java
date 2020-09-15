
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.Map;

public class Worklog_ {

    private String self;
    private Author__ author;
    private UpdateAuthor_ updateAuthor;
    private String comment;
    private String created;
    private String updated;
    private String started;
    private String timeSpent;
    private Integer timeSpentSeconds;
    private String id;
    private String issueId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Author__ getAuthor() {
        return author;
    }

    public void setAuthor(Author__ author) {
        this.author = author;
    }

    public UpdateAuthor_ getUpdateAuthor() {
        return updateAuthor;
    }

    public void setUpdateAuthor(UpdateAuthor_ updateAuthor) {
        this.updateAuthor = updateAuthor;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getStarted() {
        return started;
    }

    public void setStarted(String started) {
        this.started = started;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Integer getTimeSpentSeconds() {
        return timeSpentSeconds;
    }

    public void setTimeSpentSeconds(Integer timeSpentSeconds) {
        this.timeSpentSeconds = timeSpentSeconds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Worklog_{" +
                "self='" + self + '\'' +
                ", author=" + author +
                ", updateAuthor=" + updateAuthor +
                ", comment='" + comment + '\'' +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                ", started='" + started + '\'' +
                ", timeSpent='" + timeSpent + '\'' +
                ", timeSpentSeconds=" + timeSpentSeconds +
                ", id='" + id + '\'' +
                ", issueId='" + issueId + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
