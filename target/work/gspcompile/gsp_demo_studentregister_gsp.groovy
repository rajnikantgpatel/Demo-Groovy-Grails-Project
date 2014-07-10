import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_demo_studentregister_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/register.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'student.label', default: 'Student'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('renderErrors','g',16,['bean':(student)],-1)
printHtmlPart(5)
})
invokeTag('hasErrors','g',18,['bean':(student)],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('textField','g',22,['name':("login"),'value':(student?.login)],-1)
printHtmlPart(8)
invokeTag('passwordField','g',26,['name':("password"),'value':(student?.password)],-1)
printHtmlPart(9)
invokeTag('passwordField','g',31,['name':("confirm"),'value':(student?.confirm)],-1)
printHtmlPart(10)
invokeTag('textField','g',36,['name':("firstName"),'value':(student?.firstName)],-1)
printHtmlPart(11)
invokeTag('textField','g',40,['name':("lastName"),'value':(student?.lastName)],-1)
printHtmlPart(12)
invokeTag('select','g',46,['id':("address"),'name':("address.id"),'from':(demo.Address.list()),'optionKey':("id"),'required':(""),'value':(student?.address?.id),'class':("many-to-one")],-1)
printHtmlPart(13)
invokeTag('submitButton','g',49,['class':("formButton"),'name':("register"),'value':("Register")],-1)
printHtmlPart(6)
})
invokeTag('form','g',50,['action':("register"),'name':("registerForm")],2)
printHtmlPart(1)
})
invokeTag('captureBody','sitemesh',1,['id':("body")],1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1404736578000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
