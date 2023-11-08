package TestClass;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import InitilizeRunConfiguration.ObjectIdentifires;
import POM.Booking;
//import POM.Loginpage;
import framework.FrameworkUtil;
//import framework.JsonLogin;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
@Listeners(listeners.TestNGListener.class)
public class Demo_test extends FrameworkUtil{
	public Demo_test() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	private static final Logger logger = LogManager.getLogger(Demo_test.class);
	ObjectIdentifires objectIdenifires=new ObjectIdentifires();
	Booking booking=new Booking();
	
	 @BeforeSuite
	    void setAllureEnvironment() {
	        allureEnvironmentWriter(
	                ImmutableMap.<String, String>builder()
	                        .put("Browser", "Google Chrome")
	                        .put("Browser.Version", "116.0.5845.111")
	                        .put("URL", "https://www.rsystems.com")
	                        .build(), System.getProperty("user.dir")
	                        + "/allure-results/");
	 }
	 
	@Feature("Verify Menu")
	@Description("Verify Menu")
	//@Test(groups = {"Tc01"} )
	public void homePageMenuValidation() throws Exception
	{
		booking.Search_Booking();
		logger.info("Test case completed");
			
	}
		
}
