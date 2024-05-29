package Day11_05072024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

import static Day11_05072024.ReusableMethods.setupChromeDriver;

public class Reusable_Method_WeightWatchers {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome option
        WebDriver driver = setupChromeDriver();

        ArrayList<String> zipCode = new ArrayList<>();
        //declare an array list
        zipCode.add("11209");
        zipCode.add("11218");
        zipCode.add("10306");
        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to weightwatchers website
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
            //pause for 3 seconds
            Thread.sleep(3000);
            //click on Find a Workshop
            ReusableMethods.clickMethod(driver, "//*[@class='secondaryWrapper-lMu0i']", "find a Workshop");

            //click on in person link
            ReusableMethods.clickMethod(driver, "//*[@class='buttonText-0YATk']", "in person link");

            //pause 3 seconds
            Thread.sleep(3000);

            //declare and store locator as a webElement
            ReusableMethods.sendKeysMethod(driver, "//*[@id='location-search']", zipCode.get(i), "zipCode");

//click on search arrow
            ReusableMethods.clickMethod(driver, "//*[@class='rightArrow-C_sUu']", "search Arrow");

//pause for 3 seconds
            Thread.sleep(3000);

            if (i == 0) {
                ReusableMethods.clickByIndex(driver, "//*[@class='linkContainer-C5n9z']", 1, "Studio Link");
            } else if (i == 1) {
                ReusableMethods.clickByIndex(driver, "//*[@class='linkContainer-C5n9z']", 2, "Studio Link");
            } else if (i == 2) {
                ReusableMethods.clickByIndex(driver, "//*[@class='linkContainer-C5n9z']", 0, "Studio Link");
            }// end of if else statement

// pause for 3 seconds
            Thread.sleep(3000);

//store address
            String address = ReusableMethods.captureText(driver, "//*[@class='address-FnT8k']", "address");

//print the address
            System.out.println("Address: " + address);

            //scroll to workshop
            ReusableMethods.scrollByView(driver, "//*[@class='title-UbUc9']", "workshop");

//capture schedule
            String schedule = ReusableMethods.captureText(driver, "//*[@class='scheduleContainerMobile-ps6Rm']", "schedule");

            //print out table
            System.out.println("Schedule: " + schedule);
        }//end of for loop

        //quit driver
        driver.quit();

    }//end of main
}//end of class
