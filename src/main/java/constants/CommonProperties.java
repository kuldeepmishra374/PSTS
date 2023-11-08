package constants;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CommonProperties {
	
	public static String Browser_type;
	public static String Test_Link;
	public static String TAKE_SCREENSHOTS,User_name,Database_URL,Database_Pwd,db_test_data,DB_value;
	public static final Logger logger = LogManager.getLogger(CommonProperties.class);
	
	public static void loadProperties() {

		logger.info("Data read from properties File");

		File file = new File(SystemVariables.MAIN_RESOURCES+"configuration.properties");

		FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
				Properties prop = new Properties();
				prop.load(fileInput);
				Browser_type=prop.getProperty("browserType");
				Test_Link=prop.getProperty("URL");
				TAKE_SCREENSHOTS=prop.getProperty("takePassScreenshot");
				/*
				 * Database_URL=prop.getProperty("Database_URL");
				 * User_name=prop.getProperty("User_name");
				 * Database_Pwd=prop.getProperty("Database_password");
				 * db_test_data=prop.getProperty("db_testdata");
				 * DB_value=prop.getProperty("data");;
				 */

				} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
	}
	
	public static Boolean TakeSS() {
		if(TAKE_SCREENSHOTS.equals("true"))
			return true;
		else return false;
	}
	public static String getBrowser() {
		return Browser_type;
	}

	public static String getDB_name() {
		
		return User_name;
	}
public static String getDB_Value() {
		
		return DB_value;
	}
	public static String getDB_PWD() {
		
		return Database_Pwd;
	}
	public static String getDB_data() {
		
		return db_test_data;
	}
	public static String getDB_URL() {
	
	return Database_URL;
	}
	public static String getUrl() {
		
		return Test_Link;
	}

	public static Boolean getScreenshotFlag() {
		boolean flag=TakeSS();
		return flag;
	}
	public String getTestDataResourcePath(){
		Properties properties = new Properties();
		String testDataResourcePath = properties.getProperty(SystemVariables.MAIN_RESOURCES+"Loginuser.Jsom");
		if(testDataResourcePath!= null) return testDataResourcePath;
		else throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");		
	}
	}
