<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="com.totsp.freezedry.example.client.ExampleObject, 
                com.totsp.gwt.freezedry.server.SimpleSerializer,
                java.net.URLEncoder" %>
<%
    ExampleObject o = new ExampleObject();
    o.setMyString( "This is a dictionary test");
    o.setMyLong( new Long( 255 ));
%>
<html>
  <head>
    <title></title>
    <script language='javascript' src='com.totsp.freezedry.example.Example.nocache.js'></script>
    <script language='javascript'>
        com_totsp_freezedry_example_client_DictionaryFreezer = {
        getObject: unescape( "<%=URLEncoder.encode( SimpleSerializer.serializeObject( o ), "UTF-8" )%>" )
        };
    </script>
  </head>
  <body>
  <iframe src="javascript:''" id='__gwt_historyFrame' style='width:0;height:0;border:0'></iframe>
  </body>
</html>
