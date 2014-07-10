package demo



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class StudentController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def index(Integer max) {
		params.max = Math.min(max ?: 10, 100)
		respond Student.list(params), model:[studentInstanceCount: Student.count()]
	}

	def show(Student studentInstance) {
		respond studentInstance
	}

	def create() {
		respond new Student(params)
	}

	@Transactional
	def save(Student studentInstance) {
		if (studentInstance == null) {
			notFound()
			return
		}

		if (studentInstance.hasErrors()) {
			respond studentInstance.errors, view:'create'
			return
		}

		studentInstance.save flush:true

		request.withFormat {
			form {
				flash.message = message(code: 'default.created.message', args: [
					message(code: 'studentInstance.label', default: 'Student'),
					studentInstance.id
				])
				redirect studentInstance
			}
			'*' { respond studentInstance, [status: CREATED] }
		}
	}

	def edit(Student studentInstance) {
		respond studentInstance
	}

	@Transactional
	def update(Student studentInstance) {
		if (studentInstance == null) {
			notFound()
			return
		}

		if (studentInstance.hasErrors()) {
			respond studentInstance.errors, view:'edit'
			return
		}

		studentInstance.save flush:true

		request.withFormat {
			form {
				flash.message = message(code: 'default.updated.message', args: [
					message(code: 'Student.label', default: 'Student'),
					studentInstance.id
				])
				redirect studentInstance
			}
			'*'{ respond studentInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(Student studentInstance) {

		if (studentInstance == null) {
			notFound()
			return
		}

		studentInstance.delete flush:true

		request.withFormat {
			form {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'Student.label', default: 'Student'),
					studentInstance.id
				])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form {
				flash.message = message(code: 'default.not.found.message', args: [
					message(code: 'studentInstance.label', default: 'Student'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}

	def register = {
		if(request.method == 'POST') {
			def studentInstance = new Student(params)
			if(studentInstance.password != params.confirm) {
				studentInstance.errors.rejectValue("password", "student.password.dontmatch")
				return [student:studentInstance]
			}
			else if(studentInstance.save()) {
				session.student = studentInstance
				redirect(controller:"studentManagement")
			}
			else {
				return [student:studentInstance]
			}
		}
	}

	def login = { LoginCommand cmd ->
		if(request.method == 'POST') {
			if(!cmd.hasErrors()) {
				session.student = cmd.getStudent()
				redirect(controller:'studentManagement')
			}
			else {
				render(view:'/studentManagement/index', model:[loginCmd:cmd])
			}
		}
		else {
			render(view:'/studentManagement/index')
		}
	}
	def logout = {
		session.student = null
		redirect(controller:"studentManagement");
	}
}
