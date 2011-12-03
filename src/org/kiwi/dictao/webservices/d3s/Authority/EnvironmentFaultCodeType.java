
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentFaultCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentFaultCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D3S_ENV_AUTH_TOKEN"/>
 *     &lt;enumeration value="D3S_ENV_CONFIGURATION"/>
 *     &lt;enumeration value="D3S_ENV_DATABASE"/>
 *     &lt;enumeration value="D3S_ENV_DXS"/>
 *     &lt;enumeration value="D3S_ENV_FILE"/>
 *     &lt;enumeration value="D3S_ENV_INTERNAL_ERROR"/>
 *     &lt;enumeration value="D3S_ENV_MAIL"/>
 *     &lt;enumeration value="D3S_ENV_MEMORY"/>
 *     &lt;enumeration value="D3S_ENV_NETWORK"/>
 *     &lt;enumeration value="D3S_ENV_NOTIFICATION"/>
 *     &lt;enumeration value="D3S_ENV_SHUTTING_DOWN"/>
 *     &lt;enumeration value="D3S_ENV_AUHTORITY"/>
 *     &lt;enumeration value="D3S_ENV_RETRY_LATER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentFaultCodeType", namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
@XmlEnum
public enum EnvironmentFaultCodeType {

    @XmlEnumValue("D3S_ENV_AUTH_TOKEN")
    D_3_S_ENV_AUTH_TOKEN("D3S_ENV_AUTH_TOKEN"),
    @XmlEnumValue("D3S_ENV_CONFIGURATION")
    D_3_S_ENV_CONFIGURATION("D3S_ENV_CONFIGURATION"),
    @XmlEnumValue("D3S_ENV_DATABASE")
    D_3_S_ENV_DATABASE("D3S_ENV_DATABASE"),
    @XmlEnumValue("D3S_ENV_DXS")
    D_3_S_ENV_DXS("D3S_ENV_DXS"),
    @XmlEnumValue("D3S_ENV_FILE")
    D_3_S_ENV_FILE("D3S_ENV_FILE"),
    @XmlEnumValue("D3S_ENV_INTERNAL_ERROR")
    D_3_S_ENV_INTERNAL_ERROR("D3S_ENV_INTERNAL_ERROR"),
    @XmlEnumValue("D3S_ENV_MAIL")
    D_3_S_ENV_MAIL("D3S_ENV_MAIL"),
    @XmlEnumValue("D3S_ENV_MEMORY")
    D_3_S_ENV_MEMORY("D3S_ENV_MEMORY"),
    @XmlEnumValue("D3S_ENV_NETWORK")
    D_3_S_ENV_NETWORK("D3S_ENV_NETWORK"),
    @XmlEnumValue("D3S_ENV_NOTIFICATION")
    D_3_S_ENV_NOTIFICATION("D3S_ENV_NOTIFICATION"),
    @XmlEnumValue("D3S_ENV_SHUTTING_DOWN")
    D_3_S_ENV_SHUTTING_DOWN("D3S_ENV_SHUTTING_DOWN"),
    @XmlEnumValue("D3S_ENV_AUHTORITY")
    D_3_S_ENV_AUHTORITY("D3S_ENV_AUHTORITY"),
    @XmlEnumValue("D3S_ENV_RETRY_LATER")
    D_3_S_ENV_RETRY_LATER("D3S_ENV_RETRY_LATER");
    private final String value;

    EnvironmentFaultCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentFaultCodeType fromValue(String v) {
        for (EnvironmentFaultCodeType c: EnvironmentFaultCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
