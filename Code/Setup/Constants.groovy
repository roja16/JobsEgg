package Setup

class Constants {
    /*
      Elements are represented in the format : PAGE NAME_ELEMENT NAME_ELEMENT IDENTIFIER
     */

    //Home Page variables
    public static final String jobseggUrl="https://www.jobsegg.com/"
    public static final String homepage_logo_xpath=".//*/a/img"
    public static final String homepage_Jobs_linktext="Jobs"
    public static final String homepage_Companies_linktext="Companies"
    public static final String homepage_Postajob_linktext="Post a Job"
    public static final String homepage_ResumeSearch_linktext="Resume Search"
    public static final String homepage_Pricing_linktext="Pricing"
    public static final String homepage_Sigin_linktext="Sign in"
    public static final String homepage_Signup_linktext="Sign up"

    public static final String homepage_Keywords_id="keywords"
    public static final String homepage_Location_Xpath="//input[@id='GooglePlace']"
    public static final String homepage_FindJobs_Xpath="//div[3]//form/div[3]/button"
    public static final String homepage_ViewAllJobs_LinkText ="View all job"
    public static final String homepage_JobBYCategory_xpath="//a[text()='Jobs by Category']"
    public static final String homepage_JobBYCity_xpath="//a[text()='Jobs by City']"
    public static final String homepage_JobBYState_xpath="//a[text()='Jobs by State']"
    public  static final String homepage_EmailtoCreateAlert_css="input[class='form-control']"
    public static final String homepage_CreateAlert_Button_xpath ="//input[@value='Create alert']"
    public static final String homepage_daily_xpath="//select[@name='email_frequency']"

    //Signin Page
    public static final String Signin_Page_Email ="input[name='username']"
    public static final String signin_page_password ="//input[@name='password']"
    public static final String signin_page_radiobutton ="//input[@id='keep']"
    public static final String signin_Page_button ="//input[@value='Sign in']"

   }

