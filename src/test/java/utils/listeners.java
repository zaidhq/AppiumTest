package utils;

import java.io.IOException;

import Testcase.BaseClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Testcase.BaseClass;

public class listeners implements ITestListener {
    BaseClass b = new BaseClass();

    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub
        //hey i am done
    }

    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub
        //
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        //screenshot

        try {
            b.getScreenshot(result.getName());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    public void onTestSuccess(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

}


