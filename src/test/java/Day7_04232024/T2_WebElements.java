package Day7_04232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T2_WebElements {
    public static void main(String[] args) throws InterruptedException {
        //declare and define Chrome Options
        ChromeOptions options = new  ChromeOptions();
        //Add options to start it maximized
        options.addArguments("Start-Maximized", "incognito");
        //declare WebDriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo.com
        driver.navigate().to("https://www.yahoo.com/");
        //store the yahoo header in the array list webelements
        ArrayList<WebElement> yahooHeaders = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class,'_yb_jujrfs')]")));
        for (int i = 0;i < yahooHeaders.size(); i++){
            System.out.println("Yahoo header are " + yahooHeaders.get(i).getText());
        }//end of for loop
        //click on the sport headers (should be in the index 2 because its in the 3rd position)
        yahooHeaders.get(2).click();
        //wait for two second
        Thread.sleep(2000);
        //quit the driver
        driver.quit();
    }//end of main
}//end of class
