package com.voone.pgobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.thoughtworks.selenium.webdriven.commands.Click;
import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;

public class Online_DashBoardPgObject extends BasicPgObject {

	public Online_DashBoardPgObject(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebElement facebook = driver.findElement(By.xpath(".//*[@id='TabMenu1_lnkFB']/img"));
	WebElement twitter = driver.findElement(By.xpath(".//*[@id='TabMenu1_lnkTW']/img"));
	
	WebElement blogger = driver.findElement(By.xpath(".//*[@id='TabMenu1_lnkB']/img"));
	WebElement utube = driver.findElement(By.xpath(".//*[@id='TabMenu1_lnkYT']/img"));
	WebElement gplus = driver.findElement(By.xpath(".//*[@id='TabMenu1_lnkGp']/img"));

	WebElement name = driver.findElement(By.xpath(".//*[@id='header1_lblNameNew']"));
	WebElement last_login = driver.findElement(By.xpath(".//*[@id='header1_lblLastLoginNew']/strong"));
	
	WebElement mainpay_rank = driver.findElement(By.xpath(".//*[@id='header1_lblPayRank']"));
	WebElement maintitle_rank = driver.findElement(By.xpath(".//*[@id='header1_lblTitleRank']"));
	WebElement rsppay_rank = driver.findElement(By.xpath(".//*[@id='header1_lblPayRankRSP']"));
	WebElement rsptitle_rank = driver.findElement(By.xpath(".//*[@id='header1_lblTitleRankRSP']"));

	//WebElement newsfeed = driver.findElement(By.className("news-update")).findElement(By.className("box-content")).findElement(By.id("BusinessUpdatesNew1_lbMore"));

	public void clickfb() {
		facebook.click();
	}

	public void clickTwitter() {
		twitter.click();
	}

	public void clickTwitterAR() {
		WebElement twitterAR = driver.findElement(By.xpath(".//*[@id='TabMenu1_lnkTWA']/img"));
		twitterAR.click();
	}

	public void clickBlogger() {
		blogger.click();
	}

	public void clickUtube() {
		utube.click();
	}

	public void clickGplus() {
		gplus.click();
	}

	public String getName() {
		return name.getText();

	}

	public String getLastLogin() {
		return last_login.getText();
	}

	public String getStatus() {
		WebElement IR_status = driver.findElement(By.xpath(".//*[@id='header1_lblRenewMsgNew']/font"));
		return IR_status.getText();
	}

	public String getmpRank() {
		return mainpay_rank.getText();
	}

	public String getmtRank() {
		return maintitle_rank.getText();
	}

	public String getrpRank() {
		return rsppay_rank.getText();
	}

	public String getrtRank() {
		return rsptitle_rank.getText();
	}

/*	public void clickNews() {
		newsfeed.click();
	}*/
public void enterqpin(String value){
	WebElement qacc_pin= driver.findElement(By.xpath(".//*[@id='ContentPlaceHolderMainArea_QABalance1_txtPinCode']"));
	qacc_pin.sendKeys(value);
}

public void clickValidate() {
	WebElement validate= driver.findElement(By.xpath(".//*[@id='ContentPlaceHolderMainArea_QABalance1_btnValidate']"));
	validate.click();
}

public String checkQAbal() {
	WebElement validate= driver.findElement(By.xpath(".//*[@id='ContentPlaceHolderMainArea_QABalance1_pnlQABalance']/p[2]	"));
	if (validate.isDisplayed()) {
		return "true";
	}
	else{
		return "false";
	}
}

public String checkCmenu(){
	WebElement cmenu1 = driver.findElement(By.xpath(".//*[@id='CMenu1_dtlCMenu_CMenuCategory1_4_pnlCategoryHeader_4']"));
	WebElement cmenu2 = driver.findElement(By.xpath(".//*[@id='CMenu1_dtlCMenu_CMenuCategory1_9_pnlCategoryHeader_9']"));
	WebElement cmenu3 = driver.findElement(By.xpath(".//*[@id='CMenu1_dtlCMenu_CMenuCategory1_2_pnlCategoryHeader_2']"));
	if ((cmenu1.isDisplayed() & cmenu2.isDisplayed())| cmenu3.isDisplayed()){
		return "true";
	} else {		
		return "false";		
	}
}


}
