package com.voone.pgobjects;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;


public class forgotpasswordPgObject extends BasicPgObject {
	public forgotpasswordPgObject(Driver driver){
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
