package com.example.finalexamapp2

import MainActivity
import androidx.lifecycle.Lifecycle
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun helloText_isDisplayed() {
        // Vérifie que le TextView avec l'ID helloText est affiché
        onView(withId(R.id.helloText)).check(matches(isDisplayed()))
    }

    @Test
    fun mainActivity_launchesSuccessfully() {
        val scenario = activityScenarioRule.scenario
        scenario.onActivity { activity ->
            println("Activité actuelle : ${activity.localClassName}")
        }
        assert(scenario.state.isAtLeast(Lifecycle.State.RESUMED)) {
            "L'activité n'a pas atteint l'état RESUMED"
        }
    }
}
