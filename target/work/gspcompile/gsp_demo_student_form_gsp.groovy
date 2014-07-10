import demo.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_demo_student_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: studentInstance, field: 'login', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("student.login.label"),'default':("Login")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("login"),'maxlength':("15"),'pattern':(studentInstance.constraints.login.matches),'required':(""),'value':(studentInstance?.login)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'password', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("student.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("password"),'maxlength':("15"),'pattern':(studentInstance.constraints.password.matches),'required':(""),'value':(studentInstance?.password)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'firstName', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("student.firstName.label"),'default':("First Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("firstName"),'required':(""),'value':(studentInstance?.firstName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'lastName', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("student.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("lastName"),'required':(""),'value':(studentInstance?.lastName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance, field: 'address', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("student.address.label"),'default':("Address")],-1)
printHtmlPart(2)
invokeTag('select','g',42,['id':("address"),'name':("address.id"),'from':(demo.Address.list()),'optionKey':("id"),'required':(""),'value':(studentInstance?.address?.id),'class':("many-to-one")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1404733181000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
