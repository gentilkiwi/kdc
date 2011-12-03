
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriterionOperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriterionOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="NOT_EQUALS"/>
 *     &lt;enumeration value="SUPERIOR"/>
 *     &lt;enumeration value="INFERIOR"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="CONTAINS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CriterionOperatorType")
@XmlEnum
public enum CriterionOperatorType {

    EQUALS,
    NOT_EQUALS,
    SUPERIOR,
    INFERIOR,
    IN,
    CONTAINS;

    public String value() {
        return name();
    }

    public static CriterionOperatorType fromValue(String v) {
        return valueOf(v);
    }

}
