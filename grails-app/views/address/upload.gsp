<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'address.label', default: 'Address')}" />
<title><g:message code="default.create.label"
		args="[entityName]" /></title>
</head>
<body>
	<g:uploadForm action="upload">
		<input type="file" name="myFile" />
		<input type="submit" value="Upload! " />
	</g:uploadForm>
</body>
</html>
