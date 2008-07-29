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
// Generated on: 2006.07.05 at 05:26:35 PM CEST 
//


package org.fosstrak.reader.rprm.core.msg.reply;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;

import org.fosstrak.reader.rprm.core.msg.reply.IntReturnType;
import org.fosstrak.reader.rprm.core.msg.reply.NoParamType;
import org.fosstrak.reader.rprm.core.msg.reply.StringReturnType;
import org.fosstrak.reader.rprm.core.msg.reply.TriggerReply;
import org.fosstrak.reader.rprm.core.msg.reply.TriggerReturnType;
import org.fosstrak.reader.rprm.core.msg.reply.TriggerTypeReturnType;
import org.fosstrak.reader.rprm.core.msg.reply.TriggerValueReturnType;
import org.w3c.dom.Element;


/**
 * <p>Java class for TriggerReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="create" type="{urn:epcglobal:rp:xsd:1}TriggerReturnType"/>
 *         &lt;element name="getMaxNumberSupported" type="{urn:epcglobal:rp:xsd:1}intReturnType"/>
 *         &lt;element name="getName" type="{urn:epcglobal:rp:xsd:1}stringReturnType"/>
 *         &lt;element name="getType" type="{urn:epcglobal:rp:xsd:1}TriggerTypeReturnType"/>
 *         &lt;element name="getValue" type="{urn:epcglobal:rp:xsd:1}TriggerValueReturnType"/>
 *         &lt;element name="fire" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;any/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerReply", propOrder = {
    "create",
    "getMaxNumberSupported",
    "getName",
    "getType",
    "getValue",
    "fire",
    "any"
})
public class TriggerReply {

    protected TriggerReturnType create;
    protected IntReturnType getMaxNumberSupported;
    protected StringReturnType getName;
    protected TriggerTypeReturnType getType;
    protected TriggerValueReturnType getValue;
    protected NoParamType fire;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the create property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerReturnType }
     *     
     */
    public TriggerReturnType getCreate() {
        return create;
    }

    /**
     * Sets the value of the create property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerReturnType }
     *     
     */
    public void setCreate(TriggerReturnType value) {
        this.create = value;
    }

    /**
     * Gets the value of the getMaxNumberSupported property.
     * 
     * @return
     *     possible object is
     *     {@link IntReturnType }
     *     
     */
    public IntReturnType getGetMaxNumberSupported() {
        return getMaxNumberSupported;
    }

    /**
     * Sets the value of the getMaxNumberSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntReturnType }
     *     
     */
    public void setGetMaxNumberSupported(IntReturnType value) {
        this.getMaxNumberSupported = value;
    }

    /**
     * Gets the value of the getName property.
     * 
     * @return
     *     possible object is
     *     {@link StringReturnType }
     *     
     */
    public StringReturnType getGetName() {
        return getName;
    }

    /**
     * Sets the value of the getName property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringReturnType }
     *     
     */
    public void setGetName(StringReturnType value) {
        this.getName = value;
    }

    /**
     * Gets the value of the getType property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerTypeReturnType }
     *     
     */
    public TriggerTypeReturnType getGetType() {
        return getType;
    }

    /**
     * Sets the value of the getType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerTypeReturnType }
     *     
     */
    public void setGetType(TriggerTypeReturnType value) {
        this.getType = value;
    }

    /**
     * Gets the value of the getValue property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerValueReturnType }
     *     
     */
    public TriggerValueReturnType getGetValue() {
        return getValue;
    }

    /**
     * Sets the value of the getValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerValueReturnType }
     *     
     */
    public void setGetValue(TriggerValueReturnType value) {
        this.getValue = value;
    }

    /**
     * Gets the value of the fire property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getFire() {
        return fire;
    }

    /**
     * Sets the value of the fire property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setFire(NoParamType value) {
        this.fire = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
