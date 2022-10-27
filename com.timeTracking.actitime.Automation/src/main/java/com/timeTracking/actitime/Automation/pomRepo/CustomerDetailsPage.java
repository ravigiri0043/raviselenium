package com.timeTracking.actitime.Automation.pomRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerDetailsPage {
	
		
		WebDriver driver;

		public CustomerDetailsPage(WebDriver driver) {
			this.driver=driver;
		}
			public String verifyCustomerName(String customerName) {
				
			return	 driver.findElement(By.xpath("(//div[text()='"+customerName+"'])[2]")).getText();

		
		
		
	}

}
