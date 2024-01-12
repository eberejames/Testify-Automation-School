package org.Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webDriver.edge.driver","/Users/e.b/Documents/Testify-Automation-School/Module4B/Module4B");

        //launch driver
        WebDriver googleElement = new EdgeDriver();

        //navigate to browser

        googleElement.get("https://google.com/");
    }
}
