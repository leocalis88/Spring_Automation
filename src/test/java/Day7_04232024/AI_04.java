package Day7_04232024;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AI_04 {

    public static void main(String[] args) {
        // Step 1: Initialize an ArrayList with 3 different zip codes
        List<String> zipCodes = new ArrayList<>();
        zipCodes.add("10001"); // Example zip code
        zipCodes.add("10002"); // Example zip code
        zipCodes.add("10003"); // Example zip code

        // Step 2: Set up ChromeOptions for incognito and maximize
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Step 3: Navigate to Weight Watchers
        driver.get("https://www.weightwatchers.com/us/find-a-workshop/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Find a Workshop")));

        // Iterate through the zipCodes ArrayList
        for (int i = 0; i < zipCodes.size(); i++) {
            // Click on the "Find a Workshop" link
            WebElement findAWorkshopLink = driver.findElement(By.linkText("Find a Workshop"));
            findAWorkshopLink.click();

            // Click on "In person" link
            WebElement inPersonLink = driver.findElement(By.linkText("In person"));
            inPersonLink.click();

            // Clear the field and enter the current zip code
            WebElement zipCodeField = driver.findElement(By.id("meetingSearch"));
            zipCodeField.clear();
            zipCodeField.sendKeys(zipCodes.get(i));

            // Click on the search arrow
            WebElement searchArrow = driver.findElement(By.className("ww-btn--primary"));
            searchArrow.click();

            // Select the studio link based on the iteration
            List<WebElement> studioLinks = driver.findElements(By.className("location__top"));
            if (i == 0) {
                studioLinks.get(1).click(); // Second studio link
            } else if (i == 1) {
                studioLinks.get(2).click(); // Third studio link
            } else if (i == 2) {
                studioLinks.get(0).click(); // First studio link
            }

            // Capture the entire address and print it out
            WebElement addressElement = driver.findElement(By.className("location__address"));
            System.out.println("Address: " + addressElement.getText());

            // Scroll to "Studio Workshops schedule (in-person)" and capture the entire table
            WebElement workshopSchedule = driver.findElement(By.className("schedule__content"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", workshopSchedule);

            System.out.println("Workshop Schedule: " + workshopSchedule.getText());
        }

        driver.quit(); // Close the browser
    }
}

