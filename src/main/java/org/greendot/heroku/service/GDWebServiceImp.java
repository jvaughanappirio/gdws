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
import java.util.*;
import java.text.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

import java.lang.Object;
import java.lang.reflect.Field;


@WebService
@Stateless

public class GDWebServiceImp implements GDWebService {
	
	private static final String tns = "http://service.heroku.greendot.org/";
  private File XmlFile;
	

	/*@WebMethod(operationName = "getCardInfo")
	public CardInformation getCardInfo(@WebParam(name = "cardnumber") String cardnumber) {
		try {
			String classname="CardInformation";

			Class classintance = Class.forName("org.greendot.heroku.service." + classname);
			Field[] fieldlist = classintance.getFields();
			CardInformation o = (CardInformation)classintance.newInstance();

			o = (CardInformation)getObjectBuild(classname, fieldlist, o);

			return o;
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	
	@WebMethod(operationName = "getQMaster")
	public QMaster getQMasterTable(@WebParam(name = "QMasterKey") Double QMasterKey)
	{
			try {
				String classname="QMaster";

				Class classintance = Class.forName("org.greendot.heroku.service." + classname);
				Field[] fieldlist = classintance.getFields();
				QMaster o = (QMaster)classintance.newInstance();

				o = (QMaster)getObjectBuild(classname, fieldlist, o);

				return o;
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
		}
	
	@WebMethod(operationName = "getCustomerByActNum")
	public CustomerInformation getCustomerByActNum(@WebParam(name = "CustomerKey") Double CustomerKey)
	{
		try {
			String classname="CustomerInformation";
			
			Class classintance = Class.forName("org.greendot.heroku.service." + classname);
			Field[] fieldlist = classintance.getFields();
			CustomerInformation o = (CustomerInformation)classintance.newInstance();
			
			o = (CustomerInformation)getObjectBuild(classname, fieldlist, o);
			
			return o;
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	
	@WebMethod(operationName = "getQMasterOld")
	public QMaster getQMasterTableOld(@WebParam(name = "QMasterKey") Double QMasterKey)
	{
		try {
			QMaster qm = new QMaster();
			qm.QMasterKey = QMasterKey;
			if (QMasterKey == 4.155551212E9) 	qm.ResponseCode = "Activate";
			else if (QMasterKey == 4.155552323E9) qm.ResponseCode = "Denied";
			else qm.ResponseCode = "Invalid";

			qm.CreateDate = new Date();
			qm.Queue = "Queue";
			qm.SerialNbr = "SerialNumber1234";
			qm.PIN = "987654321";
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
	
	@WebMethod(operationName = "getCustomerByActNum")
	public CustomerInformation getCustomerByActNum(@WebParam(name = "CustomerKey") Double CustomerKey)
	{
		try {
			CustomerInformation Customer = new CustomerInformation();
			Customer.CustomerKey = CustomerKey;
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
			Customer.DOB = "07/14/1983";
			Customer.ParentFirstName = "ParentFirstName";
			Customer.ParentLastName ="ParentLastName";
			Customer.TSysLoadAmount ="TSysLoadAmount";
			Customer.ActivationStatusKey = 543.00;
			Customer.DocsInSpanish = false;
			Customer.SendDocs = true;
			Customer.ProductKey = 1111.00;
			Customer.CreateDate = new Date();
			Customer.AgreedToTerms = new Date();
			Customer.SSN = "444-55-6666";
			Customer.DriversLicense = "DriversLicense";
			Customer.DriversLicenseState = "DriversLicenseState";
			Customer.AcctBalance = "AcctBalance";
			Customer.AcctBalanceAsOf = new Date();
			Customer.SerialNbr = "SerialNbr";
			Customer.RushPlastics = false;
			Customer.SysUserKey = 1.00;
			Customer.OrigAcctNbr = "OrigAcctNbr";
			Customer.UpgradeEligKey = 2.00;
			Customer.UpgradeOfExisting = true;
			Customer.UpgradeCustPtr = 3.00;
			Customer.CreditRatingKey = "CreditRatingKey";
			Customer.AtmPin = "";
			Customer.PlasticsRequest = new Date();
			Customer.CurrBalance = "";
			Customer.CurrBalanceAsOf = new Date();
			Customer.TermsSourceKey = 4.00;
			Customer.FirstUsed = new Date();
			Customer.HasCRV = false;
			Customer.StatusChangeDate = new Date();
			Customer.ATMGenerated = true;
			Customer.RealCreditEligKey = 5.00;
			Customer.ReplacementCard = false;
			Customer.ResidentialAddress1 = "";
			Customer.ResidentialAddress2 = "";
			Customer.ResidentialCity = "";
			Customer.ResidentialState = "";
			Customer.ResidentialZipcode = "";
			Customer.ReloadWarningStatusKey = 6.00;
			Customer.ActivationSysUserKey = 7.00;
			Customer.PasswordHint = "";
			Customer.ConsularID = "";
			Customer.MilitaryID = "";
			Customer.StateID = "";
			Customer.StateIDState = "";
			Customer.ACHActivationEligKey = 8.00;
			Customer.ParentSSN = "";
			Customer.ParentDOB = "09/05/1654";
			Customer.LastRefresh = new Date();
			Customer.TaxID = "";
			Customer.PassportNumber = "";
			Customer.ParentDriversLicense = "";
			Customer.ParentDriversLicenseState = "";
			Customer.AccountKey = 8.00;
			Customer.UserExternalId = "";
			Customer.UserVersionId = "";
			Customer.IsTsysPrepaidCustomerAccount = false;
			Customer.IsPrimaryAccountHolder = false;
			Customer.Card2DOB = "01/02/1903";
			Customer.PlasticIssueTypeKey = 9.00;
			Customer.PassportCountry = "";
			Customer.MonthlyStatements = false;
			Customer.CellPhone = "";
			Customer.ReminderQuestionKey = 10.00;
			Customer.ReminderAnswer = "";
			Customer.ParentConsularID = "";
			Customer.ParentPassportNumber = "";
			Customer.ParentPassportCountry = "";
			Customer.ParentStateID = "";
			Customer.ParentStateIDState = "";
			Customer.ParentTaxID = "";
			Customer.LastPurchaseActivity = new Date();
			Customer.LastOnUsActivity = new Date();
			Customer.OrderKey = 11.00;
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
	
	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();

		Node nValue = (Node) nlList.item(0);

		return nValue.getNodeValue();
	}
	
	private static Object getObjectBuild (String classname, Field[] fieldlist, Object o) {
		try {
			File XmlFile = new File("src/main/webapp/admin/object/"+classname+".xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(XmlFile);
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("fieldset");
		
			DateFormat formatter = new SimpleDateFormat("dd/MM/yy");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
		
					for (int i  = 0; i < fieldlist.length; i++) {
						Field fld = fieldlist[i];
						if (fld.getType().toString().equals("class java.lang.String")) fld.set(o, getTagValue(fld.getName(), eElement));
						else if (fld.getType().toString().equals("class java.lang.Double")) fld.set(o, Double.valueOf(getTagValue(fld.getName(), eElement)));
						else if (fld.getType().toString().equals("class java.util.Date")) fld.set(o, formatter.parse(getTagValue(fld.getName(), eElement)));
						else if (fld.getType().toString().equals("class java.lang.Boolean")) fld.set(o, Boolean.valueOf(getTagValue(fld.getName(), eElement)));
						else if (fld.getType().toString().equals("class java.lang.Integer")) fld.set(o, Integer.valueOf(getTagValue(fld.getName(), eElement)));
					}
				}
			}
			return o;
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}*/
	
