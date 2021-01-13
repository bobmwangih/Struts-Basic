
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>

<body>
<s:form action="fileupload" method="post "
		enctype="multipart/form-data">
		<s:file name="uploadedFile" label="File" />
		<s:submit value="Upload" />
	</s:form>


</body>
</html>