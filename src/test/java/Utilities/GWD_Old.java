package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD_Old {
    public static WebDriver driver;

    //  @BeforeClass
    // ilk bu
    public static WebDriver getDriver() {
// extra rapor turkce bilgi calishmasi sebebile koyuldu
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if (driver == null) { // 1 kere calishsin diye boyle yapdik
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            //yukardakilar extra chromenin 11 versionundan dolayi lazim
            driver = new ChromeDriver(options);//driveri bashlat bana ver.
        }
        return driver;

    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver != null) {  //dolu ise yani bosh deyilse
            driver.quit();
            driver = null;
        }

    }

}
