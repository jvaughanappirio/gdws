package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement;  
import java.util.Date;
import java.util.ArrayList;
import java.util.List;    

@XmlRootElement(name="CustomerInformation")
public class CustomerInformation
{
	
	@XmlElement(name="ACHReference")
	public String ACHReference;
	
	@XmlElement(name="FirstName")
	public String FirstName;
	
	@XmlElement(name="MiddleName")
	public String MiddleName;
	
	@XmlElement(name="LastName")
	public String LastName;
	
	@XmlElementWrapper(name="AddresList")
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
