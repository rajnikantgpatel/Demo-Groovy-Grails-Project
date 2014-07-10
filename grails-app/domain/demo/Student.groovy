package demo

class Student {

	String login
	String password
	String firstName
	String lastName
	Address address
	static constraints = {
		id column :'student_id'
		login blank:false, size:5..15,matches:/[\S]+/, unique:true
		password blank:false, size:5..15,matches:/[\S]+/, column: 'student_first_name'
		firstName blank:false, column: 'student_first_name'
		lastName blank:false, column: 'student_first_name'
	}
}
