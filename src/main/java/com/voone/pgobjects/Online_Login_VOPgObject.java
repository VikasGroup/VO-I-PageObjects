package com.voone.pgobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;



public class Online_Login_VOPgObject extends BasicPgObject {
	public Online_Login_VOPgObject(Driver driver){
		super(driver);
	}
	WebElement shopnowdirectly=driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkRedirectToEStore']"));
	WebElement irid=driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtTCO']"));
	WebElement password=driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtPassword']"));
	Select language=new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_LanguageSelector2_ddlLanguage']")));
	WebElement forgotpass=driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_forgotPwd2_LinkButton1']"));
	WebElement loginbtn=driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnLogin']"));
	
	public void clickShopNowDirectly(){
		shopnowdirectly.click();
	}
	public void enterIRID(String value){
		irid.sendKeys(value);
	}
	public void enterPassword(String value){
		password.sendKeys(value);
	}
	public void selectLanguage(String value){
		language.selectByValue(value);
	}
	public void clickForgotPass(){
		forgotpass.click();
	}
	public void clickLogInBtn(){
		loginbtn.click();
	}
}
