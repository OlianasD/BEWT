package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import po.AuthCoursesPage;
import po.IndexPage;

public class Claroline_EnrolPasswordCourseGoodPasswordUserTest extends BaseTest {
	
	@Test
	public void enrolPasswordCourseGoodPassword() throws InterruptedException{
		AuthCoursesPage acp = new IndexPage(driver)
				.login("user001", "password001")
				.enrolToCourse()
				.searchCourse("Course002")
				.enrolPassword("password");
		
		assertEquals("You've been enrolled on the course", acp.getMessage());
		acp.doLogout();
	}
}
