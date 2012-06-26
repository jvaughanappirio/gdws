package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement; 
import java.util.ArrayList;
import java.util.List;
    
@XmlRootElement(name="CardInformation")
public class CardInformation
{
	@XmlElement(name="CardNumber")
	public String CardNumber;

	@XmlElement(name="Activateable")
	public Boolean isActivateable;

	@XmlElement(name="PIN")
	public String PIN;

	@XmlElement(name="CCV")
	public String CCV;

	@XmlElement(name="TestList")
	@XmlElementWrapper(name="Test")
	public String[] TestStrings;
}