package amazonPackTest;

import amazonPack.BrowseProductpage;
import fameWork.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserProductpageTest extends CommonAPI {

    BrowseProductpage browseProductpage;

    @BeforeMethod
    public void init(){
        browseProductpage = PageFactory.initElements(driver,BrowseProductpage.class);
    }
    @Test
    public void setSerachfieldTest(){

        browseProductpage .setSerachfield();
        browseProductpage .setSearchfield1("sun glasses");
        browseProductpage .setSearch();
        browseProductpage .setGlasses();
        browseProductpage .setAddcart();
        sleepFor(2);
        browseProductpage .setCheckout();
        sleepFor(2);
        browseProductpage .setEmail("Akli@Selenium.com");
        sleepFor(2);
        browseProductpage .setPassword("Akli123456");
        browseProductpage .setSubmit();
        sleepFor(2);
    }
}
