package tyss.SDET40_genericFiles;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener {
	private ExtentReports reports;
	public static  ExtentTest stest;
	private ExtentTest test;
	
	@Override // BT
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ExtentSparkReporter spark=new ExtentSparkReporter("./extentReport/extentreport.html");
		spark.config().setDocumentTitle("Document Title - SDE40");
		spark.config().setReportName("Report name-SDE");
		spark.config().setTheme(Theme.DARK);
		
	 reports = new ExtentReports();
		reports.attachReporter(spark);
		reports.setSystemInfo("Author", "Manoj");
		reports.setSystemInfo("os", "win 11");
		reports.setSystemInfo("Browser", "Chrome");
	}


	@Override // @BM
	public void onTestStart(ITestResult result) {
test=reports.createTest(result.getMethod().getMethodName());
stest=test;
	}

	@Override // @Am
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.pass(result.getMethod().getMethodName()+"pass");

	}

	@Override // AM
	public void onTestFailure(ITestResult result) {
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		try {
			webDriverUtility.takeScreenShot(BaseClassUtility.sdriver, BaseClassUtility.sjava,
					result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override // AM
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test.skip("Test1 skip");

	}

	@Override // AM
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	
	@Override // AT
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		reports.flush();

	}

}
