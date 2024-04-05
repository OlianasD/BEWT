package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import po.IndexPage;
import po.UserPage;

public class Claroline_EnrolMultipleUsersTest extends BaseTest {
	
	@Test
	public void runTest() throws InterruptedException{

		UserPage up = new IndexPage(driver)
				.login("testuser1", "testuser1")
				.enrolToCourse()
				.searchCourse("Course001")
				.enrol()
				.doLogoutAndGoHome(driver)
				.login("testuser2", "testuser2")
				.enrolToCourse()
				.searchCourse("Course001")
				.enrol()
				.doLogoutAndGoHome(driver)
				.login("testuser3", "testuser3")
				.enrolToCourse()
				.searchCourse("Course001")
				.enrol()
				.doLogoutAndGoHome(driver)
				.login("admin", "admin")
				.goInsideCourse()
				.goToUsersPage();
		
		assertTrue(up.getBodyText(driver).contains("testuser1"));
		assertTrue(up.getBodyText(driver).contains("testuser2"));
		assertTrue(up.getBodyText(driver).contains("testuser3"));
		up.doLogout();
		
	}
}
