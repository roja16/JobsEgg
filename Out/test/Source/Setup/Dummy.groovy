package Setup

import org.openqa.selenium.WebDriver

/**
 * Created by asapu on 12/4/2016.
 */
class Dummy {
    public static void main(String[] args)
    {
        WebDriver driver=DriverCreation.getChromeDriver()
        driver.get("https://www.jobsegg.com/")
        driver.close()
    }
}
