package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mystepdefs {

    static WebDriver myDriver;

    @Given("^I am a chrome user$")
    public void i_am_a_chrome_user() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\IdeaProjects\\MavenSecondPrj\\src\\chromedriver.exe");
        myDriver = new ChromeDriver();
    }
    @When("^I access website ([^\"]*)$")
    public void i_access_website(String websiteUrl)  {
        // Write code here that turns the phrase above into concrete actions
    myDriver.get(websiteUrl);
    }

    @Then("^I can see ([^\"]*)$")
    public void i_can_see(String websiteTitle) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(myDriver.getTitle(),websiteTitle);
        org.junit.Assert.assertEquals(myDriver.getTitle(),websiteTitle);
        myDriver.quit();



    }



}
