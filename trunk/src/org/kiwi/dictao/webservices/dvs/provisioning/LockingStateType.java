
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LockingStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LockingStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOCKED"/>
 *     &lt;enumeration value="UNLOCKED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LockingStateType")
@XmlEnum
public enum LockingStateType {

    LOCKED,
    UNLOCKED;

    public String value() {
        return name();
    }

    public static LockingStateType fromValue(String v) {
        return valueOf(v);
    }

}
