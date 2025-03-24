package org.example.ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

public class Selenium03 {

        @Test
        public void test_001() {
            ChromiumDriver driver = new ChromeDriver();
            driver.get("https://sdet.live");
            driver.quit();
        }
    }

