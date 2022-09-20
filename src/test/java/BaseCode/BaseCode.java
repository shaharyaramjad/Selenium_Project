package BaseCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import ExtentReport.ExtentReportsBasic;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

@Listeners(ExtentReportsBasic.class)
public class BaseCode extends ExtentReportsBasic {

    public static WebDriver driver;
    public static Properties prop = new Properties();
    public static FileReader fr;
    public static FileReader fr1;

    @BeforeTest
    public void setUp() throws IOException {

        System.out.println("SetUp successful");

        if (driver == null) {
            System.out.println(System.getProperty("user.dir"));
            FileReader fr = new FileReader("C:\\Users\\VenD-Shahryar\\Desktop\\Selenium_Project\\src\\main\\resources\\Chrome_config.properties");
            FileReader fr1 = new FileReader("C:\\Users\\VenD-Shahryar\\Desktop\\Selenium_Project\\src\\main\\resources\\locaters.properties");
            prop.load(fr);
            prop.load(fr1);
        }

        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(prop.getProperty("testurl"));

        }
        else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get(prop.getProperty("testurl"));


        }
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
        System.out.println("Teardown successful");
    }
}
