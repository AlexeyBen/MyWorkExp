package SanityTest;

import Extensions.JavaActions;
import Extensions.Verifications;
import PageObjects.HomePage;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.*;
import WorkFlows.WebFlows;


@Listeners (listeners.class)
public class TestCases extends CommonOps
{
    @Test(description = " Login" , enabled = false)
    @Description("Student piper Login")
    public void Test01()
    {
        WebFlows.Login("piper" , "qweQWE123");
        Verifications.TextInElement(StudentHomePage.txt_StudentUsername,"Piper");
    }

    @Test (description = "Logout process", enabled = false)
    @Description("Piper27 Logout ")
    public void Test02 ()
    {
        WebFlows.Logout();
        Verifications.TextInElement(HomePage.btn_Login ,"Login");
    }

    @Test (description = "Posting question" , enabled = true)
    @Description("Question`s title compared to url")
    public void Test03 ()
    {
        WebFlows.Login("piper" , "qweQWE123");
        WebFlows.PostQuestion( WebFlows.DateFigure());
        Verifications.TitleComparing(driver.getCurrentUrl() , "http://nd.hwmkt.com/questions/this-is-automated-title-"+ JavaActions.GivenTime());
        WebFlows.Logout();
    }

    @Test (description = "Comparing to  question page " , enabled = true)
    @Description("Assert on question page with title")
    public void Test04 ()
    {
        WebFlows.Login("piper" , "qweQWE123");
        WebFlows.NavigateToQuestionsPage();
        Verifications.TextInElement(StudentQuestionsTablePage.txt_Title, "This is automated title " + WebFlows.a);
        WebFlows.Logout();
    }

    @Test (description = "Teacher Placing a bid "  , enabled = true)
    @Description("Teacher Placing a bid")
    public void Test05 ()
    {
        WebFlows.Login("RealTeacher2610" , "qweQWE123");
        WebFlows.PlacingBid();
        Verifications.TextInElement(TeacherViewQuestionPage.btn_GotoBid , "Goto bid (placed)");
        WebFlows.Logout();
    }

    @Test (description = "Verification of bid notification  " ,enabled = true)
    @Description("Verify bid counter ")
    public void Test06 ()
    {
        WebFlows.Login("piper" , "qweQWE123");
        WebFlows.BidVerification(StudentHeader.counter_Bid);
        Verifications.TextInElement(StudentHeader.counter_Bid , "1");
    }

    @Test (description = "Student pays for a bid " , enabled = true)
    @Description("Student pays for a bid")
    public void Test07 () 
    {
        WebFlows.BidAcceptence();
        Verifications.TextInElement(Payments.txt_ThankYou , "Thank you Piper");
        WebFlows.Logout();
    }
}


