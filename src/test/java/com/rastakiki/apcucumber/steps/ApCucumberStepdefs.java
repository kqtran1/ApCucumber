package com.rastakiki.apcucumber.steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class ApCucumberStepdefs {

    @Given("^the input data$")
    //public void the_input_data(DataTable inputData) throws Throwable {
    public void the_input_data(List<Map<String, Object>> inputData) throws Throwable {
        //toFact(inputData);
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^Data is aggregated$")
    public void Data_is_aggregated() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^the output Measure value is (.+)$")
    public void the_output_Measure_value_is_(double measureValue) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^the Underlying is equal to$")
    public void the_Underlying_is_equal_to(DataTable underlyingPoperties) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

}
