Paths du webservice :


(Application.wadl)



<application xmlns="http://wadl.dev.java.net/2009/02">
<doc xmlns:jersey="http://jersey.java.net/" jersey:generatedBy="Jersey: 1.17.1 02/28/2013 12:47 PM"/>
<grammars>
<include href="application.wadl/xsd0.xsd">
<doc title="Generated" xml:lang="en"/>
</include>
</grammars>
<resources base="http://localhost:8080/YnovAppREST/">
<resource path="/Appointment">
<method id="updateAppointment" name="PUT">
<request>
<representation mediaType="application/json;charset=utf-8"/>
</request>
<response>
<ns2:representation xmlns:ns2="http://wadl.dev.java.net/2009/02" xmlns="" element="appointment" mediaType="*/*"/>
</response>
</method>
<method id="saveAppointment" name="POST">
<request>
<representation mediaType="application/json;charset=utf-8"/>
</request>
<response>
<ns2:representation xmlns:ns2="http://wadl.dev.java.net/2009/02" xmlns="" element="appointment" mediaType="*/*"/>
</response>
</method>
<resource path="/removeAppointment/{AppointmentId}">
<param xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AppointmentId" style="template" type="xs:int"/>
<method id="removeAppointment" name="DELETE">
<response>
<representation mediaType="*/*"/>
</response>
</method>
</resource>
<resource path="/Appointments">
<method id="getAppointments" name="GET">
<response>
<representation mediaType="application/json;charset=utf-8"/>
</response>
</method>
</resource>
</resource>
<resource path="/StudentOffice">
<method id="updateStudentOffice" name="PUT">
<request>
<representation mediaType="application/json;charset=utf-8"/>
</request>
<response>
<ns2:representation xmlns:ns2="http://wadl.dev.java.net/2009/02" xmlns="" element="studentOffice" mediaType="*/*"/>
</response>
</method>
<method id="saveStudentOffice" name="POST">
<request>
<representation mediaType="application/json;charset=utf-8"/>
</request>
<response>
<ns2:representation xmlns:ns2="http://wadl.dev.java.net/2009/02" xmlns="" element="studentOffice" mediaType="*/*"/>
</response>
</method>
<resource path="/removeStudentOffice/{StudentOfficeId}">
<param xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StudentOfficeId" style="template" type="xs:int"/>
<method id="removeStudentOffice" name="DELETE">
<response>
<representation mediaType="*/*"/>
</response>
</method>
</resource>
<resource path="/StudentOffices">
<method id="getStudentOffices" name="GET">
<response>
<representation mediaType="application/json;charset=utf-8"/>
</response>
</method>
</resource>
</resource>
<resource path="/News">
<method id="saveNews" name="POST">
<request>
<representation mediaType="application/json;charset=utf-8"/>
</request>
<response>
<ns2:representation xmlns:ns2="http://wadl.dev.java.net/2009/02" xmlns="" element="news" mediaType="*/*"/>
</response>
</method>
<method id="updateNews" name="PUT">
<request>
<representation mediaType="application/json;charset=utf-8"/>
</request>
<response>
<ns2:representation xmlns:ns2="http://wadl.dev.java.net/2009/02" xmlns="" element="news" mediaType="*/*"/>
</response>
</method>
<resource path="/removeNews/{NewsId}">
<param xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NewsId" style="template" type="xs:int"/>
<method id="removeNews" name="DELETE">
<response>
<representation mediaType="*/*"/>
</response>
</method>
</resource>
<resource path="/News">
<method id="getNewss" name="GET">
<response>
<representation mediaType="application/json;charset=utf-8"/>
</response>
</method>
</resource>
</resource>
<resource path="/Event">
<method id="updateEvent" name="PUT">
<request>
<representation mediaType="application/json;charset=utf-8"/>
</request>
<response>
<ns2:representation xmlns:ns2="http://wadl.dev.java.net/2009/02" xmlns="" element="event" mediaType="*/*"/>
</response>
</method>
<method id="saveEvent" name="POST">
<request>
<representation mediaType="application/json;charset=utf-8"/>
</request>
<response>
<ns2:representation xmlns:ns2="http://wadl.dev.java.net/2009/02" xmlns="" element="event" mediaType="*/*"/>
</response>
</method>
<resource path="/events">
<method id="getEvents" name="GET">
<response>
<representation mediaType="application/json;charset=utf-8"/>
</response>
</method>
</resource>
<resource path="/removeEvent/{eventId}">
<param xmlns:xs="http://www.w3.org/2001/XMLSchema" name="eventId" style="template" type="xs:int"/>
<method id="removeEvent" name="DELETE">
<response>
<representation mediaType="*/*"/>
</response>
</method>
</resource>
</resource>
</resources>
</application>