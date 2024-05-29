package Day15_05212024;

import Day13_05132024.TestParent;
import Day14_05202024.ReusableMethods_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class AI_UHC_ReusableMethod extends TestParent {
    @Test
    public void UnitedHealthCare(){
        driver.navigate().to("https://www.uhc.com");
        //enter a keyword on search field
        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"//*[@id='signInButton_CustomDropdown_Btn']","Sign in","UHC Search Field");
        //enter a keyword on search field
        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"//*[@id='search-desktop']","member resources","UHC Search Field");
        //click on UHC Search button
       // ReusableMethods_Loggers.submitMethod(driver,logger,"//*[@id='searchIcon']","UHC Search Button");
        //click on  claims payment
        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"//*[@class='h3 position-relative color-blueDigital']","member resources","UHC Search Field");
        //click on UHC Search button
        ReusableMethods_Loggers.submitMethod(driver,logger,"//*[text()='noopener']","UHC Search Button");
        //capture the search results
        String results = ReusableMethods_Loggers.captureText(driver,logger,"//*[@class='search-results-count']","UHC Search Results");
        System.out.println("My search Result is " + results);
        logger.log(LogStatus.INFO,"My search Result is " + results);
    }//end of main
}
