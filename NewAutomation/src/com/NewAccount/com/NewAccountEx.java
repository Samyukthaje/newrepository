package com.NewAccount.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Samyuktha\\Desktop\\SeleniumAutomation\\Softwares\\ChromeDriver\\chromedriver.exe");
		
		 //chrome capabilities
		 ChromeOptions cp=new ChromeOptions();
		 cp.addArguments("--remote-allow-origins=*");
		 
		 ChromeDriver driver=new ChromeDriver(cp);
		 
		driver.get("https://demo.guru99.com/v4/");   //URL
		
		
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();  //CLICK ON NEW ACCOUNT
		driver.get("https://demo.guru99.com/v4/manager/addAccount.php");    // NEW ACCOUNT URL
		driver.findElement(By.name("cusid")).sendKeys("98487");  //CUST ID
		driver.findElement(By.name("selaccount")).sendKeys("current"); //DROPDOWN (ACCOUNT TYPE)
		driver.findElement(By.name("inideposit")).sendKeys("1000");  //INITIAL DEPOSIT
		driver.findElement(By.name("button2")).click();  //  SUBMIT
		//driver.findElement(By.name("reset")).click();  //  RESET
		
		

	}

}
