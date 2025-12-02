package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	AddContent_Test.class,
	ChangeUrl_Test.class,
	ChangePosition_Test.class,
	ChangeParent_Test.class,
	AddAsDraft_Test.class,
	SetStickyPost_Test.class,
	DeletePost_Test.class,
	AddUser_Test.class,
	DisableUser_Test.class,
	ChangePassword_Test.class,
	AddSocials_Test.class,
	ChangeHome_Test.class,
	OrderByPosition_Test.class,
	AddSiteSocial_Test.class,
	SetFooter_Test.class,
	ChangeLanguage_Test.class,
	DeleteUser_Test.class,
	ChangePostDate_Test.class,
	BadLoginFails_Test.class,
	AddCategory_Test.class,
	ChangeCategoryUrl_Test.class,
	AssignCategory_Test.class,
	SeeCategoryArticles_Test.class,
	DeleteCategory_Test.class,
	EmptyLoginFails_Test.class,
})

public class TestSuite {}