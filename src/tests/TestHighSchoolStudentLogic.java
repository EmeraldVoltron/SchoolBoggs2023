/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.HighSchoolStudent;
import model.HighSchoolStudentLogic;

/**
 * @author abbyb
 *
 */
public class TestHighSchoolStudentLogic {
	//creating new objects for tests
	HighSchoolStudentLogic hsSL = new HighSchoolStudentLogic();
	String name = "Lola";
	HighSchoolStudent student = new HighSchoolStudent(name);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test3YearsTilGraduation() {
		//students with 4 credits or less should have 3 more years to graduate
		student.setCredits(4);
		assertEquals(3, hsSL.calculateYearsToGradutate(student));
		
	}
	@Test
	public void test1YearsTilGraduation() {
		//students with 12 credits should have one year (minimum) to graduate
				student.setCredits(12);
				assertEquals(1, hsSL.calculateYearsToGradutate(student));
	}
}