	@WebMethod(operationName = "getActivationInformation")
	public ActivationInformation getActivationInformation(@WebParam(name = "ActivationData") String ActivationData, @WebParam(name="ActivationDataType") Integer ActivationDataType)
	{
		try {
		  List<Upsell> upsellList = new ArrayList<Upsell>();
		  List<Address> addressList = new ArrayList<Address>();
		  List<Phone> phoneList = new ArrayList<Phone>();
		  List<Fee> feeList = new ArrayList<Fee>();
		  
      Upsell newUpsell = new Upsell();
      newUpsell.Description = "test";
      newUpsell.Type = 111;
      newUpsell.Fee = 400.00;
      newUpsell.isEligible = 1;
      
      upsellList.add(newUpsell);
      
      Upsell newUpsell2 = new Upsell();
      newUpsell2.Description = "test";
      newUpsell2.Type = 111;
      newUpsell2.Fee = 400.00;
      newUpsell2.isEligible = 0;
      
      upsellList.add(newUpsell2);
      
      Fee fee1 = new Fee();
      fee1.Amount = 100.00;
      fee1.Description = "Fee 1";
      fee1.isAllowed = true;
      fee1.Type = 0;
      
      feeList.add(fee1);
      
      Fee fee2 = new Fee();
      fee2.Amount = 200.00;
      fee2.Description = "Fee 2";
      fee2.isAllowed = false;
      fee2.Type = 1;
      
      feeList.add(fee2);
      
      Address address1 = new Address();
      address1.Address1 = "Address1";
      address1.Address2 = "Address2";
      address1.Address3 = "Address3";
      address1.AddressType = 1;
      address1.City = "City";
      address1.CountryCode = "USA";
      address1.State = "ST";
      address1.Zip = "11111";
      
      addressList.add(address1);
      
      Address address2 = new Address();
      address2.Address1 = "Address1";
      address2.Address2 = "Address2";
      address2.Address3 = "Address3";
      address2.AddressType = 2;
      address2.City = "City";
      address2.CountryCode = "USA";
      address2.State = "ST";
      address2.Zip = "11111";
      
      addressList.add(address2);
      
      Phone phone1 = new Phone();
      phone1.PhoneNumber = "5555555555";
      phone1.Type = 1;
      
      phoneList.add(phone1);
      
      Phone phone2 = new Phone();
      phone2.PhoneNumber = "5555555555";
      phone2.Type = 2;
      
      phoneList.add(phone2);
      
      CustomerInformation customerinformation = new CustomerInformation();
      customerinformation.ACHReference = "ACHReference";
      customerinformation.Address = addressList;
      customerinformation.DOB = new Date();
      customerinformation.Email = "test@test.com";
      customerinformation.FirstName = "FirstName";
      customerinformation.isEditable = 1;
      customerinformation.isMinor = 0;
      customerinformation.LanguagePreference = 1;
      customerinformation.LastName = "LastName";
      customerinformation.MiddleName = "MiddleName";
      customerinformation.Phone = phoneList;
      customerinformation.SSN = "123456789";
      
     BankInformation bi = new BankInformation();
     bi.ABARoutingNumber = "12345";
     bi.BankAddress = address1;
     bi.BankCode = 1;
     bi.BankKey = 1;
     bi.BankName = "BankName";
     
     CardInformation cardinformation = new CardInformation();
     
     cardinformation.CardNumber = "123456789012";
     cardinformation.CCV = "987";
     cardinformation.Cohort = "cohort";
     cardinformation.CohortKey = 1;
     cardinformation.FundingDelay = 60;
     cardinformation.MinorAge = 18;
     cardinformation.Portfolio = "portfolio";
     cardinformation.PortfolioDescription = "portfoliodescription";
     cardinformation.PortfolioKey = 1;
     cardinformation.ProductDescription = "Product Description";
     cardinformation.ProductKey = 11;
     cardinformation.RetailerKey = 22;
     
     IVRInformation ivr = new IVRInformation();
     ivr.IVRAuditHdrKey = 1;
     ivr.QMasterCallTypeKey = 123;
     ivr.QMasterExitKey = 321;
     ivr.QMasterKey = 98765;
     ivr.QMasterScriptKey = 12345;
     ivr.Queue = "Activations";
     ivr.QMasterUsherScript = "QMasterUsherScript";
     
     ParentInformation parentinformation = new ParentInformation();
     parentinformation.Address = addressList;
     parentinformation.DOB = new Date();
     parentinformation.Email = "parent@email.com";
     parentinformation.FirstName="ParentFirst";
     parentinformation.isEditable = 0;
     parentinformation.LanguagePreference = 0;
     parentinformation.LastName="ParentLast";
     parentinformation.MiddleName="ParentMiddle";
     parentinformation.Phone = phoneList;
     parentinformation.SSN = "098765432";
     
		  ActivationInformation ai = new ActivationInformation();
			ai.ActivationData = "ActivationData";
			ai.ActivationDataType = 1;
			ai.BankInformation = bi;
			ai.CardInformation = cardinformation;
			ai.CustomerInformation = customerinformation;
			ai.Fee = feeList;
			ai.IVRInformation = ivr;
			ai.ParentInformation = parentinformation;
			ai.RegistrationToken = 1;
			ai.ResponseCode = 0;
			ai.ResponseText = "ResponseText";
			ai.Upsell = upsellList;
			ai.WorkflowResponse = 1;
			
			return ai;
		}
		catch (Exception ex)
		{
			return null;
		}
	}
	
