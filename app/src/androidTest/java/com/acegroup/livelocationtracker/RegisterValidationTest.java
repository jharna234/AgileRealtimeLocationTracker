package com.acegroup.livelocationtracker;
import androidx.test.rule.ActivityTestRule;

//import com.acegroup.livelocationtracker.Message;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import com.acegroup.livelocationtracker.view.faculties.FacultySignUp;

public class RegisterValidationTest {
    @Rule
    public ActivityTestRule<FacultySignUp> activity_registerActivityTestRule = new ActivityTestRule<>(FacultySignUp.class);
    @Test
    public void RegisterValidationTest() {
        onView(withId(R.id.name)).perform(typeText( "jharna" ));
        closeSoftKeyboard();
        onView(withId(R.id.employeeid)).perform(typeText( "1234" ));
        closeSoftKeyboard();
        onView(withId(R.id.emails)).perform(typeText( "jharnar7@gmail.com" ));
        closeSoftKeyboard();
        onView(withId(R.id.passwords)).perform(typeText( "1234abcd" ));
        closeSoftKeyboard();
        onView(withId(R.id.signupbutton)).perform(click());
    }
}
