package base;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	AdminLoginTest.class,
	BadLoginTest.class,
	EmptyLoginTest.class,
	AddUserTest.class,
	LoginAsNewUserTest.class,
	BadSiteAdminLoginTest.class,
	EmptySiteAdminLogin.class,
	AddNewArticleTest.class,
	AddEmptyArticleTest.class,
	EditArticleTest.class,
	DeleteArticleTest.class,
	AddCategoryTest.class,
	AddEmptyCategoryTest.class,
	AssignCategoryTest.class,
	ChangePasswordTest.class,
	ChangePasswordDontMatchTest.class,
	AddMenuItemTest.class,
	AddMenuItem_EmptyTitleTest.class,
	AddMenuItem_MenuNotSelectedTest.class,
	AddMenuItem_EmptyMenuTypeTest.class,
	ArchiveArticleTest.class,
	SeeArchivedArticleTest.class,
	AddGroupTest.class,
	AddEmptyGroupTest.class,
	AssignUserToGroupTest.class,
	AddFieldTest.class,
	AddEmptyFieldTest.class,
	AddFieldGroupTest.class,
	AddEmptyFieldGroupTest.class,
	AssignFieldToGroupTest.class,
	DeleteUserGroupTest.class,
	DeleteFieldTest.class,
	DeleteFieldGroupTest.class,
	DeleteUserTest.class,
	
})
public class TestSuite {}