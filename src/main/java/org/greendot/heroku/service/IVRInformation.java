package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement;  
import java.util.Date;
import java.util.ArrayList;
import java.util.List;    

@XmlRootElement(name="IVRInformation")
public class IVRInformation
{
  private static final String ns = "http://service.heroku.greendot.org/";
  
	@XmlElement(name="QMasterKey")
	public Integer QMasterKey;
	
	@XmlElement(name="IVRAuditHdrKey")
	public Integer IVRAuditHdrKey;
	
	@XmlElement(name="QMasterCallTypeKey")
	public Integer QMasterCallTypeKey;
	
	@XmlElement(name="QMasterExitKey")
	public Integer QMasterExitKey;
	
	@XmlElement(name="QMasterScriptKey")
	public Integer QMasterScriptKey;
	
	@XmlElement(name="Queue")
  public String Queue;
	
	@XmlElement(name="QMasterUsherScript")
  public String QMasterUsherScript;
}

