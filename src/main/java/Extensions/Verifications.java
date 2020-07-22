package Extensions;

import utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Verifications extends CommonOps
{
    @Step ("Verification of text in Element")
    public static void TextInElement (WebElement elem, String ExpectedValue)
    {
        assertEquals(elem.getText(),ExpectedValue , "The actual value is : " + elem.getText());
    }
    @Step ("Comparing Titles")
    public static void TitleComparing (String Title , String ExpectedResult)
    {
        assertTrue(Title.equals(ExpectedResult) , "Titles arent equal tre actual title is : " + Title + " and needs to be " + ExpectedResult);
    }

}

