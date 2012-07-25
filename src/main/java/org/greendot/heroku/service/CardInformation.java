package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement; 
import java.util.ArrayList;
import java.util.List;
    
@XmlRootElement(name="CardInformation")
public class CardInformation
{
  private static final String ns = "http://service.heroku.greendot.org/";
  
  @XmlElement(name="CardNumber", namespace=ns)
	public String CardNumber;

	@XmlElement(name="CCV", namespace=ns)
	public String CCV;

	@XmlElement(name="CohortKey", namespace=ns)
	public Integer CohortKey;
	
	@XmlElement(name="Cohort", namespace=ns)
	public String Cohort;
	
	@XmlElement(name="FundingDelay", namespace=ns)
	public Integer FundingDelay;
	
	@XmlElement(name="MinorAge", namespace=ns)
	public Integer MinorAge;
	
	@XmlElement(name="ProductKey", namespace=ns)
	public Integer ProductKey;
	
	@XmlElement(name="ProductDescription", namespace=ns)
	public String ProductDescription;
	
	@XmlElement(name="PortfolioKey", namespace=ns)
	public Integer PortfolioKey;
	
	@XmlElement(name="Portfolio", namespace=ns)
	public String Portfolio;
	
	@XmlElement(name="PortfolioDescription", namespace=ns)
	public String PortfolioDescription;
	
	@XmlElement(name="RetailerKey", namespace=ns)
	public Integer RetailerKey;
}

