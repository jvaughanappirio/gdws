package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement;  
import java.util.Date;
import java.util.ArrayList;
import java.util.List;    

@XmlRootElement(name="Fee")
public class Fee
{
  private static final String ns = "http://service.heroku.greendot.org/";
  
	@XmlElement(name="Amount", namespace=ns)
	public Double Amount;
	
	@XmlElement(name="Description", namespace=ns)
	public String Description;
	
	@XmlElement(name="isAllowed", namespace=ns)
	public Boolean isAllowed;
	
	@XmlElement(name="Type", namespace=ns)
	public Integer Type;
}

