package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://fb.com");
        driver.findElement(By.id("email")).sendKeys("syntax");
        driver.findElement(By.id("pass")).sendKeys("syntax");
       // driver.findElement(By.name("login")).click();
       // driver.findElement(By.linkText("Forgot Password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();

    }


}
