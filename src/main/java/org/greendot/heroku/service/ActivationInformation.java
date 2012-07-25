package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement;  
import java.util.Date;
import java.util.ArrayList;
import java.util.List;    

@XmlRootElement(name="ActivationInformation", namespace="http://service.heroku.greendot.org/")
public class ActivationInformation
{	
	@XmlElement(name="ResponseCode")
	public Integer ResponseCode;
	
	@XmlElement(name="ResponseText")
	public String ResponseText;
	
	@XmlElement(name="WorkflowResponse")
	public Integer WorkflowResponse;
	
	@XmlElement(name="ActivationData")
	public String ActivationData;
	
	@XmlElement(name="ActivationDataType")
	public Integer ActivationDataType;
	
	@XmlElement(name="BankInformation", namespace="http://service.heroku.greendot.org/")
	public BankInformation BankInformation;
	
	@XmlElement(name="CardInformation", namespace="http://service.heroku.greendot.org/")
	public CardInformation CardInformation;
	
	@XmlElement(name="CustomerInformation", namespace="http://service.heroku.greendot.org/")
	public CustomerInformation CustomerInformation;
	
	@XmlElementWrapper(name="FeeList")
	@XmlElement(name="Fee", namespace="http://service.heroku.greendot.org/")
	public List<Fee> Fee;
	
	@XmlElement(name="IVRInformation")
	public IVRInformation IVRInformation;
	
	@XmlElement(name="ParentInformation", namespace="http://service.heroku.greendot.org/")
	public ParentInformation ParentInformation;
	
	@XmlElement(name="RegistrationToken")
	public Integer RegistrationToken;
	
	@XmlElementWrapper(name="UpsellList")
	@XmlElement(name="Upsell", namespace="http://service.heroku.greendot.org/")
	public List<Upsell> Upsell;
}
