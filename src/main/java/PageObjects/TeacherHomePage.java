package PageObjects;

import WorkFlows.WebFlows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeacherHomePage
{
    @FindBy(xpath = "//*[@id=\"wrapper\"]/div[1]/div/div/nav[1]/div[2]")
    public WebElement menu_Questions;

    @FindBy(linkText = "Questions" )
    public WebElement btn_Question;
}
