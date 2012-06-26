/**
 * 
 */
package org.greendot.heroku.service;

import javax.ejb.Remote;

/**
 * @author jvaughan
 * 
 */
@Remote
public interface GDWebService {

	Object getCardInfo(String cardnumberinput);
	Object getCustomerInfo(String firstnameinput, String lastnameinput);
}
