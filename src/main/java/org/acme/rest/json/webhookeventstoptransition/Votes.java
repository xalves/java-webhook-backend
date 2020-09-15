
package org.acme.rest.json.webhookeventstoptransition;

import java.util.HashMap;
import java.util.Map;

public class Votes {

    private String self;
    private Integer votes;
    private Boolean hasVoted;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public Boolean getHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(Boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Votes{" +
                "self='" + self + '\'' +
                ", votes=" + votes +
                ", hasVoted=" + hasVoted +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
