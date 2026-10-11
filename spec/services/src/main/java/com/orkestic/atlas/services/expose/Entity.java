package com.orkestic.atlas.services.expose;

import jakarta.json.bind.annotation.JsonbPropertyOrder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author gbran
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entity", propOrder = {
    "attributes",
    "collections"
})
@JsonbPropertyOrder({"name", "attributes", "collections"})
public class Entity implements Serializable {

    private final static long serialVersionUID = 1L;

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlElement(name = "attribute")
    protected List<Attribute> attributes;
    @XmlElement(name = "collection")
    protected List<Collection> collections;

    public Entity() {
    }

    public Entity(String name, List<Attribute> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public Entity(String name, List<Attribute> attributes, List<Collection> collections) {
        this.name = name;
        this.attributes = attributes;
        this.collections = collections;
    }

    public List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<>();
        }
        return this.attributes;
    }

    @jakarta.json.bind.annotation.JsonbTransient
    public boolean isSetAttributes() {
        return ((this.attributes != null) && (!this.attributes.isEmpty()));
    }

    public void unsetAttributes() {
        this.attributes = null;
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
