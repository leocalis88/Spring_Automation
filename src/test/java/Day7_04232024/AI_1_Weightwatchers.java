package Day7_04232024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI_1_Weightwatchers {
    public static void main(String[] args) throws InterruptedException {
        //declare the arrayList
        ArrayList<String> zipCode = new ArrayList<>();
        //add some values to the zipCode array list
        zipCode.add("10701");
        zipCode.add("21212");
        zipCode.add("20707");
        // Step 2: Set up ChromeOptions for incognito and maximize
            ChromeOptions options = new  ChromeOptions();
            //Add options to start it maximized
            options.addArguments("Start-Maximized", "incognito");
            //declare WebDriver and pass chrome options
            WebDriver driver = new ChromeDriver(options);
            //go to weight watchers.com
            driver.navigate().to("https://www.weightwatchers.com/us/");
            //wait 2 seconds
            Thread.sleep(2000);
            //Click on Workshop
        driver.findElements(By.xpath("//*[contains(@data-e2e-name,  'find_a workshop')]")).get(0).click();
        //wait 2 seconds
        Thread.sleep(2000);

        //print out all the zipCode using a for loop
        for(int i = 0; i < zipCode.size(); i++) {
            WebElement findInPersonlocation = driver.findElement(By.xpath("//*[@id = 'location-search']"));
            findInPersonlocation.clear();
            //find in person location
            findInPersonlocation.sendKeys(zipCode.get(i));
            driver.findElements(By.xpath("//*[contains(@type, 'submit')]")).get(0).click();
            //pause for 2 seconds
            Thread.sleep(2000);
            ArrayList<WebElement> locationStudio = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class ,'linkUnderline-XyxpJ')] ")));

            if(i==0) {
                locationStudio.get(0).click();
                String searchResult = driver.findElement(By.xpath("//*[@class= 'address-FnT8k']")).getText();
                System.out.println("Search result is " + searchResult);
            } else if (1 < 2) {
                locationStudio.get(1).click();
                String searchResult = driver.findElement(By.xpath("//*[@class ='address-FnT8k']")).getText();
                System.out.println("Search Result is " + searchResult);
                //pause for 2 seconds
                Thread.sleep(2000);
                driver.findElements(By.xpath("//*[contains(@data-e2e-name, 'find_a workshop')]")).get(0).click();
                //pause for 2 seconds
                Thread.sleep(2000);
                //define the javascript executor
                JavascriptExecutor jse =  (JavascriptExecutor) driver;
                //scroll back up
                jse.executeScript("scroll(0,-800)");


        //quit chrome
        driver.quit();
        }

        }
    }//end of main
}//end of class
