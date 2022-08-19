import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Multiple_windows {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vk sinha\\Downloads\\chromedriver_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.WINDOW);

        //switching windows
        Set<String> handles= driver.getWindowHandles();
        Iterator<String> it= handles.iterator();
        String parent_id =it.next();
        String child_id = it.next();
        driver.switchTo().window(child_id);

        driver.get("https://www.rahulshettyacademy.com/");
        String courseName= driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();

        driver.switchTo().window(parent_id);
        driver.findElement(By.name("name")).sendKeys(courseName);

        //screenshot for particular element
        WebElement name=driver.findElement(By.name("name"));
        File downaloadableFile=name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(downaloadableFile,new File("logo.png"));

        //height and width of element text box
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());
    }
}
