package org.greendot.heroku.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

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

public class WriteXml extends HttpServlet {
	public void doGet(HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException, IOException {
							
		try {

		String filename="test.xml";
	
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
			if (paramName.equals("filename2")) 
			{
				filename = paramValues[0];
			}
		
			else if (!paramName.equals("filename2") && !paramName.equals("submit"))
			{
				if (paramValues.length == 1) 
				{
					String paramValue = paramValues[0];
					Element element = doc.createElement(paramName);
					element.appendChild(doc.createTextNode(paramValue));
					fieldsetelement.appendChild(element);
				} 
				else 
				{
					for(int i=0; i<paramValues.length; i++) {
						Element element = doc.createElement(paramName);
						element.appendChild(doc.createTextNode(paramValues[i]));
						fieldsetelement.appendChild(element);
					}
				}
			}
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
	  } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	  } catch (TransformerException tfe) {
		tfe.printStackTrace();
	  }
	}

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}