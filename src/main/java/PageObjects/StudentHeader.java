package PageObjects;

import WorkFlows.WebFlows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentHeader
{
    @FindBy(linkText = "My Questions.")
    public WebElement btn_MyQuestions;

    @FindBy (xpath = "//span[@class='css-19tamcd-notificationCounter']")
    public  WebElement counter_Bid;

    @FindBy (className = "css-q00bl4-questionTitle")
    public WebElement link_ToQuestion;
}
