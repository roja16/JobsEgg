package PageObjects

import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.openqa.selenium.WebDriver

import java.util.concurrent.TimeUnit

class PAGE_Base {
    WebDriver driver=null;
    @Before
    public void openBrowser()
    {
        driver=DriverCreation.getEdgeDriver()
        driver.get("https://www.google.com/")
        driver.manage().window().maximize()
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS)
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS)
    }
    @After
    public void closeBrowser()
    {
        driver.close()
    }
}
