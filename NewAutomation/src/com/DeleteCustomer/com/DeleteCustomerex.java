package com.DeleteCustomer.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteCustomerex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Samyuktha\\Desktop\\SeleniumAutomation\\Softwares\\ChromeDriver\\chromedriver.exe");

		// chrome capabilities
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(cp);

		driver.get("https://demo.guru99.com/v4/"); // URL

		
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[4]/a")).click(); // CLICK DELETE CUSTOMER
		driver.get("https://demo.guru99.com/v4/manager/DeleteCustomerInput.php"); // DELETE CUST URL
		driver.findElement(By.name("cusid")).sendKeys("987689"); // ENTER CUSTID
		driver.findElement(By.name("AccSubmit")).click(); // CLICK ON SUBMIT
		
		

	}

}
