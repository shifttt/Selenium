package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.function.DoubleToIntFunction;

public class Task1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver diver = new ChromeDriver();

        diver.get("https://amazon.com");
        System.out.println(diver.getCurrentUrl());
        System.out.println(diver.getTitle());
    }

}
