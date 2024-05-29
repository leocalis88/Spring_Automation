package Day7_04232024;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;

public class T3_Scroll {
    public static void main(String[] args) throws InterruptedException {
//declare and define Chrome Options
        ChromeOptions options = new  ChromeOptions();
        //Add options to start it maximized
        options.addArguments("Start-Maximized", "incognito");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to mlcalc.com
        driver.navigate().to("https://www.mlcalc.com/");
        //wait 2 seconds
        Thread.sleep(2000);
        //define the javascript executor
      JavascriptExecutor jse =  (JavascriptExecutor) driver;
        //scroll down 800 pixels
        jse.executeScript("scroll(0,800)");
        //wait 2 seconds
        Thread.sleep(2000);
        //scroll back up
        jse.executeScript("scroll(0,-800)");
        //wait two seconds
        Thread.sleep(2000);
        //scroll into the webelement, wwe need to define calculate buttom into webelement
        WebElement calcButtom = driver.findElement(By.xpath("//*[@value = 'Calculate']"));
        //scroll into view of the calculate buttom
        jse.executeScript("arguments[0].scrollIntoView(true);",calcButtom);
        //wait 4 second
        Thread.sleep(4000);
        //quit the browser
        driver.quit();
    }//end of main
}//end of class
