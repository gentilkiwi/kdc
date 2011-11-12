
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="K_EXT_PUK"/>
 *     &lt;enumeration value="K_EXT_ADM"/>
 *     &lt;enumeration value="K_DEK_DATA"/>
 *     &lt;enumeration value="K_DEK_PIN"/>
 *     &lt;enumeration value="K_OTP"/>
 *     &lt;enumeration value="PIN_USER"/>
 *     &lt;enumeration value="PIN_PUK"/>
 *     &lt;enumeration value="PIN_ADM"/>
 *     &lt;enumeration value="CERT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KeyTypeType")
@XmlEnum
public enum KeyTypeType {

    UNDEFINED,
    K_EXT_PUK,
    K_EXT_ADM,
    K_DEK_DATA,
    K_DEK_PIN,
    K_OTP,
    PIN_USER,
    PIN_PUK,
    PIN_ADM,
    CERT;

    public String value() {
        return name();
    }

    public static KeyTypeType fromValue(String v) {
        return valueOf(v);
    }

}
