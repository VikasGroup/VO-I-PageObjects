package com.voone.pgobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;



public class QntestPgObject extends BasicPgObject {
	public QntestPgObject(Driver driver){
		super(driver);
	}
	WebElement irlogin=driver.findElement(By.xpath(".//*[@id='ctl00_SharedHeaderStyleTopMenuBarNew_hlLogin']"));
	public void clickIRLogiIn(){
		irlogin.click();
	}
}
