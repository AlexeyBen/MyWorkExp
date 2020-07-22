package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class listeners extends CommonOps implements ITestListener
{

    public void onTestStart(ITestResult iTestResult)
    {
        System.out.println("----- Starting Test " + iTestResult.getName() + "-----");
    }

    public void onTestSuccess(ITestResult iTestResult)
    {
        System.out.println("----- Test : " + iTestResult.getName() + " Passed -----");
    }

    public void onTestFailure(ITestResult iTestResult)
    {
        System.out.println("----- Test : " + iTestResult.getName() + " Failed -----");
    }

    public void onTestSkipped(ITestResult iTestResult)
    {
        System.out.println("----- Skipping Test "+ iTestResult.getName() + " -----" );
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult)
    {

    }

    public void onStart(ITestContext iTestContext)
    {
        System.out.println("----- Started Execution -----");
    }

    public void onFinish(ITestContext iTestContext)
    {
        System.out.println("----- Ending  Execution -----");
    }
}
