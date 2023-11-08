package POM;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import framework.BaseClass;
import InitilizeRunConfiguration.ObjectIdentifires;
import framework.FrameworkUtil;

public class Booking extends FrameworkUtil {
		public Booking() throws Exception {
			super();
			// TODO Auto-generated constructor stub
		}
		private static final Logger logger = LogManager.getLogger(Booking.class);
		private WebDriver driver;
		private BaseClass baseLocalObj;
		ObjectIdentifires objectIdenifires=new ObjectIdentifires();

		public  void Search_Booking() throws Exception
		{
			EnterText(objectIdenifires.Search_Icon,"India");
			ClickElement(objectIdenifires.Searched_text,"Navigation");
			ClickElement(objectIdenifires.Book_Online,"Book Online");
			ScrollBy(objectIdenifires.Scroll_Date);
			SelectByText(objectIdenifires.Adult_count,"2");
			if(IsElementPresent(objectIdenifires.Moving_Limited_Aval_Date))
				ClickElement(objectIdenifires.Select_date_1,"Date Selected");
			if(IsElementPresent(objectIdenifires.Price_Text))
				HighLight(objectIdenifires.Price_Text);
			if(IsElementPresent(objectIdenifires.Select_rooms) && IsElementPresent(objectIdenifires.Room_Checkbox ))
				HighLight(objectIdenifires.Select_rooms);
			SelectByText(objectIdenifires.Select_ad,"2");

				//Passenger detail 1
			SelectByIndex(objectIdenifires.Adultform1_Ti,1);
			EnterText(objectIdenifires.Adultform1_FN,"Kuldeep");
			EnterText(objectIdenifires.Adultform1_LN,"Mishra");
			SelectByIndex(objectIdenifires.Adultform1_DB1,1);
			SelectByIndex(objectIdenifires.Adultform1_DB2,1);
			SelectByIndex(objectIdenifires.Adultform1_DB3,1);
			//Passenger detail 1
			SelectByIndex(objectIdenifires.Adultform2_Ti,1);
			EnterText(objectIdenifires.Adultform2_FN,"John");
			EnterText(objectIdenifires.Adultform2_LN,"Wick");
			SelectByIndex(objectIdenifires.Adultform2_DB1,1);
			SelectByIndex(objectIdenifires.Adultform2_DB2,1);
			SelectByIndex(objectIdenifires.Adultform2_DB3,1);
			
			//Contact Details
			EnterText(objectIdenifires.PH,"1234567890");
			EnterText(objectIdenifires.YourName,"India");
			EnterText(objectIdenifires.Email,"kuldeepmishra374@gmail.com");
			EnterText(objectIdenifires.AddressL1,"India");
			EnterText(objectIdenifires.AddressL2,"India");
			EnterText(objectIdenifires.City,"India");
			EnterText(objectIdenifires.PostalCode,"304305");
			SelectByIndex(objectIdenifires.Pleas_Select,2);
			
			ClickElement(objectIdenifires.Continue_button,"submitted");
			//Book now button availability
			if(IsElementPresent(objectIdenifires.Book_Now_BTN))
				HighLight(objectIdenifires.Book_Now_BTN);
		}
		
		
}
