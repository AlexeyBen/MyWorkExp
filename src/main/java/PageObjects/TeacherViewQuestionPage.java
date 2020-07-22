package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeacherViewQuestionPage
{
    @FindBy(xpath = "//button[@class='primaryBtn css-10op2pj']")
    public WebElement btn_PlaceABid;

    @FindBy(xpath = "//input[@name='teacher.forms.bid.payNow']")
    public  WebElement input_DownPayment ;

    @FindBy(xpath = "//a[@class='css-ne2vjh-QuestionLink']")
    public WebElement cell_FirstQuestion;

    @FindBy (name = "teacher.forms.bid.payWhenDone")
    public  WebElement input_PayWhenDone;

    @FindBy (name = "teacher.forms.bid.text")
    public  WebElement input_BidTextToStudent;

    @FindBy(xpath = "//input[@class='css-1nmpfsh']")
    public WebElement btn_SubmitBid;

    @FindBy (xpath = "//span[@class='primaryBtn css-10op2pj']")
    public WebElement btn_GotoBid;
}
