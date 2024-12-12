package com.example.finalexamapp2

import MainActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loginForm_isFunctional() {
        // Saisir le nom d'utilisateur
        onView(withId(R.id.username)).perform(typeText("testuser"), closeSoftKeyboard())

        // Saisir le mot de passe
        onView(withId(R.id.password)).perform(typeText("password123"), closeSoftKeyboard())

        // Cliquer sur le bouton "Se connecter"
        onView(withId(R.id.loginButton)).perform(click())

        // Vérifier que le message de bienvenue est affiché
        onView(withId(R.id.welcomeMessage)).check(matches(isDisplayed()))
    }

    @Test
    fun loginForm_showsErrorForEmptyFields() {
        // Laisser les champs vides et cliquer sur le bouton "Se connecter"
        onView(withId(R.id.loginButton)).perform(click())

        // Vérifier qu'un message d'erreur est affiché (supposons qu'il existe un TextView pour les erreurs)
        onView(withId(R.id.errorMessage)).check(matches(isDisplayed()))
    }
}