	@WebMethod(operationName = "updateActivationInformation")
  public ActivationInformation updateActivationInformation (@WebParam(name = "RegistrationToken") Integer RegistrationToken, @WebParam(name = "ProductKey") Integer ProductKey, @WebParam(name = "CustomerInformation", targetNamespace=tns) CustomerInformation CustomerInformation)
  {
	  try {
      List<Upsell> upsellList = new ArrayList<Upsell>();
      List<Address> addressList = new ArrayList<Address>();
      List<Phone> phoneList = new ArrayList<Phone>();
      List<Fee> feeList = new ArrayList<Fee>();
      
      Upsell newUpsell = new Upsell();
      newUpsell.Description = "test";
      newUpsell.Type = 111;
      newUpsell.Fee = 400.00;
      newUpsell.isEligible = 1;
      
      upsellList.add(newUpsell);
      
      Upsell newUpsell2 = new Upsell();
      newUpsell2.Description = "test";
      newUpsell2.Type = 111;
      newUpsell2.Fee = 400.00;
      newUpsell2.isEligible = 0;
      
      upsellList.add(newUpsell2);
      
      Fee fee1 = new Fee();
      fee1.Amount = 100.00;
      fee1.Description = "Fee 1";
      fee1.isAllowed = true;
      fee1.Type = 0;
      
      feeList.add(fee1);
      
      Fee fee2 = new Fee();
      fee2.Amount = 200.00;
      fee2.Description = "Fee 2";
      fee2.isAllowed = false;
      fee2.Type = 1;
      
      feeList.add(fee2);
      
      Address address1 = new Address();
      address1.Address1 = "Address1";
      address1.Address2 = "Address2";
      address1.Address3 = "Address3";
      address1.AddressType = 1;
      address1.City = "City";
      address1.CountryCode = "USA";
      address1.State = "ST";
      address1.Zip = "11111";
      
      addressList.add(address1);
      
      Address address2 = new Address();
      address2.Address1 = "Address1";
      address2.Address2 = "Address2";
      address2.Address3 = "Address3";
      address2.AddressType = 2;
      address2.City = "City";
      address2.CountryCode = "USA";
      address2.State = "ST";
      address2.Zip = "11111";
      
      addressList.add(address2);
      
      Phone phone1 = new Phone();
      phone1.PhoneNumber = "5555555555";
      phone1.Type = 1;
      
      phoneList.add(phone1);
      
      Phone phone2 = new Phone();
      phone2.PhoneNumber = "5555555555";
      phone2.Type = 2;
      
      phoneList.add(phone2);
      
     BankInformation bi = new BankInformation();
     bi.ABARoutingNumber = "12345";
     bi.BankAddress = address1;
     bi.BankCode = 1;
     bi.BankKey = 1;
     bi.BankName = "BankName";
     
     CardInformation cardinformation = new CardInformation();
     
     cardinformation.CardNumber = "123456789012";
     cardinformation.CCV = "987";
     cardinformation.Cohort = "cohort";
     cardinformation.CohortKey = 1;
     cardinformation.FundingDelay = 60;
     cardinformation.MinorAge = 18;
     cardinformation.Portfolio = "portfolio";
     cardinformation.PortfolioDescription = "portfoliodescription";
     cardinformation.PortfolioKey = 1;
     cardinformation.ProductDescription = "Product Description";
     cardinformation.ProductKey = 11;
     cardinformation.RetailerKey = 22;
     
     IVRInformation ivr = new IVRInformation();
     ivr.IVRAuditHdrKey = 1;
     ivr.QMasterCallTypeKey = 123;
     ivr.QMasterExitKey = 321;
     ivr.QMasterKey = 98765;
     ivr.QMasterScriptKey = 12345;
     ivr.Queue = "Activations";
     ivr.QMasterUsherScript = "QMasterUsherScript";
     
     ParentInformation parentinformation = new ParentInformation();
     parentinformation.Address = addressList;
     parentinformation.DOB = new Date();
     parentinformation.Email = "parent@email.com";
     parentinformation.FirstName="ParentFirst";
     parentinformation.isEditable = 0;
     parentinformation.LanguagePreference = 0;
     parentinformation.LastName="ParentLast";
     parentinformation.MiddleName="ParentMiddle";
     parentinformation.Phone = phoneList;
     parentinformation.SSN = "098765432";
     
      ActivationInformation ai = new ActivationInformation();
      ai.ActivationData = "ActivationData";
      ai.ActivationDataType = 1;
      ai.BankInformation = bi;
      ai.CardInformation = cardinformation;
      ai.CustomerInformation = CustomerInformation;
      ai.Fee = feeList;
      ai.IVRInformation = ivr;
      ai.ParentInformation = parentinformation;
      ai.RegistrationToken = 1;
      ai.ResponseCode = 1;
      ai.ResponseText = "ResponseText";
      ai.Upsell = upsellList;
      ai.WorkflowResponse = 1;
      
      return ai;
    }
    catch (Exception ex)
    {
      return null;
    }
  }
	
