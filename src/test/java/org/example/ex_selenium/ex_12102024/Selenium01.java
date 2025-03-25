package org.example.ex_selenium.ex_12102024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Selenium01 {
    public static void main(String[] args) {
        ChromiumDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}
