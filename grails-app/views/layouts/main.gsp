<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title><g:layoutTitle default="Grails" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon"
	href="${resource(dir: 'images', file: 'favicon.ico')}"
	type="image/x-icon">
<link rel="apple-touch-icon"
	href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
<link rel="apple-touch-icon" sizes="114x114"
	href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"
	type="text/css">
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'mobile.css')}" type="text/css">
<g:layoutHead />
<g:javascript library="application" />
<r:layoutResources />
</head>
<body>
	<div id="grailsLogo" role="banner">
		<a href="#"><img
			src="${resource(dir: 'images', file: 'si_logo.png')}" alt="Grails" /></a>
	</div>
	<div id="spinner" class="spinner" style="display: none;">
		<g:message code="spinner.alt" default="Loading&hellip;" />
	</div>
	<div id="loginBox" class="loginBox">
		<g:if test="${session?.student}">
			<div style="margin-top: 20px">
				<div style="float: right;">
					<g:link controller="student" action="show" id="${session?.student?.id}">Profile</g:link> |
					<g:link controller="student" action="logout">Logout</g:link>
					<br>
				</div>
				Welcome back <span id="studentFirstName"> ${session?.student?.firstName}!
				</span> <br>
			</div>
		</g:if>
		<g:else>
			<g:form name="loginForm" url="[controller:'student',action:'login']">
				<div>User name:</div>
				<g:textField name="login"></g:textField>
				<div>Password:</div>
				<g:passwordField name="password" />
				<input type="submit" value="Login" />
			</g:form>
		</g:else>
	</div>
	<g:layoutBody />
	<div class="footer" role="contentinfo"></div>
	<div id="navPane">
		<g:if test="${session.student}">
			<ul>
				<li><g:link controller="address" action="index">My Address List</g:link></li>
				<li><g:link controller="student" action="index">Student List</g:link></li>
				
			</ul>
		</g:if>
		<g:else>
			<div id="registerPane">
				Need an account?
				<g:link controller="student" action="register">Signup now</g:link>
				to start saving your personal details!
			</div>
		</g:else>
	</div>
	<r:layoutResources />
</body>
</html>