	@WebMethod(operationName = "QASAddressCheck")
  public QASResponse QASAddressCheck (@WebParam(name = "Address", targetNamespace=tns) org.greendot.heroku.service.Address address)
  {
    try {
      List<Address> addressList = new ArrayList<Address>();
      
      Address address1 = new Address();
      address1.Address1 = "Address1";
      address1.Address2 = "Address2";
      address1.Address3 = "Address3";
      address1.AddressType = 1;
      address1.City = "City";
      address1.CountryCode = "USA";
      address1.State = "ST";
      address1.Zip = "11111";
      
      addressList.add(address1);
      
      Address address2 = new Address();
      address2.Address1 = "Address1";
      address2.Address2 = "Address2";
      address2.Address3 = "Address3";
      address2.AddressType = 2;
      address2.City = "City";
      address2.CountryCode = "USA";
      address2.State = "ST";
      address2.Zip = "11111";
      
      addressList.add(address2);
      
      QASResponse qas = new QASResponse();
      qas.Address = addressList;
      qas.isMatch = "true";
      qas.MatchLevel = "StreetPartial";
      qas.ResponseCode = 0;
      qas.ResponseText = "ResponseText";
      
      return qas;
      
    }
    catch (Exception ex)
    {
      return null;
    }
  }
	
}



