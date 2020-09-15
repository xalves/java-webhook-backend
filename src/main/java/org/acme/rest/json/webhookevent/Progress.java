
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.Map;

public class Progress {

    private Integer progress;
    private Integer total;
    private Integer percent;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Progress{" +
                "progress=" + progress +
                ", total=" + total +
                ", percent=" + percent +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
