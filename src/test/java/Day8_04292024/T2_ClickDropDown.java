package Day8_04292024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T2_ClickDropDown {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("Full Screen");
        WebDriver driver = new ChromeDriver(options);

        //navigate to morgage calculator site
        driver.navigate(). to("https://www.mortgagecalculator.org");
        //wait few minutes for the browser session to load up
        Thread.sleep(3000);
        //enter home value
        driver.findElement(By.xpath("//*[@id='homeval']")).sendKeys("450000");
        //enter down payment
        driver.findElement(By.xpath("//*[@id='downpayment']")).sendKeys("100000");
        //click in start month dropdown
        driver.findElement(By.xpath("//*[@name='param[start_month]']")).click();
        //click on dropdown value May by usingxpath text
        driver.findElement(By.xpath("//*[text()='May']")).click();

}//end of main
}//end of class
