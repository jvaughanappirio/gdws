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
  private static final String ns = "http://service.heroku.greendot.org/";
  
	@XmlElement(name="Description", namespace=ns)
	public String Description;
	
	@XmlElement(name="Type", namespace=ns)
	public Integer Type;
	
	@XmlElement(name="Fee", namespace=ns)
	public Double Fee;
	
	@XmlElement(name="isEligible", namespace=ns)
	public Integer isEligible;
}
