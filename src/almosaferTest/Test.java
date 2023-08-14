//import java.util.Random;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
////import java.util.List;
////
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebElement;
////import org.testng.annotations.Test;
//
////package almosaferTest;
////
////import java.util.List;
////
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebElement;
////import org.testng.annotations.Test;
////
////public class Test {
////	@Test()
////	public void CheckSearchTab() {
////		boolean TabText;
////		String ariaSelected;
////		WebElement TabsClassName = driver.findElement(By.className("fKjKUN"));		
////		WebElement Nav = TabsClassName.findElement(By.tagName("nav"));		
////		List <WebElement> TabList = Nav.findElements(By.tagName("a"));
////		
////		for(int i = 0; i<TabList.size(); i++) {
////			TabText = TabList.get(i).getText().contains("Hotel");
////			ariaSelected = TabList.get(i).getAttribute("aria-selected");
////			//if (TabText == true)
////			//	if (ariaSelected.contains("false"))
////			//ActualTab = TabList.get(i).getAttribute("aria-selected");						
////			//boolean TabText = TabList.get(i).getText().contains("Hotel");
////			System.out.println("ariaSelected : "+ ariaSelected + " TabText: "+ TabText);
////		}
////		
////	}
////	@Test()
////	public void CheckSearchTab() {
////		
////		WebElement Tabs = driver.findElement(By.className("fKjKUN"));		
////
////		WebElement Nav = Tabs.findElement(By.tagName("nav"));		
////		List <WebElement> TabList = Nav.findElements(By.tagName("a"));
////		for(int i = 0; i<TabList.size(); i++) {
////			ActualTab = TabList.get(i).getAttribute("aria-selected");			
////			
////			boolean TabText = TabList.get(i).getText().contains("Hotel");
////System.out.println("ActualTab : "+ ActualTab + " TabText: "+ TabText);
////		}
////		
////		
////	}
////
////}
////
////@Test()
////public void CheckSearchTab() {
////	boolean TabText;
//////	String ariaSelected;
////	WebElement Tabs = driver.findElement(By.className("fKjKUN"));		
////
////	WebElement Nav = Tabs.findElement(By.tagName("nav"));		
////	List <WebElement> TabList = Nav.findElements(By.tagName("a"));
////	for(int i = 0; i<TabList.size(); i++) {
////		TabText = TabList.get(i).getText().contains("Hotel");
////		//ariaSelected = TabList.get(i).getAttribute("aria-selected");
////		if (TabText == true)
////		ActualTab = TabList.get(i).getAttribute("aria-selected");						
////	//TabText = TabList.get(i).getText().contains("Hotel");
////	
////		
////	}
////	System.out.println("ActualTab : "+ ActualTab);
////
////}
//
//
//
////	@Test()
////	public void CheckSearchTab() {
////		boolean TabText;
////	//	WebElement Tabs = driver.findElement(By.className("fKjKUN"));	
////		WebElement Tabs = driver.findElement(By.className("fKjKUN"));		
////		WebElement Nav = Tabs.findElement(By.tagName("nav"));		
////		List <WebElement> TabList = Nav.findElements(By.tagName("a"));
////		
////		for(int i = 0; i<TabList.size(); i++) {
////			TabText = TabList.get(i).getText().contains("Hotel");
////			if (TabText == true)
////			ActualTab = TabList.get(i).getAttribute("aria-selected");						
////		}
////		
////		myAssert.assertEquals(ActualTab, ExpectedTab);
////		
//	
//
//@Test(priority = 2)
//	public void HotelSearchTab() throws InterruptedException {
//		
//		 CurrentLanguage = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).getText();
//		 driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]")).click();
//			Random Random = new Random();
//			int RandomNumber = Random.nextInt(3);
//	
//
//			
//		 if (CurrentLanguage.contains("English")) {
//			 driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input")).sendKeys(RandomLocationsAR[RandomNumber]);
////				String Lo = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div[2]/div/div[1]/div/div/div/ul")).getText();
////				System.out.println("List: "+Lo);
//			
//			 
//				 WebElement List = driver.findElement(By.className("AutoComplete__List"));
//				System.out.println("List: "+List);
//
////				//List.findElement(By.className("eHzKAl")).click();
////				List<WebElement>List1= List.findElements(By.tagName("li"));
////				for (int i = 0; i < List1.size(); i++) {
////					String AutoList = List1.get(i).getAttribute("data-testid");
////					if (AutoList != null)
////						if (AutoList.contains("AutoCompleteResultItem1"))
////							List1.get(i).click();
////					System.out.println("List: "+ List1.get(i)+ "  "+ AutoList);
////}
//			 }
//		 else 		 
//			 if (CurrentLanguage.contains("العربية")) {
//			 driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input")).sendKeys(RandomLocationsEN[RandomNumber]);
//			//String Lo = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div[2]/div/div[1]/div/div/div/ul")).getText();
//		//	System.out.println("List: "+Lo);
//
//			 WebElement List = driver.findElement(By.className("AutoComplete__List"));
//			//List<WebElement>List1= driver.findElements(By.tagName("li"));
////			for (int i = 0; i < List1.size(); i++) {
////				String AutoList = List1.get(i).getAttribute("data-testid");
////				if (AutoList != null)
////					if (AutoList.contains("AutoCompleteResultItem1"))
////						List1.get(i).click();
////				System.out.println("List: "+ List1.get(i)+ "  "+ AutoList);
//
////			}
//					System.out.println("List: "+List);
//
//		
//		 }
//
//		