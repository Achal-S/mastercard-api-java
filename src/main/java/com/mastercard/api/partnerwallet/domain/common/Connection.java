
package com.mastercard.api.partnerwallet.domain.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Connection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Connection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MerchantName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConnectionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Logo" type="{}Logo"/>
 *         &lt;element name="DataTypes" type="{}DataTypes"/>
 *         &lt;element name="OneClickSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OneClickEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastUpdatedUsed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ConnectedSinceDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MerchantUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="ExtensionPoint" type="{}ExtensionPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Connection", propOrder = {
    "connectionId",
    "merchantName",
    "connectionName",
    "logo",
    "dataTypes",
    "oneClickSupported",
    "oneClickEnabled",
    "lastUpdatedUsed",
    "connectedSinceDate",
    "expirationDate",
    "merchantUrl",
    "extensionPoint"
})
public class Connection {

    @XmlElement(name = "ConnectionId")
    protected long connectionId;
    @XmlElement(name = "MerchantName", required = true)
    protected String merchantName;
    @XmlElement(name = "ConnectionName", required = true)
    protected String connectionName;
    @XmlElement(name = "Logo", required = true)
    protected Logo logo;
    @XmlElement(name = "DataTypes", required = true)
    protected DataTypes dataTypes;
    @XmlElement(name = "OneClickSupported")
    protected boolean oneClickSupported;
    @XmlElement(name = "OneClickEnabled")
    protected boolean oneClickEnabled;
    @XmlElement(name = "LastUpdatedUsed", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdatedUsed;
    @XmlElement(name = "ConnectedSinceDate", required = true)
    protected String connectedSinceDate;
    @XmlElement(name = "ExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "MerchantUrl", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String merchantUrl;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

    /**
     * Gets the value of the connectionId property.
     * 
     */
    public long getConnectionId() {
        return connectionId;
    }

    /**
     * Sets the value of the connectionId property.
     * 
     */
    public void setConnectionId(long value) {
        this.connectionId = value;
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the connectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionName() {
        return connectionName;
    }

    /**
     * Sets the value of the connectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionName(String value) {
        this.connectionName = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link Logo }
     *     
     */
    public Logo getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Logo }
     *     
     */
    public void setLogo(Logo value) {
        this.logo = value;
    }

    /**
     * Gets the value of the dataTypes property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypes }
     *     
     */
    public DataTypes getDataTypes() {
        return dataTypes;
    }

    /**
     * Sets the value of the dataTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypes }
     *     
     */
    public void setDataTypes(DataTypes value) {
        this.dataTypes = value;
    }

    /**
     * Gets the value of the oneClickSupported property.
     * 
     */
    public boolean isOneClickSupported() {
        return oneClickSupported;
    }

    /**
     * Sets the value of the oneClickSupported property.
     * 
     */
    public void setOneClickSupported(boolean value) {
        this.oneClickSupported = value;
    }

    /**
     * Gets the value of the oneClickEnabled property.
     * 
     */
    public boolean isOneClickEnabled() {
        return oneClickEnabled;
    }

    /**
     * Sets the value of the oneClickEnabled property.
     * 
     */
    public void setOneClickEnabled(boolean value) {
        this.oneClickEnabled = value;
    }

    /**
     * Gets the value of the lastUpdatedUsed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdatedUsed() {
        return lastUpdatedUsed;
    }

    /**
     * Sets the value of the lastUpdatedUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdatedUsed(XMLGregorianCalendar value) {
        this.lastUpdatedUsed = value;
    }

    /**
     * Gets the value of the connectedSinceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedSinceDate() {
        return connectedSinceDate;
    }

    /**
     * Sets the value of the connectedSinceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedSinceDate(String value) {
        this.connectedSinceDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the merchantUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantUrl() {
        return merchantUrl;
    }

    /**
     * Sets the value of the merchantUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantUrl(String value) {
        this.merchantUrl = value;
    }

    /**
     * Gets the value of the extensionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionPoint }
     *     
     */
    public ExtensionPoint getExtensionPoint() {
        return extensionPoint;
    }

    /**
     * Sets the value of the extensionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionPoint }
     *     
     */
    public void setExtensionPoint(ExtensionPoint value) {
        this.extensionPoint = value;
    }

}
