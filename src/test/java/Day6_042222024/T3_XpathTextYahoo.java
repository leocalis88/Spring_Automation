package Day6_042222024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;

public class T3_XpathTextYahoo {
    public static void main(String[] args) throws InterruptedException {
        //declare and define Chrome Options
        ChromeOptions options = new  ChromeOptions();
        //Add options to start it maximized
        options.addArguments("Start-Maximized", "incognito");
        //declare WebDriever and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo.com
        driver.navigate().to("https://www.yahoo.com/");
        //click on sign in buttom using xpath text
        driver.findElement(By.xpath("//*[text() = 'Sign in']")).click();
        //wait for two second
        Thread.sleep(2000);
        //quit the driver
        driver.quit();
    }//end of main
}//end of class
