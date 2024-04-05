package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@SuiteClasses({ 
	AddUserTest.class,
	SearchUserTest.class,
	LoginUserTest.class,
	AddCourseTest.class,
	SearchCourseTest.class,
	EnrolUserTest.class,
	AddCourseEventTest.class,
	AddCourseExerciseTest.class,
	MakeCourseExerciseVisibleTest.class,
	AddCourseExerciseQuestionsTest.class,
	DoCourseExerciseQuestionsTest.class,
	ViewProfileStatisticsUserTest.class,
	AddMultipleUsersTest.class,
	SearchMultipleUsersTest.class,
	SearchStudentTest.class,
	SearchTeacherTest.class,
	SearchAdminTest.class,
	EnrolMultipleUsersTest.class,
	DoCourseExerciseQuestionsMultipleUsersTest.class,
	RemoveEnrolMultipleUsersTest.class,
	RemoveMultipleUsersTest.class,
	AddEmptyUserTest.class,
	AddWrongEmailUserTest.class,
	AddTwiceUserTest.class,
	AddWrongPasswordUserTest.class,
	AddEmptyCourseTest.class,
	AddDeniedCourseTest.class,
	EnrolDeniedCourseTest.class,
	AddPasswordCourseTest.class,
	EnrolPasswordCourseWrongPasswordUserTest.class,
	EnrolPasswordCourseGoodPasswordUserTest.class,
	SearchAllowedCourseTest.class,
	SearchAndRemovePasswordCourseTest.class,
	SearchAndRemoveDeniedCourseTest.class,
	RemoveCourseExerciseQuestionsTest.class,
	RemoveCourseEventTest.class,
	RemoveCourseExerciseTest.class,
	RemoveEnrolUserTest.class,
	RemoveUserTest.class,
	RemoveCourseTest.class
})

public class TestSuite {}
