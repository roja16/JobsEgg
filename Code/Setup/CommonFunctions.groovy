package Setup

import PageObjects.PAGE_Base
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class CommonFunctions {


    public static void  signinCheck(WebDriver driver)
    {
        driver.findElement(By.linkText(Constants.homepage_Signin_linktext)).click()

    }


    public static void findJobs(WebDriver driver)
    {
        driver.findElement(By.id(Constants.homepage_Keywords_id)).sendKeys("Quality Assurance")
        driver.findElement(By.xpath(Constants.homepage_Location_Xpath)).sendKeys("Minnesota")
        Thread.sleep(1000)
        driver.findElement(By.xpath(Constants.homepage_FindJobs_Xpath)).click()

    }

    public static void findJobs(WebDriver driver, String keyword, String location)
    {
        driver.findElement(By.id(Constants.homepage_Keywords_id)).sendKeys(keyword)
        driver.findElement(By.xpath(Constants.homepage_Location_Xpath)).sendKeys(location)
        Thread.sleep(1000)
        driver.findElement(By.xpath(Constants.homepage_FindJobs_Xpath)).click()

    }
}
