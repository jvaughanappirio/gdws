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
public class QASResponse
{
  private static final String ns = "http://service.heroku.greendot.org/";
  
  @XmlElement(name="ResponseCode")
  public Integer ResponseCode;
  
  @XmlElement(name="ResponseText")
  public String ResponseText;
  
  @XmlElement(name="isMatch")
  public String isMatch;
  
  @XmlElement(name="MatchLevel")
  public String MatchLevel;
  
  @XmlElementWrapper(name="AddressList")
  @XmlElement(name="Address")
  public List<Address> Address;
}


