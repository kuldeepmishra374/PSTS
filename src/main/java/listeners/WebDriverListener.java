package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import framework.BaseClass;

public class WebDriverListener implements WebDriverEventListener {

	private static final Logger logger = LogManager.getLogger(WebDriverListener.class);

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		logger.info("Before Accepting Alert");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		logger.info("After Accepting Alert");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		logger.info("After Dismissing Alert");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		logger.info("Before Dismissing Alert");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		logger.info("Before Navigating to : {}", url);
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		logger.info("After Navigating to : {}", url);
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		logger.info("Before Navigating Back");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		logger.info("After Navigating Back");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		logger.info("Before Navigating Forward");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		logger.info("After Navigating Forward");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		logger.info("Before Navigating and Refreshing");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		logger.info("After Navigating and Refreshing");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		logger.info("Before finding element");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		logger.info("After finding element");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		logger.info("Before clicking element ");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		logger.info("After clicking element ");
		BaseClass.getBaseObj().takeScreenshot();

	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		logger.info("Before changing value of element ");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		logger.info("After changing value of element ");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		logger.info("Before executing script : {}", script);
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		logger.info("After executing script : {}", script);
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		logger.info("Before swtiching to window : {}", windowName);
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		logger.info("After swtiching to window : {}", windowName);
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		logger.info("Exception in WebDriver Listener");
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		logger.info("Before getting screenshot");
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		logger.info("After getting screenshot");
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		logger.info("Before getting value of element ");
		BaseClass.getBaseObj().takeScreenshot();
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		logger.info("After getting value of element ");
		BaseClass.getBaseObj().takeScreenshot();
	}

}
