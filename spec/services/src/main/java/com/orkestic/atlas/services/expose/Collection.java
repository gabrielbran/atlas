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
@XmlType(name = "collection", propOrder = {
    "entities"
})
@JsonbPropertyOrder({"name", "entities"})
public class Collection implements Serializable {

    private final static long serialVersionUID = 1L;

    @XmlElement(name = "entity")
    protected List<Entity> entities;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    public Collection() {
    }

    public Collection(List<Entity> entities, String name) {
        this.entities = entities;
        this.name = name;
    }

    public List<Entity> getEntities() {
        if (entities == null) {
            entities = new ArrayList<>();
        }
        return this.entities;
    }

    @jakarta.json.bind.annotation.JsonbTransient
    public boolean isSetEntities() {
        return ((this.entities != null) && (!this.entities.isEmpty()));
    }

    public void unsetEntities() {
        this.entities = null;
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
