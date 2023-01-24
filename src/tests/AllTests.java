/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */
package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * @author abbyb
 *
 */
@Suite
@SelectClasses({ TestHighSchoolStudentLogic.class, Test2HighSchoolStudent.class})
public class AllTests {

}
