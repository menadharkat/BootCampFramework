package amazonPackTest;

import amazonPack.Account;
import fameWork.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AccountTest extends CommonAPI {
    Account account;

    @BeforeMethod
    public void initi(){
       account= PageFactory.initElements(driver,Account.class);

    }
    @Test
    public void SetloginTest(){
    account.setAcountclick();
    account.setlogein("menad@gmail.com","password");
    sleepFor(3);

    }



}
