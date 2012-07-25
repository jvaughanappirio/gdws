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
  private static final String ns = "http://service.heroku.greendot.org/";
  
	@XmlElement(name="ACHReference", namespace=ns)
	public String ACHReference;
	
	@XmlElement(name="FirstName", namespace=ns)
	public String FirstName;
	
	@XmlElement(name="MiddleName", namespace=ns)
	public String MiddleName;
	
	@XmlElement(name="LastName", namespace=ns)
	public String LastName;
	
	@XmlElementWrapper(name="AddresList", namespace=ns)
	@XmlElement(name="Address",  namespace=ns)
	public List<Address> Address;
	
	@XmlElementWrapper(name="PhoneList", namespace=ns)
	@XmlElement(name="Phone", namespace=ns)
	public List<Phone> Phone;
	
	@XmlElement(name="SSN", namespace=ns)
	public String SSN;
	
	@XmlElement(name="DOB", namespace=ns)
	public Date DOB;
	
	@XmlElement(name="Email", namespace=ns)
	public String Email;
	
	@XmlElement(name="LanguagePreference", namespace=ns)
	public Integer LanguagePreference;
	
	@XmlElement(name="isMinor", namespace=ns)
	public Integer isMinor;
	
	@XmlElement(name="isEditable", namespace=ns)
	public Integer isEditable;

}
