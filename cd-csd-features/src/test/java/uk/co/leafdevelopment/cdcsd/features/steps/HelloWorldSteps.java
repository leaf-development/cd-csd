package uk.co.leafdevelopment.cdcsd.features.steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import feign.Feign;
import org.springframework.beans.factory.annotation.Value;
import uk.co.leafdevelopment.cdcsd.features.steps.client.CdCsd;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HelloWorldSteps {

    @Value("${cdcsd.host}")
    private String host;

    private CdCsd cdCsd;

    private String name;
    private String response;

    @Before
    public void setUpClient() {
        cdCsd = Feign.builder().target(CdCsd.class, host);
    }

    @Given("^I dont tell them my name$")
    public void i_dont_tell_them_my_name() throws Throwable {
        name = null;
    }

    @When("^I say hello$")
    public void i_say_hello() throws Throwable {
        response = cdCsd.sayHello(name);
    }

    @Then("^they will respond with Hello mate$")
    public void they_will_respond_with_Hello_mate() throws Throwable {
        assertThat(response, is("Hello mate"));
    }

    @Given("^I have told you my name is \"(.*?)\"$")
    public void i_have_told_you_my_name_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^they will respond with Hello \"(.*?)\"$")
    public void they_will_respond_with_Hello(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
