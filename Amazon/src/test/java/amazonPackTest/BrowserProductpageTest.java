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
        browseProductpage .setSearchfield1("guitare gofin");
        browseProductpage .setSearch();
        browseProductpage .setGlasses();
        browseProductpage .setAddcart();
        sleepFor(3);
        browseProductpage .setCheckout();
        sleepFor(3);
        browseProductpage .setEmail("menad@gmail.com");
        sleepFor(3);
        browseProductpage .setPassword("Apassword123");
        browseProductpage .setSubmit();
        sleepFor(3);
    }
}
