/*package Day9_04302024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.ArrayList;

public class AI_StateFarm {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        ArrayList <String> zipCode = new ArrayList<>();
        zipCode.add("10701");
        zipCode.add("21212");

        ArrayList <String> policyStart = new ArrayList<>();
        policyStart.add("05/05/2024");
        policyStart.add("05/06/2024");

        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Ken");
        firstName.add("Maria");

        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Kart");
        lastName.add("Puig");

        ArrayList<String> streetAdd = new ArrayList<>();
        streetAdd.add("20 Water Grant");
        streetAdd.add("2300 Chelsea Terrace");

        ArrayList<String> DOB = new ArrayList<>();
        DOB.add("06/17/1975");
        DOB.add("11/30/1983");

        ArrayList<String> coFirstName = new ArrayList<>();
        coFirstName.add("Moe");
        coFirstName.add("Zacky");

        ArrayList<String> coLastName = new ArrayList<>();
        coLastName.add("Burt");
        coLastName.add("Coss");
        for (int i=0; i<2;i++) {

            //navigate to StateFarm site
            driver.navigate().to("https://www.statefarm.com/");
            //wait few minutes for the browser session to load up
            Thread.sleep(3000);
            //click on get a quote
            driver.findElement(By.xpath("//*[@href='/get-insurance-quote']")).click();
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

            //enter ZipCode
            try {
                driver.findElement(By.xpath("//*[@name='zipCode']")).sendKeys("10701");
            } catch (Exception e) {
                System.out.println("Unable to enter zipCode " + e);
            }//end of zipCode

            //click on Start a quote
            try {
                driver.findElement(By.xpath("//*[@id='quote-submit-button1']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Start a Quote: " + e);
            }//end of start a quote exception

//enter policy start date
            try {
                WebElement strDate = driver.findElement(By.xpath("//*[@id='effectiveDate']"));
                strDate.click();
                strDate.clear();
                strDate.sendKeys("05/04/2024");
            } catch (Exception e) {
                System.out.println("Unable to enter Start Date: " + e);
            }//end of policy start date exception
        }//wait for 2 seconds
        Thread.sleep(2000);

        //click on First Name
        try {
            driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(firstName.get(i));
        } catch (Exception e) {
            System.out.println("Unable to click on First Name: " + e);
        }//end of first name exception
    //wait for 2 seconds
        Thread.sleep(2000);

        //click on Last Name
        try {
            driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(firstName.get(i));
        } catch (Exception e) {
            System.out.println("Unable to click on Last Name: " + e);
        }//end of last name exception
        //wait for 2 seconds
        Thread.sleep(2000);

        //enter valid street address
        try {
            driver.findElement(By.xpath("//*[@id='street']")).sendKeys("20 Water Grant");
        } catch (Exception e) {
            System.out.println("unable to enter street address" + e);
        }//end of try catch street address
        //wait for 2 seconds
        Thread.sleep(2000);

        //enter date of birth
        try {
            driver.findElement(By.xpath("//*[@id='dateOfBirth']")).sendKeys("06/17/1975");
        } catch (Exception e) {
            System.out.println("unable to enter DOB" + e);
        }//end of try catch street address
        // wait for 2 seconds
        Thread.sleep(2000);

        //define the javascript executor
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        try {
            //scroll into the webelement, we need to define continue button into webelement
            WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));

            //scroll into view of the continue button
            jse.executeScript("arguments[0].scrollIntoView(true);", contButton);
            Thread.sleep(2000);
            contButton.click();
        } catch (Exception e) {
            System.out.println("unable to click continue" + e);
        }//end of try catch continue
        Thread.sleep(2000);

        //click continue again
        try {
            //scroll into the webelement, we need to define continue button into webelement
            WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));
            contButton.click();
        } catch (Exception e) {
            System.out.println("unable to click continue" + e);
        }//end of try catch continue

        //select value for fire protection
        try{
            WebElement fireProtection = driver.findElement(By.xpath("//*[@id = 'fireProtectionAreaNameSelectId']"));
            Select fireProtectionDropDown = new Select(fireProtection);
            fireProtectionDropDown.selectByIndex(1);
        } catch (Exception e) {
            System.out.println("Unable to select Fire Protection from dropdown " + e);
        }//end of fire protection
        Thread.sleep(2000);

//click continue again
        try {
            //scroll into the webelement, we need to define continue button into webelement
            WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));
            contButton.click();
        } catch (Exception e) {
            System.out.println("unable to click continue" + e);
        }//end of continue button

//capture personal info message
        try {
            String prsnlMessage = driver.findElement(By.xpath("////click on add co applicant
            try {
                //click on add co-op applicant
                driver.findElement(By.xpath("//*[@id = 'addApplicantModuleNewAdd']")).click();
            } catch (Exception e) {
                System.out.println("unable to click add applicant" + e);
            }//end of applicant info

            Thread.sleep(2000);

//enter co first name
            try {
                driver.findElement(By.xpath("//*[@name ='additionalApplicants[0].client.firstName']")).sendKeys(coFirstName.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter first name" + e);
            }//end of try catch for first name

            Thread.sleep(2000);
//enter co last name
            try {
                driver.findElement(By.xpath("//*[@name= 'additionalApplicants[0].client.lastName']")).sendKeys(coLastName.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter last name" + e);
            }//end of try catch for last name

            Thread.sleep(2000);

//click continue again
            try {
                //scroll into the webelement, we need to define continue button into webelement
                WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));
                contButton.click();
            } catch (Exception e) {
                System.out.println("unable to click continue" + e);
            }//end of continue button
        }//end of for loop
    }//end of main
}//end of class

try {
String errorMessage = driver.findElement(By.xpath("//*[@id='sfx_global_alert']")).getText();
    System.out.println("Error message is " + errorMessage);
}catch (Exception e) {
        System.out.println("unable to capture error message " + e);
}//end of error message

        Thread.sleep(2000);


    }//end of main
}//end of class

 */
