package demo

class Address {

	static constraints = {
		pincode(length:1..5)
	}

	String streetAddress
	String city
	String state
	String country
	String pincode
	String fullAddress
	String getFullAddress() {
		streetAddress + "," + city + "," + country + " - " + pincode
	}
	static hasMany = [students:Student]
	static transients = ['fullAddress']
}
