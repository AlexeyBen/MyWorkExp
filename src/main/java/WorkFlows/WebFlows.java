package WorkFlows;

import Extensions.UIActions;
import utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WebFlows extends CommonOps
{
    public static String a = HourFigure();


    @Step ("Login")
    public static void Login (String User , String Pass)
    {
        UIActions.click(HwmktHomePage.btn_Login);
        UIActions.updateText(HwmktHomePage.txt_UserName , User);
        UIActions.updateText(HwmktHomePage.txt_Password , Pass);
        UIActions.click(HwmktHomePage.btn_Submit);
    }
    @Step ("Logout")
    public static void Logout ()
    {
        UIActions.Hoovering(StudentHomePage.txt_StudentUsername,StudentHomePage.btn_Logout);
    }


    public static String DateFigure()
    {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String CurrentDate= dateFormat.format(date);
        return CurrentDate;
    }

    public static  String HourFigure ()
    {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String CurrentHour= dateFormat.format(date);
        return CurrentHour;
    }

    @Step ("Uploading File")
    public static void UploadFile  (WebElement elem , String FilePath)
    {
        elem.sendKeys(FilePath);
    }

    @Step ("Posting question")
    public static void PostQuestion(  String CurrentDate)
    {
        UIActions.updateText(StudentHomePage.input_Title,"This is automated title " + a);
        UIActions.updateText(StudentHomePage.input_Question , "If you read this ,the test run successfully and the question posted ." + CurrentDate );
        UploadFile(StudentHomePage.input_Attachment , "/home/alexey13en/Desktop/AutomationFiles/1.png");
        wait.until(ExpectedConditions.visibilityOf(StudentHomePage.icon_Loaded));
        UIActions.click(StudentHomePage.btn_Submit);
        UIActions.click(StudentHomePage.input_DatePicker);
        UIActions.click(StudentHomePage.btn_arrow);
        UIActions.click(StudentHomePage.DesiredDate);
        UIActions.updateText(StudentHomePage.input_Budget,"2.09");
        UIActions.updateText(StudentHomePage.input_AreaofStudy , "Biology");
        UIActions.PressEnter(StudentHomePage.input_AreaofStudy);
        UIActions.updateText(StudentHomePage.input_Tags , "Automated");
        UIActions.updateText(StudentHomePage.input_Tags, "test");
        UIActions.click(StudentHomePage.btn_Submit);
        UIActions.click(StudentHomePage.btn_x);
    }

    @Step ("Navigation to Questions Page ")
    public static void NavigateToQuestionsPage ()
    {
        wait.until(ExpectedConditions.elementToBeClickable(StudentHeader.btn_MyQuestions));
        driver.navigate().refresh();
        UIActions.click(StudentHeader.btn_MyQuestions);
    }

    @Step ("Teacher placing a bid ")
    public static void PlacingBid ()
    {
        UIActions.Hoovering(TeacherHomePage.menu_Questions , TeacherHomePage.btn_Question);
        driver.navigate().refresh();
        UIActions.click(TeacherViewQuestionPage.cell_FirstQuestion);
        UIActions.click(TeacherViewQuestionPage.btn_PlaceABid);
        for (int i = 0 ; i < 3; i ++)
        {
            UIActions.DeleteText(TeacherViewQuestionPage.input_DownPayment);
        }
        UIActions.updateText(TeacherViewQuestionPage.input_DownPayment , "3");
        UIActions.updateText(TeacherViewQuestionPage.input_PayWhenDone , "5");
        UIActions.updateText(TeacherViewQuestionPage.input_BidTextToStudent , "This is automated bid");
        UIActions.click(TeacherViewQuestionPage.btn_SubmitBid);
    }

    @Step (" Verification of  the bid appearance ")
    public static void BidVerification (WebElement HooverElem)
    {
        wait.until(ExpectedConditions.visibilityOf(HooverElem));
        action.moveToElement(HooverElem).perform();
        action.moveToElement(HooverElem).click().build().perform();

    }

    @Step ("Student accepts the bid")
    public static void BidAcceptence ()
    {
        String winHandleBefore = driver.getWindowHandle();
        UIActions.click(StudentHeader.link_ToQuestion);
        UIActions.click(StudentQuestionPage.btn_PayTheBid);
        UIActions.SwitchToWindow("Log in to your PayPal account");
        UIActions.updateText(PayPal.input_Email , "gerenrot3@gmail.com");
        UIActions.click(PayPal.btn_Next);
        UIActions.updateText(PayPal.input_Password , "81818181");
        UIActions.click(PayPal.btn_Login);
        UIActions.click(PayPal.btn_Submit);
        UIActions.SwitchToMainWindow(winHandleBefore);
        UIActions.click(Payments.btn_Submit);
        UIActions.click(Payments.btn_Finish);
    }

}


