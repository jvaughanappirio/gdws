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
	
	@XmlElement(name="Amount")
	public Double Amount;
	
	@XmlElement(name="Description")
	public String Description;
	
	@XmlElement(name="isAllowed")
	public Boolean isAllowed;
	
	@XmlElement(name="Type")
	public Integer Type;
	
}

