package com.pgObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.BasicPageObject;

public class forgotpasswordPgObject extends BasicPageObject {
	public forgotpasswordPgObject(WebDriver driver){
		super(driver);
	}
	WebElement irid=driver.findElement(By.xpath(".//*[@id='TextBox1']"));
	WebElement submit=driver.findElement(By.xpath(".//*[@id='btnsubmit']"));
	public void clickSubmit(){
		submit.click();
	}
	public void EnterIRID(String value){
		irid.sendKeys(value);
	}
}
