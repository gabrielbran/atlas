package com.orkestic.atlas.services.expose;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author gbran
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = {
    "uuid", "service", "service-version", "application", "user", "token",
    "uuid-origin", "eis-date", "async", "eis-uuid", "timeout",
    "remote-address", "parameter"
})
@XmlRootElement(name = "request")
public class Request implements Serializable {

    private final static long serialVersionUID = 1L;

    @XmlAttribute(name = "uuid")
    protected String uuid;

    @XmlAttribute(name = "service")
    protected String service;

    @XmlAttribute(name = "service-version")
    protected String serviceVersion;

    @XmlAttribute(name = "application", required = true)
    protected String application;

    @XmlAttribute(name = "user", required = true)
    protected String user;

    @jakarta.json.bind.annotation.JsonbTransient
    @XmlAttribute(name = "token")
    protected String token;

    @XmlAttribute(name = "uuid-origin")
    protected String uuidOrigin;

    @XmlAttribute(name = "eis-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eisDate;

    @XmlAttribute(name = "async")
    protected Boolean async;

    @jakarta.json.bind.annotation.JsonbTransient
    @XmlAttribute(name = "eis-uuid")
    protected String eisUuid;

    @XmlAttribute(name = "timeout")
    protected Integer timeout;

    @jakarta.json.bind.annotation.JsonbTransient
    @XmlAttribute(name = "remote-address")
    protected String remoteAddress;

    @jakarta.json.bind.annotation.JsonbProperty("parameters")
    protected List<Parameter> parameters;

    public Request() {
    }

    public List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<>();
        }
        return this.parameters;
    }

    public boolean isSetParameters() {
        return ((this.parameters != null) && (!this.parameters.isEmpty()));
    }

    public void unsetParameters() {
        this.parameters = null;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public String getService() {
        return service;
    }

    public void setService(String value) {
        this.service = value;
    }

    public boolean isSetService() {
        return (this.service != null);
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String value) {
        this.serviceVersion = value;
    }

    public boolean isSetServiceVersion() {
        return (this.serviceVersion != null);
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String value) {
        this.application = value;
    }

    public boolean isSetApplication() {
        return (this.application != null);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String value) {
        this.user = value;
    }

    public boolean isSetUser() {
        return (this.user != null);
    }

    public String getUid() {
        return uuid;
    }

    public void setUuid(String value) {
        this.uuid = value;
    }

    public boolean isSetUuid() {
        return (this.uuid != null);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String value) {
        this.token = value;
    }

    public boolean isSetToken() {
        return (this.token != null);
    }

    public String getUuidOrigin() {
        return uuidOrigin;
    }

    public void setUuidOrigin(String value) {
        this.uuidOrigin = value;
    }

    public boolean isSetUuidOrigin() {
        return (this.uuidOrigin != null);
    }

    public XMLGregorianCalendar getEisDate() {
        return eisDate;
    }

    public void setEisDate(XMLGregorianCalendar value) {
        this.eisDate = value;
    }

    public boolean isSetEisDate() {
        return (this.eisDate != null);
    }

    public boolean isAsync() {
        if (async == null) {
            return false;
        } else {
            return async;
        }
    }

    public void setAsync(boolean value) {
        this.async = value;
    }

    public boolean isSetAsync() {
        return (this.async != null);
    }

    public void unsetAsync() {
        this.async = null;
    }

    public String getEisUuid() {
        return eisUuid;
    }

    public void setEisUuid(String value) {
        this.eisUuid = value;
    }

    public boolean isSetEisUuid() {
        return (this.eisUuid != null);
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int value) {
        this.timeout = value;
    }

    public boolean isSetTimeout() {
        return (this.timeout != null);
    }

    public void unsetTimeout() {
        this.timeout = null;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String value) {
        this.remoteAddress = value;
    }

    public boolean isSetRemoteAddress() {
        return (this.remoteAddress != null);
    }

}
