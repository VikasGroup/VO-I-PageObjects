package com.voone.pgobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;

public class PopupsLoadPgObjects extends BasicPgObject {
	public PopupsLoadPgObjects(Driver driver){
		super(driver);
	}
	WebElement closebtn=driver.findElement(By.xpath("html/body/div[3]/div/div/a"));
	WebElement footer=driver.findElement(By.xpath("html/body/form/div[4]"));
	public void clickClose(){
		closebtn.click();
	}
	public String getTestFooter(){
		System.out.println(footer.getText().replace("\n", " "));
		return footer.getText().replace("\n", " ");
		
	}
	
}
