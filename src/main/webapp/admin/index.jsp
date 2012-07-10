<%@page import="org.w3c.dom.*, javax.xml.parsers.*" %>
<%
  DocumentBuilderFactory docFactory = 
  DocumentBuilderFactory.newInstance();
  DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
  Document doc = docBuilder.parse("src/main/webapp/admin/test.xml");
%>
<%!
  public boolean isTextNode(Node n){
  return n.getNodeName().equals("#text");
  }
%>
<html>
  <head><title>Parsing of xml using DOM Parser</title></head>
  <body>  
  <h2><font color='green'>Employees of Roseindia</font></h2>
  <table border="2">
  <tr>
  <th>Name of Employee</th>
  <th>Date of Birth</th>
  <th>City</th>
  </tr>
  <%
  Element  element = doc.getDocumentElement(); 
  NodeList personNodes = element.getChildNodes(); 
  for (int i=0; i<personNodes.getLength(); i++){
  Node emp = personNodes.item(i);
  if (isTextNode(emp))
  continue;
  NodeList NameDOBCity = emp.getChildNodes(); 
  %>
  <tr>
  <%
  for (int j=0; j<NameDOBCity.getLength(); j++ ){
  Node node = NameDOBCity.item(j);
  if ( isTextNode(node)) 
  continue;
  %>
  <td><%= node.getFirstChild().getNodeValue() %></td>
  <%
  } 
  %>
  </tr>
  <%
  }
  %>
  </table>
  </body>
</html>