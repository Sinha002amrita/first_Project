package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practicefile2 {


    @Test (dataProvider="testdata")
    public void getdata(String username, String password) {
        System.out.println("Here You are- The World");
        System.out.println(username);
        System.out.println(password);
    }

    @BeforeTest
    public void display() {
        System.out.println("Display- Your Name");
    }

    @Parameters("Apikey")
    @Test(groups = {"smoketest"})
    public void show(String key) {
        System.out.println("You are a genius");
        System.out.println("APIkey is :" + key);
    }

    @DataProvider
    public Object[][] testdata() {
        Object[][] data=new Object[3][2];
        data[0][0]="user1";
        data[0][1]="pwd1";

        data[1][0]="user2";
        data[1][1]="pwd2";

        data[2][0]="user3";
        data[2][1]="pwd3";
        return data;
    }
}
