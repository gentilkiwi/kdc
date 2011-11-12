
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalDataTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonalDataTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BIRTHDATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonalDataTypeType")
@XmlEnum
public enum PersonalDataTypeType {

    BIRTHDATE;

    public String value() {
        return name();
    }

    public static PersonalDataTypeType fromValue(String v) {
        return valueOf(v);
    }

}
