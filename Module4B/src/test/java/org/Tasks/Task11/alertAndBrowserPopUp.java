package org.Tasks.Task11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.util.Set;


public class alertAndBrowserPopUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/e.b/Documents/Testify-Automation-School/Module4B/src/chromedriver");

        WebDriver driver = new ChromeDriver();

        //Maximise the browser
        driver.manage().window().maximize();

        //Navigate to url
        driver.get("https://www.google.com/");

        //search for "testify ltd"
        WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search.sendKeys("testify ltd");
        search.sendKeys(Keys.RETURN);

        //Wait
        Thread.sleep(5000);

        //Click on the search that result with www.testifyltd.com
        driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]")).click();

        //scroll to the bottom of the page
        JavascriptExecutor scroller = (JavascriptExecutor) driver;
        scroller.executeScript("window.scrollBy(0,6000)");

        //get the parent window
        String Parentwindow = driver.getWindowHandle();

        //Click on the LinkedIn icon.
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();

        Set<String> windows = driver.getWindowHandles();

        for (String window: windows){
            driver.switchTo().window(window);

            Thread.sleep(5000);
            System.out.println(driver.getCurrentUrl());

            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/company/testifyorg")){
                Thread.sleep(5000);

                //driver.findElement(By.tagName("button[aria-label='Dismiss']")).click();
                String text = driver.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[2]/div[1]/div[2]/main[1]/div[1]" +
                        "/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/p[1]")).getText();
                System.out.println(text);
            }
        }

    }

}
