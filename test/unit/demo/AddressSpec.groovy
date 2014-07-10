package demo

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class AddressSpec extends Specification {

	def setup() {
	}

	def cleanup() {
	}

	void "test something"() {

		// mock the behavior of the Song domain class
//		 mokDomain(Address)
		 // create a Song with an invalid duration
		 def address = new Address(pincode: "abc")
		 // make sure that validation fails
		 assertFalse 'validation should have failed', address.validate()
		 // make sure that validation failed for the expected reason
		 assertEquals "min", address.errors.pincode
	}
	
	void testList(){
		

			}
}

