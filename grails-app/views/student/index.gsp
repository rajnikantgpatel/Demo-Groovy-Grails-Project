
<%@ page import="demo.Student" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'student.label', default: 'Student')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-student" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-student" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
						<th>See</th>
					
						<g:sortableColumn property="login" title="${message(code: 'student.login.label', default: 'Login')}" />
					
						<g:sortableColumn property="password" title="${message(code: 'student.password.label', default: 'Password')}" />
					
						<g:sortableColumn property="firstName" title="${message(code: 'student.firstName.label', default: 'First Name')}" />
					
						<g:sortableColumn property="lastName" title="${message(code: 'student.lastName.label', default: 'Last Name')}" />
					
						<th><g:message code="student.address.label" default="Address" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${studentInstanceList}" status="i" var="studentInstance">
					<tr class="${(i % 2) != 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${studentInstance.id}">${studentInstance.id}</g:link></td>
					
						<td>${fieldValue(bean: studentInstance, field: "login")}</td>
						
						<td>${fieldValue(bean: studentInstance, field: "password")}</td>
					
						<td>${fieldValue(bean: studentInstance, field: "firstName")}</td>
					
						<td>${fieldValue(bean: studentInstance, field: "lastName")}</td>
					
						<td>${fieldValue(bean: studentInstance, field: "address")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${studentInstanceCount ?: 0}" prev="Previous 10 Students" next="Next 10 Students" maxsteps="2" />
			</div>
		</div>
	</body>
</html>
