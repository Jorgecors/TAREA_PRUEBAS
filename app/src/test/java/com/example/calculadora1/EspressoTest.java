package com.example.calculadora1;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import static java.util.regex.Pattern.matches;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.example.calculadora1.MainActivity;
import com.example.calculadora1.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

@RunWith(EspressoTest.AndroidJUnit4.class)
public class EspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
    private boolean displayed;

    @Test
    public void verificaBotonCalcular() {
        // Verifica si el botón "botonCalcular" está presente y es visible.
        Espresso.onView(ViewMatchers.withId(R.id.boton_calcular)).check(matches(isDisplayed()));
    }





