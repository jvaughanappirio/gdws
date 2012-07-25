package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement;  
import java.util.Date;
import java.util.ArrayList;
import java.util.List;    

@XmlRootElement(name="QASResponse")
public class QASResponse
{
  
  @XmlElement(name="ResponseCode")
  public Integer ResponseCode;
  
  @XmlElement(name="ResponseText")
  public String ResponseText;
  
  @XmlElement(name="isMatch")
  public String isMatch;
  
  @XmlElement(name="MatchLevel")
  public String MatchLevel;
  
  @XmlElementWrapper(name="AddressList")
  @XmlElement(name="Address", namespace="http://service.heroku.greendot.org/")
  public List<Address> Address;
}


