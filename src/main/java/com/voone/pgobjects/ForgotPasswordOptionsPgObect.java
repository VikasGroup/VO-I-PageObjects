package com.pgObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.BasicPageObject;

public class ForgotPasswordOptionsPgObect extends BasicPageObject{
	public ForgotPasswordOptionsPgObect(WebDriver driver){
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
