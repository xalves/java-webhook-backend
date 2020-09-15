
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.Map;

public class Attachment {

    private String self;
    private String id;
    private String filename;
    private Author author;
    private String created;
    private Integer size;
    private String mimeType;
    private String content;
    private String thumbnail;
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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "self='" + self + '\'' +
                ", id='" + id + '\'' +
                ", filename='" + filename + '\'' +
                ", author=" + author +
                ", created='" + created + '\'' +
                ", size=" + size +
                ", mimeType='" + mimeType + '\'' +
                ", content='" + content + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
