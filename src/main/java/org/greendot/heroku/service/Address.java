package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.XmlRootElement; 
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@XmlRootElement(name="Address", namespace="http://service.heroku.greendot.org/")
public class Address
{	
	private static final String ns = "http://service.heroku.greendot.org/";

  @XmlElement(name="Address1")
	public String Address1;
	
	@XmlElement(name="Address2")
	public String Address2;
	
	@XmlElement(name="Address3")
	public String Address3;
	
	@XmlElement(name="City")
	public String City;
	
	@XmlElement(name="CountryCode")
	public String CountryCode;
	
	@XmlElement(name="Latitude")
	public String Latitude;
	
	@XmlElement(name="Longitude")
	public String Longitude;
	
	@XmlElement(name="State")
	public String State;
	
	@XmlElement(name="Zip")
	public String Zip;
	
	@XmlElement(name="AddressType")
	public Integer AddressType;
}