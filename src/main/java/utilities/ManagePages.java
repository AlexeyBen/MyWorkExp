package utilities;

import PageObjects.StudentHeader;
import PageObjects.StudentQuestionspage;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base
{
    public static void init()
    {
        HwmktHomePage = PageFactory.initElements(driver,PageObjects.HomePage.class);
        StudentHomePage = PageFactory.initElements(driver,PageObjects.StudentHomePage.class);
        StudentHeader = PageFactory.initElements(driver, StudentHeader.class);
        StudentQuestionsTablePage = PageFactory.initElements(driver, StudentQuestionspage.class);
        TeacherHomePage = PageFactory.initElements(driver , PageObjects.TeacherHomePage.class);
        TeacherViewQuestionPage = PageFactory.initElements(driver , PageObjects.TeacherViewQuestionPage.class);
        StudentQuestionPage = PageFactory.initElements(driver , PageObjects.StudentsQuestionPage.class);
        Payments = PageFactory.initElements(driver , PageObjects.PaymentsPage.class);
        PayPal = PageFactory.initElements( driver , PageObjects.Paypal.class);
    }

}
