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
public class Fee
{
  private static final String ns = "http://service.heroku.greendot.org/";
  
	@XmlElement(name="Amount")
	public Double Amount;
	
	@XmlElement(name="Description")
	public String Description;
	
	@XmlElement(name="isAllowed")
	public Boolean isAllowed;
	
	@XmlElement(name="Type")
	public Integer Type;
}

