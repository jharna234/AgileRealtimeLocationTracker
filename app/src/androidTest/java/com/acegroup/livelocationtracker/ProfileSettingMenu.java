package com.acegroup.livelocationtracker;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import com.acegroup.livelocationtracker.view.faculties.FacultyMainActivity;


public class ProfileSettingMenu {
    @Rule
    public ActivityTestRule<FacultyMainActivity> activity_mainActivityMenuTestRule = new ActivityTestRule<>(FacultyMainActivity.class);
    @Test
    public void ProfileSettingMenuTest() {
        onView(withId(R.id.tools)).perform(click());
    }
}
