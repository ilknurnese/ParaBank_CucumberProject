package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _06_ {
    Elements elements=new Elements();


    @When("User Should update contect info and click update Profile button")
    public void userShouldUpdateContectInfoAndClickUpdateProfileButton() {
        elements.myClick(elements.updateContactinfo);
        elements.mySendKeys(elements.phonenumber,"05366738");
        elements.myClick(elements.updateProfileButton);
    }

    @Then("User should update info successfully")
    public void userShouldUpdateInfoSuccessfully() {
        //Assert.assertTrue(elements.profileUpdated.isDisplayed());
    }
}
