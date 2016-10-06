package com.elsevier.education;

import java.util.*;

/**

can run with gradlew clean build; java -cp build/classes/main com.elsevier.education.Exercise3

TODO We should be able to call people.add() twice but end with only one object in it.

*/
public class Exercise3 {

	public static void main(String[] args) {
	
		Set<Person> people = new HashSet<>();
	
		Person p1 = new Person(1);
		people.add(p1);
		people.add(p1);
		
		System.out.println(people.size());
		
	}
	
	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		@Override
		public int hashCode() {
			return id * generator.nextInt();
		}
		
		@Override
		public boolean equals(Object other) {	
			
			if (this == other)
			      return true;
			if (other == null)
			      return false;
			if (getClass() != other.getClass())
			      return false;
			Person p = (Person) other;
			  if (id != p.id)
			      return false;
			    return true;
			
			
		}
	}
}
