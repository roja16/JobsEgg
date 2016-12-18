package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.openqa.selenium.WebDriver

import java.util.concurrent.TimeUnit

class PAGE_Base {

     WebDriver driver


    @Before
    public void openBrowser()
    {
        driver=DriverCreation.getChromeDriver()
        driver.get(Constants.jobseggUrl)
        driver.manage().window().maximize()
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS)
    }
    @After
    public void closeBrowser()
    {
        driver.close()
    }
}
