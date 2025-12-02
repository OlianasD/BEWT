package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	AddNewProject_Test.class,
	AddEmptyProject_Test.class,
	AddNewTask_Test.class,
	AddEmptyTask_Test.class,
	EditProject_Test.class,
	AddNewColumn_Test.class,
	AddEmptyColumn_Test.class,
	AddNewSwimlane_Test.class,
	AddEmptySwimlane_Test.class,
	AddNewCategory_Test.class,
	AddEmptyCategory_Test.class,
	EditProfile_Test.class,
	AuthorizedUsers_Test.class,
	SetReferenceCurrency_Test.class,
	ChangeLanguage_Test.class,
	AddNewPrivateProject_Test.class,
	SearchInProject_Test.class,
	ChangeTask_Test.class,
	AddLocalUser_Test.class,
	AddRemoteUser_Test.class,
	AddLocalUser_DifferentPasswords_Test.class,
	AddLocalUser_EmptyConfirmPassword_Test.class,
	AddLocalUser_EmptyPassword_Test.class,
	AddLocalUser_EmptyUsername_Test.class,
	AddLocalUser_ShortPassword_Test.class,
	RemoveUser_Test.class,
	ClosedTasks_Test.class,
	RemoveProject_Test.class,
	ChangeBoardSettings_Test.class,
	AddNewCurrencyRate_Test.class,
})

public class TestSuite {}
