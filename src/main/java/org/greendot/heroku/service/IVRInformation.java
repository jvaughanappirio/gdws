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
  
	@XmlElement(name="QMasterKey", namespace=ns)
	public Integer QMasterKey;
	
	@XmlElement(name="IVRAuditHdrKey", namespace=ns)
	public Integer IVRAuditHdrKey;
	
	@XmlElement(name="QMasterCallTypeKey", namespace=ns)
	public Integer QMasterCallTypeKey;
	
	@XmlElement(name="QMasterExitKey", namespace=ns)
	public Integer QMasterExitKey;
	
	@XmlElement(name="QMasterScriptKey", namespace=ns)
	public Integer QMasterScriptKey;
	
	@XmlElement(name="Queue", namespace=ns)
  public String Queue;
	
	@XmlElement(name="QMasterUsherScript", namespace=ns)
  public String QMasterUsherScript;
}

