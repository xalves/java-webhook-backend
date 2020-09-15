
package org.acme.rest.json.webhookeventstoptransition;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class AvatarUrls {

    private Integer id;
    private String size_48x48;
    private String size_24x24;
    private String size_16x16;
    private String size_32x32;
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Column(name = "size_48x48")
    public String get48x48() {
        return size_48x48;
    }

    public void set48x48(String _48x48) {
        this.size_48x48 = _48x48;
    }

    @Column(name = "size_24x24")
    public String get24x24() {
        return size_24x24;
    }

    public void set24x24(String _24x24) {
        this.size_24x24 = _24x24;
    }

    @Column(name = "size_16x16")
    public String get16x16() {
        return size_16x16;
    }

    public void set16x16(String _16x16) {
        this.size_16x16 = _16x16;
    }

    @Column(name = "size_32x32")
    public String get32x32() {
        return size_32x32;
    }

    public void set32x32(String _32x32) {
        this.size_32x32 = _32x32;
    }

    @Transient
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AvatarUrls{" +
                "_48x48='" + size_48x48 + '\'' +
                ", _24x24='" + size_24x24 + '\'' +
                ", _16x16='" + size_16x16 + '\'' +
                ", _32x32='" + size_32x32 + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
