package Day6_042222024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class T1_GoogleForLoop {
    public static void main(String[] args) throws InterruptedException {
        //define driver
        WebDriver driver = new ChromeDriver();
        //Declare the AarrayList
        ArrayList<String> CarBrands = new ArrayList<>();
        CarBrands.add("BMW");
        CarBrands.add("Mercedes");
        CarBrands.add("Toyota");
        for(int i = 0; i < CarBrands.size(); i++) {
            //navigate to google.com
            driver.navigate().to("https://www.google.com");
            //type car in the search box
            driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys((CarBrands.get(i)));
            //click buttom to submit
            driver.findElement(By.xpath("//*[@name = 'btnK']")).submit();
            //pause for 2 seconds
            Thread.sleep(2000);
            //store the search result into a string variable
            String searchResult = driver.findElement(By.xpath("//*[@id = 'result-stats']")).getText();
            System.out.println("Search Result is " + CarBrands.get(i) + " is " + searchResult);
        } //end of loop
        //quit chrome
        driver.quit();
    }//end of main
}//end on class

