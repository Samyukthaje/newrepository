package com.Loginfun.com;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstProgram {      //login functionalitry

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Samyuktha\\Desktop\\SeleniumAutomation\\Softwares\\ChromeDriver\\chromedriver.exe");
		
		 //chrome capabilities
		 ChromeOptions cp=new ChromeOptions();
		 cp.addArguments("--remote-allow-origins=*");
		 
		 ChromeDriver driver=new ChromeDriver(cp);
		driver.get("https://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr477324");
		driver.findElement(By.name("password")).sendKeys("ytuzUpu");
		driver.findElement(By.name("btnLogin")).click();
		
		String exptitle = "Guru99 Bank Manager HomePage";
		String acttitle = driver.getTitle();
		System.out.println(exptitle+ " " +acttitle);
		if(exptitle==acttitle) {
			System.out.println("test is pass");
		}else {
			System.out.println("test is failed");
		}
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		
		//driver.close();

	}

}
