package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;  
import javax.xml.bind.annotation.XmlType;

import com.sun.xml.txw2.annotation.XmlNamespace;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;    

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement()
public class CustomerInformation
{
  private static final String ns = "http://service.heroku.greendot.org/";
  
	@XmlElement(name="ACHReference")
	public String ACHReference;
	
	@XmlElement(name="FirstName")
	public String FirstName;
	
	@XmlElement(name="MiddleName")
	public String MiddleName;
	
	@XmlElement(name="LastName")
	public String LastName;
	
	@XmlElementWrapper(name="AddressList")
	@XmlElement(name="Address")
	public List<Address> Address;
	
	@XmlElementWrapper(name="PhoneList")
	@XmlElement(name="Phone")
	public List<Phone> Phone;
	
	@XmlElement(name="SSN")
	public String SSN;
	
	@XmlElement(name="DOB")
	public Date DOB;
	
	@XmlElement(name="Email")
	public String Email;
	
	@XmlElement(name="LanguagePreference")
	public Integer LanguagePreference;
	
	@XmlElement(name="isMinor")
	public Integer isMinor;
	
	@XmlElement(name="isEditable")
	public Integer isEditable;

}
