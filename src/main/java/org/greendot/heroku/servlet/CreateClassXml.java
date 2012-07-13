package org.greendot.heroku.servlet;


import org.greendot.heroku.service.*;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.lang.Object;
import java.lang.reflect.Field;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateClassXml extends HttpServlet {
	public void doGet(HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException, IOException {
		try {

			String filename="test.xml";
			String classname="QMaster";
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("root");
			doc.appendChild(rootElement);

			Element fieldsetelement = doc.createElement("fieldset");
			rootElement.appendChild(fieldsetelement);

			response.setContentType("text/html");

			Enumeration paramNames = request.getParameterNames();

			while(paramNames.hasMoreElements()) 
			{
				String paramName = (String)paramNames.nextElement();
				String[] paramValues = request.getParameterValues(paramName);
				if (paramName.equals("classname")) 
				{
					filename = paramValues[0] + ".xml";
					classname = paramValues[0];
				}
			}
		
			Class classintance = Class.forName("org.greendot.heroku.service." + classname);
			Field[] fieldlist = classintance.getFields();
			Object object = classintance.newInstance();
		
			for (int i  = 0; i < fieldlist.length; i++) {
				Field fld = fieldlist[i];
				System.out.println("name = " + fld.getName());
				System.out.println("type = " + fld.getType());
				System.out.println("-----");
				Element element = doc.createElement(fld.getName());
				if (fld.getType().toString().equals("class java.lang.String")) element.appendChild(doc.createTextNode("String"));
				else if (fld.getType().toString().equals("class java.lang.Double")) element.appendChild(doc.createTextNode("1111.00"));
				else if (fld.getType().toString().equals("class java.util.Date")) element.appendChild(doc.createTextNode("01/01/01"));
				else if (fld.getType().toString().equals("class java.lang.Boolean")) element.appendChild(doc.createTextNode("true"));
				else element.appendChild(doc.createTextNode(fld.getType().toString()));
				fieldsetelement.appendChild(element);
			}
		
		
			//create xml file if it does not exist
			File f;
			f=new File("src/main/webapp/admin/object/" + filename);
			if(!f.exists())
			{
				f.createNewFile();
			}

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("src/main/webapp/admin/object/" + filename));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String title = "Reading All Request Parameters";
			out.println("File saved!");
			String destination  ="/admin/index.jsp?filename1=" + filename;        
			response.sendRedirect(response.encodeRedirectURL(destination));
	  } 
		
		catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	  } 
		catch (TransformerException tfe) {
		tfe.printStackTrace();
	  }
		catch (ClassNotFoundException cnfe) {
		cnfe.printStackTrace();
	  }	
		catch (SecurityException se) {
			se.printStackTrace();
		}
		catch (InstantiationException ie) {
			ie.printStackTrace();
		}
		catch (IllegalAccessException iae) {
			iae.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}