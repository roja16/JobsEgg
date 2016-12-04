package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

class PAGE_HomePage {
    WebDriver driver=null;
    @Before
    public void openBrowser()
    {
        driver=DriverCreation.getChromeDriver()
        driver.get(Constants.jobseggUrl)
        driver.manage().window().maximize()
    }
    @Test
    public void testLogoLink()
    {
        driver.findElement(By.xpath(Constants.homepage_logo_xpath)).click()
        String getUrl=driver.getCurrentUrl()
        Assert.assertEquals(getUrl,Constants.jobseggUrl)
    }
    @Test
    public void homepageCheck()
    {
        driver.findElement(By.linkText(Constants.homepage_Jobs_linktext)).click()
        Thread.sleep(2000)
    }
    @After
    public void closeBrowser()
    {
        driver.close()
    }
}
