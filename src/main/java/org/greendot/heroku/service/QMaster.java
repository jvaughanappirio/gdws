package org.greendot.heroku.service;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement; 
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@XmlRootElement(name="QMaster")
public class QMaster
{	
	@XmlElement(name="QMasterKey")
	public Long QMasterKey;

	@XmlElement(name="CreateDate")
	public Date CreateDate;

	@XmlElement(name="Queue")
	public String Queue;

	@XmlElement(name="SerialNbr")
	public String SerialNbr;

	@XmlElement(name="PIN")
	public String PIN;

	@XmlElement(name="LanguageKey")
	public Integer LanguageKey;

	@XmlElement(name="PinKey")
	public Integer PinKey;

	@XmlElement(name="IVRAuditHdrKey")
	public Integer IVRAuditHdrKey;

	@XmlElement(name="QMasterCallTypeKey")
	public Integer QMasterCallTypeKey;

	@XmlElement(name="CustomerKey")
	public Integer CustomerKey;

	@XmlElement(name="QMasterExitKey")
	public Integer QMasterExitKey;

	@XmlElement(name="OfferCode")
	public String OfferCode;

	@XmlElement(name="VirtualPilot")
	public Integer VirtualPilot;

	@XmlElement(name="QMasterScriptKey")
	public Integer QMasterScriptKey;

	@XmlElement(name="UsherScript")
	public String UsherScript;
	
	@XmlElement(name="ErrorResponse")
	public String ErrorResponse;
}