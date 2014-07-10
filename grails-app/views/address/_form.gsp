<%@ page import="demo.Address" %>



<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'pincode', 'error')} ">
	<label for="pincode">
		<g:message code="address.pincode.label" default="Pincode" />
		
	</label>
	<g:textField name="pincode" pattern="${addressInstance.constraints.pincode.matches}" value="${addressInstance?.pincode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'city', 'error')} ">
	<label for="city">
		<g:message code="address.city.label" default="City" />
		
	</label>
	<g:textField name="city" value="${addressInstance?.city}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'country', 'error')} ">
	<label for="country">
		<g:message code="address.country.label" default="Country" />
		
	</label>
	<g:textField name="country" value="${addressInstance?.country}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'state', 'error')} ">
	<label for="state">
		<g:message code="address.state.label" default="State" />
		
	</label>
	<g:textField name="state" value="${addressInstance?.state}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'streetAddress', 'error')} ">
	<label for="streetAddress">
		<g:message code="address.streetAddress.label" default="Street Address" />
		
	</label>
	<g:textField name="streetAddress" value="${addressInstance?.streetAddress}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'students', 'error')} ">
	<label for="students">
		<g:message code="address.students.label" default="Students" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${addressInstance?.students?}" var="s">
    <li><g:link controller="student" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="student" action="create" params="['address.id': addressInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'student.label', default: 'Student')])}</g:link>
</li>
</ul>

</div>

