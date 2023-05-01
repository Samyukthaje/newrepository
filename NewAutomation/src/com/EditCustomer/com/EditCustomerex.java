package com.EditCustomer.com;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditCustomerex {
	String ID="mngr477324";
	String pwd="ytuzUpu";

	public static void main(String[] args) {
	
		EditCustomerex obj=new EditCustomerex();   //object creation

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Samyuktha\\Desktop\\SeleniumAutomation\\Softwares\\ChromeDriver\\chromedriver.exe");
		
		 //chrome capabilities
		 ChromeOptions cp=new ChromeOptions();
		 cp.addArguments("--remote-allow-origins=*");
		 
		 ChromeDriver driver=new ChromeDriver(cp);
		 
		driver.get("https://demo.guru99.com/v4/");   //URL
		driver.findElement(By.name("uid")).sendKeys(obj.ID);
		driver.findElement(By.name("password")).sendKeys(obj.pwd);
		driver.findElement(By.name("btnLogin")).click();
		
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/a")).click(); //cLICK EDIT CUSTOMER
		driver.get("https://demo.guru99.com/v4/manager/EditCustomer.php");  // EDIT CUSTOMER URL
		driver.findElement(By.name("cusid")).sendKeys("987689");  //CUST ID
		driver.findElement(By.name("AccSubmit")).click();    // SUBMIT BTN

		
	}

}
