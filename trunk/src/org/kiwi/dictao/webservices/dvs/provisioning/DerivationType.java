
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DerivationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="PROVIDED"/>
 *     &lt;enumeration value="GENERATED"/>
 *     &lt;enumeration value="EMV_CPS"/>
 *     &lt;enumeration value="SHA1"/>
 *     &lt;enumeration value="HSM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DerivationType")
@XmlEnum
public enum DerivationType {

    UNDEFINED("UNDEFINED"),
    PROVIDED("PROVIDED"),
    GENERATED("GENERATED"),
    EMV_CPS("EMV_CPS"),
    @XmlEnumValue("SHA1")
    SHA_1("SHA1"),
    HSM("HSM");
    private final String value;

    DerivationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DerivationType fromValue(String v) {
        for (DerivationType c: DerivationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
