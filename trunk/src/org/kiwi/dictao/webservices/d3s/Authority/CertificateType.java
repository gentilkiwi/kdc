
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CertificateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEQUESTER"/>
 *     &lt;enumeration value="CIPHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CertificateType", namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
@XmlEnum
public enum CertificateType {

    SEQUESTER,
    CIPHER;

    public String value() {
        return name();
    }

    public static CertificateType fromValue(String v) {
        return valueOf(v);
    }

}
