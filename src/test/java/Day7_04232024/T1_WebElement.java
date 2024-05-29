package Day7_04232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;

public class T1_WebElement {
    public static void main(String[] args) throws InterruptedException {
        //declare and define Chrome Options
        ChromeOptions options = new  ChromeOptions();
        //Add options to start it maximized
        options.addArguments("Start-Maximized", "incognito");
        //declare WebDriever and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to Mortgage Calculator.com
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //declare and store home value webelement
        WebElement homevalue = driver.findElement(By.xpath("//*[@id = 'homeval']"));
        //clear the home value field
        homevalue.clear();
        //enter 95000 in the home value field
        homevalue.sendKeys("95000");
        //wait 2 seconds
        Thread.sleep(2000);
        //quit the driver
        driver.quit();
    }//end of main
}//end of class
