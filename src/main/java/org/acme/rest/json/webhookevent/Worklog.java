
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Worklog {

    private Integer startAt;
    private Integer maxResults;
    private Integer total;
    private List<Worklog_> worklogs = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getStartAt() {
        return startAt;
    }

    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
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

    public List<Worklog_> getWorklogs() {
        return worklogs;
    }

    public void setWorklogs(List<Worklog_> worklogs) {
        this.worklogs = worklogs;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Worklog{" +
                "startAt=" + startAt +
                ", maxResults=" + maxResults +
                ", total=" + total +
                ", worklogs=" + worklogs +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
