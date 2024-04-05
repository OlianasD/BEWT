package base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import po.CreatePostPage;

public class AddEmptyArticle extends BaseTest {
	
	@Test
	public void addEmptyArticle() {

		CreatePostPage post = loginAsAdmin()
				.createPost()
				.saveError();
		assertEquals("Invalid field:  Title ", post.getEmptyTitleAlert());
	}
}