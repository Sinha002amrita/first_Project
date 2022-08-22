package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practicefile1 {


    @BeforeTest
    public void demo_login() {
        System.out.println("Hello, you are at Login page");
    }

    @AfterTest
    public void demo_logout() {
        System.out.println(" You logged out");
    }

    @Parameters("url")
    @Test
    public void stay(String url) {
        System.out.println(" You are on homepage");
        System.out.println(url);
    }

    @Test(groups = {"smoketest"})
    public void new_sample() {
        System.out.println("This is sample");
    }
}
