package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement; 
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@XmlRootElement(name="BankInformation")
public class BankInformation
{	
	@XmlElement(name="BankName")
	public String BankName;
	
	@XmlElement(name="BankKey")
	public Integer BankKey;
	
	@XmlElement(name="BankCode")
	public Integer BankCode;
	
	@XmlElement(name="ABARoutingNumber")
	public String ABARoutingNumber;
	
	@XmlElement(name="BankAddress", namespace="http://service.heroku.greendot.org/")
	public Address BankAddress;
}