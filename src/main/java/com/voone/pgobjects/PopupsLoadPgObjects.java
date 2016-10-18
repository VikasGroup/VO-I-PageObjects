package com.voone.pgobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;

public class PopupsLoadPgObjects extends BasicPgObject {
	public PopupsLoadPgObjects(Driver driver){
		super(driver);
	}
	
	WebElement footer				=driver.findElement(By.xpath("html/body/form/div[4]"));
	WebElement GR_Visuallink		=driver.findElement(By.id("ContentPlaceHolderShortCutArea_ShortCut1_lbnShortCut1"));
	WebElement GR_ByDate			=driver.findElement(By.id("ContentPlaceHolderShortCutArea_ShortCut1_lbnShortCut2"));
	WebElement eCard_Checker		=driver.findElement(By.id("ContentPlaceHolderShortCutArea_ShortCut1_lbnShortCut5"));
	WebElement OrderAndPayment		=driver.findElement(By.id("ContentPlaceHolderShortCutArea_ShortCut1_lbnShortCut6"));
	WebElement TrackShipment		=driver.findElement(By.id("ContentPlaceHolderShortCutArea_ShortCut1_lbnShortCut7"));
	
	
	
	public void clickClose(){
		WebElement closebtn=driver.findElement(By.xpath("html/body/div[3]/div/div/a"));
		closebtn.click();
	}
	public String getTestFooter(){
		System.out.println(footer.getText().replace("\n", " "));
		return footer.getText().replace("\n", " ");
		
	}
	public void clickGR_Visuallink(){
		GR_Visuallink.click();
	}
	public void clickGR_ByDate(){
		GR_ByDate.click();
	}
	public void clickeCard_Checker(){
		eCard_Checker.click();
	}
	public void clickOrderAndPayment(){
		OrderAndPayment.click();
	}
	public void clickTrackShipment(){
		TrackShipment.click();
	}
	
	
}
