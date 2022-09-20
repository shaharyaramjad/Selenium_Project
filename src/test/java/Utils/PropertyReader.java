package Utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\VenD-Shahryar\\Desktop\\Selenium_Project\\src\\main\\resources\\Chrome_config.properties");

        Properties p = new Properties();

        p.load(fr);

        System.out.println(p.getProperty("browser"));
        System.out.println(p.getProperty("testurl"));


    }
}
