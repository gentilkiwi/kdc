
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAP"/>
 *     &lt;enumeration value="COORD"/>
 *     &lt;enumeration value="CERTIFICATE"/>
 *     &lt;enumeration value="TOKEN"/>
 *     &lt;enumeration value="PERSODATA"/>
 *     &lt;enumeration value="CREDENTIAL"/>
 *     &lt;enumeration value="PASSWORD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationSimpleType")
@XmlEnum
public enum AuthenticationSimpleType {

    CAP,
    COORD,
    CERTIFICATE,
    TOKEN,
    PERSODATA,
    CREDENTIAL,
    PASSWORD;

    public String value() {
        return name();
    }

    public static AuthenticationSimpleType fromValue(String v) {
        return valueOf(v);
    }

}
