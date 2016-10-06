package com.elsevier.education;

/**

One of the main benefits of immutable classes is that they are inherently more thread safe due to no mutable, shared state.
Not only does this make your coding easier, it'll also give you two performance benefits as a side effect

1) Less need for synchronization.

2) More scope for using final variables, which can facilitate subsequent compiler optimisations.


*/
public class Exercise1 {

	public static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person() {
		}

		@ConstructorProperties({"phoneNumbers", "firstName", "lastName"})


		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
		
		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
	}
}
