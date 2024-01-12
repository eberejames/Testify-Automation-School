package org.Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class KongaWebLaunch {
    public static void main(String[] args) {

        System.setProperty("webDriver.edge.driver","/Users/e.b/Documents/Testify-Automation-School/Module4B/Module4B/src/msedgedriver");

        //launch browser
        WebDriver shopping = new EdgeDriver();

        //Maximise the browser
        shopping.manage().window().maximize();

        //Navigate to url
        shopping.get("https://konga.com/");

    }
}
