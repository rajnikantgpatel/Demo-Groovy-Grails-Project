package demo
import demo.Student;


class LoginCommand {
	String login
	String password
	private studentInstance
	Student getStudent() {
		if(!studentInstance && login)
			studentInstance = Student.findByLogin(login)
		return studentInstance
	}
	static constraints = {
		login blank:false, validator:{ val, studentObj ->
			if(!studentObj.student)
				return "student.not.found"
		}
		password blank:false, validator:{ val, studentObj ->
			if(studentObj.student && studentObj.student.password != val)
				return "student.password.invalid"
		}
	}
}
