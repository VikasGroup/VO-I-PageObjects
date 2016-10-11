package com.voone.pgobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;


public class ForgotPasswordApplyPassPgObject extends BasicPgObject{
	public ForgotPasswordApplyPassPgObject(Driver driver){
		super(driver);
	}
	WebElement email=driver.findElement(By.xpath(".//*[@id='rblVerifyLink_0']"));
	WebElement id=driver.findElement(By.xpath(".//*[@id='btnsubmit']"));
	WebElement name=driver.findElement(By.xpath(".//*[@id='btnContinue']"));
	WebElement address=driver.findElement(By.xpath(".//*[@id='rblVerifyLink_0']"));
	WebElement submitbtn=driver.findElement(By.xpath(".//*[@id='btnsubmit']"));
	public void enterEmail(String value){
		email.sendKeys(value);
	}
public void enterID(String value){
	id.sendKeys(value);
	}
public void enterName(String value){
	name.sendKeys(value);
}
public void enterAddress(String value){
	address.sendKeys(value);
}
public void clickSubmitBtn(){
	submitbtn.click();
}
}
