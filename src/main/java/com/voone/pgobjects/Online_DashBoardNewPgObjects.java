package com.voone.pgobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;

public class Online_DashBoardNewPgObjects extends BasicPgObject {
 public Online_DashBoardNewPgObjects(Driver driver){
  super(driver);
 }
 WebElement rspcal				=driver.findElement(By.xpath(".//*[@id='imgRSPCalculator']"));
 WebElement qnet				=driver.findElement(By.xpath(".//*[@id='imgAchieverClub']")); 
 WebElement faststart			=driver.findElement(By.xpath(".//*[@id='imgfast']")); 
 WebElement webilearn			=driver.findElement(By.xpath(".//*[@id='bannercountdown']/a/img")); 
 WebElement mydigprod			=driver.findElement(By.xpath(".//*[@id='MyDigital']/h1")); 
 WebElement qnetlifesite		=driver.findElement(By.xpath(".//*[@id='ibnQInf']")); 
 WebElement presentation		=driver.findElement(By.xpath(".//*[@id='ibnPresentation']")); 
 WebElement vtube				=driver.findElement(By.xpath(".//*[@id='ibnVtube']"));
 WebElement bizSmart			=driver.findElement(By.xpath(".//*[@id='ibnBizSmart']"));
 WebElement briltime			=driver.findElement(By.xpath(".//*[@id='ibnBril']"));
 WebElement MyTools			    =driver.findElement(By.xpath(".//*[@id='CMenu1_dtlCMenu_CMenuCategory1_4_pnlCategoryHeader_4']"));
 WebElement eCardChecker		=driver.findElement(By.xpath(".//*[@id='CMenu1_dtlCMenu_CMenuCategory1_2_dtlCategoryItem_2_lnkItem_0']"));
 
 
 
 
 
 
 public void click_rspcal(){
  rspcal.click();
 }
 public void click_qnet(){
  qnet.click();
 }
 public void click_webilearn(){
  webilearn.click();
 }
 public void click_faststart(){
  faststart.click();
 }
 public void click_mydigprod(){
  mydigprod.click();
 }
 public void click_qnetlifesite(){
  qnetlifesite.click();
 }
 public void click_presentation(){
  presentation.click();
 }
 public void click_vtube(){
  vtube.click();
 }
 public void click_bizSmart(){
  bizSmart.click();
 }
 public void click_briltime(){
  briltime.click();
 }
 public void click_MyTools(){
	 MyTools.click();
	 }
 public void click_eCardChecker(){
	 eCardChecker.click();
	 }
}