
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoAlgoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CryptoAlgoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAN_BASED"/>
 *     &lt;enumeration value="MCHIP2"/>
 *     &lt;enumeration value="VIS140"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CryptoAlgoType")
@XmlEnum
public enum CryptoAlgoType {

    PAN_BASED("PAN_BASED"),
    @XmlEnumValue("MCHIP2")
    MCHIP_2("MCHIP2"),
    @XmlEnumValue("VIS140")
    VIS_140("VIS140");
    private final String value;

    CryptoAlgoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CryptoAlgoType fromValue(String v) {
        for (CryptoAlgoType c: CryptoAlgoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
