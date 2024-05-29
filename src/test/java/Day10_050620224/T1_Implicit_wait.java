package Day10_050620224;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class T1_Implicit_wait {
    public static void main(String[] args) throws InterruptedException {
        // declare the choromeOptions
        ChromeOptions options = new ChromeOptions();
        //run in incognito
        options.addArguments("start-maximized");
        //define the web driver
        WebDriver driver = new ChromeDriver(options);
        //declare and define your global implicit wait for all web elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //navigate to usps
        driver.navigate().to("https://www.ups.com/");
        Thread.sleep(1000);
        //Click on Tracking
        driver.findElement(By.xpath("//*[text()='Tracking']")).click();
        //click on track a package
        driver.findElement(By.xpath("//*[text()='Track a Package']")).click();
        //quit the browser
        driver.quit();
    }//end of java main method

}//end of java class




