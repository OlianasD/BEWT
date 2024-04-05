package base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import po.CreateCategoryPage;

public class AddEmptyCategory extends BaseTest {
	
	@Test
	public void addEmptyCategory() {

		CreateCategoryPage cat = loginAsAdmin()
			.siteAdmin()
			.setUsername(adminUser)
			.setPassword(adminPsw)
			.login()
			.categories()
			.addCategory()
			.saveError();
		
		assertEquals("Invalid field:  Title ", cat.getEmptyTitleAlert());

	}
}
