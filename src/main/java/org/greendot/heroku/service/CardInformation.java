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

