package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import po.CourseCreatePage;
import po.IndexPage;

public class Claroline_AddPasswordCourseTest extends BaseTest {
	
	@Test
	public void addPasswordCourse() throws InterruptedException{
		CourseCreatePage ccp = new IndexPage(driver)
				.login("admin", "admin")
				.goToAdminPage()
				.addCourse()
				.addPasswordCourse("Course002", "002", "Humanities", "password");
		assertEquals("You have just created the course website : 002", ccp.getMessage());
		ccp.goToAdminPage().doLogout();
	}
}
