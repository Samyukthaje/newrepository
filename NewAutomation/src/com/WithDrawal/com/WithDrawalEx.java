package com.WithDrawal.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithDrawalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Samyuktha\\Desktop\\SeleniumAutomation\\Softwares\\ChromeDriver\\chromedriver.exe");

		// chrome capabilities
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(cp);

		driver.get("https://demo.guru99.com/v4/"); // URL


		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();  //click on withdrawl
		driver.get("https://demo.guru99.com/v4/manager/WithdrawalInput.php");   //withdrawl URL
		driver.findElement(By.name("accountno")).sendKeys("98487");  //account num
		driver.findElement(By.name("ammount")).sendKeys("1000.00");  //amount
		driver.findElement(By.name("desc")).sendKeys("amount");//description
		driver.findElement(By.name("submit")).click();  //submit
		//driver.findElement(By.name("reset")).click();  //reset
		
		

	}

}
