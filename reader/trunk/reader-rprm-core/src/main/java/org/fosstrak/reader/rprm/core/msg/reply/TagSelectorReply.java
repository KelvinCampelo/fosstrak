/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Accada (www.accada.org).
 *
 * Accada is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Accada is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Accada; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.05 at 05:26:35 PM CEST 
//


package org.accada.reader.rprm.core.msg.reply;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;

import org.accada.reader.rprm.core.msg.reply.BooleanReturnType;
import org.accada.reader.rprm.core.msg.reply.HexStringReturnType;
import org.accada.reader.rprm.core.msg.reply.IntReturnType;
import org.accada.reader.rprm.core.msg.reply.StringReturnType;
import org.accada.reader.rprm.core.msg.reply.TagFieldReturnType;
import org.accada.reader.rprm.core.msg.reply.TagSelectorReply;
import org.accada.reader.rprm.core.msg.reply.TagSelectorReturnType;
import org.w3c.dom.Element;


/**
 * <p>Java class for TagSelectorReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TagSelectorReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="create" type="{urn:epcglobal:rp:xsd:1}TagSelectorReturnType"/>
 *         &lt;element name="getMaxNumberSupported" type="{urn:epcglobal:rp:xsd:1}intReturnType"/>
 *         &lt;element name="getName" type="{urn:epcglobal:rp:xsd:1}stringReturnType"/>
 *         &lt;element name="getTagField" type="{urn:epcglobal:rp:xsd:1}TagFieldReturnType"/>
 *         &lt;element name="getValue" type="{urn:epcglobal:rp:xsd:1}HexStringReturnType"/>
 *         &lt;element name="getMask" type="{urn:epcglobal:rp:xsd:1}HexStringReturnType"/>
 *         &lt;element name="getInclusiveFlag" type="{urn:epcglobal:rp:xsd:1}booleanReturnType"/>
 *         &lt;any/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(AccessType.FIELD)
@XmlType(name = "TagSelectorReply", propOrder = {
    "create",
    "getMaxNumberSupported",
    "getName",
    "getTagField",
    "getValue",
    "getMask",
    "getInclusiveFlag",
    "any"
})
public class TagSelectorReply {

    protected TagSelectorReturnType create;
    protected IntReturnType getMaxNumberSupported;
    protected StringReturnType getName;
    protected TagFieldReturnType getTagField;
    protected HexStringReturnType getValue;
    protected HexStringReturnType getMask;
    protected BooleanReturnType getInclusiveFlag;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the create property.
     * 
     * @return
     *     possible object is
     *     {@link TagSelectorReturnType }
     *     
     */
    public TagSelectorReturnType getCreate() {
        return create;
    }

    /**
     * Sets the value of the create property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagSelectorReturnType }
     *     
     */
    public void setCreate(TagSelectorReturnType value) {
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
     * Gets the value of the getTagField property.
     * 
     * @return
     *     possible object is
     *     {@link TagFieldReturnType }
     *     
     */
    public TagFieldReturnType getGetTagField() {
        return getTagField;
    }

    /**
     * Sets the value of the getTagField property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagFieldReturnType }
     *     
     */
    public void setGetTagField(TagFieldReturnType value) {
        this.getTagField = value;
    }

    /**
     * Gets the value of the getValue property.
     * 
     * @return
     *     possible object is
     *     {@link HexStringReturnType }
     *     
     */
    public HexStringReturnType getGetValue() {
        return getValue;
    }

    /**
     * Sets the value of the getValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexStringReturnType }
     *     
     */
    public void setGetValue(HexStringReturnType value) {
        this.getValue = value;
    }

    /**
     * Gets the value of the getMask property.
     * 
     * @return
     *     possible object is
     *     {@link HexStringReturnType }
     *     
     */
    public HexStringReturnType getGetMask() {
        return getMask;
    }

    /**
     * Sets the value of the getMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexStringReturnType }
     *     
     */
    public void setGetMask(HexStringReturnType value) {
        this.getMask = value;
    }

    /**
     * Gets the value of the getInclusiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanReturnType }
     *     
     */
    public BooleanReturnType getGetInclusiveFlag() {
        return getInclusiveFlag;
    }

    /**
     * Sets the value of the getInclusiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanReturnType }
     *     
     */
    public void setGetInclusiveFlag(BooleanReturnType value) {
        this.getInclusiveFlag = value;
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
