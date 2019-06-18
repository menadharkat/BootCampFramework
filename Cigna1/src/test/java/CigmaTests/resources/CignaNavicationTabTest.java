package CigmaTests.resources;

import CigmaClasses.CignaNavigationTab;
import fameWork.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CignaNavicationTabTest extends CommonAPI {
    CignaNavigationTab cignaNavicationTab;

    @BeforeMethod
    public void init() {
        cignaNavicationTab = PageFactory.initElements(driver, CignaNavigationTab.class);
    }





    @Test(priority = 2)
    public void setIndivFamily () {
        cignaNavicationTab.setIndivFamily();
    }
    @Test(priority = 3)
    public void setempBroker(){
        cignaNavicationTab.setEmpBroker();
    }
    @Test(priority = 4)
    public void sethealthprovider(){
        cignaNavicationTab.setHealthprovider();
    }
    @Test(priority = 5)
    public void setmedicaltool(){
        cignaNavicationTab.setSearchmedicaltool();
    }
}

