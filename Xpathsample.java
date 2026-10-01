package com.training.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathsample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://selenium-prd.firebaseapp.com/");
		
	//	WebElement email = driver.findElement(By.id("email_field"));
		
		WebElement email = driver.findElement(By.xpath("//input[@id = 'email_field']"));
		email.sendKeys("admin123@gmail.com");
		Thread.sleep(500);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password_field']"));
		pwd.sendKeys("admin123");
		Thread.sleep(500);
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login to Account']"));	
		loginButton.click();
		Thread.sleep(500);
		WebElement calculatorLink = driver.findElement(By.xpath("//a[text()='Calculator']"));
		calculatorLink.click();
		
		WebElement numberClick1= driver.findElement(By.xpath("//input[@value='8']"));
		numberClick1.click();
		Thread.sleep(300);
		
		WebElement operator= driver.findElement(By.xpath("//input[@value='x']"));
		operator.click();
		
		
		WebElement numberClick2= driver.findElement(By.xpath("//input[@value='9']"));
		numberClick2.click();
		Thread.sleep(300);

		WebElement equalSign= driver.findElement(By.xpath("//input[@value='=']"));
		equalSign.click();
		
		Thread.sleep(500);
				
		WebElement switchMenu =driver.findElement(By.xpath("//button[contains(normalize-space(),'Switch To')] "));
		switchMenu.click();
		Thread.sleep(300);
		
		WebElement alertMenu =driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		alertMenu.click();
		Thread.sleep(300);
		
		WebElement windowAlert =driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]"));
		windowAlert.click();
		Thread.sleep(500);
		
		driver.switchTo().alert().accept();
		
		WebElement promtAlert =driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
		promtAlert.click();
		Thread.sleep(500);
		
		Alert promtAlertPopUp = driver.switchTo().alert();
		//promtAlertPopUp.sendKeys("Maha lakshmi");
		Thread.sleep(1500);
		promtAlertPopUp.accept();
		//promtAlertPopUp.dismiss();
		
	
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		home.click();
		
		//Name
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Jack");
		
		//Father Name
		WebElement fatherName = driver.findElement(By.xpath("//input[@id='lname']"));
		fatherName.sendKeys("FatherMack");
		
		
		//Postal Address
		//input[@id='postaladdress']
		WebElement postalAddress = driver.findElement(By.xpath("//input[@id='postaladdress']"));
		postalAddress.sendKeys("Zip code 987878");
		
		//Personal Address
		//input[@id='personaladdress']
		WebElement personalAddress = driver.findElement(By.xpath("//input[@id='personaladdress']"));
		personalAddress.sendKeys("Street 1212");
		
		
		WebElement femaleGender = driver.findElement(By.xpath("//input[@value='female']"));
		femaleGender.click();
		
		WebElement city = driver.findElement(By.xpath("//select[@id='city']"));
		Select cityDropdown = new Select(city);
		cityDropdown.selectByVisibleText("GOA");
		
		
		
		
		
		
		
		
		


		
		
	
	
		Thread.sleep(2500);
		WebElement logOutClick = driver.findElement(By.xpath("//a[text()='Logout']"));
		logOutClick.click();
		driver.quit();
		
		//a[contains(text(),'Tabs')]
		
		//button[contains(text(),'Window Alert')]
		
	
		
		
		
		
		
				
		
		
		

	
	}

}
