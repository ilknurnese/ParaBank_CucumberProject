package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _01_createNewAccountStep {
    Elements element =new Elements();

    @Given("Navigate to paraBank website")
    public void navigate_to_para_bank_website() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("Create new account firs name as {string} las name as {string} addres as {string} city as {string} state as {string} zipcode as {string} snn as {string} user name as {string} password as {string} password confirm as {string} and click register button")
    public void createNewAccountFirsNameAsLasNameAsAddresAsCityAsStateAsZipcodeAsSnnAsUserNameAsPasswordAsPasswordConfirmAsAndClickRegisterButton(String firstName, String lastName, String address, String city, String state, String zipCode, String SNN, String userName, String password, String confirm) {
        element.myClick(element.firstRegisterButton);
        element.mySendKeys(element.firstName,firstName);
        element.mySendKeys(element.lastName,lastName);
        element.mySendKeys(element.address,address);
        element.mySendKeys(element.city, city);
        element.mySendKeys(element.state,state);
        element.mySendKeys(element.zipCode,zipCode);
        element.mySendKeys(element.SNN, SNN);

        element.mySendKeys(element.userName,userName);
        element.mySendKeys(element.password,password);
        element.mySendKeys(element.confirmPassword,confirm);
        element.myClick(element.register);
    }
    @Then("User should login successfully")
    public void user_should_login_succesfully() {

        Assert.assertTrue(element.successMessage.getText().contains("Welcome"),"Hesap olusturulamadi");
    }
}


