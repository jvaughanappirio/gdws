package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement; 
import javax.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;
    
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class CardInformation
{
  private static final String ns = "http://service.heroku.greendot.org/";
  
  @XmlElement(name="CardNumber")
	public String CardNumber;

	@XmlElement(name="CCV")
	public String CCV;

	@XmlElement(name="CohortKey")
	public Integer CohortKey;
	
	@XmlElement(name="Cohort")
	public String Cohort;
	
	@XmlElement(name="FundingDelay")
	public Integer FundingDelay;
	
	@XmlElement(name="MinorAge")
	public Integer MinorAge;
	
	@XmlElement(name="ProductKey")
	public Integer ProductKey;
	
	@XmlElement(name="ProductDescription")
	public String ProductDescription;
	
	@XmlElement(name="PortfolioKey")
	public Integer PortfolioKey;
	
	@XmlElement(name="Portfolio")
	public String Portfolio;
	
	@XmlElement(name="PortfolioDescription")
	public String PortfolioDescription;
	
	@XmlElement(name="RetailerKey")
	public Integer RetailerKey;
}

