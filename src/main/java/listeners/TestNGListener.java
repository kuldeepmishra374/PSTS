package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import framework.BaseClass;

public class TestNGListener implements ITestListener {

	private static final Logger logger = LogManager.getLogger(TestNGListener.class);

	@Override
	public void onTestStart(ITestResult result) {

		
		logger.info("On Test Start");

		try {
			Thread.sleep(1000);
			BaseClass baseClass = new BaseClass();
			BaseClass.setBaseObj(baseClass);
			BaseClass.getBaseObj().setExtentTest(result);
			BaseClass.getBaseObj().browserSelection();
			BaseClass.getBaseObj().fetchUrl();

		} catch (Exception e) {
			logger.info("Error in Test Start :{}", e);
		}

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		logger.info("On Test Success");

		try {
			BaseClass.getBaseObj().closeBrowsers();
			BaseClass.getBaseObj().saveTestRunDetails(result);
			BaseClass.getBaseObj().getExtentTest().log(Status.PASS, "PASSED");

		} catch (Exception e) {
			logger.info("Error in capturing test success details :{}", e);
		}

	}

	@Override
	public void onTestFailure(ITestResult result) {

		logger.info("On Test Failure");

		try {
			BaseClass.getBaseObj().saveTestRunDetails(result);
			BaseClass.getBaseObj().closeBrowsers();
		} catch (Exception e) {

			logger.error("Error in capturing test failure details :{} ", e);
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		logger.info("On Test Skip");

		try {
			BaseClass.getBaseObj().saveTestRunDetails(result);
			BaseClass.getBaseObj().getExtentTest().log(Status.SKIP, "SKIPPED");
		} catch (Exception e) {
			logger.error("Error in capturing test skip details :{} ", e);
		}

	}

	@Override
	public void onStart(ITestContext context) {

		logger.info("On Start");

		try {
			BaseClass.configureExtentReports();
		} catch (Exception e) {
			logger.error("Error in On Start method :{} ", e);
		}
	}

	@Override
	public void onFinish(ITestContext context) {

		logger.info("On Finish");

		try {
			BaseClass.getExtentReports().flush();
			BaseClass.removeBaseObj();
		} catch (Exception e) {
			logger.error("Error in generating final extent report :{} ", e);
		}

	}

}
