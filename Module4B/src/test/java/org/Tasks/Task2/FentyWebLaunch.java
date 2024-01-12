package org.Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FentyWebLaunch {
    public static void main(String[] args) {

        System.setProperty("webDriver.edge.driver","/Users/e.b/Documents/Testify-Automation-School/Module4B/Module4B/src/msedgedriver");

        //launch browser
        WebDriver beauty = new EdgeDriver();

        //Maximise the browser
        beauty.manage().window().maximize();

        //Navigate to url
        beauty.get("https://fentybeauty.com/");

    }
}
