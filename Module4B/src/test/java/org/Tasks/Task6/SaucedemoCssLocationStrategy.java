package org.Tasks.Task6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SaucedemoCssLocationStrategy {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users/e.b/Documents/Testify-Automation-School/Module4B/src/msedgedriver");

        //launch browser
        WebDriver cssLocStrt = new EdgeDriver();

        //Maximise the browser
        cssLocStrt.manage().window().maximize();

        ////Navigate to url
        cssLocStrt.get("https://www.saucedemo.com/");

        cssLocStrt.findElement(By.cssSelector("#user-name")).sendKeys("visual_user");
        cssLocStrt.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        cssLocStrt.findElement(By.cssSelector("#login-button")).click();
        Thread.sleep(5000);

        cssLocStrt.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(5000);
        cssLocStrt.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.shopping_cart_container.visual_failure:nth-child(3) > a.shopping_cart_link")).click();
        Thread.sleep(5000);
        cssLocStrt.findElement(By.cssSelector("#checkout")).click();
        Thread.sleep(5000);

    }
}