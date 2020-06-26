package maven.selenium.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class JavaScriptUtil extends TestCore{
    
    public static void highlightElement(String xpath) throws InterruptedException{
        WebElement element = driver.findElement(By.xpath(xpath));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='2px solid red'", element);
        Thread.sleep(500);
        jse.executeScript("arguments[0].style.border=''", element);
        Thread.sleep(500);
        jse.executeScript("arguments[0].style.border='2px solid red'", element);
        Thread.sleep(500);
        jse.executeScript("arguments[0].style.border=''", element);
    }
    
    public static void highlightElement(WebElement element) throws InterruptedException{
        
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='2px solid red'", element);
        Thread.sleep(500);
        jse.executeScript("arguments[0].style.border=''", element);
        Thread.sleep(500);
        jse.executeScript("arguments[0].style.border='2px solid red'", element);
        Thread.sleep(500);
        jse.executeScript("arguments[0].style.border=''", element);
    }   
}