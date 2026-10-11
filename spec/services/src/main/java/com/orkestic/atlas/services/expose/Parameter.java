package com.orkestic.atlas.services.expose;

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

    public boolean isSetValue() {
        return (this.value != null);
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name != null);
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type != null);
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String value) {
        this.mode = value;
    }

    public boolean isSetMode() {
        return (this.mode != null);
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String value) {
        this.mask = value;
    }

    public boolean isSetMask() {
        return (this.mask != null);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int value) {
        this.index = value;
    }

    public boolean isSetIndex() {
        return (this.index != null);
    }

    public void unsetIndex() {
        this.index = null;
    }

    public boolean isSensitive() {
        return sensitive;
    }

    public void setSensitive(boolean value) {
        this.sensitive = value;
    }

    public boolean isSetSensitive() {
        return (this.sensitive != null);
    }

    public void unsetSensitive() {
        this.sensitive = null;
    }

    public boolean isLoggable() {
        return loggable;
    }

    public void setLoggable(boolean value) {
        this.loggable = value;
    }

    public boolean isSetLoggable() {
        return (this.loggable != null);
    }

    public void unsetLoggable() {
        this.loggable = null;
    }

}
