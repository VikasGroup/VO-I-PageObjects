package com.pgObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.BasicPageObject;

public class loginPgObject extends BasicPageObject {
	public loginPgObject(WebDriver driver){
		super(driver);
	}
	WebElement currentVirtualOffice=driver.findElement(By.xpath(".//*[@id='form1']/div[3]/div/div[1]/div[1]/a[1]"));
	public void clickCurrentVirtualOffice(){
		currentVirtualOffice.click();
	}
	
}
