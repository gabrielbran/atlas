package com.orkestic.atlas.services.expose;

import jakarta.json.bind.annotation.JsonbPropertyOrder;
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
@XmlType(name = "attribute", propOrder = {
    "value"
})
@JsonbPropertyOrder({"name", "value"})
public class Attribute implements Serializable {

    private final static long serialVersionUID = 1L;

    @XmlValue
    protected String value;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    public Attribute() {
    }

    public Attribute(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @jakarta.json.bind.annotation.JsonbTransient
    public boolean isSetValue() {
        return (this.value != null);
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @jakarta.json.bind.annotation.JsonbTransient
    public boolean isSetName() {
        return (this.name != null);
    }

}
