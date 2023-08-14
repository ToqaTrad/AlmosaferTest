package almosaferTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parameters {

	static WebDriver driver = new ChromeDriver();
	String WebsiteURL = "https://www.almosafer.com/en?ncr=1";
	Assertion myAssert = new Assertion();
	String ActualCurrentLanguage;
	String ExpectedCurrentLangauge = "العربية";
	String ActualCurrency;
	String ExpectedCurrency = "SAR";
	String ActualNumber;
	String ExpectedNumber = "+966554400000";
	Boolean ActualLogo;
	Boolean ExpectedLogo= true;
	String ActualTab;
	String ExpectedTab = "false";
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMdd"); 
	LocalDateTime Tomorrow = LocalDateTime.now().plusDays(1);   
	String ExpectedFlightDeparture = dtf.format(Tomorrow); 
	String ActualFlightDeparture = "";
	LocalDateTime AfterTomorrow = LocalDateTime.now().plusDays(2); 
	String ExpectedFlightReturn = dtf.format(AfterTomorrow); 
	String ActualFlightReturn= "";
	String ExpectedRandomLanguage;
	String ActualRandomLanguage;
	String CurrentLanguage;
	String[] RandomLocationsEN = {"Dubai","Jeddah","Riyadh"};
	String[] RandomLocationsAR = {"دبي","جدة","رياض"};

}
