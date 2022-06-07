package com.example.affirmations

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/*
 * Info: Because of an error in the ActivityScenarioRule, the test doesn't work
 *       Still need to fix that. More information: https://github.com/android/android-test/issues/143
 */

// Adding a test runner to the class
@RunWith(AndroidJUnit4::class)
class AffirmationsListTest {
    // Make an activity scenario for the main activity
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    // Create Test for list (static data)
    @Test
    fun scroll_to_item() {
        // Go to the last item. No hardcoded number, go to the item with the
        // given string (affirmation10)
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(9)
        )

        // Check if the last item contains the same string as in strings.xml (affirmation10)
        onView(withText(R.string.affirmation10))
            .check(
                matches(isDisplayed())
            )
    }
}