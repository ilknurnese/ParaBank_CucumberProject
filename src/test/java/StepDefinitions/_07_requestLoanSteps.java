package StepDefinitions;


import Pages.Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class _07_requestLoanSteps {
    Elements element=new Elements();
    @Given("navigate to the request loan")
    public void navigateToTheRequestLoan() {
        element.myClick(element.requestLoan);



    }
    @Then("enter loan payment as {string}  down payment as {string}click apply now button")
    public void enterLoanPaymentAsDownPaymentAsClickApplyNowButtun(String loanPayment, String downPayment) {
        element.mySendKeys(element.loanAmount,loanPayment);
        element.mySendKeys(element.downPayment,downPayment);
        element.myClick(element.selectAccountId);
        element.myClick(element.applyNow);
    }

    @Then("result message should be displayed")
    public void resultMessageShouldBeDisplayed() {
        Assert.assertTrue(element.resultMessage.isDisplayed());
    }


    }


