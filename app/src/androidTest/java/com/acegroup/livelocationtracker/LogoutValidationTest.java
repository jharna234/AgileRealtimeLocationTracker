package com.acegroup.livelocationtracker;


import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import com.acegroup.livelocationtracker.view.students.StudentMainActivity;

public class LogoutValidationTest {
    @Rule
    public ActivityTestRule<StudentMainActivity> activity_logoutActivityTestRule = new ActivityTestRule<>(StudentMainActivity.class);
    @Test
    public void LogoutValidationTest() {
        onView(withId(R.id.signout)).perform(click());
    }
}
