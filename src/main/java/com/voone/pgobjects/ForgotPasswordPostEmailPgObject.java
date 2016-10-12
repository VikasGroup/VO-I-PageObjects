package com.voone.pgobjects;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;



public class ForgotPasswordPostEmailPgObject extends BasicPgObject{
	public ForgotPasswordPostEmailPgObject(Driver driver){
		super(driver);
	}
	WebElement msg=driver.findElement(By.xpath(".//*[@id='ucHeaderLogin_pnlHeaderStyle2']/table[2]/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[3]/td/p"));
public String getMessage(){
	return msg.getText().replace("\n", "");
}
}
