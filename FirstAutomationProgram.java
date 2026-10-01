package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationProgram {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium-prd.firebaseapp.com/");
		
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password_field"));
		pwd.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		loginButton.click();
		
		
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--incognito");
		 * options.addArguments("--start-maximized"); WebDriver driver = new
		 * ChromeDriver(options);
		 
		
		driver.get("https://selenium-prd.firebaseapp.com/");
		
		
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.id("password_field"));
		pwd.sendKeys("admin123");
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		loginButton.click();*/
		Thread.sleep(3000);
		driver.quit();

	}

}
