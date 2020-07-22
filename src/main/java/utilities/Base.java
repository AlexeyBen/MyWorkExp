package utilities;

import PageObjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base
{
    //General
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;

    //Students
    public static PageObjects.HomePage HwmktHomePage ;
    public static PageObjects.StudentHomePage StudentHomePage;
    public static StudentHeader StudentHeader ;
    public static StudentQuestionspage StudentQuestionsTablePage;
    public static StudentsQuestionPage StudentQuestionPage ;


    // Teachers
    public static TeacherHomePage TeacherHomePage;
    public static TeacherViewQuestionPage TeacherViewQuestionPage;

    //Payments
    public static PaymentsPage Payments;
    public static Paypal PayPal ;
}
