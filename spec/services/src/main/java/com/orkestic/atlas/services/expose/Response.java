package com.orkestic.atlas.services.expose;

import jakarta.json.bind.annotation.JsonbPropertyOrder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author gbran
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response", propOrder = {
    "entity",
    "collections",
    "exceptionMessage"
})
@XmlRootElement(name = "response")
@JsonbPropertyOrder({"uid", "correlationId", "entity", "exceptionMessage", "collections"})
public class Response implements Serializable {

    private final static long serialVersionUID = 1L;

    protected Entity entity;
    @XmlElement(name = "collection")
    protected List<Collection> collections;
    @XmlElement(name = "exception-message")
    protected ExceptionMessage exceptionMessage;
    @XmlAttribute(name = "uuid", required = true)
    protected String uuid;
    @XmlAttribute(name = "correlation-uuid")
    protected String correlationUuid;

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity value) {
        this.entity = value;
    }

    @jakarta.json.bind.annotation.JsonbTransient
    public boolean isSetEntity() {
        return (this.entity != null);
    }

    public List<Collection> getCollections() {
        if (collections == null) {
            collections = new ArrayList<>();
        }
        return this.collections;
    }

    @jakarta.json.bind.annotation.JsonbTransient
    public boolean isSetCollections() {
        return ((this.collections != null) && (!this.collections.isEmpty()));
    }

    public void unsetCollections() {
        this.collections = null;
    }

    public ExceptionMessage getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(ExceptionMessage value) {
        this.exceptionMessage = value;
    }

    @jakarta.json.bind.annotation.JsonbTransient
    public boolean isSetExceptionMessage() {
        return (this.exceptionMessage != null);
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String value) {
        this.uuid = value;
    }

    @jakarta.json.bind.annotation.JsonbTransient
    public boolean isSetUuid() {
        return (this.uuid != null);
    }

    public String getCorrelationUuId() {
        return correlationUuid;
    }

    public void setCorrelationUuid(String value) {
        this.correlationUuid = value;
    }

    @jakarta.json.bind.annotation.JsonbTransient
    public boolean isSetCorrelationUuid() {
        return (this.correlationUuid != null);
    }

}
