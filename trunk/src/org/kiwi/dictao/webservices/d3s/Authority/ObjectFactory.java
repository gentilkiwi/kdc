
package org.kiwi.dictao.webservices.d3s.Authority;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.kiwi.dictao.webservices.d3s.Authority package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");
    private final static QName _EncryptionProperty_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "EncryptionProperty");
    private final static QName _PGPData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPData");
    private final static QName _UpdateCertificate_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "updateCertificate");
    private final static QName _EncryptedKey_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "EncryptedKey");
    private final static QName _DiscardDepositResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "discardDepositResponse");
    private final static QName _RemoveAuthorizationsResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "removeAuthorizationsResponse");
    private final static QName _UpdateSafeboxResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "updateSafeboxResponse");
    private final static QName _SPKIData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKIData");
    private final static QName _GrantExportResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantExportResponse");
    private final static QName _FindCertificates_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "findCertificates");
    private final static QName _Certificates_QNAME = new QName("http://www.dictao.com/d3s/xsd/v2010_10/Common", "certificates");
    private final static QName _CanonicalizationMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
    private final static QName _ReadDeposit_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "readDeposit");
    private final static QName _UserFaultElement_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "UserFaultElement");
    private final static QName _FindDepositsResponseContent_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "findDepositsResponseContent");
    private final static QName _Transforms_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
    private final static QName _Manifest_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Manifest");
    private final static QName _GrantDeleteResponseContent_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantDeleteResponseContent");
    private final static QName _ReadUser_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "readUser");
    private final static QName _DepositProof_QNAME = new QName("http://www.dictao.com/d3s/xsd/v2010_10/Common", "depositProof");
    private final static QName _FindDeposits_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "findDeposits");
    private final static QName _EnvironmentFaultElement_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "EnvironmentFaultElement");
    private final static QName _ReadUserResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "readUserResponse");
    private final static QName _SignatureMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
    private final static QName _CreateCertificate_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "createCertificate");
    private final static QName _DiscardDeposit_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "discardDeposit");
    private final static QName _CreateSafebox_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "createSafebox");
    private final static QName _KeyInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
    private final static QName _User_QNAME = new QName("http://www.dictao.com/d3s/xsd/v2010_10/Common", "user");
    private final static QName _DigestMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
    private final static QName _AddAuthorizations_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "addAuthorizations");
    private final static QName _MgmtData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
    private final static QName _DeleteCertificate_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "deleteCertificate");
    private final static QName _ReadOrgunit_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "readOrgunit");
    private final static QName _ReadCertificate_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "readCertificate");
    private final static QName _CipherData_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "CipherData");
    private final static QName _Safebox_QNAME = new QName("http://www.dictao.com/d3s/xsd/v2010_10/Common", "safebox");
    private final static QName _GrantUpdateResponseContent_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantUpdateResponseContent");
    private final static QName _NextSafeboxesResponseContent_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "nextSafeboxesResponseContent");
    private final static QName _SignedInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
    private final static QName _UpdateCertificateResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "updateCertificateResponse");
    private final static QName _Object_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Object");
    private final static QName _UpdateDepositResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "updateDepositResponse");
    private final static QName _GrantDelete_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantDelete");
    private final static QName _FindSafeboxesResponseContent_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "findSafeboxesResponseContent");
    private final static QName _NextSafeboxes_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "nextSafeboxes");
    private final static QName _ImportDeposit_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "importDeposit");
    private final static QName _GrantUpdate_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantUpdate");
    private final static QName _ReadDepositResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "readDepositResponse");
    private final static QName _X509Data_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
    private final static QName _UpdateOrgunitResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "updateOrgunitResponse");
    private final static QName _UpdateDepositMetadata_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "updateDepositMetadata");
    private final static QName _SignatureProperties_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperties");
    private final static QName _Authorizations_QNAME = new QName("http://www.dictao.com/d3s/xsd/v2010_10/Common", "authorizations");
    private final static QName _KeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
    private final static QName _DeleteUser_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "deleteUser");
    private final static QName _ChangeAccessPermissions_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "changeAccessPermissions");
    private final static QName _UpdateUser_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "updateUser");
    private final static QName _RestoreDeposit_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "restoreDeposit");
    private final static QName _CreateUser_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "createUser");
    private final static QName _ImportDepositResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "importDepositResponse");
    private final static QName _DeleteOrgunit_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "deleteOrgunit");
    private final static QName _GrantReadResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantReadResponse");
    private final static QName _ReadCertificateResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "readCertificateResponse");
    private final static QName _GrantDeleteResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantDeleteResponse");
    private final static QName _CreateSafeboxResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "createSafeboxResponse");
    private final static QName _ImportDepositResponseContent_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "importDepositResponseContent");
    private final static QName _NextCertificates_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "nextCertificates");
    private final static QName _CreateCertificateResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "createCertificateResponse");
    private final static QName _RetrievalMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RetrievalMethod");
    private final static QName _GrantWriteResponseContent_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantWriteResponseContent");
    private final static QName _RestoreDepositResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "restoreDepositResponse");
    private final static QName _GrantWrite_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantWrite");
    private final static QName _DeleteDeposit_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "deleteDeposit");
    private final static QName _FindSafeboxes_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "findSafeboxes");
    private final static QName _SecurityToken_QNAME = new QName("http://www.dictao.com/d3s/xsd/v2010_10/Common", "securityToken");
    private final static QName _CipherReference_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "CipherReference");
    private final static QName _DeleteDepositResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "deleteDepositResponse");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "deleteUserResponse");
    private final static QName _SignatureProperty_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperty");
    private final static QName _ReadSafeboxResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "readSafeboxResponse");
    private final static QName _FindCertificatesResponseContent_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "findCertificatesResponseContent");
    private final static QName _GrantUpdateResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantUpdateResponse");
    private final static QName _NextDeposits_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "nextDeposits");
    private final static QName _FindDepositsResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "findDepositsResponse");
    private final static QName _EncryptedData_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "EncryptedData");
    private final static QName _UpdateOrgunit_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "updateOrgunit");
    private final static QName _Reference_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
    private final static QName _FindSafeboxesResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "findSafeboxesResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "updateUserResponse");
    private final static QName _GrantRead_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantRead");
    private final static QName _RSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
    private final static QName _Orgunit_QNAME = new QName("http://www.dictao.com/d3s/xsd/v2010_10/Common", "orgunit");
    private final static QName _ReadOrgunitResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "readOrgunitResponse");
    private final static QName _CreateUserResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "createUserResponse");
    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private final static QName _Certificate_QNAME = new QName("http://www.dictao.com/d3s/xsd/v2010_10/Common", "certificate");
    private final static QName _DSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue");
    private final static QName _CreateDepositResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "createDepositResponse");
    private final static QName _DeleteCertificateResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "deleteCertificateResponse");
    private final static QName _CreateOrgunit_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "createOrgunit");
    private final static QName _DeleteSafeboxResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "deleteSafeboxResponse");
    private final static QName _UpdateDeposit_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "updateDeposit");
    private final static QName _Metadatas_QNAME = new QName("http://www.dictao.com/d3s/xsd/v2010_10/Common", "metadatas");
    private final static QName _AddAuthorizationsResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "addAuthorizationsResponse");
    private final static QName _CreateOrgunitResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "createOrgunitResponse");
    private final static QName _DeleteOrgunitResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "deleteOrgunitResponse");
    private final static QName _Deposit_QNAME = new QName("http://www.dictao.com/d3s/xsd/v2010_10/Common", "deposit");
    private final static QName _SignatureValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureValue");
    private final static QName _Transform_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    private final static QName _EncryptionProperties_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "EncryptionProperties");
    private final static QName _UpdateSafebox_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "updateSafebox");
    private final static QName _DeleteSafebox_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "deleteSafebox");
    private final static QName _AgreementMethod_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "AgreementMethod");
    private final static QName _FindCertificatesResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "findCertificatesResponse");
    private final static QName _RemoveAuthorizations_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "removeAuthorizations");
    private final static QName _UpdateDepositMetadataResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "updateDepositMetadataResponse");
    private final static QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    private final static QName _NextDepositsResponseContent_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "nextDepositsResponseContent");
    private final static QName _ChangeAccessPermissionsResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "changeAccessPermissionsResponse");
    private final static QName _KeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
    private final static QName _CreateDeposit_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "createDeposit");
    private final static QName _NextCertificatesResponseContent_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "nextCertificatesResponseContent");
    private final static QName _GrantExport_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantExport");
    private final static QName _GrantReadResponseContent_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantReadResponseContent");
    private final static QName _ReadSafebox_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "readSafebox");
    private final static QName _GrantWriteResponse_QNAME = new QName("http://www.dictao.com/d3s/wsdl/v2.1/Authority", "grantWriteResponse");
    private final static QName _X509DataTypeX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private final static QName _X509DataTypeX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private final static QName _X509DataTypeX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private final static QName _X509DataTypeX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private final static QName _X509DataTypeX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private final static QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");
    private final static QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private final static QName _EncryptionMethodTypeKeySize_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "KeySize");
    private final static QName _EncryptionMethodTypeOAEPparams_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "OAEPparams");
    private final static QName _AgreementMethodTypeOriginatorKeyInfo_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "OriginatorKeyInfo");
    private final static QName _AgreementMethodTypeRecipientKeyInfo_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "RecipientKeyInfo");
    private final static QName _AgreementMethodTypeKANonce_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "KA-Nonce");
    private final static QName _PGPDataTypePGPKeyID_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyID");
    private final static QName _PGPDataTypePGPKeyPacket_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyPacket");
    private final static QName _ReferenceListDataReference_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "DataReference");
    private final static QName _ReferenceListKeyReference_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "KeyReference");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kiwi.dictao.webservices.d3s.Authority
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link X509DataType }
     * 
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link GrantWrite }
     * 
     */
    public GrantWrite createGrantWrite() {
        return new GrantWrite();
    }

    /**
     * Create an instance of {@link FindSafeboxesResponse }
     * 
     */
    public FindSafeboxesResponse createFindSafeboxesResponse() {
        return new FindSafeboxesResponse();
    }

    /**
     * Create an instance of {@link KeyValueType }
     * 
     */
    public KeyValueType createKeyValueType() {
        return new KeyValueType();
    }

    /**
     * Create an instance of {@link RemoveAuthorizations }
     * 
     */
    public RemoveAuthorizations createRemoveAuthorizations() {
        return new RemoveAuthorizations();
    }

    /**
     * Create an instance of {@link UpdateOrgunit }
     * 
     */
    public UpdateOrgunit createUpdateOrgunit() {
        return new UpdateOrgunit();
    }

    /**
     * Create an instance of {@link EncryptedDataType }
     * 
     */
    public EncryptedDataType createEncryptedDataType() {
        return new EncryptedDataType();
    }

    /**
     * Create an instance of {@link GrantReadResponse }
     * 
     */
    public GrantReadResponse createGrantReadResponse() {
        return new GrantReadResponse();
    }

    /**
     * Create an instance of {@link Authorizations.Authorization }
     * 
     */
    public Authorizations.Authorization createAuthorizationsAuthorization() {
        return new Authorizations.Authorization();
    }

    /**
     * Create an instance of {@link CipherDataType }
     * 
     */
    public CipherDataType createCipherDataType() {
        return new CipherDataType();
    }

    /**
     * Create an instance of {@link FindCertificatesResponse }
     * 
     */
    public FindCertificatesResponse createFindCertificatesResponse() {
        return new FindCertificatesResponse();
    }

    /**
     * Create an instance of {@link ManifestType }
     * 
     */
    public ManifestType createManifestType() {
        return new ManifestType();
    }

    /**
     * Create an instance of {@link Authorizations }
     * 
     */
    public Authorizations createAuthorizations() {
        return new Authorizations();
    }

    /**
     * Create an instance of {@link ReferenceType2 }
     * 
     */
    public ReferenceType2 createReferenceType2() {
        return new ReferenceType2();
    }

    /**
     * Create an instance of {@link ImportDepositResponse }
     * 
     */
    public ImportDepositResponse createImportDepositResponse() {
        return new ImportDepositResponse();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link ImportDeposit }
     * 
     */
    public ImportDeposit createImportDeposit() {
        return new ImportDeposit();
    }

    /**
     * Create an instance of {@link UserFaultInfo }
     * 
     */
    public UserFaultInfo createUserFaultInfo() {
        return new UserFaultInfo();
    }

    /**
     * Create an instance of {@link RestoreDepositResponse }
     * 
     */
    public RestoreDepositResponse createRestoreDepositResponse() {
        return new RestoreDepositResponse();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link StatusDetail }
     * 
     */
    public StatusDetail createStatusDetail() {
        return new StatusDetail();
    }

    /**
     * Create an instance of {@link DSAKeyValueType }
     * 
     */
    public DSAKeyValueType createDSAKeyValueType() {
        return new DSAKeyValueType();
    }

    /**
     * Create an instance of {@link PGPDataType }
     * 
     */
    public PGPDataType createPGPDataType() {
        return new PGPDataType();
    }

    /**
     * Create an instance of {@link SignaturePropertiesType }
     * 
     */
    public SignaturePropertiesType createSignaturePropertiesType() {
        return new SignaturePropertiesType();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link Criterion }
     * 
     */
    public Criterion createCriterion() {
        return new Criterion();
    }

    /**
     * Create an instance of {@link DiscardDepositResponse }
     * 
     */
    public DiscardDepositResponse createDiscardDepositResponse() {
        return new DiscardDepositResponse();
    }

    /**
     * Create an instance of {@link UpdateDepositMetadata }
     * 
     */
    public UpdateDepositMetadata createUpdateDepositMetadata() {
        return new UpdateDepositMetadata();
    }

    /**
     * Create an instance of {@link DigestMethodType }
     * 
     */
    public DigestMethodType createDigestMethodType() {
        return new DigestMethodType();
    }

    /**
     * Create an instance of {@link GrantUpdateResponse }
     * 
     */
    public GrantUpdateResponse createGrantUpdateResponse() {
        return new GrantUpdateResponse();
    }

    /**
     * Create an instance of {@link IndexMapping }
     * 
     */
    public IndexMapping createIndexMapping() {
        return new IndexMapping();
    }

    /**
     * Create an instance of {@link UpdateCertificate }
     * 
     */
    public UpdateCertificate createUpdateCertificate() {
        return new UpdateCertificate();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link Safebox }
     * 
     */
    public Safebox createSafebox() {
        return new Safebox();
    }

    /**
     * Create an instance of {@link ReadCertificateResponse }
     * 
     */
    public ReadCertificateResponse createReadCertificateResponse() {
        return new ReadCertificateResponse();
    }

    /**
     * Create an instance of {@link EncryptionPropertiesType }
     * 
     */
    public EncryptionPropertiesType createEncryptionPropertiesType() {
        return new EncryptionPropertiesType();
    }

    /**
     * Create an instance of {@link RemoveAuthorizationsResponse }
     * 
     */
    public RemoveAuthorizationsResponse createRemoveAuthorizationsResponse() {
        return new RemoveAuthorizationsResponse();
    }

    /**
     * Create an instance of {@link GrantExport }
     * 
     */
    public GrantExport createGrantExport() {
        return new GrantExport();
    }

    /**
     * Create an instance of {@link SignatureMethodType }
     * 
     */
    public SignatureMethodType createSignatureMethodType() {
        return new SignatureMethodType();
    }

    /**
     * Create an instance of {@link RSAKeyValueType }
     * 
     */
    public RSAKeyValueType createRSAKeyValueType() {
        return new RSAKeyValueType();
    }

    /**
     * Create an instance of {@link EnvironmentFaultInfo }
     * 
     */
    public EnvironmentFaultInfo createEnvironmentFaultInfo() {
        return new EnvironmentFaultInfo();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link EncryptedKeyType }
     * 
     */
    public EncryptedKeyType createEncryptedKeyType() {
        return new EncryptedKeyType();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link GrantDeleteResponse }
     * 
     */
    public GrantDeleteResponse createGrantDeleteResponse() {
        return new GrantDeleteResponse();
    }

    /**
     * Create an instance of {@link SignaturePropertyType }
     * 
     */
    public SignaturePropertyType createSignaturePropertyType() {
        return new SignaturePropertyType();
    }

    /**
     * Create an instance of {@link Read }
     * 
     */
    public Read createRead() {
        return new Read();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link AddAuthorizations }
     * 
     */
    public AddAuthorizations createAddAuthorizations() {
        return new AddAuthorizations();
    }

    /**
     * Create an instance of {@link NextSafeboxes }
     * 
     */
    public NextSafeboxes createNextSafeboxes() {
        return new NextSafeboxes();
    }

    /**
     * Create an instance of {@link ChangeAccessPermissions }
     * 
     */
    public ChangeAccessPermissions createChangeAccessPermissions() {
        return new ChangeAccessPermissions();
    }

    /**
     * Create an instance of {@link EncryptionPropertyType }
     * 
     */
    public EncryptionPropertyType createEncryptionPropertyType() {
        return new EncryptionPropertyType();
    }

    /**
     * Create an instance of {@link X509IssuerSerialType }
     * 
     */
    public X509IssuerSerialType createX509IssuerSerialType() {
        return new X509IssuerSerialType();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link FindDepositsResponse }
     * 
     */
    public FindDepositsResponse createFindDepositsResponse() {
        return new FindDepositsResponse();
    }

    /**
     * Create an instance of {@link DepositProof }
     * 
     */
    public DepositProof createDepositProof() {
        return new DepositProof();
    }

    /**
     * Create an instance of {@link ReferenceList }
     * 
     */
    public ReferenceList createReferenceList() {
        return new ReferenceList();
    }

    /**
     * Create an instance of {@link CreateDeposit }
     * 
     */
    public CreateDeposit createCreateDeposit() {
        return new CreateDeposit();
    }

    /**
     * Create an instance of {@link FindCertificatesResponseContent }
     * 
     */
    public FindCertificatesResponseContent createFindCertificatesResponseContent() {
        return new FindCertificatesResponseContent();
    }

    /**
     * Create an instance of {@link NextDepositsResponseContent }
     * 
     */
    public NextDepositsResponseContent createNextDepositsResponseContent() {
        return new NextDepositsResponseContent();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     * 
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link HashComparisonStatus }
     * 
     */
    public HashComparisonStatus createHashComparisonStatus() {
        return new HashComparisonStatus();
    }

    /**
     * Create an instance of {@link CreateOrgunit }
     * 
     */
    public CreateOrgunit createCreateOrgunit() {
        return new CreateOrgunit();
    }

    /**
     * Create an instance of {@link FindSafeboxes }
     * 
     */
    public FindSafeboxes createFindSafeboxes() {
        return new FindSafeboxes();
    }

    /**
     * Create an instance of {@link GrantWriteResponse }
     * 
     */
    public GrantWriteResponse createGrantWriteResponse() {
        return new GrantWriteResponse();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link ChangeAccessPermissionsResponse }
     * 
     */
    public ChangeAccessPermissionsResponse createChangeAccessPermissionsResponse() {
        return new ChangeAccessPermissionsResponse();
    }

    /**
     * Create an instance of {@link DataRef }
     * 
     */
    public DataRef createDataRef() {
        return new DataRef();
    }

    /**
     * Create an instance of {@link ReadSafeboxResponse }
     * 
     */
    public ReadSafeboxResponse createReadSafeboxResponse() {
        return new ReadSafeboxResponse();
    }

    /**
     * Create an instance of {@link ValidationStatus }
     * 
     */
    public ValidationStatus createValidationStatus() {
        return new ValidationStatus();
    }

    /**
     * Create an instance of {@link ReadOrgunitResponse }
     * 
     */
    public ReadOrgunitResponse createReadOrgunitResponse() {
        return new ReadOrgunitResponse();
    }

    /**
     * Create an instance of {@link DepositMetadatas }
     * 
     */
    public DepositMetadatas createDepositMetadatas() {
        return new DepositMetadatas();
    }

    /**
     * Create an instance of {@link CanonicalizationMethodType }
     * 
     */
    public CanonicalizationMethodType createCanonicalizationMethodType() {
        return new CanonicalizationMethodType();
    }

    /**
     * Create an instance of {@link ReadUserResponse }
     * 
     */
    public ReadUserResponse createReadUserResponse() {
        return new ReadUserResponse();
    }

    /**
     * Create an instance of {@link NextDeposits }
     * 
     */
    public NextDeposits createNextDeposits() {
        return new NextDeposits();
    }

    /**
     * Create an instance of {@link Certificate }
     * 
     */
    public Certificate createCertificate() {
        return new Certificate();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link FindDeposits }
     * 
     */
    public FindDeposits createFindDeposits() {
        return new FindDeposits();
    }

    /**
     * Create an instance of {@link ReadDepositResponse }
     * 
     */
    public ReadDepositResponse createReadDepositResponse() {
        return new ReadDepositResponse();
    }

    /**
     * Create an instance of {@link Metadatas }
     * 
     */
    public Metadatas createMetadatas() {
        return new Metadatas();
    }

    /**
     * Create an instance of {@link NextCertificatesResponseContent }
     * 
     */
    public NextCertificatesResponseContent createNextCertificatesResponseContent() {
        return new NextCertificatesResponseContent();
    }

    /**
     * Create an instance of {@link AgreementMethodType }
     * 
     */
    public AgreementMethodType createAgreementMethodType() {
        return new AgreementMethodType();
    }

    /**
     * Create an instance of {@link GrantRead }
     * 
     */
    public GrantRead createGrantRead() {
        return new GrantRead();
    }

    /**
     * Create an instance of {@link AddAuthorizationsResponse }
     * 
     */
    public AddAuthorizationsResponse createAddAuthorizationsResponse() {
        return new AddAuthorizationsResponse();
    }

    /**
     * Create an instance of {@link FileSourcePath }
     * 
     */
    public FileSourcePath createFileSourcePath() {
        return new FileSourcePath();
    }

    /**
     * Create an instance of {@link TransformsType2 }
     * 
     */
    public TransformsType2 createTransformsType2() {
        return new TransformsType2();
    }

    /**
     * Create an instance of {@link GrantWriteResponseContent }
     * 
     */
    public GrantWriteResponseContent createGrantWriteResponseContent() {
        return new GrantWriteResponseContent();
    }

    /**
     * Create an instance of {@link EncryptedDatas }
     * 
     */
    public EncryptedDatas createEncryptedDatas() {
        return new EncryptedDatas();
    }

    /**
     * Create an instance of {@link GrantDeleteResponseContent }
     * 
     */
    public GrantDeleteResponseContent createGrantDeleteResponseContent() {
        return new GrantDeleteResponseContent();
    }

    /**
     * Create an instance of {@link FindDepositsResponseContent }
     * 
     */
    public FindDepositsResponseContent createFindDepositsResponseContent() {
        return new FindDepositsResponseContent();
    }

    /**
     * Create an instance of {@link CreateSafebox }
     * 
     */
    public CreateSafebox createCreateSafebox() {
        return new CreateSafebox();
    }

    /**
     * Create an instance of {@link RetrievalMethodType }
     * 
     */
    public RetrievalMethodType createRetrievalMethodType() {
        return new RetrievalMethodType();
    }

    /**
     * Create an instance of {@link UpdateDeposit }
     * 
     */
    public UpdateDeposit createUpdateDeposit() {
        return new UpdateDeposit();
    }

    /**
     * Create an instance of {@link DepositProofType }
     * 
     */
    public DepositProofType createDepositProofType() {
        return new DepositProofType();
    }

    /**
     * Create an instance of {@link SAMLToken }
     * 
     */
    public SAMLToken createSAMLToken() {
        return new SAMLToken();
    }

    /**
     * Create an instance of {@link Orgunit }
     * 
     */
    public Orgunit createOrgunit() {
        return new Orgunit();
    }

    /**
     * Create an instance of {@link EncryptionMethodType }
     * 
     */
    public EncryptionMethodType createEncryptionMethodType() {
        return new EncryptionMethodType();
    }

    /**
     * Create an instance of {@link CipherReferenceType }
     * 
     */
    public CipherReferenceType createCipherReferenceType() {
        return new CipherReferenceType();
    }

    /**
     * Create an instance of {@link SPKIDataType }
     * 
     */
    public SPKIDataType createSPKIDataType() {
        return new SPKIDataType();
    }

    /**
     * Create an instance of {@link FileSourcePathList }
     * 
     */
    public FileSourcePathList createFileSourcePathList() {
        return new FileSourcePathList();
    }

    /**
     * Create an instance of {@link UpdateSafebox }
     * 
     */
    public UpdateSafebox createUpdateSafebox() {
        return new UpdateSafebox();
    }

    /**
     * Create an instance of {@link CreateCertificate }
     * 
     */
    public CreateCertificate createCreateCertificate() {
        return new CreateCertificate();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link NextCertificates }
     * 
     */
    public NextCertificates createNextCertificates() {
        return new NextCertificates();
    }

    /**
     * Create an instance of {@link EncryptedKeys }
     * 
     */
    public EncryptedKeys createEncryptedKeys() {
        return new EncryptedKeys();
    }

    /**
     * Create an instance of {@link OrderBy }
     * 
     */
    public OrderBy createOrderBy() {
        return new OrderBy();
    }

    /**
     * Create an instance of {@link NextSafeboxesResponseContent }
     * 
     */
    public NextSafeboxesResponseContent createNextSafeboxesResponseContent() {
        return new NextSafeboxesResponseContent();
    }

    /**
     * Create an instance of {@link GrantExportResponse }
     * 
     */
    public GrantExportResponse createGrantExportResponse() {
        return new GrantExportResponse();
    }

    /**
     * Create an instance of {@link GrantDelete }
     * 
     */
    public GrantDelete createGrantDelete() {
        return new GrantDelete();
    }

    /**
     * Create an instance of {@link AccessPermissions }
     * 
     */
    public AccessPermissions createAccessPermissions() {
        return new AccessPermissions();
    }

    /**
     * Create an instance of {@link FindCertificates }
     * 
     */
    public FindCertificates createFindCertificates() {
        return new FindCertificates();
    }

    /**
     * Create an instance of {@link RestoreDeposit }
     * 
     */
    public RestoreDeposit createRestoreDeposit() {
        return new RestoreDeposit();
    }

    /**
     * Create an instance of {@link FindSafeboxesResponseContent }
     * 
     */
    public FindSafeboxesResponseContent createFindSafeboxesResponseContent() {
        return new FindSafeboxesResponseContent();
    }

    /**
     * Create an instance of {@link GrantUpdate }
     * 
     */
    public GrantUpdate createGrantUpdate() {
        return new GrantUpdate();
    }

    /**
     * Create an instance of {@link Certificates }
     * 
     */
    public Certificates createCertificates() {
        return new Certificates();
    }

    /**
     * Create an instance of {@link ImportDepositResponseContent }
     * 
     */
    public ImportDepositResponseContent createImportDepositResponseContent() {
        return new ImportDepositResponseContent();
    }

    /**
     * Create an instance of {@link DiscardDeposit }
     * 
     */
    public DiscardDeposit createDiscardDeposit() {
        return new DiscardDeposit();
    }

    /**
     * Create an instance of {@link GrantReadResponseContent }
     * 
     */
    public GrantReadResponseContent createGrantReadResponseContent() {
        return new GrantReadResponseContent();
    }

    /**
     * Create an instance of {@link GrantUpdateResponseContent }
     * 
     */
    public GrantUpdateResponseContent createGrantUpdateResponseContent() {
        return new GrantUpdateResponseContent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKISexp", scope = SPKIDataType.class)
    public JAXBElement<byte[]> createSPKIDataTypeSPKISexp(byte[] value) {
        return new JAXBElement<byte[]>(_SPKIDataTypeSPKISexp_QNAME, byte[].class, SPKIDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "EncryptionProperty")
    public JAXBElement<EncryptionPropertyType> createEncryptionProperty(EncryptionPropertyType value) {
        return new JAXBElement<EncryptionPropertyType>(_EncryptionProperty_QNAME, EncryptionPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPData")
    public JAXBElement<PGPDataType> createPGPData(PGPDataType value) {
        return new JAXBElement<PGPDataType>(_PGPData_QNAME, PGPDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCertificate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "updateCertificate")
    public JAXBElement<UpdateCertificate> createUpdateCertificate(UpdateCertificate value) {
        return new JAXBElement<UpdateCertificate>(_UpdateCertificate_QNAME, UpdateCertificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptedKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "EncryptedKey")
    public JAXBElement<EncryptedKeyType> createEncryptedKey(EncryptedKeyType value) {
        return new JAXBElement<EncryptedKeyType>(_EncryptedKey_QNAME, EncryptedKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscardDepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "discardDepositResponse")
    public JAXBElement<DiscardDepositResponse> createDiscardDepositResponse(DiscardDepositResponse value) {
        return new JAXBElement<DiscardDepositResponse>(_DiscardDepositResponse_QNAME, DiscardDepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAuthorizationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "removeAuthorizationsResponse")
    public JAXBElement<RemoveAuthorizationsResponse> createRemoveAuthorizationsResponse(RemoveAuthorizationsResponse value) {
        return new JAXBElement<RemoveAuthorizationsResponse>(_RemoveAuthorizationsResponse_QNAME, RemoveAuthorizationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "updateSafeboxResponse")
    public JAXBElement<UpdateResponse> createUpdateSafeboxResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateSafeboxResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKIData")
    public JAXBElement<SPKIDataType> createSPKIData(SPKIDataType value) {
        return new JAXBElement<SPKIDataType>(_SPKIData_QNAME, SPKIDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantExportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantExportResponse")
    public JAXBElement<GrantExportResponse> createGrantExportResponse(GrantExportResponse value) {
        return new JAXBElement<GrantExportResponse>(_GrantExportResponse_QNAME, GrantExportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCertificates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "findCertificates")
    public JAXBElement<FindCertificates> createFindCertificates(FindCertificates value) {
        return new JAXBElement<FindCertificates>(_FindCertificates_QNAME, FindCertificates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Certificates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", name = "certificates")
    public JAXBElement<Certificates> createCertificates(Certificates value) {
        return new JAXBElement<Certificates>(_Certificates_QNAME, Certificates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanonicalizationMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "CanonicalizationMethod")
    public JAXBElement<CanonicalizationMethodType> createCanonicalizationMethod(CanonicalizationMethodType value) {
        return new JAXBElement<CanonicalizationMethodType>(_CanonicalizationMethod_QNAME, CanonicalizationMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Read }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "readDeposit")
    public JAXBElement<Read> createReadDeposit(Read value) {
        return new JAXBElement<Read>(_ReadDeposit_QNAME, Read.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "UserFaultElement")
    public JAXBElement<UserFaultInfo> createUserFaultElement(UserFaultInfo value) {
        return new JAXBElement<UserFaultInfo>(_UserFaultElement_QNAME, UserFaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDepositsResponseContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "findDepositsResponseContent")
    public JAXBElement<FindDepositsResponseContent> createFindDepositsResponseContent(FindDepositsResponseContent value) {
        return new JAXBElement<FindDepositsResponseContent>(_FindDepositsResponseContent_QNAME, FindDepositsResponseContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transforms")
    public JAXBElement<TransformsType> createTransforms(TransformsType value) {
        return new JAXBElement<TransformsType>(_Transforms_QNAME, TransformsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManifestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Manifest")
    public JAXBElement<ManifestType> createManifest(ManifestType value) {
        return new JAXBElement<ManifestType>(_Manifest_QNAME, ManifestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantDeleteResponseContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantDeleteResponseContent")
    public JAXBElement<GrantDeleteResponseContent> createGrantDeleteResponseContent(GrantDeleteResponseContent value) {
        return new JAXBElement<GrantDeleteResponseContent>(_GrantDeleteResponseContent_QNAME, GrantDeleteResponseContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Read }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "readUser")
    public JAXBElement<Read> createReadUser(Read value) {
        return new JAXBElement<Read>(_ReadUser_QNAME, Read.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositProofType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", name = "depositProof")
    public JAXBElement<DepositProofType> createDepositProof(DepositProofType value) {
        return new JAXBElement<DepositProofType>(_DepositProof_QNAME, DepositProofType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDeposits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "findDeposits")
    public JAXBElement<FindDeposits> createFindDeposits(FindDeposits value) {
        return new JAXBElement<FindDeposits>(_FindDeposits_QNAME, FindDeposits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentFaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "EnvironmentFaultElement")
    public JAXBElement<EnvironmentFaultInfo> createEnvironmentFaultElement(EnvironmentFaultInfo value) {
        return new JAXBElement<EnvironmentFaultInfo>(_EnvironmentFaultElement_QNAME, EnvironmentFaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "readUserResponse")
    public JAXBElement<ReadUserResponse> createReadUserResponse(ReadUserResponse value) {
        return new JAXBElement<ReadUserResponse>(_ReadUserResponse_QNAME, ReadUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureMethod")
    public JAXBElement<SignatureMethodType> createSignatureMethod(SignatureMethodType value) {
        return new JAXBElement<SignatureMethodType>(_SignatureMethod_QNAME, SignatureMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCertificate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "createCertificate")
    public JAXBElement<CreateCertificate> createCreateCertificate(CreateCertificate value) {
        return new JAXBElement<CreateCertificate>(_CreateCertificate_QNAME, CreateCertificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscardDeposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "discardDeposit")
    public JAXBElement<DiscardDeposit> createDiscardDeposit(DiscardDeposit value) {
        return new JAXBElement<DiscardDeposit>(_DiscardDeposit_QNAME, DiscardDeposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSafebox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "createSafebox")
    public JAXBElement<CreateSafebox> createCreateSafebox(CreateSafebox value) {
        return new JAXBElement<CreateSafebox>(_CreateSafebox_QNAME, CreateSafebox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyInfo")
    public JAXBElement<KeyInfoType> createKeyInfo(KeyInfoType value) {
        return new JAXBElement<KeyInfoType>(_KeyInfo_QNAME, KeyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigestMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestMethod")
    public JAXBElement<DigestMethodType> createDigestMethod(DigestMethodType value) {
        return new JAXBElement<DigestMethodType>(_DigestMethod_QNAME, DigestMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuthorizations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "addAuthorizations")
    public JAXBElement<AddAuthorizations> createAddAuthorizations(AddAuthorizations value) {
        return new JAXBElement<AddAuthorizations>(_AddAuthorizations_QNAME, AddAuthorizations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "MgmtData")
    public JAXBElement<String> createMgmtData(String value) {
        return new JAXBElement<String>(_MgmtData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "deleteCertificate")
    public JAXBElement<Delete> createDeleteCertificate(Delete value) {
        return new JAXBElement<Delete>(_DeleteCertificate_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Read }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "readOrgunit")
    public JAXBElement<Read> createReadOrgunit(Read value) {
        return new JAXBElement<Read>(_ReadOrgunit_QNAME, Read.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Read }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "readCertificate")
    public JAXBElement<Read> createReadCertificate(Read value) {
        return new JAXBElement<Read>(_ReadCertificate_QNAME, Read.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CipherDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "CipherData")
    public JAXBElement<CipherDataType> createCipherData(CipherDataType value) {
        return new JAXBElement<CipherDataType>(_CipherData_QNAME, CipherDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Safebox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", name = "safebox")
    public JAXBElement<Safebox> createSafebox(Safebox value) {
        return new JAXBElement<Safebox>(_Safebox_QNAME, Safebox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantUpdateResponseContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantUpdateResponseContent")
    public JAXBElement<GrantUpdateResponseContent> createGrantUpdateResponseContent(GrantUpdateResponseContent value) {
        return new JAXBElement<GrantUpdateResponseContent>(_GrantUpdateResponseContent_QNAME, GrantUpdateResponseContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextSafeboxesResponseContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "nextSafeboxesResponseContent")
    public JAXBElement<NextSafeboxesResponseContent> createNextSafeboxesResponseContent(NextSafeboxesResponseContent value) {
        return new JAXBElement<NextSafeboxesResponseContent>(_NextSafeboxesResponseContent_QNAME, NextSafeboxesResponseContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignedInfo")
    public JAXBElement<SignedInfoType> createSignedInfo(SignedInfoType value) {
        return new JAXBElement<SignedInfoType>(_SignedInfo_QNAME, SignedInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "updateCertificateResponse")
    public JAXBElement<UpdateResponse> createUpdateCertificateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateCertificateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Object")
    public JAXBElement<ObjectType> createObject(ObjectType value) {
        return new JAXBElement<ObjectType>(_Object_QNAME, ObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "updateDepositResponse")
    public JAXBElement<UpdateResponse> createUpdateDepositResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateDepositResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantDelete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantDelete")
    public JAXBElement<GrantDelete> createGrantDelete(GrantDelete value) {
        return new JAXBElement<GrantDelete>(_GrantDelete_QNAME, GrantDelete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSafeboxesResponseContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "findSafeboxesResponseContent")
    public JAXBElement<FindSafeboxesResponseContent> createFindSafeboxesResponseContent(FindSafeboxesResponseContent value) {
        return new JAXBElement<FindSafeboxesResponseContent>(_FindSafeboxesResponseContent_QNAME, FindSafeboxesResponseContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextSafeboxes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "nextSafeboxes")
    public JAXBElement<NextSafeboxes> createNextSafeboxes(NextSafeboxes value) {
        return new JAXBElement<NextSafeboxes>(_NextSafeboxes_QNAME, NextSafeboxes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportDeposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "importDeposit")
    public JAXBElement<ImportDeposit> createImportDeposit(ImportDeposit value) {
        return new JAXBElement<ImportDeposit>(_ImportDeposit_QNAME, ImportDeposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantUpdate")
    public JAXBElement<GrantUpdate> createGrantUpdate(GrantUpdate value) {
        return new JAXBElement<GrantUpdate>(_GrantUpdate_QNAME, GrantUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "readDepositResponse")
    public JAXBElement<ReadDepositResponse> createReadDepositResponse(ReadDepositResponse value) {
        return new JAXBElement<ReadDepositResponse>(_ReadDepositResponse_QNAME, ReadDepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Data")
    public JAXBElement<X509DataType> createX509Data(X509DataType value) {
        return new JAXBElement<X509DataType>(_X509Data_QNAME, X509DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "updateOrgunitResponse")
    public JAXBElement<UpdateResponse> createUpdateOrgunitResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateOrgunitResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDepositMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "updateDepositMetadata")
    public JAXBElement<UpdateDepositMetadata> createUpdateDepositMetadata(UpdateDepositMetadata value) {
        return new JAXBElement<UpdateDepositMetadata>(_UpdateDepositMetadata_QNAME, UpdateDepositMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperties")
    public JAXBElement<SignaturePropertiesType> createSignatureProperties(SignaturePropertiesType value) {
        return new JAXBElement<SignaturePropertiesType>(_SignatureProperties_QNAME, SignaturePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authorizations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", name = "authorizations")
    public JAXBElement<Authorizations> createAuthorizations(Authorizations value) {
        return new JAXBElement<Authorizations>(_Authorizations_QNAME, Authorizations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyName")
    public JAXBElement<String> createKeyName(String value) {
        return new JAXBElement<String>(_KeyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "deleteUser")
    public JAXBElement<Delete> createDeleteUser(Delete value) {
        return new JAXBElement<Delete>(_DeleteUser_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeAccessPermissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "changeAccessPermissions")
    public JAXBElement<ChangeAccessPermissions> createChangeAccessPermissions(ChangeAccessPermissions value) {
        return new JAXBElement<ChangeAccessPermissions>(_ChangeAccessPermissions_QNAME, ChangeAccessPermissions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoreDeposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "restoreDeposit")
    public JAXBElement<RestoreDeposit> createRestoreDeposit(RestoreDeposit value) {
        return new JAXBElement<RestoreDeposit>(_RestoreDeposit_QNAME, RestoreDeposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportDepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "importDepositResponse")
    public JAXBElement<ImportDepositResponse> createImportDepositResponse(ImportDepositResponse value) {
        return new JAXBElement<ImportDepositResponse>(_ImportDepositResponse_QNAME, ImportDepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "deleteOrgunit")
    public JAXBElement<Delete> createDeleteOrgunit(Delete value) {
        return new JAXBElement<Delete>(_DeleteOrgunit_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantReadResponse")
    public JAXBElement<GrantReadResponse> createGrantReadResponse(GrantReadResponse value) {
        return new JAXBElement<GrantReadResponse>(_GrantReadResponse_QNAME, GrantReadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCertificateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "readCertificateResponse")
    public JAXBElement<ReadCertificateResponse> createReadCertificateResponse(ReadCertificateResponse value) {
        return new JAXBElement<ReadCertificateResponse>(_ReadCertificateResponse_QNAME, ReadCertificateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantDeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantDeleteResponse")
    public JAXBElement<GrantDeleteResponse> createGrantDeleteResponse(GrantDeleteResponse value) {
        return new JAXBElement<GrantDeleteResponse>(_GrantDeleteResponse_QNAME, GrantDeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "createSafeboxResponse")
    public JAXBElement<CreateResponse> createCreateSafeboxResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateSafeboxResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportDepositResponseContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "importDepositResponseContent")
    public JAXBElement<ImportDepositResponseContent> createImportDepositResponseContent(ImportDepositResponseContent value) {
        return new JAXBElement<ImportDepositResponseContent>(_ImportDepositResponseContent_QNAME, ImportDepositResponseContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextCertificates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "nextCertificates")
    public JAXBElement<NextCertificates> createNextCertificates(NextCertificates value) {
        return new JAXBElement<NextCertificates>(_NextCertificates_QNAME, NextCertificates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "createCertificateResponse")
    public JAXBElement<CreateResponse> createCreateCertificateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateCertificateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RetrievalMethod")
    public JAXBElement<RetrievalMethodType> createRetrievalMethod(RetrievalMethodType value) {
        return new JAXBElement<RetrievalMethodType>(_RetrievalMethod_QNAME, RetrievalMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantWriteResponseContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantWriteResponseContent")
    public JAXBElement<GrantWriteResponseContent> createGrantWriteResponseContent(GrantWriteResponseContent value) {
        return new JAXBElement<GrantWriteResponseContent>(_GrantWriteResponseContent_QNAME, GrantWriteResponseContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoreDepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "restoreDepositResponse")
    public JAXBElement<RestoreDepositResponse> createRestoreDepositResponse(RestoreDepositResponse value) {
        return new JAXBElement<RestoreDepositResponse>(_RestoreDepositResponse_QNAME, RestoreDepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantWrite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantWrite")
    public JAXBElement<GrantWrite> createGrantWrite(GrantWrite value) {
        return new JAXBElement<GrantWrite>(_GrantWrite_QNAME, GrantWrite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "deleteDeposit")
    public JAXBElement<Delete> createDeleteDeposit(Delete value) {
        return new JAXBElement<Delete>(_DeleteDeposit_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSafeboxes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "findSafeboxes")
    public JAXBElement<FindSafeboxes> createFindSafeboxes(FindSafeboxes value) {
        return new JAXBElement<FindSafeboxes>(_FindSafeboxes_QNAME, FindSafeboxes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SAMLToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", name = "securityToken")
    public JAXBElement<SAMLToken> createSecurityToken(SAMLToken value) {
        return new JAXBElement<SAMLToken>(_SecurityToken_QNAME, SAMLToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CipherReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "CipherReference")
    public JAXBElement<CipherReferenceType> createCipherReference(CipherReferenceType value) {
        return new JAXBElement<CipherReferenceType>(_CipherReference_QNAME, CipherReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "deleteDepositResponse")
    public JAXBElement<DeleteResponse> createDeleteDepositResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteDepositResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "deleteUserResponse")
    public JAXBElement<DeleteResponse> createDeleteUserResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteUserResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperty")
    public JAXBElement<SignaturePropertyType> createSignatureProperty(SignaturePropertyType value) {
        return new JAXBElement<SignaturePropertyType>(_SignatureProperty_QNAME, SignaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSafeboxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "readSafeboxResponse")
    public JAXBElement<ReadSafeboxResponse> createReadSafeboxResponse(ReadSafeboxResponse value) {
        return new JAXBElement<ReadSafeboxResponse>(_ReadSafeboxResponse_QNAME, ReadSafeboxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCertificatesResponseContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "findCertificatesResponseContent")
    public JAXBElement<FindCertificatesResponseContent> createFindCertificatesResponseContent(FindCertificatesResponseContent value) {
        return new JAXBElement<FindCertificatesResponseContent>(_FindCertificatesResponseContent_QNAME, FindCertificatesResponseContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantUpdateResponse")
    public JAXBElement<GrantUpdateResponse> createGrantUpdateResponse(GrantUpdateResponse value) {
        return new JAXBElement<GrantUpdateResponse>(_GrantUpdateResponse_QNAME, GrantUpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextDeposits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "nextDeposits")
    public JAXBElement<NextDeposits> createNextDeposits(NextDeposits value) {
        return new JAXBElement<NextDeposits>(_NextDeposits_QNAME, NextDeposits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDepositsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "findDepositsResponse")
    public JAXBElement<FindDepositsResponse> createFindDepositsResponse(FindDepositsResponse value) {
        return new JAXBElement<FindDepositsResponse>(_FindDepositsResponse_QNAME, FindDepositsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptedDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "EncryptedData")
    public JAXBElement<EncryptedDataType> createEncryptedData(EncryptedDataType value) {
        return new JAXBElement<EncryptedDataType>(_EncryptedData_QNAME, EncryptedDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrgunit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "updateOrgunit")
    public JAXBElement<UpdateOrgunit> createUpdateOrgunit(UpdateOrgunit value) {
        return new JAXBElement<UpdateOrgunit>(_UpdateOrgunit_QNAME, UpdateOrgunit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Reference")
    public JAXBElement<ReferenceType> createReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_Reference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSafeboxesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "findSafeboxesResponse")
    public JAXBElement<FindSafeboxesResponse> createFindSafeboxesResponse(FindSafeboxesResponse value) {
        return new JAXBElement<FindSafeboxesResponse>(_FindSafeboxesResponse_QNAME, FindSafeboxesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "updateUserResponse")
    public JAXBElement<UpdateResponse> createUpdateUserResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateUserResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantRead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantRead")
    public JAXBElement<GrantRead> createGrantRead(GrantRead value) {
        return new JAXBElement<GrantRead>(_GrantRead_QNAME, GrantRead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RSAKeyValue")
    public JAXBElement<RSAKeyValueType> createRSAKeyValue(RSAKeyValueType value) {
        return new JAXBElement<RSAKeyValueType>(_RSAKeyValue_QNAME, RSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Orgunit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", name = "orgunit")
    public JAXBElement<Orgunit> createOrgunit(Orgunit value) {
        return new JAXBElement<Orgunit>(_Orgunit_QNAME, Orgunit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadOrgunitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "readOrgunitResponse")
    public JAXBElement<ReadOrgunitResponse> createReadOrgunitResponse(ReadOrgunitResponse value) {
        return new JAXBElement<ReadOrgunitResponse>(_ReadOrgunitResponse_QNAME, ReadOrgunitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "createUserResponse")
    public JAXBElement<CreateResponse> createCreateUserResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateUserResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Certificate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", name = "certificate")
    public JAXBElement<Certificate> createCertificate(Certificate value) {
        return new JAXBElement<Certificate>(_Certificate_QNAME, Certificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DSAKeyValue")
    public JAXBElement<DSAKeyValueType> createDSAKeyValue(DSAKeyValueType value) {
        return new JAXBElement<DSAKeyValueType>(_DSAKeyValue_QNAME, DSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "createDepositResponse")
    public JAXBElement<CreateResponse> createCreateDepositResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateDepositResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "deleteCertificateResponse")
    public JAXBElement<DeleteResponse> createDeleteCertificateResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteCertificateResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrgunit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "createOrgunit")
    public JAXBElement<CreateOrgunit> createCreateOrgunit(CreateOrgunit value) {
        return new JAXBElement<CreateOrgunit>(_CreateOrgunit_QNAME, CreateOrgunit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "deleteSafeboxResponse")
    public JAXBElement<DeleteResponse> createDeleteSafeboxResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteSafeboxResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "updateDeposit")
    public JAXBElement<UpdateDeposit> createUpdateDeposit(UpdateDeposit value) {
        return new JAXBElement<UpdateDeposit>(_UpdateDeposit_QNAME, UpdateDeposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Metadatas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", name = "metadatas")
    public JAXBElement<Metadatas> createMetadatas(Metadatas value) {
        return new JAXBElement<Metadatas>(_Metadatas_QNAME, Metadatas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuthorizationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "addAuthorizationsResponse")
    public JAXBElement<AddAuthorizationsResponse> createAddAuthorizationsResponse(AddAuthorizationsResponse value) {
        return new JAXBElement<AddAuthorizationsResponse>(_AddAuthorizationsResponse_QNAME, AddAuthorizationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "createOrgunitResponse")
    public JAXBElement<CreateResponse> createCreateOrgunitResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateOrgunitResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "deleteOrgunitResponse")
    public JAXBElement<DeleteResponse> createDeleteOrgunitResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteOrgunitResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/xsd/v2010_10/Common", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureValue")
    public JAXBElement<SignatureValueType> createSignatureValue(SignatureValueType value) {
        return new JAXBElement<SignatureValueType>(_SignatureValue_QNAME, SignatureValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transform")
    public JAXBElement<TransformType> createTransform(TransformType value) {
        return new JAXBElement<TransformType>(_Transform_QNAME, TransformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "EncryptionProperties")
    public JAXBElement<EncryptionPropertiesType> createEncryptionProperties(EncryptionPropertiesType value) {
        return new JAXBElement<EncryptionPropertiesType>(_EncryptionProperties_QNAME, EncryptionPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSafebox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "updateSafebox")
    public JAXBElement<UpdateSafebox> createUpdateSafebox(UpdateSafebox value) {
        return new JAXBElement<UpdateSafebox>(_UpdateSafebox_QNAME, UpdateSafebox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "deleteSafebox")
    public JAXBElement<Delete> createDeleteSafebox(Delete value) {
        return new JAXBElement<Delete>(_DeleteSafebox_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "AgreementMethod")
    public JAXBElement<AgreementMethodType> createAgreementMethod(AgreementMethodType value) {
        return new JAXBElement<AgreementMethodType>(_AgreementMethod_QNAME, AgreementMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCertificatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "findCertificatesResponse")
    public JAXBElement<FindCertificatesResponse> createFindCertificatesResponse(FindCertificatesResponse value) {
        return new JAXBElement<FindCertificatesResponse>(_FindCertificatesResponse_QNAME, FindCertificatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAuthorizations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "removeAuthorizations")
    public JAXBElement<RemoveAuthorizations> createRemoveAuthorizations(RemoveAuthorizations value) {
        return new JAXBElement<RemoveAuthorizations>(_RemoveAuthorizations_QNAME, RemoveAuthorizations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "updateDepositMetadataResponse")
    public JAXBElement<UpdateResponse> createUpdateDepositMetadataResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateDepositMetadataResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<byte[]>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextDepositsResponseContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "nextDepositsResponseContent")
    public JAXBElement<NextDepositsResponseContent> createNextDepositsResponseContent(NextDepositsResponseContent value) {
        return new JAXBElement<NextDepositsResponseContent>(_NextDepositsResponseContent_QNAME, NextDepositsResponseContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeAccessPermissionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "changeAccessPermissionsResponse")
    public JAXBElement<ChangeAccessPermissionsResponse> createChangeAccessPermissionsResponse(ChangeAccessPermissionsResponse value) {
        return new JAXBElement<ChangeAccessPermissionsResponse>(_ChangeAccessPermissionsResponse_QNAME, ChangeAccessPermissionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyValue")
    public JAXBElement<KeyValueType> createKeyValue(KeyValueType value) {
        return new JAXBElement<KeyValueType>(_KeyValue_QNAME, KeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDeposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "createDeposit")
    public JAXBElement<CreateDeposit> createCreateDeposit(CreateDeposit value) {
        return new JAXBElement<CreateDeposit>(_CreateDeposit_QNAME, CreateDeposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextCertificatesResponseContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "nextCertificatesResponseContent")
    public JAXBElement<NextCertificatesResponseContent> createNextCertificatesResponseContent(NextCertificatesResponseContent value) {
        return new JAXBElement<NextCertificatesResponseContent>(_NextCertificatesResponseContent_QNAME, NextCertificatesResponseContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantExport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantExport")
    public JAXBElement<GrantExport> createGrantExport(GrantExport value) {
        return new JAXBElement<GrantExport>(_GrantExport_QNAME, GrantExport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantReadResponseContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantReadResponseContent")
    public JAXBElement<GrantReadResponseContent> createGrantReadResponseContent(GrantReadResponseContent value) {
        return new JAXBElement<GrantReadResponseContent>(_GrantReadResponseContent_QNAME, GrantReadResponseContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Read }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "readSafebox")
    public JAXBElement<Read> createReadSafebox(Read value) {
        return new JAXBElement<Read>(_ReadSafebox_QNAME, Read.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantWriteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", name = "grantWriteResponse")
    public JAXBElement<GrantWriteResponse> createGrantWriteResponse(GrantWriteResponse value) {
        return new JAXBElement<GrantWriteResponse>(_GrantWriteResponse_QNAME, GrantWriteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509IssuerSerialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509IssuerSerial", scope = X509DataType.class)
    public JAXBElement<X509IssuerSerialType> createX509DataTypeX509IssuerSerial(X509IssuerSerialType value) {
        return new JAXBElement<X509IssuerSerialType>(_X509DataTypeX509IssuerSerial_QNAME, X509IssuerSerialType.class, X509DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Certificate", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509Certificate(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509Certificate_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SKI", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509SKI(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509SKI_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SubjectName", scope = X509DataType.class)
    public JAXBElement<String> createX509DataTypeX509SubjectName(String value) {
        return new JAXBElement<String>(_X509DataTypeX509SubjectName_QNAME, String.class, X509DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509CRL", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509CRL(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509CRL_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "HMACOutputLength", scope = SignatureMethodType.class)
    public JAXBElement<BigInteger> createSignatureMethodTypeHMACOutputLength(BigInteger value) {
        return new JAXBElement<BigInteger>(_SignatureMethodTypeHMACOutputLength_QNAME, BigInteger.class, SignatureMethodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "XPath", scope = TransformType.class)
    public JAXBElement<String> createTransformTypeXPath(String value) {
        return new JAXBElement<String>(_TransformTypeXPath_QNAME, String.class, TransformType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "KeySize", scope = EncryptionMethodType.class)
    public JAXBElement<BigInteger> createEncryptionMethodTypeKeySize(BigInteger value) {
        return new JAXBElement<BigInteger>(_EncryptionMethodTypeKeySize_QNAME, BigInteger.class, EncryptionMethodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "OAEPparams", scope = EncryptionMethodType.class)
    public JAXBElement<byte[]> createEncryptionMethodTypeOAEPparams(byte[] value) {
        return new JAXBElement<byte[]>(_EncryptionMethodTypeOAEPparams_QNAME, byte[].class, EncryptionMethodType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "OriginatorKeyInfo", scope = AgreementMethodType.class)
    public JAXBElement<KeyInfoType> createAgreementMethodTypeOriginatorKeyInfo(KeyInfoType value) {
        return new JAXBElement<KeyInfoType>(_AgreementMethodTypeOriginatorKeyInfo_QNAME, KeyInfoType.class, AgreementMethodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "RecipientKeyInfo", scope = AgreementMethodType.class)
    public JAXBElement<KeyInfoType> createAgreementMethodTypeRecipientKeyInfo(KeyInfoType value) {
        return new JAXBElement<KeyInfoType>(_AgreementMethodTypeRecipientKeyInfo_QNAME, KeyInfoType.class, AgreementMethodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "KA-Nonce", scope = AgreementMethodType.class)
    public JAXBElement<byte[]> createAgreementMethodTypeKANonce(byte[] value) {
        return new JAXBElement<byte[]>(_AgreementMethodTypeKANonce_QNAME, byte[].class, AgreementMethodType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPKeyID", scope = PGPDataType.class)
    public JAXBElement<byte[]> createPGPDataTypePGPKeyID(byte[] value) {
        return new JAXBElement<byte[]>(_PGPDataTypePGPKeyID_QNAME, byte[].class, PGPDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPKeyPacket", scope = PGPDataType.class)
    public JAXBElement<byte[]> createPGPDataTypePGPKeyPacket(byte[] value) {
        return new JAXBElement<byte[]>(_PGPDataTypePGPKeyPacket_QNAME, byte[].class, PGPDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "DataReference", scope = ReferenceList.class)
    public JAXBElement<ReferenceType2> createReferenceListDataReference(ReferenceType2 value) {
        return new JAXBElement<ReferenceType2>(_ReferenceListDataReference_QNAME, ReferenceType2 .class, ReferenceList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "KeyReference", scope = ReferenceList.class)
    public JAXBElement<ReferenceType2> createReferenceListKeyReference(ReferenceType2 value) {
        return new JAXBElement<ReferenceType2>(_ReferenceListKeyReference_QNAME, ReferenceType2 .class, ReferenceList.class, value);
    }

}
