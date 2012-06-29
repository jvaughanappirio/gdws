package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement;  
import java.util.Date;
    

@XmlRootElement(name="CustomerInformation")
public class CustomerInformation
{
	@XmlElement(name="CustomerKey")
	public Double CustomerKey;
	
	@XmlElement(name="ActivationNumber")
	public String ActivationNumber;
	
	@XmlElement(name="CardReference")
	public String CardReference;
	
	@XmlElement(name="CardExpDate")
	public Date CardExpDate;
	
	@XmlElement(name="CardCVV2")
	public String CardCVV2;
	
	@XmlElement(name="CardActivationDate")
	public Date CardActivationDate;
	
	@XmlElement(name="SecretWord")
	public String SecretWord;
	
	@XmlElement(name="FirstName")
	public String FirstName;
	
	@XmlElement(name="MiddleName")
	public String MiddleName;
	
	@XmlElement(name="LastName")
	public String LastName;
	
	@XmlElement(name="Generation")
	public String Generation;
	
	@XmlElement(name="Address1")
	public String Address1;
	
	@XmlElement(name="Address2")
	public String Address2;
	
	@XmlElement(name="City")
	public String City;
	
	@XmlElement(name="State")
	public String State;
	
	@XmlElement(name="ZipCode")
	public String ZipCode;
	
	@XmlElement(name="HomePhone")
	public String HomePhone;
	
	@XmlElement(name="WorkPhone")
	public String WorkPhone;
	
	@XmlElement(name="Email")
	public String Email;
	
	@XmlElement(name="Card2FirstName")
	public String Card2FirstName;
	
	@XmlElement(name="Card2LastName")
	public String Card2LastName;
	
	@XmlElement(name="DOB")
	public String DOB;
	
	@XmlElement(name="ParentFirstName")
	public String ParentFirstName;
	
	@XmlElement(name="ParentLastName")
	public String ParentLastName;
	
	@XmlElement(name="TSysLoadAmount")
	public String TSysLoadAmount;
	
	@XmlElement(name="ActivationStatusKey")
	public Double ActivationStatusKey;
	
	@XmlElement(name="DocsInSpanish")
	public Boolean DocsInSpanish;
	
	@XmlElement(name="SendDocs")
	public Boolean SendDocs;
	
	@XmlElement(name="ProductKey")
	public Double ProductKey;
	
	@XmlElement(name="CreateDate")
	public Date CreateDate;
	
	@XmlElement(name="AgreedToTerms")
	public Date AgreedToTerms;
	
	@XmlElement(name="SSN")
	public String SSN;
	
	@XmlElement(name="DriversLicense")
	public String DriversLicense;
	
	@XmlElement(name="DriversLicenseState")
	public String DriversLicenseState;
	
	@XmlElement(name="AcctBalance")
	public String AcctBalance;
	
	@XmlElement(name="AcctBalanceAsOf")
	public Date AcctBalanceAsOf;
	
	@XmlElement(name="SerialNbr")
	public String SerialNbr;
	
	@XmlElement(name="RushPlastics")
	public Boolean RushPlastics;
	
	@XmlElement(name="SysUserKey")
	public Double SysUserKey;
	
	@XmlElement(name="OrigAcctNbr")
	public String OrigAcctNbr;
	
	@XmlElement(name="UpgradeEligKey")
	public Double UpgradeEligKey;
	
	@XmlElement(name="UpgradeOfExisting")
	public Boolean UpgradeOfExisting;
	
	@XmlElement(name="UpgradeCustPtr")
	public Double UpgradeCustPtr;
	
	@XmlElement(name="CreditRatingKey")
	public String CreditRatingKey;
	
	@XmlElement(name="AtmPin")
	public String AtmPin;
	
	@XmlElement(name="PlasticsRequest")
	public Date PlasticsRequest;
	
	@XmlElement(name="CurrBalance")
	public String CurrBalance;
	
	@XmlElement(name="CurrBalanceAsOf")
	public Date CurrBalanceAsOf;
	
	@XmlElement(name="TermsSourceKey")
	public Double TermsSourceKey;
	
	@XmlElement(name="FirstUsed")
	public Date FirstUsed;
	
	@XmlElement(name="HasCRV")
	public Boolean HasCRV;
	
