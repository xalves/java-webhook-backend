
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Comment {

    private List<Comment_> comments = null;
    private Integer maxResults;
    private Integer total;
    private Integer startAt;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Comment_> getComments() {
        return comments;
    }

    public void setComments(List<Comment_> comments) {
        this.comments = comments;
    }

    public Integer getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getStartAt() {
        return startAt;
    }

    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comments=" + comments +
                ", maxResults=" + maxResults +
                ", total=" + total +
                ", startAt=" + startAt +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
