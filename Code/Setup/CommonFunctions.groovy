package Setup

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class CommonFunctions {

    /*
      Method : Navigate to Home page
     */
    public static void navigateToHomePage(WebDriver driver)
    {
        driver.get(Constants.jobseggUrl)
    }

    /*
   Method : Navigate to Job page
  */
    public static void navigateToJobPage(WebDriver driver)
    {
        driver.findElement(By.linkText(Constants.homepage_Jobs_linktext)).click()
    }

    /*
   Method : Navigate to Companies page
  */
    public static void navigateToCompaniesPage(WebDriver driver)
    {
        driver.findElement(By.linkText(Constants.homepage_Companies_linktext)).click()
    }

    /*
   Method : Navigate to post a job page
  */
    public static void navigateToPostAJobPage(WebDriver driver)
    {
        driver.findElement(By.linkText(Constants.homepage_Postajob_linktext)).click()
    }

    /*
   Method : Navigate to Resume Search page
  */
    public static void navigateToResumeSearchPage(WebDriver driver)
    {
        driver.findElement(By.linkText(Constants.homepage_ResumeSearch_linktext)).click()
    }

    /*
   Method : Navigate to Pricing page
  */
    public static void navigateToPricingPage(WebDriver driver)
    {
        driver.findElement(By.linkText(Constants.homepage_Pricing_linktext)).click()
    }

}
