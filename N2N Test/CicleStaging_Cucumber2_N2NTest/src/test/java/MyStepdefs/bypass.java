package MyStepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.testUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class bypass {
    public static WebDriver driver;
    @Before
    public static void bypasslogin() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-extension");
        options.addArguments("--disable-plugins-discovery");
        options.addArguments("--profile-directory=Default");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("user_agent=DN");
        options.addArguments("user-data-dir=C:/Users/62812/AppData/Local/Google/Chrome/User Data");
        options.addArguments("profile-directory=default");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://staging.cicle.app/");
        driver.manage().timeouts().pageLoadTimeout(testUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(testUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);


    }
    @After
    public static void tearDown() {
        driver.quit();
    }
}