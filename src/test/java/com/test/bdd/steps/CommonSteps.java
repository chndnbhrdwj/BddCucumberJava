package com.test.bdd.steps;

import com.test.bdd.Addition;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by chandan on 12/7/2015.
 */
public class CommonSteps {

    Addition add= new Addition();

    @Given("^I have numbers (\\d+) and (\\d+)$")
    public void i_have_numbers_and(int arg1, int arg2) throws Throwable {
        add.setNum1(arg1);
        add.setNum2(arg2);
    }

    @When("^I add the numbers$")
    public void i_add_the_numbers() throws Throwable {
        add.add();
    }

    @Then("^I should get addition result as (\\d+)$")
    public void i_should_get_addition_result(int arg1) throws Throwable {
        assertEquals(add.getSum(), arg1);
    }
}
