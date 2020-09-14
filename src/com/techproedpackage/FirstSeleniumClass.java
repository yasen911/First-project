package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","/Users/yasenarslan/Documents/Selenium Libraries/Drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println("al");
    }
}
