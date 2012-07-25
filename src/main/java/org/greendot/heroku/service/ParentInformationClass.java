package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement;  
import javax.xml.bind.annotation.XmlType;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;    

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement()
public class ParentInformationClass
{
  
  private static final String ns = "http://service.heroku.greendot.org/";
	
	@XmlElement(name="FirstName")
	public String FirstName;
	
	@XmlElement(name="MiddleName")
	public String MiddleName;
	
	@XmlElement(name="LastName")
	public String LastName;
	
	@XmlElementWrapper(name="AddressList")
	@XmlElement(name="Address")
	public List<AddressClass> Address;
	
	@XmlElementWrapper(name="PhoneList")
	@XmlElement(name="Phone")
	public List<PhoneClass> Phone;
	
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
