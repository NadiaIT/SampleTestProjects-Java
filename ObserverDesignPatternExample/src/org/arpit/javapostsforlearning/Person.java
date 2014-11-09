package org.arpit.javapostsforlearning;

public class Person implements Observer {

	String personName;

	public Person(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void update(String availabiliy) {

		System.out.println(personName + ", Product is now " + availabiliy);
	}

	public void unUsedMethod() {
		System.out.println("I am garbage");
	}
}
