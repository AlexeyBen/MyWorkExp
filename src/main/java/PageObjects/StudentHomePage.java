package PageObjects;

import WorkFlows.WebFlows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentHomePage
{
    @FindBy(xpath = "//span[@class='css-1qee3z8']")
    public WebElement txt_StudentUsername;

    @FindBy(linkText = "Log out")
    public WebElement btn_Logout;

    @FindBy( id="title")
    public WebElement input_Title;

    @FindBy (xpath = "//div[@class='notranslate public-DraftEditor-content']")
    public WebElement input_Question;

    @FindBy (xpath = "//input[@tabindex='-1']")
    public WebElement input_Attachment;

    @FindBy (xpath = "//span[@class='css-kc2wxe-loadedIcon']")
    public  WebElement icon_Loaded;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement btn_Submit;

    @FindBy (xpath = "//input[@class='DateInput_input DateInput_input_1']")
    public WebElement input_DatePicker;

    @FindBy (xpath = "//*[@id=\'wizard-form\']/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[2]/td[5]")
    public  WebElement DesiredDate ;

    @FindBy(className = "css-vw46zd")
    public WebElement btn_arrow;

    @FindBy(id = "Budget")
    public WebElement input_Budget;

    @FindBy(xpath = "//input[@id='react-select-3-input']")
    public WebElement input_AreaofStudy;

    @FindBy(className = "react-tagsinput-input")
    public WebElement input_Tags;

    @FindBy(xpath = "//button[@class='css-1dv0osw-closeBtn']")
    public WebElement btn_x;

}
