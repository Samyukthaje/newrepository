package com.Deposit.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DepositEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Samyuktha\\Desktop\\SeleniumAutomation\\Softwares\\ChromeDriver\\chromedriver.exe");

		// chrome capabilities
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(cp);

		driver.get("https://demo.guru99.com/v4/"); // URL
		
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a")).click();  //click on DEPOSIT
		driver.get("https://demo.guru99.com/v4/manager/DepositInput.php");  //DEPOSIT URL
		driver.findElement(By.name("accountno")).sendKeys("98487");  //ACCOUNT NUM
		driver.findElement(By.name("ammount")).sendKeys("1000.00");  //AMOUNT
		driver.findElement(By.name("desc")).sendKeys("transfer");  //DESCRIPTION
		driver.findElement(By.name("AccSubmit")).click();  //SUBMIT
		
		//driver.findElement(By.name("reset")).click();  //RESET
		

	}

}
