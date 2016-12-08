package PageObjects

import Setup.CommonFunctions
import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import org.testng.Assert

import java.util.concurrent.TimeUnit

class PAGE_HomePage extends PAGE_Base {

    @Test
    public void testLogoLink()
    {
        driver.findElement(By.xpath(Constants.homepage_logo_xpath)).click()
        String getUrl=driver.getCurrentUrl()
        Assert.assertEquals(getUrl,Constants.jobseggUrl)
    }
    @Test
    public void JobsLinkCheck()
    {
        driver.findElement(By.linkText(Constants.homepage_Jobs_linktext)).click()
        Thread.sleep(2000)


    }
    @Test
    public void CompaniesLinkCheck()
    {
        driver.findElement(By.linkText(Constants.homepage_Companies_linktext)).click()
    }

    @Test
    public void PostJobLinkCheck()
    {
        driver.findElement(By.linkText(Constants.homepage_Postajob_linktext)).click()
    }
    @Test
    public void ResumeSearchCheck()
    {
        driver.findElement(By.linkText(Constants.homepage_ResumeSearch_LinkText)).click()
    }


    @Test
        public void CreateAlert()
        {
            driver.findElement(By.cssSelector(Constants.homepage_EmailtoCreateAlert_css)).sendKeys("rojareddycr@gmail.com")
            Select Dropdown = new Select(driver.findElement(By.xpath(Constants.homepage_daily_xpath)))
            Dropdown.selectByValue("monthly")
            driver.findElement(By.xpath("//input[@value='Create alert']")).submit()

        }
     @Test
    public void RefineSearch1()
     {
         driver.findElement(By.xpath(Constants.homepage_FindJobs_Xpath)).click()
         List<WebElement> RefineTypes = driver.findElements(By.className("refine-search__item"))
         println(RefineTypes.size())
         Thread.sleep(5000)
         driver.findElement(By.linkText("Refine by Job Type")).click()
        Thread.sleep(5000)

         WebElement element
         element = driver.findElement(By.xpath(".//*[@id='refine-block-EmploymentType']/a[1]/span[1]"))
                println("Is Full Time Displayed  " +element.isDisplayed())

         element = driver.findElement(By.xpath(".//*[@id='ajax-refine-search']/div/div[3]/a"))
         println("Is Refine by Categories Enabled  " +element.isEnabled())

         element = driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div/div[3]/button"))
         println("Is Load More Button Selected " +  element.isSelected())


         element = driver.findElement(By.linkText("Twitter"))
         println("Location of Twitter " + element.getLocation())
         println(element.getTagName())






    }


}
