//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.13 at 12:45:22 PM CEST 
//


package org.lsc.configuration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldapDerefAliasesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ldapDerefAliasesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEVER"/>
 *     &lt;enumeration value="SEARCH"/>
 *     &lt;enumeration value="FIND"/>
 *     &lt;enumeration value="ALWAYS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ldapDerefAliasesType")
@XmlEnum
public enum LdapDerefAliasesType {

    NEVER,
    SEARCH,
    FIND,
    ALWAYS;

    public String value() {
        return name();
    }

    public static LdapDerefAliasesType fromValue(String v) {
        return valueOf(v);
    }

}
