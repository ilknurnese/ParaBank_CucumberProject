package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class _05_TransferFundsStepDefinitions {

    Elements elements=new Elements();
    WebElement dropdownElement;
    String newAccountNumber="";

    @And("The user confirms the second account number")
    public void theUserConfirmsTheSecondAccountNumber() {

        elements.myClick(elements.accountsOverviewTF);

    }

    @Then("User should open new account successfully")
    public void userShouldOpenNewAccountSuccessfully() {


    }

    @And("User Opens a new Account")
    public void userOpensANewAccount() {

        elements.myClick(elements.openNewAccountLinkTF);



        try {
            Thread.sleep(5000L);
        }catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }


        Select dropdownAccountType = new Select(elements.dropdownAccountType);
        dropdownAccountType.selectByVisibleText("SAVINGS");

       Select dropdownExistingAccountID = new Select(elements.dropdownExistingAccountID);
       dropdownExistingAccountID.selectByIndex(0);


        elements.myClick(elements.openNewAccountButtonTF);

        Assert.assertTrue(!elements.accountOpenedTextTF.getText().equals("Accounts Opened!"),"Account oluşturulamadı");


        newAccountNumber= elements.newAccountIDTF.getText();

    }

    @And("Click on the Transfer Funds Link")
    public void clickOnTheTransferFundsLink() {

        elements.myClick(elements.transferFundsLinkTF);
    }

    @Then("Transfer Page should be displayed")
    public void transferPageShouldBeDisplayed() {

        Assert.assertTrue(GWD.getDriver().getCurrentUrl().toLowerCase().contains("transfer"));

    }

    @And("User inputs the amount")
    public void userInputsTheAmount() {

        elements.amountInputBoxTF.sendKeys("50");

    }

    @And("User selects From Account")
    public void userSelectsFromAccount() {



    for (WebElement fromAccountIDs: elements.dropdownFromAccountOptionsTF)
    {
        System.out.println(fromAccountIDs.getText());

        if (elements.dropdownFromAccountOptionsTF.size()>0)
        {
            elements.dropdownFromAccountOptionsTF.get(0).click();
        }
    }



    }

    @And("User selects To Account")
    public void userSelectsToAccount() {

       // elements.dropdownToAccountIDTF.click();


        for (WebElement toAccountIDs: elements.dropdownToAccountOptionsTF)
        {
            if (elements.dropdownToAccountOptionsTF.size()>0)
            {
                elements.dropdownToAccountOptionsTF.get(1).click();
            }
        }



    }

    @And("User Clicks Transfer Button")
    public void userClicksTransferButton() {

        elements.myClick(elements.transferButtonTF);

    }

    @Then("User receives the Transfer Completed Confirmation Message")
    public void userReceivesTheTransferCompletedConfirmationMessage() {

        Assert.assertTrue(!elements.transferComleteTextTF.getText().contains("Complete"),"Transfer cannot be completed!");
    }


}
