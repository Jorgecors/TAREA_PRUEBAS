package com.example.calculadora1;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

public class espressoTest2 {

    @Rule
    public ActivityScenarioRule<CalculatorActivity> activityScenarioRule =
            new ActivityScenarioRule<>(CalculatorActivity.class);

    @Test
    public void testSum() {
        // Ingresa el primer número
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber1))
                .perform(ViewActions.typeText("2"));

        // Ingresa el segundo número
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber2))
                .perform(ViewActions.typeText("3"));

        // Presiona el botón de suma
        Espresso.onView(ViewMatchers.withId(R.id.buttonSum))
                .perform(ViewActions.click());

        // Verifica que el resultado es correcto
        Espresso.onView(ViewMatchers.withId(R.id.textViewResult))
                .check(ViewAssertions.matches(ViewMatchers.withText("5")));
    }
}