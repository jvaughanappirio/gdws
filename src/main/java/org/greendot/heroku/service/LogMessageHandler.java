package org.greendotgreendot.heroku.service;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 *
 * @author meerasubbarao
 */
public class LogMessageHandler implements SOAPHandler<SOAPMessageContext> {

	public boolean handleMessage(SOAPMessageContext messageContext) {
			log(messageContext);         
			return true;
		}

		public Set<QName> getHeaders() {
			return Collections.EMPTY_SET;
		}

		public boolean handleFault(SOAPMessageContext messageContext) {
			return true;
		}

		public void close(MessageContext context) {
		}

		private void log(SOAPMessageContext messageContext) {
			SOAPMessage msg = messageContext.getMessage(); //Line 1
			try {
				msg.writeTo(System.out);  //Line 3
			} catch (SOAPException ex) {
				Logger.getLogger(LogMessageHandler.class.getName()).log(Level.SEVERE, null, ex);
			} catch (IOException ex) {
				Logger.getLogger(LogMessageHandler.class.getName()).log(Level.SEVERE, null, ex);
			}
		}


}