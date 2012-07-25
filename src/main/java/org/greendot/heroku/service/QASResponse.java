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
  private static final String ns = "http://service.heroku.greendot.org/";
  
  @XmlElement(name="ResponseCode", namespace=ns)
  public Integer ResponseCode;
  
  @XmlElement(name="ResponseText", namespace=ns)
  public String ResponseText;
  
  @XmlElement(name="isMatch", namespace=ns)
  public String isMatch;
  
  @XmlElement(name="MatchLevel", namespace=ns)
  public String MatchLevel;
  
  @XmlElementWrapper(name="AddressList", namespace=ns)
  @XmlElement(name="Address", namespace=ns)
  public List<Address> Address;
}