	@XmlElement(name="StatusChangeDate")
	public Date StatusChangeDate;
	
	@XmlElement(name="ATMGenerated")
	public Boolean ATMGenerated;
	
	@XmlElement(name="RealCreditEligKey")
	public Double RealCreditEligKey;
	
	@XmlElement(name="ReplacementCard")
	public Boolean ReplacementCard;
	
	@XmlElement(name="ResidentialAddress1")
	public String ResidentialAddress1;
	
	@XmlElement(name="ResidentialAddress2")
	public String ResidentialAddress2;
	
	@XmlElement(name="ResidentialCity")
	public String ResidentialCity;
	
	@XmlElement(name="ResidentialState")
	public String ResidentialState;
	
	@XmlElement(name="ResidentialZipcode")
	public String ResidentialZipcode;
	
	@XmlElement(name="ReloadWarningStatusKey")
	public Double ReloadWarningStatusKey;
	
	@XmlElement(name="ActivationSysUserKey")
	public Double ActivationSysUserKey;
	
	@XmlElement(name="PasswordHint")
	public String PasswordHint;
	
	@XmlElement(name="ConsularID")
	public String ConsularID;
	
	@XmlElement(name="MilitaryID")
	public String MilitaryID;
	
	@XmlElement(name="StateID")
	public String StateID;
	
	@XmlElement(name="StateIDState")
	public String StateIDState;
	
	@XmlElement(name="ACHActivationEligKey")
	public Double ACHActivationEligKey;
	
	@XmlElement(name="ParentSSN")
	public String ParentSSN;
	
	@XmlElement(name="ParentDOB")
	public String ParentDOB;
	
	@XmlElement(name="LastRefresh")
	public Date LastRefresh;
	
	@XmlElement(name="TaxID")
	public String TaxID;
	
	@XmlElement(name="PassportNumber")
	public String PassportNumber;
	
	@XmlElement(name="ParentDriversLicense")
	public String ParentDriversLicense;
	
	@XmlElement(name="ParentDriversLicenseState")
	public String ParentDriversLicenseState;
	
	@XmlElement(name="AccountKey")
	public Double AccountKey;
	
	@XmlElement(name="UserExternalId")
	public String UserExternalId;
	
	@XmlElement(name="UserVersionId")
	public String UserVersionId;
	
	@XmlElement(name="IsTsysPrepaidCustomerAccount")
	public Boolean IsTsysPrepaidCustomerAccount;
	
	@XmlElement(name="IsPrimaryAccountHolder")
	public Boolean IsPrimaryAccountHolder;
	
	@XmlElement(name="Card2DOB")
	public String Card2DOB;
	
	@XmlElement(name="PlasticIssueTypeKey")
	public Double PlasticIssueTypeKey;
	
	@XmlElement(name="PassportCountry")
	public String PassportCountry;
	
	@XmlElement(name="MonthlyStatements")
	public Boolean MonthlyStatements;
	
	@XmlElement(name="CellPhone")
	public String CellPhone;
	
	@XmlElement(name="ReminderQuestionKey")
	public Double ReminderQuestionKey;
	
	@XmlElement(name="ReminderAnswer")
	public String ReminderAnswer;
	
	@XmlElement(name="ParentConsularID")
	public String ParentConsularID;
	
	@XmlElement(name="ParentPassportNumber")
	public String ParentPassportNumber;
	
	@XmlElement(name="ParentPassportCountry")
	public String ParentPassportCountry;
	
	@XmlElement(name="ParentStateID")
	public String ParentStateID;
	
	@XmlElement(name="ParentStateIDState")
	public String ParentStateIDState;
	
	@XmlElement(name="ParentTaxID")
	public String ParentTaxID;
	
	@XmlElement(name="LastPurchaseActivity")
	public Date LastPurchaseActivity;
	
	@XmlElement(name="LastOnUsActivity")
	public Date LastOnUsActivity;
	
	@XmlElement(name="OrderKey")
	public Double OrderKey;
	
	@XmlElement(name="PinReference")
	public String PinReference;
	
	@XmlElement(name="AgreedToESignDate")
	public Date AgreedToESignDate;
	
	@XmlElement(name="ProcessorProduct")
	public String ProcessorProduct;
}