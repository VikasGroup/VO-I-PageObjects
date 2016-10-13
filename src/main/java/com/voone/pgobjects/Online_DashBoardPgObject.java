package com.voone.pgobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;

public class Online_DashBoardPgObject extends BasicPgObject {

	public Online_DashBoardPgObject(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebElement facebook = driver.findElement(By.xpath(".//*[@id='TabMenu1_lnkFB']/img"));
	WebElement twitter = driver.findElement(By.xpath(".//*[@id='TabMenu1_lnkTW']/img"));
	WebElement twitterAR = driver.findElement(By.xpath(".//*[@id='TabMenu1_lnkTWA']/img"));
	WebElement blogger  = driver.findElement(By.xpath(".//*[@id='TabMenu1_lnkB']/img"));
	WebElement utube  = driver.findElement(By.xpath(".//*[@id='TabMenu1_lnkYT']/img"));
	WebElement gplus = driver.findElement(By.xpath(".//*[@id='TabMenu1_lnkGp']/img"));
	
	public void clickfb(){
		facebook.click();
	}
	public void clickTwitter(){
		twitter.click();
	}
	public void clickTwitterAR(){
		twitterAR.click();
	}
	public void clickBlogger(){
		blogger.click();
	}
	public void clickUtube(){
		utube.click();
	}
	public void clickGplus(){
		gplus.click();
	}
	
	}
