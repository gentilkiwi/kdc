
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoImplType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CryptoImplType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="SAGEM_V1"/>
 *     &lt;enumeration value="GOOGLE_HOTP_V1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CryptoImplType")
@XmlEnum
public enum CryptoImplType {

    UNDEFINED("UNDEFINED"),
    @XmlEnumValue("SAGEM_V1")
    SAGEM_V_1("SAGEM_V1"),
    @XmlEnumValue("GOOGLE_HOTP_V1")
    GOOGLE_HOTP_V_1("GOOGLE_HOTP_V1");
    private final String value;

    CryptoImplType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CryptoImplType fromValue(String v) {
        for (CryptoImplType c: CryptoImplType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
