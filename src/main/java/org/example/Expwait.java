package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class Expwait {
        public static void main(String args[]){
            WebDriver driver=new ChromeDriver();
            driver.get("https://demo.automationtesting.in/Alerts.html");
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
            WebElement clickbutton =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"OKTab\"]/button")));
            clickbutton.click();
            Alert alert=wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
            System.out.println("Alert has been closed Successfully");

            //WebElement element= driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")''
            //  WebElement element=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"))));
            //List<WebElement>list= wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("xxxxxxx"))));



        }
    }


