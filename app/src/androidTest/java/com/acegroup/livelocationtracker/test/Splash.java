package com.acegroup.livelocationtracker.test;
import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import com.acegroup.livelocationtracker.view.SplashActivity;


import org.hamcrest.Matcher;
import org.junit.Rule;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.TestCase.assertNotNull;

import android.view.View;

public class Splash {
    @Rule
    private ActivityTestRule<SplashActivity> activityTestRule = new ActivityTestRule<>(SplashActivity.class);
    private SplashActivity activity;

    @Given("^I am on application drawer$")
    public void I_am_on_application_drawer() {
        assertNotNull(activity);
    }

    @When("^I click on tracker application$")
    public void I_click_on_tracker_application() {
        Espresso.closeSoftKeyboard();
        onView(withId(com.acegroup.livelocationtracker.R.id.splashtest)).perform(click());

    }

    @Then("^I should see spalsh screen with app logo$")
    public void I_should_see_dashboard_screen() {
        onView((Matcher<View>) activity);
        assertNotNull(activity);

    }
}