package almosaferTest;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases extends Parameters {

	@BeforeTest
	public void OpenWebsite() {
		driver.get(WebsiteURL);
		driver.manage().window().maximize();

	}

	@Test()
	public void CheckLanguage() {
		ActualCurrentLanguage = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
				.getText();
		myAssert.assertEquals(ActualCurrentLanguage, ExpectedCurrentLangauge);

	}

	@Test()
	public void CheckCurreny() {
		ActualCurrency = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button")).getText();
		myAssert.assertEquals(ActualCurrency, ExpectedCurrency);
	}

	@Test()
	public void CheckContactNumber() {
		ActualNumber = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[2]/strong"))
				.getText();
		myAssert.assertEquals(ActualNumber, ExpectedNumber);
	}

	@Test()
	public void CheckLogo() {

		WebElement Footer = driver.findElement(By.tagName("footer"));
		List<WebElement> LogoLists = Footer.findElements(By.tagName("svg"));
		for (int i = 0; i < LogoLists.size(); i++) {
			String QitafLogo = LogoLists.get(i).getAttribute("data-testid");
			if (QitafLogo != null)
				if (QitafLogo.contains("Footer__QitafLogo"))
					ActualLogo = true;
				else
					ActualLogo = false;
		}
		myAssert.assertEquals(ActualLogo, ExpectedLogo);
	}

	@Test()
	public void CheckSearchTab() {
		boolean TabText;
		WebElement Tabs = driver.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div[4]/div/div/nav"));
		List<WebElement> TabList = Tabs.findElements(By.tagName("a"));
		for (int i = 0; i < TabList.size(); i++) {
			TabText = TabList.get(i).getText().contains("Hotel");
			if (TabText == true)
				ActualTab = TabList.get(i).getAttribute("aria-selected");
		}

		myAssert.assertEquals(ActualTab, ExpectedTab);

	}

	@Test()
	public void CheckFlightDeparture() {
		WebElement DateClassName = driver.findElement(By.xpath(
				"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[1]"));
		List<WebElement> DateList = DateClassName.findElements(By.tagName("span"));
		for (int i = 0; i < DateList.size() - 1; i++) {
			ActualFlightDeparture = ActualFlightDeparture + DateList.get(i).getText();

		}
		myAssert.assertEquals(ActualFlightDeparture, ExpectedFlightDeparture);
	}

	@Test()
	public void CheckFlightReturn() {
		WebElement DateClassName = driver.findElement(By.xpath(
				"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]"));
		List<WebElement> DateList = DateClassName.findElements(By.tagName("span"));
		for (int i = 0; i < DateList.size() - 1; i++) {
			ActualFlightReturn = ActualFlightReturn + DateList.get(i).getText();

		}
		myAssert.assertEquals(ActualFlightReturn, ExpectedFlightReturn);
	}

//	@Test(priority = 3)
//	
//	public void NotificationClose() throws InterruptedException {
//		Thread.sleep(3000);
//		//WebElement Notification = driver.findElement(By.className("CT_Interstitial"));
//	//	Notification.findElement(By.tagName("Span")).click();
//	//	WebElement Alert = driver.findElement(By.className("moe-push-class"));
//	//	Alert.findElement(By.tagName("button")).click();
//		driver.findElement(By.xpath("//*[@id=\"contentDiv\"]/div/div/span")).click();
//
//	}
	@Test(priority = 1)
	public void RandomLanguage() {

		 CurrentLanguage = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).getText();
		Random Random = new Random();
		
		int RandomNumber = Random.nextInt(50);

		if ((RandomNumber % 2) == 0) {
			if (CurrentLanguage.contains("العربية")) {
				ExpectedRandomLanguage = "English";
				driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).click();
			} else
				ExpectedRandomLanguage = "English";

		} else if (CurrentLanguage.contains("English")) {
			ExpectedRandomLanguage = "العربية";
			driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).click();
		} else
			ExpectedRandomLanguage = "العربية";

		ActualRandomLanguage = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).getText();
		
		myAssert.assertEquals(ActualRandomLanguage, ExpectedRandomLanguage);
		
	}
	
	@Test(priority = 2)
	public void HotelSearchTab() throws InterruptedException {
		
		 CurrentLanguage = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).getText();
		 driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]")).click();
			Random Random = new Random();
			int RandomNumber = Random.nextInt(3);
			
		 if (CurrentLanguage.contains("English")) {
			 driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input")).sendKeys(RandomLocationsAR[RandomNumber]);
			 }
		 else 		 
			 if (CurrentLanguage.contains("العربية")) {
			 driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input")).sendKeys(RandomLocationsEN[RandomNumber]);
		
		 }

		
	}
	
//	@Test()
//	public void RandomRoomOption() {

//		WebElement RoomOption = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div[2]/div/div[3]/div/select"));
//		List <WebElement> RoomChoices = RoomOption.findElements(By.tagName("option"));
//		Random Random = new Random();
//		int RandomNumber = Random.nextInt(2);
//		RoomChoices.get(RandomNumber).click();

//}
	}
