package com.acegroup.livelocationtracker;


import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import com.acegroup.livelocationtracker.models.Student;
import com.acegroup.livelocationtracker.view.students.StudentLogin;

public class LoginValidationTest {
    @Rule
    public ActivityTestRule<StudentLogin> activity_loginActivityTestRule = new ActivityTestRule<>(StudentLogin.class);

    @Test
    public void LoginValidationTest() {
        onView(withId(R.id.email)).perform(typeText( "jharnar7@gmail.com" ));
        closeSoftKeyboard();
        onView(withId(R.id.password)).perform(typeText( "1234abcd" ));
        closeSoftKeyboard();
        onView(withId(R.id.login_button)).perform(click());
    }
}
