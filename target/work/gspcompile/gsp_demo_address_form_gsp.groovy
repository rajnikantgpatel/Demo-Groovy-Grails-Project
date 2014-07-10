import demo.Address
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_demo_address_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/address/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: addressInstance, field: 'pincode', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("address.pincode.label"),'default':("Pincode")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("pincode"),'pattern':(addressInstance.constraints.pincode.matches),'value':(addressInstance?.pincode)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'city', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("address.city.label"),'default':("City")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("city"),'value':(addressInstance?.city)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'country', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("address.country.label"),'default':("Country")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("country"),'value':(addressInstance?.country)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'state', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("address.state.label"),'default':("State")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("state"),'value':(addressInstance?.state)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'streetAddress', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("address.streetAddress.label"),'default':("Street Address")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("streetAddress"),'value':(addressInstance?.streetAddress)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'students', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("address.students.label"),'default':("Students")],-1)
printHtmlPart(9)
for( s in (addressInstance?.students) ) {
printHtmlPart(10)
createTagBody(2, {->
expressionOut.print(s?.encodeAsHTML())
})
invokeTag('link','g',53,['controller':("student"),'action':("show"),'id':(s.id)],2)
printHtmlPart(11)
}
printHtmlPart(12)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'student.label', default: 'Student')]))
})
invokeTag('link','g',56,['controller':("student"),'action':("create"),'params':(['address.id': addressInstance?.id])],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1404735909000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
