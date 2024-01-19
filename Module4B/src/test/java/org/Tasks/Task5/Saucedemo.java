package org.Tasks.Task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Saucedemo {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "//Users/e.b/Documents/Testify-Automation-School/Module4B/src/msedgedriver");

        //launch browser
        WebDriver sauceDemo = new EdgeDriver();

        //Maximise the browser
        sauceDemo.manage().window().maximize();

        ////Navigate to url
        sauceDemo.get("https://www.saucedemo.com/");

        sauceDemo.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("visual_user");
        sauceDemo.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        sauceDemo.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(5000);

        sauceDemo.findElement(By.xpath("//html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")).click();
        Thread.sleep(5000);
        sauceDemo.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(5000);
        sauceDemo.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        Thread.sleep(5000);

    }


}
