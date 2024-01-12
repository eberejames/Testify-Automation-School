package org.Tasks.Task7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WorldWeather {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "/Users/e.b/Documents/Testify-Automation-School/Module4B/src/msedgedriver");

        //launch browser
        WebDriver worldWeather = new EdgeDriver();

        //Maximise the browser
        worldWeather.manage().window().maximize();

        ////Navigate to url
       worldWeather.get(" https://worldweather.wmo.int/en/home.html");

        worldWeather.findElement(By.cssSelector("#q_search")).sendKeys("abuja");

        worldWeather.findElement(By.cssSelector("div.wrapper div.row.shortcut_n_searchbox:nth-child(6) div:nth-child(1) div:nth-child(5) div:nth-child(1) form:nth-child(1) > input.top_searchbox_submit:nth-child(4)")).click();

        String fri = worldWeather.findElement(By.cssSelector("div.wrapper:nth-child(1) div.row.shortcut_n_searchbox:nth-child(6) div:nth-child(1) div:nth-child(5) div:nth-child(1) form:nth-child(1) > input.top_searchbox_submit:nth-child(4)")).getAttribute("Fri");

        System.out.println(fri);


    }
}
