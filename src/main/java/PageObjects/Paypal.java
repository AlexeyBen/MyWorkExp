package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Paypal
{
    @FindBy (id = "email")
    public WebElement input_Email;

    @FindBy (id = "password")
    public WebElement input_Password;

    @FindBy (id = "btnNext")
    public WebElement btn_Next;

    @FindBy (id = "btnLogin")
    public WebElement btn_Login;

    @FindBy (id = "payment-submit-btn")
    public WebElement btn_Submit;
}
