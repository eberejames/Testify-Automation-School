package org.Tasks.Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavGuru99 {
    public static void main(String[] args) {


        System.setProperty("webDriver.chrome.driver","/Users/e.b/Documents/Testify-Automation-School/Module4B/Module4B/src/msedgedriver");

        //launch browser
        WebDriver securityProject = new ChromeDriver();

        //Maximise the browser
        securityProject.manage().window().maximize();

        //Navigate to url
       securityProject.get("http://demo.guru99.com/ ");

       securityProject.findElement(By.xpath("/html/body/app-root/app-theme/div/div/app-notice/app-theme/div/div/app-home/div/div[2]/app-footer/div/div[2]/app-action-buttons/div/button[3]")).click();

    }
}
