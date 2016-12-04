package Setup

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.edge.EdgeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxProfile

class DriverCreation {

    public static WebDriver getChromeDriver()
    {
        System.setProperty("webdriver.chrome.driver","dependencies\\chromedriver.exe")
        WebDriver driver=new ChromeDriver(ConfigureCapabilities.getChromeOptions())
        return driver
    }
    public static WebDriver getEdgeDriver()

    {
        System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
        WebDriver driver=new EdgeDriver()
        return driver
    }
    public static WebDriver getFireFoxDriver() {

        WebDriver driver = new FirefoxDriver()
        return driver
    }
}
