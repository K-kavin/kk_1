package com.DemoWebShopBase_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.DemoWebShop_Utilities.Frame_Work_Constants;

public class Base_class  implements Frame_Work_Constants{
	
	public WebDriver driver;
	@BeforeMethod
	public void oppapp()
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.get(URL);
		
	}
	@AfterMethod
	public void close()
	
	{
		driver.quit();
		
	}
	
}
