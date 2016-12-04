package Setup

import org.openqa.selenium.chrome.ChromeOptions

/**
 * Created by Rocky on 6/9/2016.
 */
class ConfigureCapabilities {
    public static ChromeOptions getChromeOptions()
    {
        //To disable extensions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("disable-plugins");
        options.addArguments("--disable-extensions");
        return options;
    }
}
