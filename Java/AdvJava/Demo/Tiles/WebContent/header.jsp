<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <sj:head />
        <style>
        .buttons
        {
        display:inline; 
        border-style:solid ; 
        border-width:2px;
		 text-decoration:underline;
		 color:black;
        background-color: maroon;
        text-align: center;        
        }
        </style>
    </head>
    <body>
    <!-- <s:div cssStyle="height:20%">
      <img src="Images/india-tour.jpeg" width="100%" height="5%"/>
    </s:div> -->
    <s:div>
    <s:a href="login.action"><sj:div cssClass="buttons">Home</sj:div></s:a>
    <s:a href="about.action"><sj:div cssClass="buttons"  >About</sj:div></s:a>
    <s:a href="tour.action"><sj:div cssClass="buttons" >Tours</sj:div></s:a>
    <s:a href="search.action"><sj:div cssClass="buttons" >Search</sj:div></s:a>
    <s:a href="bid.action"><sj:div cssClass="buttons" >BID</sj:div></s:a>
    <s:a href="download.action"><sj:div cssClass="buttons" >Download</sj:div></s:a>
    <s:a href="tandc.action"><sj:div cssClass="buttons" >T & C</sj:div></s:a>
    <s:a href="feedback.action"><sj:div cssClass="buttons" >Feedback</sj:div></s:a>
    <s:a href="videos.action"><sj:div cssClass="buttons" >Videos</sj:div></s:a>
    <s:a href="gallery.action"><sj:div cssClass="buttons" >Gallery</sj:div></s:a>
    <s:a href="emailus.action"><sj:div cssClass="buttons" >Email us</sj:div></s:a>
    <s:a href="contact.action"><sj:div cssClass="buttons" >Contact</sj:div></s:a>
    </s:div>
    <s:div>
    <s:a href="login.action"><marquee><s:text name="Crawling text will come here"></s:text></marquee></s:a>
    </s:div>
  </body>
</html>