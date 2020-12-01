package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        /* Navigate to
        http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
        Login
        Get title and verify
        logout
        close the browser
         */

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        Thread.sleep(2000);

        if(driver.getTitle().equalsIgnoreCase("web orders")){
            System.out.println("title is correct");
        }else{
            System.out.println("title incorrect");
        }

        driver.findElement(By.id("ctl00_logout")).click();


        driver.quit();
    }
}
