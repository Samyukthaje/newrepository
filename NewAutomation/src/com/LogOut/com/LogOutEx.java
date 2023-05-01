package com.LogOut.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LogOutEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Samyuktha\\Desktop\\SeleniumAutomation\\Softwares\\ChromeDriver\\chromedriver.exe");

		// chrome capabilities
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(cp);

		driver.get("https://demo.guru99.com/v4/"); // URL
		
		driver.findElement(By.name("uid")).sendKeys("mngr477324"); // UserID
		driver.findElement(By.name("password")).sendKeys("ytuzUpu"); // pwd
		driver.findElement(By.name("btnLogin")).click(); // click login
		
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a")).click();   //logout


	}

}
