
package org.acme.rest.json.webhookevent;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class Changelog {

    private Integer changelogId;
    private String id;
    @Transient
    private List<Item> items = null;
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getChangelogId() {
        return changelogId;
    }

    public void setChangelogId(Integer changelogId) {
        this.changelogId = changelogId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Transient
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
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
        return "Changelog{" +
                "id='" + id + '\'' +
                ", items=" + items +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
