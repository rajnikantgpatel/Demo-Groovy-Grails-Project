import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_demo_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',12,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(resource(dir: 'images', file: 'favicon.ico'))
printHtmlPart(3)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon.png'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon-retina.png'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'main.css'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'css', file: 'mobile.css'))
printHtmlPart(7)
invokeTag('layoutHead','g',25,[:],-1)
printHtmlPart(1)
invokeTag('javascript','g',26,['library':("application")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',27,[:],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',28,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(resource(dir: 'images', file: 'grails_logo.png'))
printHtmlPart(9)
invokeTag('layoutBody','g',35,[:],-1)
printHtmlPart(10)
invokeTag('message','g',38,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(11)
invokeTag('layoutResources','r',40,[:],-1)
printHtmlPart(12)
if(true && (session?.student)) {
printHtmlPart(13)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',46,['controller':("student"),'action':("logout")],3)
printHtmlPart(15)
expressionOut.print(session?.student?.firstName)
printHtmlPart(16)
}
else {
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
invokeTag('textField','g',56,['name':("login")],-1)
printHtmlPart(19)
invokeTag('passwordField','g',58,['name':("password")],-1)
printHtmlPart(20)
})
invokeTag('form','g',60,['name':("loginForm"),'url':([controller:'student',action:'login'])],3)
printHtmlPart(21)
}
printHtmlPart(22)
if(true && (session.student)) {
printHtmlPart(23)
createClosureForHtmlPart(24, 3)
invokeTag('link','g',66,['controller':("address"),'action':("index")],3)
printHtmlPart(25)
}
else {
printHtmlPart(26)
createClosureForHtmlPart(27, 3)
invokeTag('link','g',72,['controller':("student"),'action':("register")],3)
printHtmlPart(28)
}
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',77,[:],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1404737260000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
