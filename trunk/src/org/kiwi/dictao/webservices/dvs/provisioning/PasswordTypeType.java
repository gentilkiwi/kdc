
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PasswordTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PasswordTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOGIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PasswordTypeType")
@XmlEnum
public enum PasswordTypeType {

    LOGIN;

    public String value() {
        return name();
    }

    public static PasswordTypeType fromValue(String v) {
        return valueOf(v);
    }

}
