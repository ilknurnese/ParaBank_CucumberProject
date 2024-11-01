package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Element extends ParentPage{
    public Element() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement firstRegisterButton;

    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    public WebElement SNN;

    @FindBy(id = "customer.username")
    public WebElement userName;

    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement confirmPassword;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
   public  WebElement register;

    @FindBy(css = "[class='title']")
    public WebElement successMessage;

    //( LOGIN ICIN LOCATORLAR)**************************

    @FindBy(css = "[name='username']")
    public WebElement loginUserName;

    @FindBy(css = "[name='password']")
    public WebElement loginPassword;

    @FindBy(css = "[value='Log In']")
    public WebElement loginButton;

    //REQUEST LOAN ***********************************//
    @FindBy(xpath = "//a[text()='Request Loan']")
    public WebElement requestLoan;

    @FindBy(id = "amount")
    public WebElement loanAmount;

    @FindBy(id = "downPayment")
    public WebElement downPayment;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement selectAccountId;

    @FindBy(css = "[value='Apply Now']")
    public WebElement applyNow;

    @FindBy(xpath = "//td[@id='loanStatus']")
    public WebElement resultMessage;






    //***************************??*****************************************

@FindBy(xpath = "(//li[@class='authorization-link']/a)[1]")
public WebElement singIn;

@FindBy(css = "[name='login[username]']")
public WebElement email;

@FindBy(css = "[name='login[password]']")
public WebElement password1;

@FindBy(xpath = "//button[@class='action login primary']")
public WebElement singIng2;

@FindBy(xpath = "(//span[@class='logged-in'])[1]")
public WebElement loginSuccessfuly;







    public WebElement getWebelement(String strElementName)
    {
        switch (strElementName.trim())
        {



        }


        return null;
    }

}
