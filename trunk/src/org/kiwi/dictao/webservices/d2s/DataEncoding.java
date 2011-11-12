
package org.kiwi.dictao.webservices.d2s;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataEncoding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="gzEnc"/>
 *     &lt;enumeration value="b64Enc"/>
 *     &lt;enumeration value="gzb64Enc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataEncoding")
@XmlEnum
public enum DataEncoding {

    @XmlEnumValue("gzEnc")
    GZ_ENC("gzEnc"),
    @XmlEnumValue("b64Enc")
    B_64_ENC("b64Enc"),
    @XmlEnumValue("gzb64Enc")
    GZB_64_ENC("gzb64Enc");
    private final String value;

    DataEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataEncoding fromValue(String v) {
        for (DataEncoding c: DataEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
