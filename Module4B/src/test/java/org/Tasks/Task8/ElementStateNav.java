package org.Tasks.Task8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementStateNav {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver","/Users/e.b/Documents/Testify-Automation-School/Module4B/Module4B/src/msedgedriver");

        //launch browser
        WebDriver enabledElement = new ChromeDriver();

        //Maximise the browser
        enabledElement.manage().window().maximize();

        //Navigate to url
        enabledElement.get(" https://idorenyinankoh.github.io/loginPage/");

        enabledElement.findElement(By.xpath("//input[@id='firstName']")).click();

        // Find the "Create Account" button
        WebElement createButton = enabledElement.findElement(By.id("create"));

        //check if the " create account" button is enabled"
        if (createButton.isEnabled()) {
            System.out.println("Enabled");
        } else {
            System.out.println("Not Enabled");
        }

        //fill all the fields
        WebElement firstname =enabledElement.findElement(By.id("firstName"));
        firstname.sendKeys("Ebere");

        WebElement lastName = enabledElement.findElement(By.id("lastName"));
        lastName.sendKeys("James");

        WebElement email = enabledElement.findElement(By.id("email"));
        email.sendKeys("ebere@gmail.com");

        WebElement sex = enabledElement.findElement(By.id("female"));
        sex.click();

        WebElement password = enabledElement.findElement(By.id("password"));
        password.sendKeys("Ebere1");

        WebElement confirmPassword =enabledElement.findElement(By.id("confirmPass"));
        confirmPassword.sendKeys("Ebere1");

        WebElement aboutYou = enabledElement.findElement(By.id("xpLevel"));
        aboutYou.sendKeys("I am a tester");
        aboutYou.click();

        Thread.sleep(5000);


        //check if the "create account"is enabled  after filling the form correctly
        WebElement createAcctAfterForm = enabledElement.findElement(By.xpath("//button[@id='create']"));
        boolean enabledOrNot= createAcctAfterForm.isEnabled();
        System.out.println("Enabled:true or false = " +enabledOrNot);

    }
}
