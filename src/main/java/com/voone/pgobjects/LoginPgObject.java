package com.voone.pgobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;



public class LoginPgObject extends BasicPgObject {
	public LoginPgObject(Driver driver){
		super(driver);
	}
	WebElement currentVirtualOffice=driver.findElement(By.xpath(".//*[@id='form1']/div[3]/div/div[1]/div[1]/a[1]"));
	public void clickCurrentVirtualOffice(){
		currentVirtualOffice.click();
	}
	
}
