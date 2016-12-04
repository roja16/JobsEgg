package PageObjects

import Setup.DriverCreation
import org.openqa.selenium.WebDriver

class PAGE_HomePage {
    public static void main(String[] args)
    {
        WebDriver driver=DriverCreation.getChromeDriver()
        driver.get("https://www.jobsegg.com/")
        driver.close()
    }
}
