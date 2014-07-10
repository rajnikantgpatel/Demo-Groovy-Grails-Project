<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'student.label', default: 'Student')}" />
<title><g:message code="default.create.label"
		args="[entityName]" /></title>
</head>

<body id="body">
	<h1>Registration</h1>
	<p>Complete the form below to create an account!</p>
	<g:hasErrors bean="${student}">
		<div class="errors">
			<g:renderErrors bean="${student}"></g:renderErrors>
		</div>
	</g:hasErrors>
	<g:form action="register" name="registerForm">
		<div class="formField">
			<label for="login">Login:</label>
			<g:textField name="login" value="${student?.login}" />
		</div>
		<div class="formField">
			<label for="password">Password:</label>
			<g:passwordField name="password" value="${student?.password}" />
		</div>
		
		<div class="formField">
			<label for="confirm">Confirm Password:</label>
			<g:passwordField name="confirm" value="${student?.confirm}" />
		</div>
		
		<div class="formField">
			<label for="firstName">First Name:</label>
			<g:textField name="firstName" value="${student?.firstName}" />
		</div>
		<div class="formField">
			<label for="lastName">Last Name:</label>
			<g:textField name="lastName" value="${student?.lastName}" />
		</div>
		<div class="fieldfield">
			<label for="address">Address:</label>
			<g:select id="address" name="address.id"
				from="${demo.Address.list()}" optionKey="id" required=""
				value="${streetAddress}" optionValue="${streetAddress}" />
		</div>
		<g:submitButton class="formButton" name="register" value="Register" />
		<g:actionSubmit class="formButton" action="index" name="cancel" value="Cancel" />
	</g:form>
</body>