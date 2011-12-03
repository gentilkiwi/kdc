
package org.kiwi.dictao.webservices.d3s.Authority;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserFaultCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserFaultCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D3S_USER_APPROBATION_NEEDED"/>
 *     &lt;enumeration value="D3S_USER_APPROBATION_ALREADY_REQUESTED"/>
 *     &lt;enumeration value="D3S_USER_APPROBATION_ALREADY_GIVEN_BY_APPROVER"/>
 *     &lt;enumeration value="D3S_USER_USER_CAN_NOT_APPROVE_HIMSELF"/>
 *     &lt;enumeration value="D3S_USER_BOX_NOT_EMPTY"/>
 *     &lt;enumeration value="D3S_USER_ACTION_FORBIDEN_BY_DEPOSIT_STATUS"/>
 *     &lt;enumeration value="D3S_USER_ACTION_FORBIDEN_BY_BOX_STATUS"/>
 *     &lt;enumeration value="D3S_USER_GROUP_STILL_LINKED_TO_BOXES"/>
 *     &lt;enumeration value="D3S_USER_WRONG_OWNERSHIP"/>
 *     &lt;enumeration value="D3S_USER_INCOMPATIBLE_ROLES"/>
 *     &lt;enumeration value="D3S_USER_BOX_QUOTA_EXCEEDED"/>
 *     &lt;enumeration value="D3S_USER_BOX_HISTORIC_SIZE_EXCEEDED"/>
 *     &lt;enumeration value="D3S_USER_URG_ASSOC_ALREADY_EXISTS"/>
 *     &lt;enumeration value="D3S_USER_INVALID_BOX_TYPE"/>
 *     &lt;enumeration value="D3S_USER_EDITABLE_CONSTRAINT_VIOLATION"/>
 *     &lt;enumeration value="D3S_USER_INVALID_PARAMETER"/>
 *     &lt;enumeration value="D3S_USER_MISSING_PARAMETER"/>
 *     &lt;enumeration value="D3S_USER_INVALID_X509_CERTIFICATE"/>
 *     &lt;enumeration value="D3S_USER_USER_PASSWORD_NOT_MATCHING"/>
 *     &lt;enumeration value="D3S_USER_INVALID_USER_PASSWORD"/>
 *     &lt;enumeration value="D3S_USER_INVALID_SECURITY_TOKEN"/>
 *     &lt;enumeration value="D3S_USER_MISSING_PRIVILEGE"/>
 *     &lt;enumeration value="D3S_USER_DEPOSIT_NOT_FOUND"/>
 *     &lt;enumeration value="D3S_USER_IMPORT_ARCHIVE_INVALID"/>
 *     &lt;enumeration value="D3S_USER_IMPORT_DUPLICATE_MISMATCH"/>
 *     &lt;enumeration value="D3S_USER_IMPORT_DUPLICATE_RECLASSIFIED"/>
 *     &lt;enumeration value="D3S_USER_IMPORT_TARGET_FILING_PLAN_INVALID"/>
 *     &lt;enumeration value="D3S_USER_IMPORT_TARGET_SAFEBOX_INVALID"/>
 *     &lt;enumeration value="D3S_USER_INVALID_DEPOSIT_PROOF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserFaultCodeType", namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common")
@XmlEnum
public enum UserFaultCodeType {

