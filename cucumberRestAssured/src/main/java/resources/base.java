package resources;
//package resource;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.io.FileInputStream;
//import java.io.FilenameFilter;
//import java.io.IOException;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//public class base {
//    public static WebDriver driver;
//    public static Properties prop;
//
//    public static WebDriver initializeDriver() throws IOException {
////        prop = new Properties();
////        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");
////        prop.load(fis);
//
//        String browserName = prop.getProperty("browser");
//        if(browserName.contains("chrome")) {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        }
//        else if(browserName.contains("firefox")) {
//            WebDriverManager.firefoxdriver().setup();
//            driver = new FirefoxDriver();
//        }
//        else if(browserName.contains("edge")) {
//            WebDriverManager.edgedriver().setup();
//            driver = new EdgeDriver();
//        }
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        return driver;
//    }
//}