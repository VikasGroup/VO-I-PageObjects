package com.pgObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.BasicPageObject;

public class ForgotPasswordApplyPassPgObject extends BasicPageObject{
	public ForgotPasswordApplyPassPgObject(WebDriver driver){
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
