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
	public Double QMasterKey;

	@XmlElement(name="CreateDate")
	public Date CreateDate;

	@XmlElement(name="Queue")
	public String Queue;

	@XmlElement(name="SerialNbr")
	public String SerialNbr;

	@XmlElement(name="PIN")
	public String PIN;

	@XmlElement(name="LanguageKey")
	public Double LanguageKey;

	@XmlElement(name="PinKey")
	public Double PinKey;

	@XmlElement(name="IVRAuditHdrKey")
	public Double IVRAuditHdrKey;

	@XmlElement(name="QMasterCallTypeKey")
	public Double QMasterCallTypeKey;

	@XmlElement(name="CustomerKey")
	public Double CustomerKey;

	@XmlElement(name="QMasterExitKey")
	public Double QMasterExitKey;

	@XmlElement(name="OfferCode")
	public String OfferCode;

	@XmlElement(name="VirtualPilot")
	public Double VirtualPilot;

	@XmlElement(name="QMasterScriptKey")
	public Double QMasterScriptKey;

	@XmlElement(name="UsherScript")
	public String UsherScript;
	
	@XmlElement(name="ErrorResponse")
	public String ErrorResponse;
}