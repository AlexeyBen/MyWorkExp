package PageObjects;

import WorkFlows.WebFlows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentQuestionspage
{
    @FindBy(xpath = "//div[@class='title-column css-oanidz-cell']")
    public WebElement txt_Title;


}
