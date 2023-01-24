/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */
package model;

/**
 * @author abbyb
 *
 */
public class HighSchoolStudent {
	private int age;
	private String name;
	private int credits;
	
	public HighSchoolStudent() {
	}
	
	public HighSchoolStudent(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

	
	
}
