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
        elements.mySendKeys(elements.Firstname,"sd");
        elements.mySendKeys(elements.Lastname,"ada");
        elements.mySendKeys(elements.Address,"dad");
        elements.mySendKeys(elements.City,"ada");
        elements.mySendKeys(elements.State,"dad");
        elements.mySendKeys(elements.ZipCode,"dwa");
        elements.mySendKeys(elements.phonenumber,"05537653924");
        elements.myClick(elements.updateProfileButton);
    }

    @Then("User should update info successfully")
    public void userShouldUpdateInfoSuccessfully() {
        Assert.assertTrue(!elements.profileUpdated.getText().contains("Updates"),"eUser Account cannot be updates!");

    }
}
