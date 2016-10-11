package com.pgObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.BasicPageObject;

public class ForgotPasswordPostEmailPgObject extends BasicPageObject{
	public ForgotPasswordPostEmailPgObject(WebDriver driver){
		super(driver);
	}
	WebElement msg=driver.findElement(By.xpath(".//*[@id='ucHeaderLogin_pnlHeaderStyle2']/table[2]/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[3]/td/p"));
public String getMessage(){
	return msg.getText().replace("\n", "");
}
}
