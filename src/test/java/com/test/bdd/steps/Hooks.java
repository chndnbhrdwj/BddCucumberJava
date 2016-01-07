package com.test.bdd.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Feature;

/**
 * Created by cku04 on 08/12/2015.
 */
public class Hooks {

    @Before
    public void before(Feature s) {
        System.out.println("Before hook kicked off for scenario " + s.getName() + "***" + s.getClass());
    }

    @After
    public void after(Scenario s){
        System.out.println("After hook kicked off for scenario "+s.getName()+"***"+s.isFailed());
    }
}
