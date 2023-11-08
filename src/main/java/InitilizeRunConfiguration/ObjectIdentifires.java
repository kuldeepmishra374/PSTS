package InitilizeRunConfiguration;
import org.openqa.selenium.By;

public class ObjectIdentifires {
 public  By Header=By.xpath("");	
 
 public By Search_Icon= By.xpath("//*[@id='searchtext_freetext_search_form']");
 public By Searched_text=By.xpath("//*[@id='as_searchtext_freetext_search_form']");
 public By Book_Online=By.xpath("//div[contains(text(),'Book Online')][1]");
 public By Scroll_Date=By.xpath("//*[@id='dates_and_prices_title']");
 public By Adult_count=By.xpath("//select[@name='numAdults']");
 public By Available_Date=By.xpath("//div[@class='nbf_tpl_pms_calendar_day_available nbf_tpl_pms_calendar_box']");
 public By Moving_Next_Aval_Date=By.xpath("//*[@id='nbf_tpl_pms_calendar-f0050aa159413059b0d39248658bdb50']/div[1]/div[3]/img");
 public By Select_date=By.xpath("//div[@class='nbf_tpl_pms_calendar_day_available nbf_tpl_pms_calendar_box']/child::div[3]/input");

 public By Moving_Limited_Aval_Date=By.xpath("//div[@class='nbf_tpl_pms_calendar_day_limited nbf_tpl_pms_calendar_box nbf_pms_tpl_calendar_selecteddate']");
 public By Select_date_1=By.xpath("//div[@class='nbf_tpl_pms_calendar_day_limited nbf_tpl_pms_calendar_box nbf_pms_tpl_calendar_selecteddate']/child::div[3]/input");
 public By Price_Text=By.xpath("//span[@id='tour-price']/span]");
 public By Select_rooms=By.xpath("//div[contains(text(),'Select your rooms and continue')]");
 public By Room_Checkbox=By.xpath("//*[@id='room-1837300-numselect']");
 public By Select_ad=By.xpath("//select[@id='room-1837300-numselect']");
 public By Continue_Button=By.xpath("//*[@id='extraForm-select-a18f02c1-7e1c-11ee-aaeb-20677cd381a0']/button");
 
 public By Adultform1_Ti=By.xpath("//select[@id='pax-a-title-1']"); 
 public By Adultform1_FN=By.xpath("//*[@id='pax-a-first-1']"); 
 public By Adultform1_LN=By.xpath("//*[@id='pax-a-last-1']"); 
 public By Adultform1_DB1=By.xpath("//select[@id=pax-a-dobd-1']"); 
 public By Adultform1_DB2=By.xpath("//select[@id='pax-a-dobm-1']"); 
 public By Adultform1_DB3=By.xpath("//select[@id='pax-a-doby-1']");
 public By Adultform2_Ti=By.xpath("//select[@id='pax-a-title-2']"); 
 public By Adultform2_FN=By.xpath("//*[@id='pax-a-first-2']"); 
 public By Adultform2_LN=By.xpath("//*[@id='pax-a-last-2']"); 
 public By Adultform2_DB1=By.xpath("//select[@id='pax-a-dobd-2']"); 
 public By Adultform2_DB2=By.xpath("//select[@id='pax-a-dobm-2']"); 
 public By Adultform2_DB3=By.xpath("//select[@id='pax-a-doby-2']"); 
 public By PH=By.xpath("//*[@id='contact-mobile']"); 
 public By YourName=By.xpath("//*[@id='contact-name']"); 
 public By Email=By.xpath("//*[@id='contact-email']"); 
 public By AddressL1=By.xpath("//*[@id='contact-address1']"); 
 public By AddressL2=By.xpath("//*[@id='contact-address2']"); 
 public By City=By.xpath("//*[@id='contact-city']"); 
 public By PostalCode=By.xpath("//*[@id='contact-postcode']"); 
 public By Pleas_Select=By.xpath("//select[@id='contact-hearabout']"); 
 public By Continue_button=By.xpath("//*[@id='paxform-select']");
 public By Book_Now_BTN=By.xpath(("//*[contains(text(),'Book Now')]"));
 

}
