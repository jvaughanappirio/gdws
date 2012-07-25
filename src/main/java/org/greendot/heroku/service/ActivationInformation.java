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
@XmlRootElement()
public class ActivationInformation
{	
	private static final String ns = "http://service.heroku.greendot.org/";

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
	
	@XmlElement(name="BankInformation")
	public BankInformation BankInformation;
	
	@XmlElement(name="CardInformation")
	public CardInformation CardInformation;
	
	@XmlElement(name="CustomerInformation")
	public CustomerInformation CustomerInformation;
	
	@XmlElementWrapper(name="FeeList")
	@XmlElement(name="Fee")
	public List<Fee> Fee;
	
	@XmlElement(name="IVRInformation")
	public IVRInformation IVRInformation;
	
	@XmlElement(name="ParentInformation")
	public ParentInformation ParentInformation;
	
	@XmlElement(name="RegistrationToken")
	public Integer RegistrationToken;
	
	@XmlElementWrapper(name="UpsellList")
	@XmlElement(name="Upsell")
	public List<Upsell> Upsell;
}
