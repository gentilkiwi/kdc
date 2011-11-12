
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoParamsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CryptoParamsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAN_BASED"/>
 *     &lt;enumeration value="CAP"/>
 *     &lt;enumeration value="DPA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CryptoParamsType")
@XmlEnum
public enum CryptoParamsType {

    PAN_BASED,
    CAP,
    DPA;

    public String value() {
        return name();
    }

    public static CryptoParamsType fromValue(String v) {
        return valueOf(v);
    }

}
