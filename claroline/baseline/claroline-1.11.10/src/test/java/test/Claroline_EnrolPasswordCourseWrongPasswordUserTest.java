package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import po.AuthCoursesPage;
import po.IndexPage;

public class Claroline_EnrolPasswordCourseWrongPasswordUserTest extends BaseTest {
	
	@Test
	public void enrolPasswordCourseWrongPassword() throws InterruptedException{
		AuthCoursesPage acp = new IndexPage(driver)
				.login("user001", "password001")
				.enrolToCourse()
				.searchCourse("Course002")
				.enrolPassword("passowrd");
		
		assertEquals("Invalid enrolment key given", acp.getMessage());
		acp.doLogout();
	}
}
