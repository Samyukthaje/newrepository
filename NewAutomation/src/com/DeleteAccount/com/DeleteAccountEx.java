package com.DeleteAccount.com;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chromium.ChromiumOptions;

public class DeleteAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Samyuktha\\Desktop\\SeleniumAutomation\\Softwares\\ChromeDriver\\chromedriver.exe");

		// chrome capabilities
		/*
		 * ChromiumOptions cp = new ChromiumOptions();
		 * cp.addArguments("--remote-allow-origins=*");
		 */
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/v4/"); // URL

		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[7]/a")).click();  //CLICK ON DELETE ACCOUNT 
		driver.get("https://demo.guru99.com/v4/manager/deleteAccountInput.php");   //DELETE ACCOUNT URL
		driver.findElement(By.name("accountno")).sendKeys("98487");  //ACCOUNT NUM
		driver.findElement(By.name("AccSubmit")).click();  //SUBMIT
		driver.findElement(By.name("res")).click();  //RESET
		

	}

}
