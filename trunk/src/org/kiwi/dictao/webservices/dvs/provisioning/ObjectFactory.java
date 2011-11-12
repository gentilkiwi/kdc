
package org.kiwi.dictao.webservices.dvs.provisioning;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.kiwi.dictao.webservices.dvs.provisioning package. 
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

    private final static QName _ValidFrom_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "ValidFrom");
    private final static QName _AuthenticationType_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "AuthenticationType");
    private final static QName _Login_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Login");
    private final static QName _PasswordIdentifierList_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PasswordIdentifierList");
    private final static QName _Cred_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Cred");
    private final static QName _TokenProfileFailureDetails_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TokenProfileFailureDetails");
    private final static QName _NbResults_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "NbResults");
    private final static QName _UsersOffset_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "UsersOffset");
    private final static QName _GroupIdentifier_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "GroupIdentifier");
    private final static QName _CardSynchronizationInfo_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CardSynchronizationInfo");
    private final static QName _Manufacturer_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Manufacturer");
    private final static QName _CardProfileName_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CardProfileName");
    private final static QName _IssueNumber_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "IssueNumber");
    private final static QName _KeyType_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "KeyType");
    private final static QName _PersonalDataIdentifierList_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PersonalDataIdentifierList");
    private final static QName _ProfileName_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "ProfileName");
    private final static QName _FailureAttemptNumber_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "FailureAttemptNumber");
    private final static QName _CancellationState_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CancellationState");
    private final static QName _Tokens_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Tokens");
    private final static QName _CredentialValue_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CredentialValue");
    private final static QName _CoordIdentifier_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CoordIdentifier");
    private final static QName _CardFeatures_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CardFeatures");
    private final static QName _CryptoAlgo_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CryptoAlgo");
    private final static QName _TKKDI_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TKKDI");
    private final static QName _AddingMode_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "AddingMode");
    private final static QName _CoordFailureDetails_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CoordFailureDetails");
    private final static QName _Token_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Token");
    private final static QName _OTPMode_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "OTPMode");
    private final static QName _ValidUntil_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "ValidUntil");
    private final static QName _Name_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Name");
    private final static QName _PersonalDataValue_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PersonalDataValue");
    private final static QName _DeletingMode_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "DeletingMode");
    private final static QName _Certs_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Certs");
    private final static QName _PersonalDatas_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PersonalDatas");
    private final static QName _TKDerivationType_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TKDerivationType");
    private final static QName _KeyValue_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "KeyValue");
    private final static QName _Card_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Card");
    private final static QName _CardSynchroList_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CardSynchroList");
    private final static QName _CertFailureDetails_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CertFailureDetails");
    private final static QName _UsersNbResponses_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "UsersNbResponses");
    private final static QName _ATCSynchronisation_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "ATCSynchronisation");
    private final static QName _CryptoParams_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CryptoParams");
    private final static QName _ProvisioningPolicyLabel_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "ProvisioningPolicyLabel");
    private final static QName _PasswordFailureDetails_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PasswordFailureDetails");
    private final static QName _TokenProfile_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TokenProfile");
    private final static QName _IADUserData_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "IADUserData");
    private final static QName _Birthday_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Birthday");
    private final static QName _SerialNumber_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "SerialNumber");
    private final static QName _UserAliasList_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "UserAliasList");
    private final static QName _PasswordSalt_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PasswordSalt");
    private final static QName _OTPPlug_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "OTPPlug");
    private final static QName _OTPLength_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "OTPLength");
    private final static QName _TokenKeyIdentifier_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TokenKeyIdentifier");
    private final static QName _UserInfoList_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "UserInfoList");
    private final static QName _Cards_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Cards");
    private final static QName _CoordValue_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CoordValue");
    private final static QName _TokenFeatures_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TokenFeatures");
    private final static QName _MinLength_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "MinLength");
    private final static QName _CoordType_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CoordType");
    private final static QName _CertIdentifier_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CertIdentifier");
    private final static QName _IAF_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "IAF");
    private final static QName _SearchCriteria_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "SearchCriteria");
    private final static QName _UserCertificate_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "UserCertificate");
    private final static QName _CardIdentifierList_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CardIdentifierList");
    private final static QName _USBDriver_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "USBDriver");
    private final static QName _CredType_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CredType");
    private final static QName _TKLocalisation_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TKLocalisation");
    private final static QName _Valid_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Valid");
    private final static QName _PSN_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PSN");
    private final static QName _Cert_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Cert");
    private final static QName _LockingState_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "LockingState");
    private final static QName _IMKLabel_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "IMKLabel");
    private final static QName _OTP1_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "OTP1");
    private final static QName _OTP2_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "OTP2");
    private final static QName _TokenFormat_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TokenFormat");
    private final static QName _PAN_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PAN");
    private final static QName _CVR_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CVR");
    private final static QName _IMKDerivationType_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "IMKDerivationType");
    private final static QName _Password_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Password");
    private final static QName _CardProfile_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CardProfile");
    private final static QName _CVN_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CVN");
    private final static QName _Usable_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Usable");
    private final static QName _PersonalDataIdentifier_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PersonalDataIdentifier");
    private final static QName _TokenSynchronizationInfo_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TokenSynchronizationInfo");
    private final static QName _CertIdentifierList_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CertIdentifierList");
    private final static QName _CardFailureDetails_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CardFailureDetails");
    private final static QName _Header_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Header");
    private final static QName _UserFailureDetails_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "UserFailureDetails");
    private final static QName _FirstName_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "FirstName");
    private final static QName _PasswordIdentifier_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PasswordIdentifier");
    private final static QName _QueryLimit_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "QueryLimit");
    private final static QName _FormatType_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "FormatType");
    private final static QName _Scope_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Scope");
    private final static QName _TimeSpeed_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TimeSpeed");
    private final static QName _ProhibitedCharacters_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "ProhibitedCharacters");
    private final static QName _PINServerMandatory_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PINServerMandatory");
    private final static QName _IPB_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "IPB");
    private final static QName _NbResultsMax_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "NbResultsMax");
    private final static QName _ClientRef_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "ClientRef");
    private final static QName _Input_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Input");
    private final static QName _FirmwareVersion_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "FirmwareVersion");
    private final static QName _KDI_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "KDI");
    private final static QName _Validity_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Validity");
    private final static QName _ATC_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "ATC");
    private final static QName _FailureDetails_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "FailureDetails");
    private final static QName _PINServer_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PINServer");
    private final static QName _IMKKDI_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "IMKKDI");
    private final static QName _Priority_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Priority");
    private final static QName _PersonalData_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PersonalData");
    private final static QName _TokenIdentifier_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TokenIdentifier");
    private final static QName _ExtendedData_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "ExtendedData");
    private final static QName _TokenSynchroList_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TokenSynchroList");
    private final static QName _UserInfo_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "UserInfo");
    private final static QName _Length_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Length");
    private final static QName _IMKLocalisation_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "IMKLocalisation");
    private final static QName _Label_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Label");
    private final static QName _TokenIdentifierList_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TokenIdentifierList");
    private final static QName _ActivationState_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "ActivationState");
    private final static QName _Format_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Format");
    private final static QName _UserAlias_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "UserAlias");
    private final static QName _Model_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Model");
    private final static QName _Key_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Key");
    private final static QName _Coords_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Coords");
    private final static QName _CryptoImpl_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CryptoImpl");
    private final static QName _UserLevel_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "UserLevel");
    private final static QName _ATCStart_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "ATCStart");
    private final static QName _CardIdentifier_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CardIdentifier");
    private final static QName _OneOTPByPlug_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "OneOTPByPlug");
    private final static QName _AIP_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "AIP");
    private final static QName _DAC_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "DAC");
    private final static QName _Coord_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Coord");
    private final static QName _MaxLength_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "MaxLength");
    private final static QName _TokenFailureDetails_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TokenFailureDetails");
    private final static QName _PersonalDataType_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PersonalDataType");
    private final static QName _DateTime_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "DateTime");
    private final static QName _NbUsers_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "NbUsers");
    private final static QName _Identifier_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Identifier");
    private final static QName _TokenProfileName_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TokenProfileName");
    private final static QName _PasswordValue_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PasswordValue");
    private final static QName _CredIdentifier_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CredIdentifier");
    private final static QName _CredFailureDetails_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CredFailureDetails");
    private final static QName _PasswordFormat_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PasswordFormat");
    private final static QName _TKLabel_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "TKLabel");
    private final static QName _CredIdentifierList_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CredIdentifierList");
    private final static QName _AliasFailureDetails_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "AliasFailureDetails");
    private final static QName _CardProfileFailureDetails_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CardProfileFailureDetails");
    private final static QName _MaxRetry_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "MaxRetry");
    private final static QName _Localisation_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Localisation");
    private final static QName _CoordIdentifierList_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "CoordIdentifierList");
    private final static QName _RequestId_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "RequestId");
    private final static QName _Certificate_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "Certificate");
    private final static QName _PasswordType_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PasswordType");
    private final static QName _PersonalDataFailureDetails_QNAME = new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "PersonalDataFailureDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kiwi.dictao.webservices.dvs.provisioning
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteUserInformationListRequest }
     * 
     */
    public DeleteUserInformationListRequest createDeleteUserInformationListRequest() {
        return new DeleteUserInformationListRequest();
    }

    /**
     * Create an instance of {@link CommandResponseType }
     * 
     */
    public CommandResponseType createCommandResponseType() {
        return new CommandResponseType();
    }

    /**
     * Create an instance of {@link TokenProfileFailureDetailsType }
     * 
     */
    public TokenProfileFailureDetailsType createTokenProfileFailureDetailsType() {
        return new TokenProfileFailureDetailsType();
    }

    /**
     * Create an instance of {@link DeleteProfileListResult }
     * 
     */
    public DeleteProfileListResult createDeleteProfileListResult() {
        return new DeleteProfileListResult();
    }

    /**
     * Create an instance of {@link DeleteProfileListResponse }
     * 
     */
    public DeleteProfileListResponse createDeleteProfileListResponse() {
        return new DeleteProfileListResponse();
    }

    /**
     * Create an instance of {@link CredIdentifierType }
     * 
     */
    public CredIdentifierType createCredIdentifierType() {
        return new CredIdentifierType();
    }

    /**
     * Create an instance of {@link SynchronizeUserListResponse }
     * 
     */
    public SynchronizeUserListResponse createSynchronizeUserListResponse() {
        return new SynchronizeUserListResponse();
    }

    /**
     * Create an instance of {@link SynchronizeUserListRequest }
     * 
     */
    public SynchronizeUserListRequest createSynchronizeUserListRequest() {
        return new SynchronizeUserListRequest();
    }

    /**
     * Create an instance of {@link PersonalDataType }
     * 
     */
    public PersonalDataType createPersonalDataType() {
        return new PersonalDataType();
    }

    /**
     * Create an instance of {@link SearchTokenKeyListRequest }
     * 
     */
    public SearchTokenKeyListRequest createSearchTokenKeyListRequest() {
        return new SearchTokenKeyListRequest();
    }

    /**
     * Create an instance of {@link UserInfoType.CardAuthent }
     * 
     */
    public UserInfoType.CardAuthent createUserInfoTypeCardAuthent() {
        return new UserInfoType.CardAuthent();
    }

    /**
     * Create an instance of {@link DeleteUserInformationListResponse }
     * 
     */
    public DeleteUserInformationListResponse createDeleteUserInformationListResponse() {
        return new DeleteUserInformationListResponse();
    }

    /**
     * Create an instance of {@link AddProfileListRequest }
     * 
     */
    public AddProfileListRequest createAddProfileListRequest() {
        return new AddProfileListRequest();
    }

    /**
     * Create an instance of {@link PasswordIdentifierListType }
     * 
     */
    public PasswordIdentifierListType createPasswordIdentifierListType() {
        return new PasswordIdentifierListType();
    }

    /**
     * Create an instance of {@link TokenIdentifierListType }
     * 
     */
    public TokenIdentifierListType createTokenIdentifierListType() {
        return new TokenIdentifierListType();
    }

    /**
     * Create an instance of {@link LinkDeviceListResponse }
     * 
     */
    public LinkDeviceListResponse createLinkDeviceListResponse() {
        return new LinkDeviceListResponse();
    }

    /**
     * Create an instance of {@link GetProfileListRequest }
     * 
     */
    public GetProfileListRequest createGetProfileListRequest() {
        return new GetProfileListRequest();
    }

    /**
     * Create an instance of {@link TokensType }
     * 
     */
    public TokensType createTokensType() {
        return new TokensType();
    }

    /**
     * Create an instance of {@link TokenKeyIdentifierType }
     * 
     */
    public TokenKeyIdentifierType createTokenKeyIdentifierType() {
        return new TokenKeyIdentifierType();
    }

    /**
     * Create an instance of {@link DeleteUserInformationListRequest.UserInformationList.UserInformation.DropInformations }
     * 
     */
    public DeleteUserInformationListRequest.UserInformationList.UserInformation.DropInformations createDeleteUserInformationListRequestUserInformationListUserInformationDropInformations() {
        return new DeleteUserInformationListRequest.UserInformationList.UserInformation.DropInformations();
    }

    /**
     * Create an instance of {@link TokenFeaturesType }
     * 
     */
    public TokenFeaturesType createTokenFeaturesType() {
        return new TokenFeaturesType();
    }

    /**
     * Create an instance of {@link DeleteUserInformationListRequest.UserInformationList }
     * 
     */
    public DeleteUserInformationListRequest.UserInformationList createDeleteUserInformationListRequestUserInformationList() {
        return new DeleteUserInformationListRequest.UserInformationList();
    }

    /**
     * Create an instance of {@link TokenIdentifierType }
     * 
     */
    public TokenIdentifierType createTokenIdentifierType() {
        return new TokenIdentifierType();
    }

    /**
     * Create an instance of {@link UserInfoType }
     * 
     */
    public UserInfoType createUserInfoType() {
        return new UserInfoType();
    }

    /**
     * Create an instance of {@link TokenFailureDetailsType }
     * 
     */
    public TokenFailureDetailsType createTokenFailureDetailsType() {
        return new TokenFailureDetailsType();
    }

    /**
     * Create an instance of {@link UserInfoType.CertAuthent }
     * 
     */
    public UserInfoType.CertAuthent createUserInfoTypeCertAuthent() {
        return new UserInfoType.CertAuthent();
    }

    /**
     * Create an instance of {@link ATCSynchronisationType }
     * 
     */
    public ATCSynchronisationType createATCSynchronisationType() {
        return new ATCSynchronisationType();
    }

    /**
     * Create an instance of {@link AddProfileListResponse }
     * 
     */
    public AddProfileListResponse createAddProfileListResponse() {
        return new AddProfileListResponse();
    }

    /**
     * Create an instance of {@link PasswordIdentifierType }
     * 
     */
    public PasswordIdentifierType createPasswordIdentifierType() {
        return new PasswordIdentifierType();
    }

    /**
     * Create an instance of {@link UserAliasListType }
     * 
     */
    public UserAliasListType createUserAliasListType() {
        return new UserAliasListType();
    }

    /**
     * Create an instance of {@link PersonalDataIdentifierListType }
     * 
     */
    public PersonalDataIdentifierListType createPersonalDataIdentifierListType() {
        return new PersonalDataIdentifierListType();
    }

    /**
     * Create an instance of {@link SearchTokenKeyListRequest.SearchCriteria }
     * 
     */
    public SearchTokenKeyListRequest.SearchCriteria createSearchTokenKeyListRequestSearchCriteria() {
        return new SearchTokenKeyListRequest.SearchCriteria();
    }

    /**
     * Create an instance of {@link PersonalDataFailureDetailsType }
     * 
     */
    public PersonalDataFailureDetailsType createPersonalDataFailureDetailsType() {
        return new PersonalDataFailureDetailsType();
    }

    /**
     * Create an instance of {@link ProfileNameListType }
     * 
     */
    public ProfileNameListType createProfileNameListType() {
        return new ProfileNameListType();
    }

    /**
     * Create an instance of {@link UserInfoType.PasswordAuthent.PasswordList }
     * 
     */
    public UserInfoType.PasswordAuthent.PasswordList createUserInfoTypePasswordAuthentPasswordList() {
        return new UserInfoType.PasswordAuthent.PasswordList();
    }

    /**
     * Create an instance of {@link UserInfoType.TokenAuthent.TokenList }
     * 
     */
    public UserInfoType.TokenAuthent.TokenList createUserInfoTypeTokenAuthentTokenList() {
        return new UserInfoType.TokenAuthent.TokenList();
    }

    /**
     * Create an instance of {@link GetUserListResult }
     * 
     */
    public GetUserListResult createGetUserListResult() {
        return new GetUserListResult();
    }

    /**
     * Create an instance of {@link CardFailureDetailsType }
     * 
     */
    public CardFailureDetailsType createCardFailureDetailsType() {
        return new CardFailureDetailsType();
    }

    /**
     * Create an instance of {@link GetTokenKeyValueRequest }
     * 
     */
    public GetTokenKeyValueRequest createGetTokenKeyValueRequest() {
        return new GetTokenKeyValueRequest();
    }

    /**
     * Create an instance of {@link CardSynchronizationInfoListType }
     * 
     */
    public CardSynchronizationInfoListType createCardSynchronizationInfoListType() {
        return new CardSynchronizationInfoListType();
    }

    /**
     * Create an instance of {@link CardsType }
     * 
     */
    public CardsType createCardsType() {
        return new CardsType();
    }

    /**
     * Create an instance of {@link FailureDetailsType }
     * 
     */
    public FailureDetailsType createFailureDetailsType() {
        return new FailureDetailsType();
    }

    /**
     * Create an instance of {@link UserInfoType.PersonalDataAuthent }
     * 
     */
    public UserInfoType.PersonalDataAuthent createUserInfoTypePersonalDataAuthent() {
        return new UserInfoType.PersonalDataAuthent();
    }

    /**
     * Create an instance of {@link CardFeaturesType }
     * 
     */
    public CardFeaturesType createCardFeaturesType() {
        return new CardFeaturesType();
    }

    /**
     * Create an instance of {@link AddProfileListResult }
     * 
     */
    public AddProfileListResult createAddProfileListResult() {
        return new AddProfileListResult();
    }

    /**
     * Create an instance of {@link DeleteUserInformationListResult }
     * 
     */
    public DeleteUserInformationListResult createDeleteUserInformationListResult() {
        return new DeleteUserInformationListResult();
    }

    /**
     * Create an instance of {@link CommonFailureDetailsType }
     * 
     */
    public CommonFailureDetailsType createCommonFailureDetailsType() {
        return new CommonFailureDetailsType();
    }

    /**
     * Create an instance of {@link UserInfoType.CoordAuthent.CoordList }
     * 
     */
    public UserInfoType.CoordAuthent.CoordList createUserInfoTypeCoordAuthentCoordList() {
        return new UserInfoType.CoordAuthent.CoordList();
    }

    /**
     * Create an instance of {@link DeleteUserInformationListRequest.UserInformationList.UserInformation }
     * 
     */
    public DeleteUserInformationListRequest.UserInformationList.UserInformation createDeleteUserInformationListRequestUserInformationListUserInformation() {
        return new DeleteUserInformationListRequest.UserInformationList.UserInformation();
    }

    /**
     * Create an instance of {@link CardProfileType }
     * 
     */
    public CardProfileType createCardProfileType() {
        return new CardProfileType();
    }

    /**
     * Create an instance of {@link TokenSynchronizationInfoType }
     * 
     */
    public TokenSynchronizationInfoType createTokenSynchronizationInfoType() {
        return new TokenSynchronizationInfoType();
    }

    /**
     * Create an instance of {@link CertType }
     * 
     */
    public CertType createCertType() {
        return new CertType();
    }

    /**
     * Create an instance of {@link CardProfileFailureDetailsType }
     * 
     */
    public CardProfileFailureDetailsType createCardProfileFailureDetailsType() {
        return new CardProfileFailureDetailsType();
    }

    /**
     * Create an instance of {@link CardSynchronizationInfoType }
     * 
     */
    public CardSynchronizationInfoType createCardSynchronizationInfoType() {
        return new CardSynchronizationInfoType();
    }

    /**
     * Create an instance of {@link AliasFailureDetailsType }
     * 
     */
    public AliasFailureDetailsType createAliasFailureDetailsType() {
        return new AliasFailureDetailsType();
    }

    /**
     * Create an instance of {@link SearchCriteriaType }
     * 
     */
    public SearchCriteriaType createSearchCriteriaType() {
        return new SearchCriteriaType();
    }

    /**
     * Create an instance of {@link CoordFailureDetailsType }
     * 
     */
    public CoordFailureDetailsType createCoordFailureDetailsType() {
        return new CoordFailureDetailsType();
    }

    /**
     * Create an instance of {@link CardIdentifierListType }
     * 
     */
    public CardIdentifierListType createCardIdentifierListType() {
        return new CardIdentifierListType();
    }

    /**
     * Create an instance of {@link GetProfileListRequest.SearchCriteria }
     * 
     */
    public GetProfileListRequest.SearchCriteria createGetProfileListRequestSearchCriteria() {
        return new GetProfileListRequest.SearchCriteria();
    }

    /**
     * Create an instance of {@link GetUserListResult.UserList }
     * 
     */
    public GetUserListResult.UserList createGetUserListResultUserList() {
        return new GetUserListResult.UserList();
    }

    /**
     * Create an instance of {@link CancellationAuthType }
     * 
     */
    public CancellationAuthType createCancellationAuthType() {
        return new CancellationAuthType();
    }

    /**
     * Create an instance of {@link CredType }
     * 
     */
    public CredType createCredType() {
        return new CredType();
    }

    /**
     * Create an instance of {@link UserInfoType.PersonalDataAuthent.PersonalDataList }
     * 
     */
    public UserInfoType.PersonalDataAuthent.PersonalDataList createUserInfoTypePersonalDataAuthentPersonalDataList() {
        return new UserInfoType.PersonalDataAuthent.PersonalDataList();
    }

    /**
     * Create an instance of {@link GetTokenKeyValueResult }
     * 
     */
    public GetTokenKeyValueResult createGetTokenKeyValueResult() {
        return new GetTokenKeyValueResult();
    }

    /**
     * Create an instance of {@link UserInfoType.PasswordAuthent }
     * 
     */
    public UserInfoType.PasswordAuthent createUserInfoTypePasswordAuthent() {
        return new UserInfoType.PasswordAuthent();
    }

    /**
     * Create an instance of {@link UserInfoType.CredAuthent }
     * 
     */
    public UserInfoType.CredAuthent createUserInfoTypeCredAuthent() {
        return new UserInfoType.CredAuthent();
    }

    /**
     * Create an instance of {@link CardType }
     * 
     */
    public CardType createCardType() {
        return new CardType();
    }

    /**
     * Create an instance of {@link AddUserListRequest }
     * 
     */
    public AddUserListRequest createAddUserListRequest() {
        return new AddUserListRequest();
    }

    /**
     * Create an instance of {@link UserInfoTypeList }
     * 
     */
    public UserInfoTypeList createUserInfoTypeList() {
        return new UserInfoTypeList();
    }

    /**
     * Create an instance of {@link CoordType }
     * 
     */
    public CoordType createCoordType() {
        return new CoordType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link PersonalDatasType }
     * 
     */
    public PersonalDatasType createPersonalDatasType() {
        return new PersonalDatasType();
    }

    /**
     * Create an instance of {@link TokenFeaturesType.KeyList }
     * 
     */
    public TokenFeaturesType.KeyList createTokenFeaturesTypeKeyList() {
        return new TokenFeaturesType.KeyList();
    }

    /**
     * Create an instance of {@link LinkDeviceListRequest }
     * 
     */
    public LinkDeviceListRequest createLinkDeviceListRequest() {
        return new LinkDeviceListRequest();
    }

    /**
     * Create an instance of {@link CredIdentifierListType }
     * 
     */
    public CredIdentifierListType createCredIdentifierListType() {
        return new CredIdentifierListType();
    }

    /**
     * Create an instance of {@link SearchTokenKeyListResponse }
     * 
     */
    public SearchTokenKeyListResponse createSearchTokenKeyListResponse() {
        return new SearchTokenKeyListResponse();
    }

    /**
     * Create an instance of {@link LinkDeviceListResult }
     * 
     */
    public LinkDeviceListResult createLinkDeviceListResult() {
        return new LinkDeviceListResult();
    }

    /**
     * Create an instance of {@link CertFailureDetailsType }
     * 
     */
    public CertFailureDetailsType createCertFailureDetailsType() {
        return new CertFailureDetailsType();
    }

    /**
     * Create an instance of {@link UserInfoType.CardAuthent.CardList }
     * 
     */
    public UserInfoType.CardAuthent.CardList createUserInfoTypeCardAuthentCardList() {
        return new UserInfoType.CardAuthent.CardList();
    }

    /**
     * Create an instance of {@link GetProfileListResult }
     * 
     */
    public GetProfileListResult createGetProfileListResult() {
        return new GetProfileListResult();
    }

    /**
     * Create an instance of {@link UserInfoType.CoordAuthent }
     * 
     */
    public UserInfoType.CoordAuthent createUserInfoTypeCoordAuthent() {
        return new UserInfoType.CoordAuthent();
    }

    /**
     * Create an instance of {@link UserInfoType.TokenAuthent }
     * 
     */
    public UserInfoType.TokenAuthent createUserInfoTypeTokenAuthent() {
        return new UserInfoType.TokenAuthent();
    }

    /**
     * Create an instance of {@link CoordsType }
     * 
     */
    public CoordsType createCoordsType() {
        return new CoordsType();
    }

    /**
     * Create an instance of {@link GetUserListResponse }
     * 
     */
    public GetUserListResponse createGetUserListResponse() {
        return new GetUserListResponse();
    }

    /**
     * Create an instance of {@link CredFailureDetailsType }
     * 
     */
    public CredFailureDetailsType createCredFailureDetailsType() {
        return new CredFailureDetailsType();
    }

    /**
     * Create an instance of {@link UserInfoType.CertAuthent.CertList }
     * 
     */
    public UserInfoType.CertAuthent.CertList createUserInfoTypeCertAuthentCertList() {
        return new UserInfoType.CertAuthent.CertList();
    }

    /**
     * Create an instance of {@link GetProfileListResponse }
     * 
     */
    public GetProfileListResponse createGetProfileListResponse() {
        return new GetProfileListResponse();
    }

    /**
     * Create an instance of {@link GetDeviceSensitiveValueResult }
     * 
     */
    public GetDeviceSensitiveValueResult createGetDeviceSensitiveValueResult() {
        return new GetDeviceSensitiveValueResult();
    }

    /**
     * Create an instance of {@link PasswordType }
     * 
     */
    public PasswordType createPasswordType() {
        return new PasswordType();
    }

    /**
     * Create an instance of {@link TokenType }
     * 
     */
    public TokenType createTokenType() {
        return new TokenType();
    }

    /**
     * Create an instance of {@link TokenProfileList }
     * 
     */
    public TokenProfileList createTokenProfileList() {
        return new TokenProfileList();
    }

    /**
     * Create an instance of {@link CardIdentifierType }
     * 
     */
    public CardIdentifierType createCardIdentifierType() {
        return new CardIdentifierType();
    }

    /**
     * Create an instance of {@link SynchronizeUserListResult }
     * 
     */
    public SynchronizeUserListResult createSynchronizeUserListResult() {
        return new SynchronizeUserListResult();
    }

    /**
     * Create an instance of {@link GetDeviceSensitiveValueRequest }
     * 
     */
    public GetDeviceSensitiveValueRequest createGetDeviceSensitiveValueRequest() {
        return new GetDeviceSensitiveValueRequest();
    }

    /**
     * Create an instance of {@link SearchTokenKeyListResult }
     * 
     */
    public SearchTokenKeyListResult createSearchTokenKeyListResult() {
        return new SearchTokenKeyListResult();
    }

    /**
     * Create an instance of {@link AddUserListResult }
     * 
     */
    public AddUserListResult createAddUserListResult() {
        return new AddUserListResult();
    }

    /**
     * Create an instance of {@link AddUserListResponse }
     * 
     */
    public AddUserListResponse createAddUserListResponse() {
        return new AddUserListResponse();
    }

    /**
     * Create an instance of {@link UserFailureDetailsType }
     * 
     */
    public UserFailureDetailsType createUserFailureDetailsType() {
        return new UserFailureDetailsType();
    }

    /**
     * Create an instance of {@link UserInfoListType }
     * 
     */
    public UserInfoListType createUserInfoListType() {
        return new UserInfoListType();
    }

    /**
     * Create an instance of {@link PasswordFailureDetailsType }
     * 
     */
    public PasswordFailureDetailsType createPasswordFailureDetailsType() {
        return new PasswordFailureDetailsType();
    }

    /**
     * Create an instance of {@link BaseType }
     * 
     */
    public BaseType createBaseType() {
        return new BaseType();
    }

    /**
     * Create an instance of {@link CertIdentifierType }
     * 
     */
    public CertIdentifierType createCertIdentifierType() {
        return new CertIdentifierType();
    }

    /**
     * Create an instance of {@link PersonalDataIdentifierType }
     * 
     */
    public PersonalDataIdentifierType createPersonalDataIdentifierType() {
        return new PersonalDataIdentifierType();
    }

    /**
     * Create an instance of {@link GetDeviceSensitiveValueResponse }
     * 
     */
    public GetDeviceSensitiveValueResponse createGetDeviceSensitiveValueResponse() {
        return new GetDeviceSensitiveValueResponse();
    }

    /**
     * Create an instance of {@link CardProfileList }
     * 
     */
    public CardProfileList createCardProfileList() {
        return new CardProfileList();
    }

    /**
     * Create an instance of {@link GetTokenKeyValueResponse }
     * 
     */
    public GetTokenKeyValueResponse createGetTokenKeyValueResponse() {
        return new GetTokenKeyValueResponse();
    }

    /**
     * Create an instance of {@link SearchTokenKeyListResult.TokenKeyIdentifierList }
     * 
     */
    public SearchTokenKeyListResult.TokenKeyIdentifierList createSearchTokenKeyListResultTokenKeyIdentifierList() {
        return new SearchTokenKeyListResult.TokenKeyIdentifierList();
    }

    /**
     * Create an instance of {@link UserInfoType.CredAuthent.CredList }
     * 
     */
    public UserInfoType.CredAuthent.CredList createUserInfoTypeCredAuthentCredList() {
        return new UserInfoType.CredAuthent.CredList();
    }

    /**
     * Create an instance of {@link TokenKeyType }
     * 
     */
    public TokenKeyType createTokenKeyType() {
        return new TokenKeyType();
    }

    /**
     * Create an instance of {@link GetUserListRequest.SearchCriteria }
     * 
     */
    public GetUserListRequest.SearchCriteria createGetUserListRequestSearchCriteria() {
        return new GetUserListRequest.SearchCriteria();
    }

    /**
     * Create an instance of {@link CertsType }
     * 
     */
    public CertsType createCertsType() {
        return new CertsType();
    }

    /**
     * Create an instance of {@link CallerRequest }
     * 
     */
    public CallerRequest createCallerRequest() {
        return new CallerRequest();
    }

    /**
     * Create an instance of {@link CoordIdentifierType }
     * 
     */
    public CoordIdentifierType createCoordIdentifierType() {
        return new CoordIdentifierType();
    }

    /**
     * Create an instance of {@link CertIdentifierListType }
     * 
     */
    public CertIdentifierListType createCertIdentifierListType() {
        return new CertIdentifierListType();
    }

    /**
     * Create an instance of {@link CoordIdentifierListType }
     * 
     */
    public CoordIdentifierListType createCoordIdentifierListType() {
        return new CoordIdentifierListType();
    }

    /**
     * Create an instance of {@link TokenProfileType }
     * 
     */
    public TokenProfileType createTokenProfileType() {
        return new TokenProfileType();
    }

    /**
     * Create an instance of {@link GetUserListRequest }
     * 
     */
    public GetUserListRequest createGetUserListRequest() {
        return new GetUserListRequest();
    }

    /**
     * Create an instance of {@link DeleteProfileListRequest }
     * 
     */
    public DeleteProfileListRequest createDeleteProfileListRequest() {
        return new DeleteProfileListRequest();
    }

    /**
     * Create an instance of {@link TokenSynchronizationInfoListType }
     * 
     */
    public TokenSynchronizationInfoListType createTokenSynchronizationInfoListType() {
        return new TokenSynchronizationInfoListType();
    }

    /**
     * Create an instance of {@link UserContext }
     * 
     */
    public UserContext createUserContext() {
        return new UserContext();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "ValidFrom")
    public JAXBElement<XMLGregorianCalendar> createValidFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ValidFrom_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationSimpleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "AuthenticationType")
    public JAXBElement<AuthenticationSimpleType> createAuthenticationType(AuthenticationSimpleType value) {
        return new JAXBElement<AuthenticationSimpleType>(_AuthenticationType_QNAME, AuthenticationSimpleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Login")
    public JAXBElement<String> createLogin(String value) {
        return new JAXBElement<String>(_Login_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordIdentifierListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PasswordIdentifierList")
    public JAXBElement<PasswordIdentifierListType> createPasswordIdentifierList(PasswordIdentifierListType value) {
        return new JAXBElement<PasswordIdentifierListType>(_PasswordIdentifierList_QNAME, PasswordIdentifierListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CredType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Cred")
    public JAXBElement<CredType> createCred(CredType value) {
        return new JAXBElement<CredType>(_Cred_QNAME, CredType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenProfileFailureDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TokenProfileFailureDetails")
    public JAXBElement<TokenProfileFailureDetailsType> createTokenProfileFailureDetails(TokenProfileFailureDetailsType value) {
        return new JAXBElement<TokenProfileFailureDetailsType>(_TokenProfileFailureDetails_QNAME, TokenProfileFailureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "NbResults")
    public JAXBElement<Integer> createNbResults(Integer value) {
        return new JAXBElement<Integer>(_NbResults_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "UsersOffset")
    public JAXBElement<Integer> createUsersOffset(Integer value) {
        return new JAXBElement<Integer>(_UsersOffset_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "GroupIdentifier")
    public JAXBElement<String> createGroupIdentifier(String value) {
        return new JAXBElement<String>(_GroupIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardSynchronizationInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CardSynchronizationInfo")
    public JAXBElement<CardSynchronizationInfoType> createCardSynchronizationInfo(CardSynchronizationInfoType value) {
        return new JAXBElement<CardSynchronizationInfoType>(_CardSynchronizationInfo_QNAME, CardSynchronizationInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Manufacturer")
    public JAXBElement<String> createManufacturer(String value) {
        return new JAXBElement<String>(_Manufacturer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CardProfileName")
    public JAXBElement<String> createCardProfileName(String value) {
        return new JAXBElement<String>(_CardProfileName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "IssueNumber")
    public JAXBElement<String> createIssueNumber(String value) {
        return new JAXBElement<String>(_IssueNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "KeyType")
    public JAXBElement<KeyTypeType> createKeyType(KeyTypeType value) {
        return new JAXBElement<KeyTypeType>(_KeyType_QNAME, KeyTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalDataIdentifierListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PersonalDataIdentifierList")
    public JAXBElement<PersonalDataIdentifierListType> createPersonalDataIdentifierList(PersonalDataIdentifierListType value) {
        return new JAXBElement<PersonalDataIdentifierListType>(_PersonalDataIdentifierList_QNAME, PersonalDataIdentifierListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "ProfileName")
    public JAXBElement<String> createProfileName(String value) {
        return new JAXBElement<String>(_ProfileName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "FailureAttemptNumber")
    public JAXBElement<Integer> createFailureAttemptNumber(Integer value) {
        return new JAXBElement<Integer>(_FailureAttemptNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellationStateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CancellationState")
    public JAXBElement<CancellationStateType> createCancellationState(CancellationStateType value) {
        return new JAXBElement<CancellationStateType>(_CancellationState_QNAME, CancellationStateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokensType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Tokens")
    public JAXBElement<TokensType> createTokens(TokensType value) {
        return new JAXBElement<TokensType>(_Tokens_QNAME, TokensType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CredentialValue")
    public JAXBElement<String> createCredentialValue(String value) {
        return new JAXBElement<String>(_CredentialValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CoordIdentifier")
    public JAXBElement<CoordIdentifierType> createCoordIdentifier(CoordIdentifierType value) {
        return new JAXBElement<CoordIdentifierType>(_CoordIdentifier_QNAME, CoordIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardFeaturesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CardFeatures")
    public JAXBElement<CardFeaturesType> createCardFeatures(CardFeaturesType value) {
        return new JAXBElement<CardFeaturesType>(_CardFeatures_QNAME, CardFeaturesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CryptoAlgoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CryptoAlgo")
    public JAXBElement<CryptoAlgoType> createCryptoAlgo(CryptoAlgoType value) {
        return new JAXBElement<CryptoAlgoType>(_CryptoAlgo_QNAME, CryptoAlgoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TKKDI")
    public JAXBElement<Integer> createTKKDI(Integer value) {
        return new JAXBElement<Integer>(_TKKDI_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "AddingMode")
    public JAXBElement<String> createAddingMode(String value) {
        return new JAXBElement<String>(_AddingMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordFailureDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CoordFailureDetails")
    public JAXBElement<CoordFailureDetailsType> createCoordFailureDetails(CoordFailureDetailsType value) {
        return new JAXBElement<CoordFailureDetailsType>(_CoordFailureDetails_QNAME, CoordFailureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Token")
    public JAXBElement<TokenType> createToken(TokenType value) {
        return new JAXBElement<TokenType>(_Token_QNAME, TokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "OTPMode")
    public JAXBElement<OTPType> createOTPMode(OTPType value) {
        return new JAXBElement<OTPType>(_OTPMode_QNAME, OTPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "ValidUntil")
    public JAXBElement<XMLGregorianCalendar> createValidUntil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ValidUntil_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PersonalDataValue")
    public JAXBElement<String> createPersonalDataValue(String value) {
        return new JAXBElement<String>(_PersonalDataValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "DeletingMode")
    public JAXBElement<String> createDeletingMode(String value) {
        return new JAXBElement<String>(_DeletingMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Certs")
    public JAXBElement<CertsType> createCerts(CertsType value) {
        return new JAXBElement<CertsType>(_Certs_QNAME, CertsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalDatasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PersonalDatas")
    public JAXBElement<PersonalDatasType> createPersonalDatas(PersonalDatasType value) {
        return new JAXBElement<PersonalDatasType>(_PersonalDatas_QNAME, PersonalDatasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TKDerivationType")
    public JAXBElement<DerivationType> createTKDerivationType(DerivationType value) {
        return new JAXBElement<DerivationType>(_TKDerivationType_QNAME, DerivationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "KeyValue")
    public JAXBElement<byte[]> createKeyValue(byte[] value) {
        return new JAXBElement<byte[]>(_KeyValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Card")
    public JAXBElement<CardType> createCard(CardType value) {
        return new JAXBElement<CardType>(_Card_QNAME, CardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardSynchronizationInfoListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CardSynchroList")
    public JAXBElement<CardSynchronizationInfoListType> createCardSynchroList(CardSynchronizationInfoListType value) {
        return new JAXBElement<CardSynchronizationInfoListType>(_CardSynchroList_QNAME, CardSynchronizationInfoListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertFailureDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CertFailureDetails")
    public JAXBElement<CertFailureDetailsType> createCertFailureDetails(CertFailureDetailsType value) {
        return new JAXBElement<CertFailureDetailsType>(_CertFailureDetails_QNAME, CertFailureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "UsersNbResponses")
    public JAXBElement<Integer> createUsersNbResponses(Integer value) {
        return new JAXBElement<Integer>(_UsersNbResponses_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATCSynchronisationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "ATCSynchronisation")
    public JAXBElement<ATCSynchronisationType> createATCSynchronisation(ATCSynchronisationType value) {
        return new JAXBElement<ATCSynchronisationType>(_ATCSynchronisation_QNAME, ATCSynchronisationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CryptoParamsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CryptoParams")
    public JAXBElement<CryptoParamsType> createCryptoParams(CryptoParamsType value) {
        return new JAXBElement<CryptoParamsType>(_CryptoParams_QNAME, CryptoParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "ProvisioningPolicyLabel")
    public JAXBElement<String> createProvisioningPolicyLabel(String value) {
        return new JAXBElement<String>(_ProvisioningPolicyLabel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordFailureDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PasswordFailureDetails")
    public JAXBElement<PasswordFailureDetailsType> createPasswordFailureDetails(PasswordFailureDetailsType value) {
        return new JAXBElement<PasswordFailureDetailsType>(_PasswordFailureDetails_QNAME, PasswordFailureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TokenProfile")
    public JAXBElement<TokenProfileType> createTokenProfile(TokenProfileType value) {
        return new JAXBElement<TokenProfileType>(_TokenProfile_QNAME, TokenProfileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "IADUserData")
    public JAXBElement<byte[]> createIADUserData(byte[] value) {
        return new JAXBElement<byte[]>(_IADUserData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Birthday")
    public JAXBElement<XMLGregorianCalendar> createBirthday(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Birthday_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "SerialNumber")
    public JAXBElement<String> createSerialNumber(String value) {
        return new JAXBElement<String>(_SerialNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAliasListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "UserAliasList")
    public JAXBElement<UserAliasListType> createUserAliasList(UserAliasListType value) {
        return new JAXBElement<UserAliasListType>(_UserAliasList_QNAME, UserAliasListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PasswordSalt")
    public JAXBElement<byte[]> createPasswordSalt(byte[] value) {
        return new JAXBElement<byte[]>(_PasswordSalt_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "OTPPlug")
    public JAXBElement<Boolean> createOTPPlug(Boolean value) {
        return new JAXBElement<Boolean>(_OTPPlug_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "OTPLength")
    public JAXBElement<Integer> createOTPLength(Integer value) {
        return new JAXBElement<Integer>(_OTPLength_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenKeyIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TokenKeyIdentifier")
    public JAXBElement<TokenKeyIdentifierType> createTokenKeyIdentifier(TokenKeyIdentifierType value) {
        return new JAXBElement<TokenKeyIdentifierType>(_TokenKeyIdentifier_QNAME, TokenKeyIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserInfoListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "UserInfoList")
    public JAXBElement<UserInfoListType> createUserInfoList(UserInfoListType value) {
        return new JAXBElement<UserInfoListType>(_UserInfoList_QNAME, UserInfoListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Cards")
    public JAXBElement<CardsType> createCards(CardsType value) {
        return new JAXBElement<CardsType>(_Cards_QNAME, CardsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CoordValue")
    public JAXBElement<String> createCoordValue(String value) {
        return new JAXBElement<String>(_CoordValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenFeaturesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TokenFeatures")
    public JAXBElement<TokenFeaturesType> createTokenFeatures(TokenFeaturesType value) {
        return new JAXBElement<TokenFeaturesType>(_TokenFeatures_QNAME, TokenFeaturesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "MinLength")
    public JAXBElement<Integer> createMinLength(Integer value) {
        return new JAXBElement<Integer>(_MinLength_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordSimpleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CoordType")
    public JAXBElement<CoordSimpleType> createCoordType(CoordSimpleType value) {
        return new JAXBElement<CoordSimpleType>(_CoordType_QNAME, CoordSimpleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CertIdentifier")
    public JAXBElement<CertIdentifierType> createCertIdentifier(CertIdentifierType value) {
        return new JAXBElement<CertIdentifierType>(_CertIdentifier_QNAME, CertIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "IAF")
    public JAXBElement<Integer> createIAF(Integer value) {
        return new JAXBElement<Integer>(_IAF_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "SearchCriteria")
    public JAXBElement<SearchCriteriaType> createSearchCriteria(SearchCriteriaType value) {
        return new JAXBElement<SearchCriteriaType>(_SearchCriteria_QNAME, SearchCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "UserCertificate")
    public JAXBElement<byte[]> createUserCertificate(byte[] value) {
        return new JAXBElement<byte[]>(_UserCertificate_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardIdentifierListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CardIdentifierList")
    public JAXBElement<CardIdentifierListType> createCardIdentifierList(CardIdentifierListType value) {
        return new JAXBElement<CardIdentifierListType>(_CardIdentifierList_QNAME, CardIdentifierListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "USBDriver")
    public JAXBElement<String> createUSBDriver(String value) {
        return new JAXBElement<String>(_USBDriver_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CredTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CredType")
    public JAXBElement<CredTypeType> createCredType(CredTypeType value) {
        return new JAXBElement<CredTypeType>(_CredType_QNAME, CredTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TKLocalisation")
    public JAXBElement<String> createTKLocalisation(String value) {
        return new JAXBElement<String>(_TKLocalisation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Valid")
    public JAXBElement<String> createValid(String value) {
        return new JAXBElement<String>(_Valid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PSN")
    public JAXBElement<Integer> createPSN(Integer value) {
        return new JAXBElement<Integer>(_PSN_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Cert")
    public JAXBElement<CertType> createCert(CertType value) {
        return new JAXBElement<CertType>(_Cert_QNAME, CertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockingStateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "LockingState")
    public JAXBElement<LockingStateType> createLockingState(LockingStateType value) {
        return new JAXBElement<LockingStateType>(_LockingState_QNAME, LockingStateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "IMKLabel")
    public JAXBElement<String> createIMKLabel(String value) {
        return new JAXBElement<String>(_IMKLabel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "OTP1")
    public JAXBElement<String> createOTP1(String value) {
        return new JAXBElement<String>(_OTP1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "OTP2")
    public JAXBElement<String> createOTP2(String value) {
        return new JAXBElement<String>(_OTP2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenFormatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TokenFormat")
    public JAXBElement<TokenFormatType> createTokenFormat(TokenFormatType value) {
        return new JAXBElement<TokenFormatType>(_TokenFormat_QNAME, TokenFormatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PAN")
    public JAXBElement<String> createPAN(String value) {
        return new JAXBElement<String>(_PAN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CVR")
    public JAXBElement<byte[]> createCVR(byte[] value) {
        return new JAXBElement<byte[]>(_CVR_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "IMKDerivationType")
    public JAXBElement<DerivationType> createIMKDerivationType(DerivationType value) {
        return new JAXBElement<DerivationType>(_IMKDerivationType_QNAME, DerivationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Password")
    public JAXBElement<PasswordType> createPassword(PasswordType value) {
        return new JAXBElement<PasswordType>(_Password_QNAME, PasswordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CardProfile")
    public JAXBElement<CardProfileType> createCardProfile(CardProfileType value) {
        return new JAXBElement<CardProfileType>(_CardProfile_QNAME, CardProfileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CVN")
    public JAXBElement<Integer> createCVN(Integer value) {
        return new JAXBElement<Integer>(_CVN_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Usable")
    public JAXBElement<Boolean> createUsable(Boolean value) {
        return new JAXBElement<Boolean>(_Usable_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalDataIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PersonalDataIdentifier")
    public JAXBElement<PersonalDataIdentifierType> createPersonalDataIdentifier(PersonalDataIdentifierType value) {
        return new JAXBElement<PersonalDataIdentifierType>(_PersonalDataIdentifier_QNAME, PersonalDataIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenSynchronizationInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TokenSynchronizationInfo")
    public JAXBElement<TokenSynchronizationInfoType> createTokenSynchronizationInfo(TokenSynchronizationInfoType value) {
        return new JAXBElement<TokenSynchronizationInfoType>(_TokenSynchronizationInfo_QNAME, TokenSynchronizationInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertIdentifierListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CertIdentifierList")
    public JAXBElement<CertIdentifierListType> createCertIdentifierList(CertIdentifierListType value) {
        return new JAXBElement<CertIdentifierListType>(_CertIdentifierList_QNAME, CertIdentifierListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardFailureDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CardFailureDetails")
    public JAXBElement<CardFailureDetailsType> createCardFailureDetails(CardFailureDetailsType value) {
        return new JAXBElement<CardFailureDetailsType>(_CardFailureDetails_QNAME, CardFailureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Header")
    public JAXBElement<HeaderType> createHeader(HeaderType value) {
        return new JAXBElement<HeaderType>(_Header_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFailureDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "UserFailureDetails")
    public JAXBElement<UserFailureDetailsType> createUserFailureDetails(UserFailureDetailsType value) {
        return new JAXBElement<UserFailureDetailsType>(_UserFailureDetails_QNAME, UserFailureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "FirstName")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PasswordIdentifier")
    public JAXBElement<PasswordIdentifierType> createPasswordIdentifier(PasswordIdentifierType value) {
        return new JAXBElement<PasswordIdentifierType>(_PasswordIdentifier_QNAME, PasswordIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "QueryLimit")
    public JAXBElement<Integer> createQueryLimit(Integer value) {
        return new JAXBElement<Integer>(_QueryLimit_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormatKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "FormatType")
    public JAXBElement<FormatKeyType> createFormatType(FormatKeyType value) {
        return new JAXBElement<FormatKeyType>(_FormatType_QNAME, FormatKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Scope")
    public JAXBElement<String> createScope(String value) {
        return new JAXBElement<String>(_Scope_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TimeSpeed")
    public JAXBElement<Integer> createTimeSpeed(Integer value) {
        return new JAXBElement<Integer>(_TimeSpeed_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "ProhibitedCharacters")
    public JAXBElement<String> createProhibitedCharacters(String value) {
        return new JAXBElement<String>(_ProhibitedCharacters_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PINServerMandatory")
    public JAXBElement<Boolean> createPINServerMandatory(Boolean value) {
        return new JAXBElement<Boolean>(_PINServerMandatory_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "IPB")
    public JAXBElement<byte[]> createIPB(byte[] value) {
        return new JAXBElement<byte[]>(_IPB_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "NbResultsMax")
    public JAXBElement<Integer> createNbResultsMax(Integer value) {
        return new JAXBElement<Integer>(_NbResultsMax_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "ClientRef")
    public JAXBElement<String> createClientRef(String value) {
        return new JAXBElement<String>(_ClientRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Input")
    public JAXBElement<String> createInput(String value) {
        return new JAXBElement<String>(_Input_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "FirmwareVersion")
    public JAXBElement<String> createFirmwareVersion(String value) {
        return new JAXBElement<String>(_FirmwareVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "KDI")
    public JAXBElement<Integer> createKDI(Integer value) {
        return new JAXBElement<Integer>(_KDI_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Validity")
    public JAXBElement<XMLGregorianCalendar> createValidity(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Validity_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "ATC")
    public JAXBElement<Integer> createATC(Integer value) {
        return new JAXBElement<Integer>(_ATC_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FailureDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "FailureDetails")
    public JAXBElement<FailureDetailsType> createFailureDetails(FailureDetailsType value) {
        return new JAXBElement<FailureDetailsType>(_FailureDetails_QNAME, FailureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PINServer")
    public JAXBElement<String> createPINServer(String value) {
        return new JAXBElement<String>(_PINServer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "IMKKDI")
    public JAXBElement<Integer> createIMKKDI(Integer value) {
        return new JAXBElement<Integer>(_IMKKDI_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Priority")
    public JAXBElement<Integer> createPriority(Integer value) {
        return new JAXBElement<Integer>(_Priority_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PersonalData")
    public JAXBElement<PersonalDataType> createPersonalData(PersonalDataType value) {
        return new JAXBElement<PersonalDataType>(_PersonalData_QNAME, PersonalDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TokenIdentifier")
    public JAXBElement<TokenIdentifierType> createTokenIdentifier(TokenIdentifierType value) {
        return new JAXBElement<TokenIdentifierType>(_TokenIdentifier_QNAME, TokenIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "ExtendedData")
    public JAXBElement<String> createExtendedData(String value) {
        return new JAXBElement<String>(_ExtendedData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenSynchronizationInfoListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TokenSynchroList")
    public JAXBElement<TokenSynchronizationInfoListType> createTokenSynchroList(TokenSynchronizationInfoListType value) {
        return new JAXBElement<TokenSynchronizationInfoListType>(_TokenSynchroList_QNAME, TokenSynchronizationInfoListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "UserInfo")
    public JAXBElement<UserInfoType> createUserInfo(UserInfoType value) {
        return new JAXBElement<UserInfoType>(_UserInfo_QNAME, UserInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Length")
    public JAXBElement<Integer> createLength(Integer value) {
        return new JAXBElement<Integer>(_Length_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "IMKLocalisation")
    public JAXBElement<String> createIMKLocalisation(String value) {
        return new JAXBElement<String>(_IMKLocalisation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Label")
    public JAXBElement<String> createLabel(String value) {
        return new JAXBElement<String>(_Label_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenIdentifierListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TokenIdentifierList")
    public JAXBElement<TokenIdentifierListType> createTokenIdentifierList(TokenIdentifierListType value) {
        return new JAXBElement<TokenIdentifierListType>(_TokenIdentifierList_QNAME, TokenIdentifierListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivationStateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "ActivationState")
    public JAXBElement<ActivationStateType> createActivationState(ActivationStateType value) {
        return new JAXBElement<ActivationStateType>(_ActivationState_QNAME, ActivationStateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Format")
    public JAXBElement<String> createFormat(String value) {
        return new JAXBElement<String>(_Format_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "UserAlias")
    public JAXBElement<String> createUserAlias(String value) {
        return new JAXBElement<String>(_UserAlias_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Model")
    public JAXBElement<String> createModel(String value) {
        return new JAXBElement<String>(_Model_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Key")
    public JAXBElement<TokenKeyType> createKey(TokenKeyType value) {
        return new JAXBElement<TokenKeyType>(_Key_QNAME, TokenKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Coords")
    public JAXBElement<CoordsType> createCoords(CoordsType value) {
        return new JAXBElement<CoordsType>(_Coords_QNAME, CoordsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CryptoImplType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CryptoImpl")
    public JAXBElement<CryptoImplType> createCryptoImpl(CryptoImplType value) {
        return new JAXBElement<CryptoImplType>(_CryptoImpl_QNAME, CryptoImplType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "UserLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUserLevel(String value) {
        return new JAXBElement<String>(_UserLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "ATCStart")
    public JAXBElement<Integer> createATCStart(Integer value) {
        return new JAXBElement<Integer>(_ATCStart_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CardIdentifier")
    public JAXBElement<CardIdentifierType> createCardIdentifier(CardIdentifierType value) {
        return new JAXBElement<CardIdentifierType>(_CardIdentifier_QNAME, CardIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "OneOTPByPlug")
    public JAXBElement<Boolean> createOneOTPByPlug(Boolean value) {
        return new JAXBElement<Boolean>(_OneOTPByPlug_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "AIP")
    public JAXBElement<Integer> createAIP(Integer value) {
        return new JAXBElement<Integer>(_AIP_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "DAC")
    public JAXBElement<byte[]> createDAC(byte[] value) {
        return new JAXBElement<byte[]>(_DAC_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Coord")
    public JAXBElement<CoordType> createCoord(CoordType value) {
        return new JAXBElement<CoordType>(_Coord_QNAME, CoordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "MaxLength")
    public JAXBElement<Integer> createMaxLength(Integer value) {
        return new JAXBElement<Integer>(_MaxLength_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenFailureDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TokenFailureDetails")
    public JAXBElement<TokenFailureDetailsType> createTokenFailureDetails(TokenFailureDetailsType value) {
        return new JAXBElement<TokenFailureDetailsType>(_TokenFailureDetails_QNAME, TokenFailureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalDataTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PersonalDataType")
    public JAXBElement<PersonalDataTypeType> createPersonalDataType(PersonalDataTypeType value) {
        return new JAXBElement<PersonalDataTypeType>(_PersonalDataType_QNAME, PersonalDataTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "DateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "NbUsers")
    public JAXBElement<Integer> createNbUsers(Integer value) {
        return new JAXBElement<Integer>(_NbUsers_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Identifier")
    public JAXBElement<String> createIdentifier(String value) {
        return new JAXBElement<String>(_Identifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TokenProfileName")
    public JAXBElement<String> createTokenProfileName(String value) {
        return new JAXBElement<String>(_TokenProfileName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PasswordValue")
    public JAXBElement<String> createPasswordValue(String value) {
        return new JAXBElement<String>(_PasswordValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CredIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CredIdentifier")
    public JAXBElement<CredIdentifierType> createCredIdentifier(CredIdentifierType value) {
        return new JAXBElement<CredIdentifierType>(_CredIdentifier_QNAME, CredIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CredFailureDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CredFailureDetails")
    public JAXBElement<CredFailureDetailsType> createCredFailureDetails(CredFailureDetailsType value) {
        return new JAXBElement<CredFailureDetailsType>(_CredFailureDetails_QNAME, CredFailureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueFormatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PasswordFormat")
    public JAXBElement<ValueFormatType> createPasswordFormat(ValueFormatType value) {
        return new JAXBElement<ValueFormatType>(_PasswordFormat_QNAME, ValueFormatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "TKLabel")
    public JAXBElement<String> createTKLabel(String value) {
        return new JAXBElement<String>(_TKLabel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CredIdentifierListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CredIdentifierList")
    public JAXBElement<CredIdentifierListType> createCredIdentifierList(CredIdentifierListType value) {
        return new JAXBElement<CredIdentifierListType>(_CredIdentifierList_QNAME, CredIdentifierListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AliasFailureDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "AliasFailureDetails")
    public JAXBElement<AliasFailureDetailsType> createAliasFailureDetails(AliasFailureDetailsType value) {
        return new JAXBElement<AliasFailureDetailsType>(_AliasFailureDetails_QNAME, AliasFailureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardProfileFailureDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CardProfileFailureDetails")
    public JAXBElement<CardProfileFailureDetailsType> createCardProfileFailureDetails(CardProfileFailureDetailsType value) {
        return new JAXBElement<CardProfileFailureDetailsType>(_CardProfileFailureDetails_QNAME, CardProfileFailureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "MaxRetry")
    public JAXBElement<Integer> createMaxRetry(Integer value) {
        return new JAXBElement<Integer>(_MaxRetry_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Localisation")
    public JAXBElement<String> createLocalisation(String value) {
        return new JAXBElement<String>(_Localisation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordIdentifierListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "CoordIdentifierList")
    public JAXBElement<CoordIdentifierListType> createCoordIdentifierList(CoordIdentifierListType value) {
        return new JAXBElement<CoordIdentifierListType>(_CoordIdentifierList_QNAME, CoordIdentifierListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "RequestId")
    public JAXBElement<String> createRequestId(String value) {
        return new JAXBElement<String>(_RequestId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "Certificate")
    public JAXBElement<byte[]> createCertificate(byte[] value) {
        return new JAXBElement<byte[]>(_Certificate_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PasswordType")
    public JAXBElement<PasswordTypeType> createPasswordType(PasswordTypeType value) {
        return new JAXBElement<PasswordTypeType>(_PasswordType_QNAME, PasswordTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalDataFailureDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", name = "PersonalDataFailureDetails")
    public JAXBElement<PersonalDataFailureDetailsType> createPersonalDataFailureDetails(PersonalDataFailureDetailsType value) {
        return new JAXBElement<PersonalDataFailureDetailsType>(_PersonalDataFailureDetails_QNAME, PersonalDataFailureDetailsType.class, null, value);
    }

}
