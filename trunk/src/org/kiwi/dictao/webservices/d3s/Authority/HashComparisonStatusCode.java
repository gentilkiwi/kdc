
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HashComparisonStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HashComparisonStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HASH_COMPARAISON_OK"/>
 *     &lt;enumeration value="HASH_COMPARAISON_NOK"/>
 *     &lt;enumeration value="HASH_COMPARAISON_CANCELED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HashComparisonStatusCode", namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
@XmlEnum
public enum HashComparisonStatusCode {

    HASH_COMPARAISON_OK,
    HASH_COMPARAISON_NOK,
    HASH_COMPARAISON_CANCELED;

    public String value() {
        return name();
    }

    public static HashComparisonStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
