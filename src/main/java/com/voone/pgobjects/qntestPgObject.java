package com.pgObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.BasicPageObject;

public class qntestPgObject extends BasicPageObject {
	public qntestPgObject(WebDriver driver){
		super(driver);
	}
	WebElement irlogin=driver.findElement(By.xpath(".//*[@id='ctl00_SharedHeaderStyleTopMenuBarNew_hlLogin']"));
	public void clickIRLogiIn(){
		irlogin.click();
	}
}