    @XmlEnumValue("D3S_USER_APPROBATION_NEEDED")
    D_3_S_USER_APPROBATION_NEEDED("D3S_USER_APPROBATION_NEEDED"),
    @XmlEnumValue("D3S_USER_APPROBATION_ALREADY_REQUESTED")
    D_3_S_USER_APPROBATION_ALREADY_REQUESTED("D3S_USER_APPROBATION_ALREADY_REQUESTED"),
    @XmlEnumValue("D3S_USER_APPROBATION_ALREADY_GIVEN_BY_APPROVER")
    D_3_S_USER_APPROBATION_ALREADY_GIVEN_BY_APPROVER("D3S_USER_APPROBATION_ALREADY_GIVEN_BY_APPROVER"),
    @XmlEnumValue("D3S_USER_USER_CAN_NOT_APPROVE_HIMSELF")
    D_3_S_USER_USER_CAN_NOT_APPROVE_HIMSELF("D3S_USER_USER_CAN_NOT_APPROVE_HIMSELF"),
    @XmlEnumValue("D3S_USER_BOX_NOT_EMPTY")
    D_3_S_USER_BOX_NOT_EMPTY("D3S_USER_BOX_NOT_EMPTY"),
    @XmlEnumValue("D3S_USER_ACTION_FORBIDEN_BY_DEPOSIT_STATUS")
    D_3_S_USER_ACTION_FORBIDEN_BY_DEPOSIT_STATUS("D3S_USER_ACTION_FORBIDEN_BY_DEPOSIT_STATUS"),
    @XmlEnumValue("D3S_USER_ACTION_FORBIDEN_BY_BOX_STATUS")
    D_3_S_USER_ACTION_FORBIDEN_BY_BOX_STATUS("D3S_USER_ACTION_FORBIDEN_BY_BOX_STATUS"),
    @XmlEnumValue("D3S_USER_GROUP_STILL_LINKED_TO_BOXES")
    D_3_S_USER_GROUP_STILL_LINKED_TO_BOXES("D3S_USER_GROUP_STILL_LINKED_TO_BOXES"),
    @XmlEnumValue("D3S_USER_WRONG_OWNERSHIP")
    D_3_S_USER_WRONG_OWNERSHIP("D3S_USER_WRONG_OWNERSHIP"),
    @XmlEnumValue("D3S_USER_INCOMPATIBLE_ROLES")
    D_3_S_USER_INCOMPATIBLE_ROLES("D3S_USER_INCOMPATIBLE_ROLES"),
    @XmlEnumValue("D3S_USER_BOX_QUOTA_EXCEEDED")
    D_3_S_USER_BOX_QUOTA_EXCEEDED("D3S_USER_BOX_QUOTA_EXCEEDED"),
    @XmlEnumValue("D3S_USER_BOX_HISTORIC_SIZE_EXCEEDED")
    D_3_S_USER_BOX_HISTORIC_SIZE_EXCEEDED("D3S_USER_BOX_HISTORIC_SIZE_EXCEEDED"),
    @XmlEnumValue("D3S_USER_URG_ASSOC_ALREADY_EXISTS")
    D_3_S_USER_URG_ASSOC_ALREADY_EXISTS("D3S_USER_URG_ASSOC_ALREADY_EXISTS"),
    @XmlEnumValue("D3S_USER_INVALID_BOX_TYPE")
    D_3_S_USER_INVALID_BOX_TYPE("D3S_USER_INVALID_BOX_TYPE"),
    @XmlEnumValue("D3S_USER_EDITABLE_CONSTRAINT_VIOLATION")
    D_3_S_USER_EDITABLE_CONSTRAINT_VIOLATION("D3S_USER_EDITABLE_CONSTRAINT_VIOLATION"),
    @XmlEnumValue("D3S_USER_INVALID_PARAMETER")
    D_3_S_USER_INVALID_PARAMETER("D3S_USER_INVALID_PARAMETER"),
    @XmlEnumValue("D3S_USER_MISSING_PARAMETER")
    D_3_S_USER_MISSING_PARAMETER("D3S_USER_MISSING_PARAMETER"),
    @XmlEnumValue("D3S_USER_INVALID_X509_CERTIFICATE")
    D_3_S_USER_INVALID_X_509_CERTIFICATE("D3S_USER_INVALID_X509_CERTIFICATE"),
    @XmlEnumValue("D3S_USER_USER_PASSWORD_NOT_MATCHING")
    D_3_S_USER_USER_PASSWORD_NOT_MATCHING("D3S_USER_USER_PASSWORD_NOT_MATCHING"),
    @XmlEnumValue("D3S_USER_INVALID_USER_PASSWORD")
    D_3_S_USER_INVALID_USER_PASSWORD("D3S_USER_INVALID_USER_PASSWORD"),
    @XmlEnumValue("D3S_USER_INVALID_SECURITY_TOKEN")
    D_3_S_USER_INVALID_SECURITY_TOKEN("D3S_USER_INVALID_SECURITY_TOKEN"),
    @XmlEnumValue("D3S_USER_MISSING_PRIVILEGE")
    D_3_S_USER_MISSING_PRIVILEGE("D3S_USER_MISSING_PRIVILEGE"),
    @XmlEnumValue("D3S_USER_DEPOSIT_NOT_FOUND")
    D_3_S_USER_DEPOSIT_NOT_FOUND("D3S_USER_DEPOSIT_NOT_FOUND"),
    @XmlEnumValue("D3S_USER_IMPORT_ARCHIVE_INVALID")
    D_3_S_USER_IMPORT_ARCHIVE_INVALID("D3S_USER_IMPORT_ARCHIVE_INVALID"),
    @XmlEnumValue("D3S_USER_IMPORT_DUPLICATE_MISMATCH")
    D_3_S_USER_IMPORT_DUPLICATE_MISMATCH("D3S_USER_IMPORT_DUPLICATE_MISMATCH"),
    @XmlEnumValue("D3S_USER_IMPORT_DUPLICATE_RECLASSIFIED")
    D_3_S_USER_IMPORT_DUPLICATE_RECLASSIFIED("D3S_USER_IMPORT_DUPLICATE_RECLASSIFIED"),
    @XmlEnumValue("D3S_USER_IMPORT_TARGET_FILING_PLAN_INVALID")
    D_3_S_USER_IMPORT_TARGET_FILING_PLAN_INVALID("D3S_USER_IMPORT_TARGET_FILING_PLAN_INVALID"),
    @XmlEnumValue("D3S_USER_IMPORT_TARGET_SAFEBOX_INVALID")
    D_3_S_USER_IMPORT_TARGET_SAFEBOX_INVALID("D3S_USER_IMPORT_TARGET_SAFEBOX_INVALID"),
    @XmlEnumValue("D3S_USER_INVALID_DEPOSIT_PROOF")
    D_3_S_USER_INVALID_DEPOSIT_PROOF("D3S_USER_INVALID_DEPOSIT_PROOF");
    private final String value;

    UserFaultCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserFaultCodeType fromValue(String v) {
        for (UserFaultCodeType c: UserFaultCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
