package Day5_04162024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;

public class T1_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        //define driver
        WebDriver driver = new ChromeDriver();
        //navigate to google.com
        driver.navigate().to("https://www.google.com");
        //type car in the search box
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("cars");
        //click buttom to submit
        driver.findElement(By.xpath("//*[@name = 'btnK']")).submit();
        //pause for 2 seconds
        Thread.sleep(2000);
        //store the search result into a string variable
        String searchResult = driver.findElement(By.xpath("//*[@id = 'result-stats']")).getText();
        System.out.println("Search Result is " + searchResult);
        //quit chrome
        driver.quit();

    }//end of main
}//end on class
