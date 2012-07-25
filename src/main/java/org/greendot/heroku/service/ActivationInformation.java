package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement;  
import java.util.Date;
import java.util.ArrayList;
import java.util.List;    

@XmlRootElement(name="ActivationInformation", namespace= "http://service.heroku.greendot.org/")
public class ActivationInformation
{	
	private static final String ns = "http://service.heroku.greendot.org/";

  @XmlElement(name="ResponseCode")
	public Integer ResponseCode;
	
	@XmlElement(name="ResponseText", namespace=ns)
	public String ResponseText;
	
	@XmlElement(name="WorkflowResponse", namespace=ns)
	public Integer WorkflowResponse;
	
	@XmlElement(name="ActivationData", namespace=ns)
	public String ActivationData;
	
	@XmlElement(name="ActivationDataType", namespace=ns)
	public Integer ActivationDataType;
	
	@XmlElement(name="BankInformation", namespace=ns)
	public BankInformation BankInformation;
	
	@XmlElement(name="CardInformation", namespace=ns)
	public CardInformation CardInformation;
	
	@XmlElement(name="CustomerInformation", namespace=ns)
	public CustomerInformation CustomerInformation;
	
	@XmlElementWrapper(name="FeeList", namespace=ns)
	@XmlElement(name="Fee", namespace=ns)
	public List<Fee> Fee;
	
	@XmlElement(name="IVRInformation", namespace=ns)
	public IVRInformation IVRInformation;
	
	@XmlElement(name="ParentInformation", namespace=ns)
	public ParentInformation ParentInformation;
	
	@XmlElement(name="RegistrationToken", namespace=ns)
	public Integer RegistrationToken;
	
	@XmlElementWrapper(name="UpsellList", namespace=ns)
	@XmlElement(name="Upsell", namespace=ns)
	public List<Upsell> Upsell;
}
