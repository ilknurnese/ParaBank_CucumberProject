package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements extends Parent {
    public Elements() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    //betul

    @FindBy(xpath="//*[text()='Customer Login']")
    public WebElement customer_login;

    @FindBy(name="username")
    public WebElement login_username;

    @FindBy(name="password")
    public WebElement login_password;

    @FindBy(xpath = "//*[@value='Log In']")
    public WebElement login_button;

    @FindBy(xpath = "//*[text()='Welcome']")
    public WebElement login_wellcome;

    @FindBy(xpath = "//*[@class='error']")
    public WebElement login_error;

    @FindBy(xpath="//*[text()='Log Out']")
    public WebElement Log_Out;

    //Us06
    @FindBy(xpath = "//a[text()='Update Contact Info']")
    public WebElement updateContactinfo;

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement Firstname;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement Lastname;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement Address;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement City;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement State;


    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement ZipCode;


    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement phonenumber;

    @FindBy(xpath = "//input[@value='Update Profile']")
    public WebElement updateProfileButton;

    @FindBy(xpath="//h1[text()='Profile Updated']")
    public WebElement profileUpdated;

    
    //yusuf

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


//neşe

    @FindBy(xpath = "//a[normalize-space()='Open New Account']")
    public WebElement openNewAccountLinkTF;

    @FindBy(xpath = "//input[@value='Open New Account']")
    public WebElement openNewAccountButtonTF;

    @FindBy(id = "type")
    public WebElement dropdownAccountType;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement dropdownExistingAccountID;

    @FindBy(xpath = "//a[normalize-space()='Accounts Overview']")
    public WebElement accountsOverviewTF;

    @FindBy(xpath = "//h1[normalize-space()='Account Opened!']")
    public WebElement accountOpenedTextTF;

    @FindBy(id = "newAccountId")
    public WebElement newAccountIDTF;

    @FindBy(xpath = "//a[normalize-space()='Transfer Funds']")
    public WebElement transferFundsLinkTF;

    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amountInputBoxTF;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement dropdownFromAccountIDTF;

    @FindBy(xpath = "//select[@id='toAccountId']/option")
    public WebElement dropdownToAccountIDTF;

    @FindBy(xpath = "//select[@id='fromAccountId']/option")
    public List<WebElement> dropdownFromAccountOptionsTF;

    @FindBy(xpath = "//select[@id='toAccountId']/option")
    public List<WebElement> dropdownToAccountOptionsTF;

    @FindBy(xpath = "//input[@value='Transfer']")
    public WebElement transferButtonTF;

    @FindBy(xpath = "//h1[normalize-space()='Transfer Complete!']")
    public WebElement transferComleteTextTF;






    public WebElement getWebelement(String strElementName)
    {
        switch (strElementName.trim())
        {



        }


        return null;
    }





}
