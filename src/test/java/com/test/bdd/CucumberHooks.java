package com.test.bdd;

import cucumber.api.Scenario;

/**
 * Created by chandan on 1/7/2016.
 */
public class CucumberHooks {

    public String getStatus(Scenario s) {
        return "Status update: " + s.getSourceTagNames() + " " + s.getId() + " " + s.getStatus();
    }

}
