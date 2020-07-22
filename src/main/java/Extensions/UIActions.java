package Extensions;

import utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class UIActions extends CommonOps
{
    @Step ("Clicking on elem")
    public static void  click (WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }
    @Step("Updating text")
    public static void  updateText (WebElement elem , String Value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(Value);
    }
    @Step("Clearing Text from element")
    public static void ClearTxt (WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.clear();
    }
    @Step ("Choosing from dropdown")
    public static void  updateDropdown (WebElement elem , String Value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select MyValue = new Select (elem);
        MyValue.selectByVisibleText(Value);
    }
    @Step ("Switching to Iframe")
    public static void IframeSwitch (String IframeID)
    {
        WebElement ifrm = driver.findElement(By.id(IframeID));
        driver.switchTo().frame(ifrm);
    }
    @Step ("Switching back to main frame ")
    public static void MainIframeSwitch ()

    {
     driver.switchTo().frame(0);
    }

    @Step ("Hoovering and clicking on element")
    public static void Hoovering ( WebElement HooverElem , WebElement ClickElem)
    {
        wait.until(ExpectedConditions.visibilityOf(HooverElem));
        action.moveToElement(HooverElem).perform();
        action.moveToElement(ClickElem).click().build().perform();
    }
    @Step ("Picking date")
    public static void PickDate (WebElement elem ,String DesiredDate)
    {
        WebElement dateWidget = elem;
        List<WebElement> cells = dateWidget.findElements(By.tagName("td"));
        for (WebElement cell :cells)
            if (cell.getText().equals(DesiredDate))
            {
                cell.click();
                break;
            }
    }


    @Step("Deleting the text inside a field ")
    public static void DeleteText (WebElement elem)
    {
        elem.sendKeys(Keys.DELETE);
    }

    @Step ("Pressing ENTER")
    public static void PressEnter (WebElement elem)
    {
        {
            elem.sendKeys(Keys.ENTER);
        }
    }

    @Step ("Switching to new window")
    public static void SwitchToWindow (String WinName)
    {
        UIActions.click(Payments.btn_PayPal);
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            if ( driver.getTitle().equals(WinName))
                break;
        }
    }

    @Step ("Switching to Main window")
    public static void SwitchToMainWindow (String winHandleBefore)
    {

        driver.switchTo().window(winHandleBefore);
    }

}
