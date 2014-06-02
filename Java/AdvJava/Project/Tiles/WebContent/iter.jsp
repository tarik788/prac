<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
  <title>India Tours pvt</title>
    <sj:head jqueryui="true" jquerytheme="humanity" />
  </head>
  <body background="bg.jpg">
    <s:url var="url1" action="myaction1"/>
    <s:url var="url2" action="myaction2"/>
     <s:url var="url3" action="myaction1"/>
      <s:url var="url4" action="myaction4"/>
       <s:url var="url5" action="myaction5"/>
       <s:url var="url6" action="myaction6"/>
    <s:url var="url7" action="myaction7"/>
     
    


    
    <sj:tabbedpanel id="mytabs2" selectedTab="0" animate="" sortable="true"  collapsible="true" >
      <sj:tab id="tab1" href="%{url1}" label="Itinerary"/>
      <sj:tab id="tab2" href="%{url2}" label="Cost"/>
        <sj:tab id="tab3" href="%{url3}" label="Dates"/>
           <sj:tab id="tab4" href="%{url4}" label="Stay & Meal"/><br/>
             <sj:tab id="tab5" href="%{url5}" label="PP/VISA"/>
               <sj:tab id="tab6" href="%{url6}" label="Terms&Conditions"/>
                 <sj:tab id="tab7" href="%{url7}" label="Book Tour"/><br/>
           
     
    </sj:tabbedpanel>

  </body>
</html>
