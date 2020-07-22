package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsPage
{
    @FindBy (xpath = "//div[@class='css-yltd4o-buttonsContainer']/button[2]")
    public WebElement btn_PayPal;

    @FindBy (xpath = "//button[@class='css-17d29q-StepLocator']")
    public WebElement btn_Submit;

    @FindBy ( xpath =  "//h6[@class='css-rm5g34-h6']")
    public WebElement txt_ThankYou;

    @FindBy ( xpath = "//button[@class='css-17d29q-StepLocator']")
    public WebElement btn_Finish;
}
