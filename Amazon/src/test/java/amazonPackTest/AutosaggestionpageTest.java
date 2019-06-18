package amazonPackTest;

import amazonPack.Autosuggestionpage;
import fameWork.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutosaggestionpageTest extends CommonAPI {

    Autosuggestionpage autosuggestionpage;

    @BeforeMethod
    public void init(){
        autosuggestionpage = PageFactory.initElements(driver,Autosuggestionpage.class);
    }
    @Test
    public void setDealsTest(){
        autosuggestionpage.setDeals();
        autosuggestionpage.setDetails();
        autosuggestionpage.setVerify();
        autosuggestionpage.setEmail("menad");
        autosuggestionpage.setPass("pass123");
        autosuggestionpage.setSubmit();
    }
}

