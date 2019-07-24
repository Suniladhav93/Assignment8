package com.model;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Assignment8 
{
	public WebDriver driver;
  @Test
  public void test1() 
  {
	  //click on my account
	  driver.findElement(By.xpath("//html/body/div/div/div[3]/div/div[4]/ul/li[1]/a")).click();
	  //login
	  driver.findElement(By.cssSelector("input[id='email']")).sendKeys("suniladhav10@gmail.com");
	  driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("p@ssword1");
	  driver.findElement(By.xpath("//button[@id='send2']")).click();
	  System.out.println("eclipse to gitHub");
  }
  @BeforeSuite
  public void beforeSuite()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://live.guru99.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
  }

}
