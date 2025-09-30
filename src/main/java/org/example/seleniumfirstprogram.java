package seleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.NoSuchElementException;

public class seleniumfirstprogram {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //ChromeDriver driver2=(ChromeDriver)driver;
        driver.get("https://datatables.net/examples/data_sources/ajax.html");
        driver.manage().window().maximize();
        //driver.navigate().forward();
        // driver.navigate().back();
        //driver.navigate().refresh();
        Thread.sleep(2000);

//        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement text= driver.findElement(By.xpath("(//span[text()='DataTables'])[position()=1]"));
//        Boolean isVisible=(Boolean) js.executeScript("return arguments[0].offsetParent !== null;",text);
//        System.out.println("Is visible: " + isVisible);
//first way
        Boolean iselementpresent=text.isDisplayed();
        //first way
        if(iselementpresent){
            System.out.println("Element is present"+ iselementpresent);
        }
        else{
            System.out.println("Element is not present");
        }
        //second way
        if(text.isDisplayed()){
            System.out.println("DtaTable text is present" + text);
        }
        else{
            System.out.println("DtaTable text is not present");
        }

        //Third way
        try{
            if(driver.findElement(By.xpath("(//span[text()='DataTables'])[position()=1]")).isDisplayed()){
                System.out.println("Element is present");
            }
        }
        catch(NoSuchElementException e){
            System.out.println("Element is not present ");
        }
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("All link size"+ " " +links.size());
        for(WebElement weblinks:links){
            if(!(weblinks.getText().isEmpty())){
                // && weblinks.getText().length()>10
                System.out.println(weblinks.getText());
            }
            driver.close();
        }

    }
}


