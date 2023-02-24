package com.github.jencinas.bootcamp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.content.Context;
import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {

    @Before
    public void setUp() {
        Intents.init();
    }

    @After
    public void tearDown() {
        Intents.release();
    }

    @Test
    public void testCorrectGreetingDisplayed(){
        Context context = ApplicationProvider.getApplicationContext();
        Intent intent = new Intent(context, GreetingActivity.class);
        intent.putExtra("EXTRA_USER_NAME", "John");
        ActivityScenario.launch(intent);
        onView(withId(R.id.greetingText)).check(matches(withText("Hello " + intent.getStringExtra("EXTRA_USER_NAME"))));
    }
}
