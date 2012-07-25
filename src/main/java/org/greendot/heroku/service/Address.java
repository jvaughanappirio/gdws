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

  @XmlElement(name="Address1", namespace=ns)
	public String Address1;
	
	@XmlElement(name="Address2", namespace=ns)
	public String Address2;
	
	@XmlElement(name="Address3", namespace=ns)
	public String Address3;
	
	@XmlElement(name="City", namespace=ns)
	public String City;
	
	@XmlElement(name="CountryCode", namespace=ns)
	public String CountryCode;
	
	@XmlElement(name="Latitude", namespace=ns)
	public String Latitude;
	
	@XmlElement(name="Longitude", namespace=ns)
	public String Longitude;
	
	@XmlElement(name="State", namespace=ns)
	public String State;
	
	@XmlElement(name="Zip", namespace=ns)
	public String Zip;
	
	@XmlElement(name="AddressType", namespace=ns)
	public Integer AddressType;
}