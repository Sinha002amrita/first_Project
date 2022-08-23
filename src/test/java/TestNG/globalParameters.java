package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class globalParameters {

    public static void main(String[] args) throws IOException {

        Properties prop =new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\vk sinha\\IdeaProjects\\first_Project\\src\\test\\java\\TestNG\\data.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));

    }
}
