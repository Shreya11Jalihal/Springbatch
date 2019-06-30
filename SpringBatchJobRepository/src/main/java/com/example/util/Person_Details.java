package main.java.com.example.util;

public class Person_Details {

	String firstName, lastName, school;
	int rollnumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	@Override
	public String toString() {
		return "Person_Details [firstName=" + firstName + ", lastName=" + lastName + ", school=" + school
				+ ", rollnumber=" + rollnumber + "]";
	}

}
