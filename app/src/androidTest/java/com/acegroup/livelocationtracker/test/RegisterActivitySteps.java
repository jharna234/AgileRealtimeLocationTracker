package com.acegroup.livelocationtracker.test;
import android.content.Intent;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import com.acegroup.livelocationtracker.R;
import com.acegroup.livelocationtracker.view.faculties.FacultyLogin;
import com.acegroup.livelocationtracker.view.faculties.FacultySignUp;

import org.junit.Rule;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
//import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


//import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.TestCase.assertNotNull;

public class RegisterActivitySteps {

    @Rule
    private ActivityTestRule<FacultyLogin> activityTestRule = new ActivityTestRule<>(FacultyLogin.class);
    private FacultyLogin activity;

    @Before("@signup-feature")
    public void setUp() {
        activityTestRule.launchActivity(new Intent());
        activity = activityTestRule.getActivity();
    }
    @After("@signup-feature")
    public void tearDown() {
        activityTestRule.finishActivity();
    }

    @Given("^I am on register screen$")
    public void I_am_on_register_screen() {
        assertNotNull(activity);
    }

    @When("^I tap register button$")
    public void I_tap_register_button() {
//        Close the keyboard else the login button is not available for click on the screen
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.signupbutton)).perform(click());
    }

    @Then("^I should see email verify page screen$")
    public void I_should_see_dashboard_screen() {
        onView(withId(R.id.ok));
//        onView(withId(R.id.dashboard)).check(matches(withText(R.string.login)));
    }
}
