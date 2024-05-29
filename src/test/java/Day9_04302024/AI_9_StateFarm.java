package Day9_04302024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AI_9_StateFarm {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        //navigate to mlcalc.com
        driver.navigate().to("https://www.statefarm.com/");
        //wait few minutes for the browser session to load up
        Thread.sleep(3000);

        //click on get a quote
        driver.findElement(By.xpath("//*[@href='/get-insurance-quote']")).click();
        //click on get a quote
        try {
            driver.findElement(By.xpath("//*[@id='quote-submit-button1']")).click();
        } catch (Exception e) {
            System.out.println("Unable to click on get a quote options: " + e);
        }//end of get a quote exception
        //wait few minutes
        Thread.sleep(2000);

        //select on HomeOwners dropdown
        try {
            WebElement homeOwners = driver.findElement(By.xpath("//*[@id='product-select1']"));
            Select dropdown = new Select(homeOwners);
            dropdown.selectByVisibleText("Homeowners");
        } catch (Exception e) {
            System.out.println("Unable to select homeOwners dropdown " + e);
        }//end of homeowners drop down exception
        //wait few minutes
        Thread.sleep(2000);

        // ArrayList with input data
        ArrayList<String> inputData = new ArrayList<>();
        inputData.add("10701"); // Zip Code
        inputData.add("05/10/2024"); // Policy Start Date
        inputData.add("John"); // First Name
        inputData.add("Doe"); // Last Name
        inputData.add("123 Main St"); // Street Address
        inputData.add("01/01/1990"); // Date of Birth
        inputData.add("21216"); // Zip Code
        inputData.add("05/11/2024"); // Policy Start Date
        inputData.add("Johny"); // First Name
        inputData.add("Kerr"); // Last Name
        inputData.add("2300     Chelsea Terr"); // Street Address
        inputData.add("09/08/1987"); // Date of Birth
        inputData.add("Jane"); // Co-Applicant First Name
        inputData.add("Doe"); // Co-Applicant Last Name
        inputData.add("Katty"); // Co-Applicant First Name
        inputData.add("Pion"); // Co-Applicant Last Name

        // Enter Zip Code and start a quote
        try {
            WebElement zipCodeInput = driver.findElement(By.id("//*[@name='zipCode']"));
            zipCodeInput.sendKeys(inputData.get(0));
            WebElement startQuoteButton = driver.findElement(By.id("//*[@id='quote-submit-button1']"));
            startQuoteButton.click();
        } catch (Exception e) {
            System.out.println("Error entering Zip Code or starting quote: " + e.getMessage());
        }//wait few minutes
        Thread.sleep(2000);

        // Enter policy start date
        try {
            WebElement policyStartDate = driver.findElement(By.id("//*[@id='effectiveDate']"));
            policyStartDate.sendKeys(inputData.get(1));
        } catch (Exception e) {
            System.out.println("Error entering policy start date: " + e.getMessage());
        }//wait few minutes
        Thread.sleep(2000);

        // Enter personal information
        try {
            WebElement firstNameInput = driver.findElement(By.id("//*[@id='firstName']")); // Adjust ID
            WebElement lastNameInput = driver.findElement(By.id("//*[@id='lastName']")); // Adjust ID
            WebElement streetAddressInput = driver.findElement(By.id("//*[@id='street']")); // Adjust ID
            WebElement dobInput = driver.findElement(By.id("//*[@id='dateOfBirth']")); // Adjust ID

            firstNameInput.sendKeys(inputData.get(2));
            lastNameInput.sendKeys(inputData.get(3));
            streetAddressInput.sendKeys(inputData.get(4));
            dobInput.sendKeys(inputData.get(5));
        } catch (Exception e) {
            System.out.println("Error entering personal information: " + e.getMessage());
        }//wait few minutes
        Thread.sleep(2000);

        // Scroll down using JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Click on Continue
        try {
            WebElement continueButton = driver.findElement(By.id("//*[@name = 'continue']"));
            continueButton.click();
        } catch (Exception e) {
            System.out.println("Error clicking Continue: " + e.getMessage());
        }//wait few minutes
        Thread.sleep(2000);

        //click continue again
        try {
            //scroll into the webelement, we need to define continue button into webelement
            WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));
            contButton.click();
        } catch (Exception e) {
            System.out.println("unable to click continue" + e);
            //wait few minutes
            Thread.sleep(2000);
        }//end of try catch continue

        //select value for fire protection
        try{
            WebElement fireProtection = driver.findElement(By.xpath("//*[@id = 'fireProtectionAreaNameSelectId']"));
            Select fireProtectionDropDown = new Select(fireProtection);
            fireProtectionDropDown.selectByIndex(1);
        } catch (Exception e) {
            System.out.println("Unable to select Fire Protection from dropdown " + e);
        }//end of fire protection
        //wait few minutes
        Thread.sleep(2000);

        //click continue again
        try {
            //scroll into the webelement, we need to define continue button into webelement
            WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));
            contButton.click();
        } catch (Exception e) {
            System.out.println("unable to click continue" + e);
        }//end of continue button

        // Capture personal info messages
        try {
            WebElement personalInfoMessage = driver.findElement(By.id("personal-info-message-id"));
            System.out.println("Personal Info Message: " + personalInfoMessage.getText());
        } catch (Exception e) {
            System.out.println("Error capturing personal info message: " + e.getMessage());
        }

        // Capture email info messages
        try {
            WebElement emailInfoMessage = driver.findElement(By.id("email-info-message-id"));
            System.out.println("Email Info Message: " + emailInfoMessage.getText());
        } catch (Exception e) {
            System.out.println("Error capturing email info message: " + e.getMessage());
        }

        // Capture "Add a Co Applicant" message
        try {
            WebElement addCoApplicantMessage = driver.findElement(By.id("add-co-applicant-message-id"));
            System.out.println("Add Co Applicant Message: " + addCoApplicantMessage.getText());
        } catch (Exception e) {
            System.out.println("Error capturing Add Co Applicant message: " + e.getMessage());
        }

        // Click on "Add Co Applicant"
        try {
            WebElement addCoApplicantButton = driver.findElement(By.id("add-co-applicant-button-id"));
            addCoApplicantButton.click();
        } catch (Exception e) {
            System.out.println("Error clicking 'Add Co Applicant': " + e.getMessage());
        }

        // Enter Co-Applicant information
        try {
            WebElement coApplicantFirstNameInput = driver.findElement(By.id("co-first-name-id"));
        } catch (Exception e){
            System.out.println("error entering coFirstName: " + e.getMessage());
        }

    }//end of main
}//end of class
