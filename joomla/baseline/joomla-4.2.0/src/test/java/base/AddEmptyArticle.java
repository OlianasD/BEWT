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
		
		assertEquals("Please fill in this field", post.getEmptyTitleAlert());
	}
}
