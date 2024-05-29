package Day13_05132024;

import Day11_05072024.ReusableMethods;
import org.testng.annotations.Test;

import java.sql.Driver;

public class fidelisCare_AI extends TestParent {
    @Test(priority = 1)
    public void tc001_searchForfidelisMember() throws InterruptedException {
        //navigate to fidelis care home page
        driver.navigate().to("https://www.fideliscare.org/");
        //click on search element on top right
        ReusableMethods.clickMethod(driver, "//*[@class = 'fal fa-search']", "search");
        //wait for a few second
        Thread.sleep(2000);
        ReusableMethods.clickMethod(driver, "//*[@class = 'form-control search-input']", "searchfideliscaremember");
        //search for fidelis member
        ReusableMethods.sendKeysMethod(driver, "//*[@class = 'form-control search-input']", "fidelis care member", "fidelismember");
        //wait for a few second
        Thread.sleep(2000);
        ReusableMethods.clickMethod(driver, "//*[@class = 'btn btn-primary btn-search']", "click");
        String searchResult = ReusableMethods.captureText(driver, "//*[@class = 'gsc-result-info']", "Result");
        String[] splitSearchNumber = searchResult.split(" ");
        //print out the result
        System.out.println("search Result is " + splitSearchNumber[1]);
        ReusableMethods.clickMethod(driver, "//*[text() = 'Fidelis Care Members']", "clickfidelis");
        //wait for a few second
        Thread.sleep(2000);
    }//end of test case 1

        @Test(dependsOnMethods = "tc001_searchForfidelisMember")
                public void tc002_switchToTab() throws InterruptedException {
        //switch to tab
            ReusableMethods.switchToTabByIndex(driver,1,"tab");
            ReusableMethods.scrollByPixelMethod(driver, "scrollBy");
            //wait for a few second
            Thread.sleep(2000);
            String renewalCoverage = ReusableMethods.captureText(driver, "//*[@id = 'dnn_ctr4169_View_ScopeWrapper']", "renewCoverage");
            //split message to only print renew your coverage
            String [] renewSplit = renewalCoverage.split("Questions");
           //print out renew your coverage
            System.out.println("RENEW YOUR COVERAGE RESULT IS " + renewSplit[0]);
            //click on renew help
            ReusableMethods.clickMethod(driver,"//*[contains(text(),'Renewal Help')]", "renewalhelpicon");
            //wait a few seconds
            ReusableMethods.scrollByPixelMethod(driver, "scrollBy");
            Thread.sleep(2000);
            ReusableMethods.clickMethod(driver, "//*[contains(text(), 'When do you need to renew your coverage?')]", "when to renew coverage");
            Thread.sleep(2000);
            String renewCoverageMessage = ReusableMethods.captureText(driver, "//*[@style = 'display: block;']", "renewcoverage");
            System.out.println("renew coverage message is " + renewCoverageMessage);
            ReusableMethods.clickMethod(driver, "//*[contains(text(), 'When do you need to renew your coverage?')]", "when to renew coverage");
            Thread.sleep(2000);
            ReusableMethods.clickMethod(driver, "//*[contains(text(),'What information do you need to renew your coverage?')]", "infotorenew");
            String infoToRenew = ReusableMethods.captureText(driver, "//*[@style = 'display: block;']", "renewcoverageinfo");
            String [] infoSplit = infoToRenew.split("information:");
            //print out info to renew
            System.out.println("INFO TO RENEW COVERAGE MESSAGE " + infoSplit[1]);
            driver.close();
            Thread.sleep(2000);
        }//end of test case 2

            @Test(dependsOnMethods = {"tc001_searchForfidelisMember", "tc002_switchToTab" })
    public void tc003_switchToTabByIndex() throws InterruptedException {
        //switch back to the defult tab
                ReusableMethods.switchToTabByIndex(driver, 0, "defaulttab");
                ReusableMethods.scrollByPixelMethod(driver, "scrollBy");
                //wait for a few second
                Thread.sleep(2000);
                //click on login
                ReusableMethods.clickMethod(driver, "//*[@class = 'tool dropdown login']", "login");
                //click n member portal
                Thread.sleep(2000);
                ReusableMethods.clickMethod(driver, "//*[@rel = 'noopener noreferrer']", "memberportal");
                //new tab
                ReusableMethods.switchToTabByIndex(driver, 1,"newtab");
                Thread.sleep(2000);
                //capture the text
               String  helpfulHints = ReusableMethods.captureText(driver,"//*[@id = 'dnn_ctr5328_ContentPane']", "hints");
               System.out.println("MY HELPFUL HINTS Message is: " + helpfulHints);
               Thread.sleep(2000);
               driver.close();
    }//end of test case 3

}//end of class
