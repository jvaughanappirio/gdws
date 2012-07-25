package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement; 
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@XmlRootElement(name="Phone")
public class Phone
{	
  private static final String ns = "http://service.heroku.greendot.org/";
  
	@XmlElement(name="PhoneNumber")
	public String PhoneNumber;

	@XmlElement(name="Extension")
	public String Extension;

	@XmlElement(name="Type")
	public Integer Type;
}