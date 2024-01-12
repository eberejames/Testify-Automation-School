package org.Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JumiaWebLauch {
    public static void main(String[] args) {

        System.setProperty("webDriver.edge.driver","/Users/e.b/Documents/Testify-Automation-School/Module4B/Module4B/src/msedgedriver");

        //launch browser
        WebDriver driver = new EdgeDriver ();

        //Maximise the browser
        driver.manage().window().maximize();

        //Navigate to url
        driver.get("https://www.jumia.com.ng/");

    }

}
