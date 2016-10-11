package com.voone.pgobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;



public class ForgotPasswordOptionsPgObect extends BasicPgObject{
	public ForgotPasswordOptionsPgObect(Driver driver){
		super(driver);
	}
	WebElement link=driver.findElement(By.xpath(".//*[@id='rblVerifyLink_0']"));
	WebElement email=driver.findElement(By.xpath(".//*[@id='btnsubmit']"));
	WebElement continuebtn=driver.findElement(By.xpath(".//*[@id='btnContinue']"));
	public void clickSendVerifyLink(){
		link.click();
	}
	public void clickNoAcessEmail(){
		email.click();
	}
	public void clickContinueBtn(){
		continuebtn.click();
	}
}
