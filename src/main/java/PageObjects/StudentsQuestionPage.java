package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentsQuestionPage
{
    @FindBy(xpath = "//button[@class='primaryBtn css-1rpo3me']")
    public WebElement btn_PayTheBid;
}
