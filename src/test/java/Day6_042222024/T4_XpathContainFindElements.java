package Day6_042222024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T4_XpathContainFindElements {
    public static void main(String[] args) throws InterruptedException {
        //declare and define Chrome Options
        ChromeOptions options = new  ChromeOptions();
        //Add options to start it maximized
        options.addArguments("Start-Maximized", "incognito");
        //declare WebDriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo.com
        driver.navigate().to("https://www.yahoo.com/");
        //click on the finance header
        driver.findElements(By.xpath("//*[contains(@class , '_yb_jujrfs')]")).get(1).click();
        //wait for two second
        Thread.sleep(2000);
        //quit the driver
        driver.quit();
    }//end of main
}//end of class

