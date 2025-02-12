package com.testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apptest {
		@Test
		
		public void test() throws InterruptedException{
			
		
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/TRAVEL_AGENCES/index.html");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("password123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
}
