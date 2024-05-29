package Day9_04302024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;



    public class StateFarm3 {

        public static void main(String[] args) {


            // Create ChromeDriver
            WebDriver driver = new ChromeDriver();

            // Define ArrayList with input data
            ArrayList<String> data = new ArrayList<>();
            data.add("10701");              // zipcode
            data.add("05/10/2024");         // policystart
            data.add("Jhonny");               // first name
            data.add("Brent");                // last name
            data.add("20 Water Grant");        // street address
            data.add("07/01/1985");         // day of birth
            data.add("Katty");               // co first name
            data.add("Pion");                // co last name

            try {
                ///navigate to StateFarm site
                driver.navigate().to("https://www.statefarm.com/");
                //wait few minutes for the browser session to load up
                Thread.sleep(3000);

                //click on get a quote
                try {
                    driver.findElement(By.xpath("//*[text()='Get a Quote']")).click();
                } catch (Exception e) {
                    System.out.println("Unable to click on get a quote options: " + e);
                }//end of get a quote exception

                //select on HomeOwners dropdown
                try {
                    WebElement homeOwners = driver.findElement(By.xpath("//*[@id='product-select1']"));
                    Select dropdown = new Select(homeOwners);
                    dropdown.selectByVisibleText("Homeowners");
                } catch (Exception e) {
                    System.out.println("Unable to select homeOwners dropdown " + e);
                }//end of homeowners drop down exception

                // Enter zipcode
                driver.findElement(By.id("//*[@name='zipCode']")).sendKeys(data.get(0));

                // Click on start a quote
                driver.findElement(By.id("//*[@id='quote-submit-button1']")).click();

                // Enter your policy start date
                driver.findElement(By.id("//*[@id='effectiveDate']")).sendKeys(data.get(1));

                // Enter first name
                driver.findElement(By.id("//*[@id='firstName']")).sendKeys(data.get(2));

                // Enter last name
                driver.findElement(By.id("//*[@id='lastName']")).sendKeys(data.get(3));

                // Enter a valid street address
                driver.findElement(By.id("//*[@id='street']")).sendKeys(data.get(4));

                // Enter your date of birth
                driver.findElement(By.id("//*[@id='dateOfBirth']")).sendKeys(data.get(5));

                // Scroll down
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 800)");

                // Click on continue button
                driver.findElement(By.id("//*[@name = 'continue']")).click();

                // Click on continue again
                driver.findElement(By.id("//*[@name = 'continue']")).click();

                // Select value for fire protection from the dropdown
                WebElement fireProtection = driver.findElement(By.id("//*[@id = 'fireProtectionAreaNameSelectId']"));
                Select fireProtectionSelect = new Select(fireProtection);
                fireProtectionSelect.selectByIndex(1);

                // Click on continue button
                driver.findElement(By.id("//*[@name = 'continue']")).click();

                // Capture and print personal info messages
                WebElement personalInfoMessage = driver.findElement(By.id("//*[@h1 = 'Personal Info']"));
                System.out.println("Personal Info Message: " + personalInfoMessage.getText());

                // Capture and print email info messages
                WebElement emailInfoMessage = driver.findElement(By.id("//*[@id = 'sfx_contactInfo.emailAddress_input']"));
                System.out.println("Email Info Message: " + emailInfoMessage.getText());

                // Capture and print add a applicant info messages
                WebElement addApplicantInfoMessage = driver.findElement(By.id("//*[@id = 'applicantInformationHeader']"));
                System.out.println("Add Applicant Info Message: " + addApplicantInfoMessage.getText());

                // Click on add co applicant
                driver.findElement(By.id("//*[@id = 'addApplicantModuleNewAdd']")).click();

                // Enter co applicant first name
                driver.findElement(By.id("//*[@id = 'sfx_applicants[1].client.firstName_input']")).sendKeys(data.get(6));

                // Enter co applicant last name
                driver.findElement(By.id("//*[@id = 'sfx_additionalApplicants[0].client.lastName_input']")).sendKeys(data.get(7));

                // Click on continue button
                driver.findElement(By.id("//*[@id = 'continue']")).click();

                // Capture the error message and print it out
                WebElement errorMessage = driver.findElement(By.className("//*[@h1 = 'Sorry, we cannot provide you a quote online.']"));
                System.out.println("Error Message: " + errorMessage.getText());

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close the browser
                driver.quit();

        }
    }//end of main
}//end of class
