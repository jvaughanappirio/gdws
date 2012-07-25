package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement;  
import java.util.Date;
import java.util.ArrayList;
import java.util.List;    

@XmlRootElement(name="Upsell")
public class Upsell
{	
	@XmlElement(name="Description")
	public String Description;
	
	@XmlElement(name="Type")
	public Integer Type;
	
	@XmlElement(name="Fee")
	public Double Fee;
	
	@XmlElement(name="isEligible")
	public Integer isEligible;
}
