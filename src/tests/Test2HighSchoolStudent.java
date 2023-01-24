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
public class Test2HighSchoolStudent {
	//create new objects for tests
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
	public void testStudentReadyToGraduate() {
		//students with 16 or more credits should be ready to graduate
		student.setCredits(16);
		assertTrue(hsSL.readyToGraduate(student));
	}
	
	@Test
	public void testStudentNotReadyToGraduate() {
		//students with 8 credits should not be ready to graduate
		student.setCredits(8);
		assertFalse(hsSL.readyToGraduate(student));
	}

}
