
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DP_VALID_SIGNATURE"/>
 *     &lt;enumeration value="DP_SIGNATURE_COULD_NOT_BE_VERIFIED"/>
 *     &lt;enumeration value="DP_VALIDATION_OPERATION_DISABLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidationStatusCode", namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
@XmlEnum
public enum ValidationStatusCode {

    DP_VALID_SIGNATURE,
    DP_SIGNATURE_COULD_NOT_BE_VERIFIED,
    DP_VALIDATION_OPERATION_DISABLED;

    public String value() {
        return name();
    }

    public static ValidationStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
