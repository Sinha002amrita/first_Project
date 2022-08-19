import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class class1 {
     public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vk sinha\\Downloads\\chromedriver_updated\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();

         driver.get("https://rahulshettyacademy.com/angularpractice/");
         //above element
         WebElement text=driver.findElement(By.name("email"));
         System.out.println(driver.findElement(with(By.tagName("label")).above(text)).getText());

         //below element
         WebElement nameEditbox= driver.findElement(By.cssSelector("[name='name']"));
         driver.findElement(with(By.tagName("input")).below(nameEditbox)).sendKeys("hey@test.com");

         //to leftof element
         WebElement markCheckbox= driver.findElement(By.cssSelector("[for='exampleCheck1']"));
         driver.findElement(with(By.tagName("input")).toLeftOf(markCheckbox)).click();

         //to rightof element
         WebElement markRadio= driver.findElement(By.cssSelector("[for='exampleFormControlRadio1']"));
         driver.findElement(with(By.tagName("input")).toRightOf(markRadio)).click();
     }
}
