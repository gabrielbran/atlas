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
@XmlType(name = "exception-message", propOrder = {
    "value"
})
public class ExceptionMessage implements Serializable {

    private final static long serialVersionUID = 1L;

    @XmlValue
    protected String value;
    @XmlAttribute(name = "code", required = true)
    protected String code;

    public ExceptionMessage() {
    }

    public ExceptionMessage(String value, String code) {
        this.value = value;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public boolean isSetCode() {
        return (this.code != null);
    }

}
