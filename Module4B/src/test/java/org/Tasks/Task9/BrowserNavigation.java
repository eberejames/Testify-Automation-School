package org.Tasks.Task9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.edge.driver", "//Users/e.b/Documents/Testify-Automation-School/Module4B/src/msedgedriver");

        //launch browser
        WebDriver navigation = new EdgeDriver();

        //Maximise the browser
        navigation.manage().window().maximize();

        //Navigate to url
        navigation.get("https://www.saucedemo.com/");

        //input username
        navigation.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("visual_user");

        //input password
        navigation.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");

        //click on the login button
        navigation.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //rest
        Thread.sleep(5000);

        //refresh page
        navigation.navigate().refresh();

        //rest
        Thread.sleep(5000);

        //navigate back to log in screen from the homepage
        navigation.navigate().back();

        //Verify the login button attribute "Value and print out
        String loginAttributeValue = navigation.findElement(By.cssSelector("input[name=login-button]")).getAttribute("value");
        System.out.println(loginAttributeValue + " is the attribute VALUE for login  button  ");


        //rest
        Thread.sleep(5000);

        //navigate forward to the homepage
        navigation.navigate().forward();
        String productName = navigation.findElement(By.cssSelector("div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(5) div.inventory_item_description div.inventory_item_label a:nth-child(1) > div.inventory_item_name")).getText();
        System.out.println("productName");



        if (productName.equals("Sauce Labs Onesie")) {
            System.out.println(" Successfully back on the homepage ");
        } else {
            System.out.println("Incorrect payload");


            navigation.quit();


        }
    }
}

