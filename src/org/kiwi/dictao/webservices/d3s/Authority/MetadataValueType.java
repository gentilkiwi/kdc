
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetadataValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRING_TYPE"/>
 *     &lt;enumeration value="DATE_TYPE"/>
 *     &lt;enumeration value="LONG_TYPE"/>
 *     &lt;enumeration value="BINARY_TYPE"/>
 *     &lt;enumeration value="IDREF_TYPE"/>
 *     &lt;enumeration value="BOOLEAN_TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetadataValueType", namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
@XmlEnum
public enum MetadataValueType {

    STRING_TYPE,
    DATE_TYPE,
    LONG_TYPE,
    BINARY_TYPE,
    IDREF_TYPE,
    BOOLEAN_TYPE;

    public String value() {
        return name();
    }

    public static MetadataValueType fromValue(String v) {
        return valueOf(v);
    }

}
