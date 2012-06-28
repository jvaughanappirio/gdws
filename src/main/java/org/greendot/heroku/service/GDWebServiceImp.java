/**
 * 
 */
package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.util.Date;

@WebService
@Stateless

public class GDWebServiceImp implements GDWebService {

	@WebMethod(operationName = "getCardInfo")
	public CardInformation getCardInfo(@WebParam(name = "cardnumber") String cardnumber) {
		try {
			CardInformation ci = new CardInformation();
			ci.CardNumber = cardnumber;
			ci.isActivateable = true;
			ci.PIN = "1234";
			ci.CCV = "987";
			ci.TestStrings = new String[2];
			ci.TestStrings[0] = "Test1";
			ci.TestStrings[1] = "Test2";
			return ci;
		}
		catch (Exception ex)
		{
			return null;
		}
	}
	
	@WebMethod(operationName = "getQMaster")
	public QMaster getQMasterTable(@WebParam(name = "QMasterKey") Double QMasterKey)
	{
		try {
			QMaster qm = new QMaster();
			qm.QMasterKey = QMasterKey;
			qm.CreateDate = new Date();
			qm.Queue = "Queue";
			qm.SerialNbr = "SerialNumber1234";
			qm.PIN = "54321";
			qm.LanguageKey = 1111.00;
			qm.PinKey = 2222.00;
			qm.IVRAuditHdrKey = 3333.00;
			qm.QMasterCallTypeKey = 4444.00;
			qm.CustomerKey = 5555.00;
			qm.QMasterExitKey = 6666.00;
			qm.OfferCode = "OfferCode";
			qm.VirtualPilot = 7777.00;
			qm.QMasterScriptKey = 8888.00;
			qm.UsherScript = "UsherScript";
			return qm;
		}
		catch (Exception ex)
		{
			QMaster error = new QMaster();
			error.ErrorResponse = ex.getMessage();
			return error;
		}
	}
	
	@WebMethod(operationName = "getCustomerValidation")
	public CustomerInformation getCustomerByActNum(@WebParam(name = "CustomerKey") Double CustomerKey)
	{
		try {
			CustomerInformation Customer = new CustomerInformation();
			Customer.CustomerKey = 1234;
			Customer.ActivationNumber = "ActivationNumber";
			Customer.CardReference = "CardReference";
			Customer.CardExpDate = new Date();
			Customer.CardCVV2 = "CVV";
			Customer.CardActivationDate = new Date();
			Customer.SecretWord = "SecretWord";
			Customer.FirstName = "FirstName";
			Customer.MiddleName = "MiddleName";
			Customer.LastName = "LastName";
			Customer.Generation = "Generation";
			Customer.Address1 = "Address1";
			Customer.Address2 = "Address2";
			Customer.City = "City";
			Customer.State = "State";
			Customer.ZipCode = "ZipCode";
			Customer.HomePhone = "HomePhone";
			Customer.WorkPhone = "WorkPhone";
			Customer.Email = "Email@Email.Com";
			Customer.Card2FirstName = "Card2FirstName";
			Customer.Card2LastName = "Card2LastName";
			Customer.DOB = new Date();
			Customer.ParentFirstName = "ParentFirstName";
			Customer.ParentLastName ="ParentLastName";
			Customer.TSysLoadAmount ="TSysLoadAmount";
			Customer.ActivationStatusKey = 543;
			Customer.DocsInSpanish = false;
			Customer.SendDocs = true;
			Customer.ProductKey = 1111;
			Customer.CreateDate = new Date();
			Customer.AgreedToTerms = new Date();
			Customer.SSN = "444-55-6666";
			Customer.DriversLicense = "DriversLicense";
			Customer.DriversLicenseState = "DriversLicenseState";
			Customer.AcctBalance = "AcctBalance";
			Customer.AcctBalanceAsOf = new Date();
			Customer.SerialNbr = "SerialNbr";
			Customer.RushPlastics = false;
			Customer.SysUserKey = 1;
			Customer.OrigAcctNbr = "OrigAcctNbr";
			Customer.UpgradeEligKey = 2;
			Customer.UpgradeOfExisting = true;
			Customer.UpgradeCustPtr = 3;
			Customer.CreditRatingKey = "CreditRatingKey";
			Customer.AtmPin = "";
			Customer.PlasticsRequest = new Date();
			Customer.CurrBalance = "";
			Customer.CurrBalanceAsOf = new Date();
			Customer.TermsSourceKey = 4;
			Customer.FirstUsed = new Date();
			Customer.HasCRV = false;
			Customer.StatusChangeDate = new Date();
			Customer.ATMGenerated = true;
			Customer.RealCreditEligKey = 5;
			Customer.ReplacementCard = false;
			Customer.ResidentialAddress1 = "";
			Customer.ResidentialAddress2 = "";
			Customer.ResidentialCity = "";
			Customer.ResidentialState = "";
			Customer.ResidentialZipcode = "";
			Customer.ReloadWarningStatusKey = 6;
			Customer.ActivationSysUserKey = 7;
			Customer.PasswordHint = "";
			Customer.ConsularID = "";
			Customer.MilitaryID = "";
			Customer.StateID = "";
			Customer.StateIDState = "";
			Customer.ACHActivationEligKey = 8;
			Customer.ParentSSN = "";
			Customer.ParentDOB = new Date();
			Customer.LastRefresh = new Date();
			Customer.TaxID = "";
			Customer.PassportNumber = "";
			Customer.ParentDriversLicense = "";
			Customer.ParentDriversLicenseState = "";
			Customer.AccountKey = 8;
			Customer.UserExternalId = "";
			Customer.UserVersionId = "";
			Customer.IsTsysPrepaidCustomerAccount = false;
			Customer.IsPrimaryAccountHolder = false;
			Customer.Card2DOB = new Date();
			Customer.PlasticIssueTypeKey = 9;
			Customer.PassportCountry = "";
			Customer.MonthlyStatements = false;
			Customer.CellPhone = "";
			Customer.ReminderQuestionKey = 10;
			Customer.ReminderAnswer = "";
			Customer.ParentConsularID = "";
			Customer.ParentPassportNumber = "";
			Customer.ParentPassportCountry = "";
			Customer.ParentStateID = "";
			Customer.ParentStateIDState = "";
			Customer.ParentTaxID = "";
			Customer.LastPurchaseActivity = new Date();
			Customer.LastOnUsActivity = new Date();
			Customer.OrderKey = 11;
			Customer.PinReference = "";
			Customer.AgreedToESignDate = new Date();
			Customer.ProcessorProduct = "";
			return Customer;
		}
		catch (Exception ex)
		{
			return null;
		}
	}
	
	@WebMethod(operationName = "getQuizValidationStepOne")
	public String getQuizValidationStepOne()
	{
		try {
			return null;
		}
		catch (Exception ex) {
			return null;
		}
	}
	
	@WebMethod(operationName = "getQuizValidationStepTwo")
	public String getQuizValidationStepTwo()
	{
		try {
			return null;
		}
		catch (Exception ex) {
			return null;
		}
	}
	
	@WebMethod(operationName = "getHardFail")
	public Boolean getHardFail()
	{
		try {
			return true;
		}
		catch (Exception ex) {
			return false;
		}
	}
	
	@WebMethod(operationName = "getFinalActivation")
	public Boolean getFinalActivation()
	{
		try {
			return true;
		}
		catch (Exception ex) {
			return false;
		}
	}
}



