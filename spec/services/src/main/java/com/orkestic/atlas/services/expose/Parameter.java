package com.orkestic.atlas.services.expose;

import jakarta.json.bind.annotation.JsonbTransient;
import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;

/**
 *
 * @author gbran
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parameter", propOrder = {
    "value"
})
public class Parameter implements Serializable {

    private final static long serialVersionUID = 1L;

    @XmlValue
    protected String value;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "mask")
    protected String mask;
    @XmlAttribute(name = "index")
    protected Integer index;
    @XmlAttribute(name = "sensitive")
    protected Boolean sensitive;
    @XmlAttribute(name = "loggable")
    protected Boolean loggable;

    public Parameter() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @JsonbTransient
    public Boolean isSetValue() {
        return (this.value != null);
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @JsonbTransient
    public Boolean isSetName() {
        return (this.name != null);
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    @JsonbTransient
    public Boolean isSetType() {
        return (this.type != null);
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String value) {
        this.mode = value;
    }

    @JsonbTransient
    public Boolean isSetMode() {
        return (this.mode != null);
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String value) {
        this.mask = value;
    }

    @JsonbTransient
    public Boolean isSetMask() {
        return (this.mask != null);
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer value) {
        this.index = value;
    }

    @JsonbTransient
    public Boolean isSetIndex() {
        return (this.index != null);
    }

    public void unsetIndex() {
        this.index = null;
    }

    public Boolean isSensitive() {
        return sensitive;
    }

    public void setSensitive(Boolean value) {
        this.sensitive = value;
    }

    @JsonbTransient
    public Boolean isSetSensitive() {
        return (this.sensitive != null);
    }

    public void unsetSensitive() {
        this.sensitive = null;
    }

    public Boolean isLoggable() {
        return loggable;
    }

    public void setLoggable(Boolean value) {
        this.loggable = value;
    }

    @JsonbTransient
    public Boolean isSetLoggable() {
        return (this.loggable != null);
    }

    public void unsetLoggable() {
        this.loggable = null;
    }

}
