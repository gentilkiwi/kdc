
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTPType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTPType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="SINGLE"/>
 *     &lt;enumeration value="MUTUAL"/>
 *     &lt;enumeration value="MUTUAL_LIGHT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTPType")
@XmlEnum
public enum OTPType {

    UNDEFINED,
    SINGLE,
    MUTUAL,
    MUTUAL_LIGHT;

    public String value() {
        return name();
    }

    public static OTPType fromValue(String v) {
        return valueOf(v);
    }

}
