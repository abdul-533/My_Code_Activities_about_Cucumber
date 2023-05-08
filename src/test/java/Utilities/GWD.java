package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {
    public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    // boyle olunca statik olucak amma her bir thredin kendine
    // ozel olucak
    //Webdriver 1
    //Webdriver2...

    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    //threadDriver.get(): // driveri verir
    //threadDriver.set(driver):->bulunduqu threade driver set eder


    public static WebDriver getDriver() {
// extra rapor turkce bilgi calishmasi sebebile koyuldu
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        //diyer seneryolar icin cunki browser tipi her zaman gelmiyicek diye yapicaz
        if (threadBrowserName.get() == null)
            threadBrowserName.set("chrome");


        if (threadDriver.get() == null) {
            switch (threadBrowserName.get()) {
                case "firefox":
                    threadDriver.set(new FirefoxDriver());

                    break;
                case "safari":
                    threadDriver.set(new SafariDriver());
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;



                default:
                    //chrome
                    ChromeOptions options = new ChromeOptions();
                    //options.addArguments("--remote-allow-origins=*");
                    options.addArguments("--remote-allow-origins=*","--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                    threadDriver.set(new ChromeDriver(options));   // yoksa buraya bir tane set et
                    break;
            }

        }

        threadDriver.get().manage().window().maximize();
        return threadDriver.get();

    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (threadDriver.get() != null) {  //dolu ise yani bosh deyilse
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }

    }

    public static void threadBrowserSet(String browser) {
        threadBrowserName.set(browser);


    }

    public static String threadBrowserGet(){
        return threadBrowserName.get();
    }

}
