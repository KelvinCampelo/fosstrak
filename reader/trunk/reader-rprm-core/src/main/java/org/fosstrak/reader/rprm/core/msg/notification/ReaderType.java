/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Fosstrak (www.fosstrak.org).
 *
 * Fosstrak is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Fosstrak is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Fosstrak; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.05 at 04:25:04 PM CEST 
//


package org.fosstrak.reader.rprm.core.msg.notification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;

import org.fosstrak.reader.rprm.core.msg.notification.EPC;
import org.fosstrak.reader.rprm.core.msg.notification.ReaderTimeType;
import org.fosstrak.reader.rprm.core.msg.notification.ReaderType;
import org.w3c.dom.Element;


/**
 * Reader Information
 * 
 * <p>Java class for ReaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readerEPC" type="{urn:epcglobal:xsd:1}EPC" minOccurs="0"/>
 *         &lt;element name="readerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readerHandle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="readerRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readerTime" type="{urn:epcglobal:rp:xsd:1}ReaderTimeType" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReaderType", propOrder = {
    "readerEPC",
    "readerName",
    "readerHandle",
    "readerRole",
    "readerTime",
    "any"
})
public class ReaderType {

    protected EPC readerEPC;
    protected String readerName;
    protected Integer readerHandle;
    protected String readerRole;
    protected ReaderTimeType readerTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the readerEPC property.
     * 
     * @return
     *     possible object is
     *     {@link EPC }
     *     
     */
    public EPC getReaderEPC() {
        return readerEPC;
    }

    /**
     * Sets the value of the readerEPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPC }
     *     
     */
    public void setReaderEPC(EPC value) {
        this.readerEPC = value;
    }

    /**
     * Gets the value of the readerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReaderName() {
        return readerName;
    }

    /**
     * Sets the value of the readerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReaderName(String value) {
        this.readerName = value;
    }

    /**
     * Gets the value of the readerHandle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReaderHandle() {
        return readerHandle;
    }

    /**
     * Sets the value of the readerHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReaderHandle(Integer value) {
        this.readerHandle = value;
    }

    /**
     * Gets the value of the readerRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReaderRole() {
        return readerRole;
    }

    /**
     * Sets the value of the readerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReaderRole(String value) {
        this.readerRole = value;
    }

    /**
     * Gets the value of the readerTime property.
     * 
     * @return
     *     possible object is
     *     {@link ReaderTimeType }
     *     
     */
    public ReaderTimeType getReaderTime() {
        return readerTime;
    }

    /**
     * Sets the value of the readerTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReaderTimeType }
     *     
     */
    public void setReaderTime(ReaderTimeType value) {
        this.readerTime = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
