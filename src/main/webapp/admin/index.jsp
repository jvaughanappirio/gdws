<%@page import="org.w3c.dom.*, javax.xml.parsers.*, java.io.*;" %>
<%
	File dir = new File("src/main/webapp/admin/object/");
 	File[] filelist = dir.listFiles();
	String filename = filelist[0].getName();
	if (request.getParameter("filename1") != null)
	{
		filename=request.getParameter("filename1");
	}
	
  DocumentBuilderFactory docFactory = 
  DocumentBuilderFactory.newInstance();
  DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
  Document doc = docBuilder.parse("src/main/webapp/admin/object/"+filename);

%>
<%!
	public boolean isTextNode(Node n)
	{
		return n.getNodeName().equals("#text");
	}
%>
<script type="text/javascript">
window.onload = function()
{
	document.getElementById("filenameselect").value = "<%= filename %>";	
}

function updateFields()
{
	x = document.getElementById("filenameselect").value;
	document.getElementById("filename1").value = x;
	document.getElementById("filename2").value = x;
}
</script>

<html>
	<head>
		<title>Admin Panel</title>
	</head>
	<body>  
		<form method="post" action="index.jsp" >
			<select name="filenameselect" id="filenameselect" onchange="updateFields();">
<%
				for (int i=0; i<filelist.length; i++)
				{
%>
				<option value="<%= filelist[i].getName() %>"><%= filelist[i].getName() %></option>
<%					
				}
%>	
			</select>
			<input type="hidden" name="filename1" value="<%= filename %>" id="filename1"/><input type="submit" name="submit" value="Load" >
		</form>
		<form method="post" action="../servlet/WriteXml">
			<input type="hidden" name="filename2" value="<%= filename %>" id="filename2"/>
			<h2><font color='green'>Field Values</font></h2>
			<table border="2">
				<tr>
					<th>Name</th>
					<th>Value</th>
				</tr>
<%
				Element  element = doc.getDocumentElement(); 
				NodeList fullfieldNode = element.getChildNodes(); 
				for (int i=0; i<fullfieldNode.getLength(); i++)
				{
					Node fullfield = fullfieldNode.item(i);
					if (isTextNode(fullfield)) continue;
					NodeList fieldNode = fullfield.getChildNodes(); 
%>
	  				<tr>
<%
					for (int j=0; j<fieldNode.getLength(); j++ )
					{
						Node node = fieldNode.item(j);
						if ( isTextNode(node)) continue;
%>							<td><%= node.getNodeName() %>
							<td><input type="text" name="<%= node.getNodeName() %>" value="<%= node.getFirstChild().getNodeValue() %>" /></td>
							</tr>	
<%
					}
				}
%>
			</table>
			<input type="submit" name="submit" value="Save">
			
		</form>
		<hr />
		<h2><font color='green'>Generate XML Files</font></h2>
		<form method="post" action="../servlet/CreateClassXml">
			Class Name<input type="text" name="classname" />
			<input type="submit" name="submit" />
		</form>
	</body>
</html>