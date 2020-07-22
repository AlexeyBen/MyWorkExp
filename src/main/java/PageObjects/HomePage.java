package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage
{
    @FindBy(className = "css-1xrau4b-RightBlock")
    public static WebElement btn_Login ;

    @FindBy(xpath = "//input[@name='forms.user.username']")
    public WebElement txt_UserName;

    @FindBy(xpath = "//input[@name='forms.user.password']")
    public WebElement txt_Password;

    @FindBy(className = "css-1fz3gny-LoginModal")
    public WebElement btn_Submit;

}

