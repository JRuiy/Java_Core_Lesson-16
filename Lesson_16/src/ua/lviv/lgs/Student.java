package ua.lviv.lgs;

public class Student {

	private int age;
	private String firstName;
	private String lastName;
	public String group;

	public Student(int age, String firstName, String lastName, String group) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
