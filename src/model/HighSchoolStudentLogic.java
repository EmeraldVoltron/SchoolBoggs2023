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
public class HighSchoolStudentLogic {
	
	public int calculateYearsToGradutate(HighSchoolStudent student) {
		
		int yearsToGraduate = 0;
		
		if(student.getCredits() >= 16) { //students with more than 16 or more credits can graduate
			yearsToGraduate = 0;
		} else if(student.getCredits() >= 12) { //students with 12 or more credits have another year til they can graduate
			yearsToGraduate = 1;
		} else if(student.getCredits() >= 8) { //students with 8 or more credits have 2 more years until they graduate
			yearsToGraduate = 2;
		} else if(student.getCredits() >= 4) { //students with less than 6 credits have 3 more years
			yearsToGraduate = 3;
		} else if(student.getCredits() == 0) { //students with 0 credits, have 4 years to graduate
			yearsToGraduate = 4;
		}
		return yearsToGraduate;
	}
	
	public boolean readyToGraduate(HighSchoolStudent student) {
		//students with 16 or more credits (minimum) are eligable to graduate, 4 credits per subject
		if(student.getCredits() >= 16) {
			return true;
		} else {
			return false;
		}
	}
	
}
