package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\11892\\SeleniumNew\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
//        driver.close();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.manage().window().fullscreen();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.quit();
    }
}
