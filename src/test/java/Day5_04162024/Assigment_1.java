package Day5_04162024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_1 {
    public static void main(String[] args) throws InterruptedException {
        //define driver
        WebDriver driver = new ChromeDriver();
        //navigate to Bing.com
        driver.navigate().to("https://www.bing.com");
        //type car in the search box
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("cars");
        //click buttom to submit
        driver.findElement(By.xpath("//*[@id = 'sb_form_q']")).submit();
        //pause for 2 seconds
        Thread.sleep(2000);
        //store the search result into a string variable
        String searchResult = driver.findElement(By.id("b_tween_searchResults")).getText();
        //declare an array to store the split message
        String[] splitmessagearray = searchResult.split(" ");
        //print out only number from the string
        System.out.println("the number is " + splitmessagearray[1]);
        //Click the buttom on More
        driver.findElement(By.xpath("//*[@id = 'b_sp_menu_separ']")).click();
        //click on my Bing
        driver.findElement(By.id("b-scopeListItem-bingpages")).click();
        //pause for 3 second
        Thread.sleep(3000);
        System.out.println("to see your profile " + searchResult);
        //quit chrome
       driver.quit();
    }//end of main
}//end of class
