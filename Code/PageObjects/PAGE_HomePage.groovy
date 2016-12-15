package PageObjects

import Setup.CommonFunctions
import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.Point
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert



class PAGE_HomePage extends PAGE_Base {
    PAGE_HomePage homePage;
    @Test
    public void testLogoLink()
    {
//        homePage=new PAGE_HomePage()
//        WebElement e=driver.findElement(By.id("lst-ib"))
//        e.sendKeys("HB*&(&(")
//        homePage.homepageCheck()
        CommonFunctions.navigateToHomePage(driver)
        CommonFunctions.navigateToCompaniesPage(driver)
        CommonFunctions.navigateToJobPage(driver)
        CommonFunctions.navigateToPostAJobPage(driver)
        CommonFunctions.navigateToPricingPage(driver)
        CommonFunctions.navigateToResumeSearchPage(driver)
    }

    public void homepageCheck()
    {
        driver.findElement(By.linkText(Constants.homepage_Jobs_linktext)).click()
        Thread.sleep(2000)
    }

}
