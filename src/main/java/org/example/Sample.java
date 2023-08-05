package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\11892\\NIT-9PM-June2023\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(100000);
        driver.get("https://chromedriver.chromium.org/downloads");
        driver.close();
    }
}
