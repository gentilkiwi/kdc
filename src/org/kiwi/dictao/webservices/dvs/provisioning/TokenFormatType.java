
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TokenFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAP"/>
 *     &lt;enumeration value="PLA"/>
 *     &lt;enumeration value="GIECB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TokenFormatType")
@XmlEnum
public enum TokenFormatType {

    CAP,
    PLA,
    GIECB;

    public String value() {
        return name();
    }

    public static TokenFormatType fromValue(String v) {
        return valueOf(v);
    }

}
