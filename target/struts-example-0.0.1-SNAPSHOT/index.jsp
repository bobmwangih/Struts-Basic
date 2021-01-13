
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<s:head />
</head>
<body>
	<%-- <s:form action ="verify">
	<s:textfield name="uname" label ="Enter username"/><br>
	<s:textfield name ="password" label="Enter password"/><br>
	<s:submit value="Submit" align="center"/>
</s:form> --%>

	<s:form action="register">
		<s:textfield name="firstName" label="Enter first name" />
		<br>
		<s:textfield name="lastName" label="Enter last name" />
		<br>

		<s:textfield name="email" label="Enter Email" />
		<br>

		<s:textfield name="age" label="Enter Age" />
		<br>
		<s:submit value="Register" align="center" />
	</s:form>
	<br />
	<s:form action="fileupload" method="POST "
		enctype="multipart/form-data">
		<s:file name="uploadedFile" label="File" />
		<s:submit value="Upload" />
	</s:form>

</body>
</html>