package com.example.android_test;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;

import static org.junit.Assert.*;

import static android .support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityRule = new ActivityTestRule<>(MainActivity.class);
    private MainActivity mainActivity=null;

    @Before
    public void setUp() throws Exception {
        mainActivity = activityActivityRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
        Log.d("TAG","onCreate()");
    }

    @Test
    public void btn_clik() {
        Log.d("TAG","Button was cliked");
    }

    @Test
    public void testClikbutton(){
        Espresso.onView(withId(R.id.button)).perform(click());
    }
}