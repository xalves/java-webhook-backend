
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.Map;

public class Comment_ {

    private String self;
    private String id;
    private Author_ author;
    private String body;
    private UpdateAuthor updateAuthor;
    private String created;
    private String updated;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Author_ getAuthor() {
        return author;
    }

    public void setAuthor(Author_ author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public UpdateAuthor getUpdateAuthor() {
        return updateAuthor;
    }

    public void setUpdateAuthor(UpdateAuthor updateAuthor) {
        this.updateAuthor = updateAuthor;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Comment_{" +
                "self='" + self + '\'' +
                ", id='" + id + '\'' +
                ", author=" + author +
                ", body='" + body + '\'' +
                ", updateAuthor=" + updateAuthor +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
