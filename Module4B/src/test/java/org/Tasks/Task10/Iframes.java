package org.Tasks.Task10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver","/Users/e.b/Documents/Testify-Automation-School/Module4B/Module4B/src/msedgedriver");

        //launch browser
        WebDriver iframeSwitch = new ChromeDriver();

        //Maximise the browser
        iframeSwitch.manage().window().maximize();

        //Navigate to url
        iframeSwitch.get(" https://jqueryui.com/ ");

        //rest
        Thread.sleep(5000);

        //Click on Dialogue button on the left pane
        iframeSwitch.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();

         //switch to iframe
        iframeSwitch.switchTo().frame(0);

        //rest
        Thread.sleep(5000);

        //Click the close button
        iframeSwitch.findElement(By.xpath("//body/div[1]/div[1]/button[1]/span[1]")).click();




    }
}
