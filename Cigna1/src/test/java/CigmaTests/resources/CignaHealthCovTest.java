package CigmaTests.resources;

import CigmaClasses.CignaHealthCov;
import fameWork.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CignaHealthCovTest extends CommonAPI {
    CignaHealthCov cignaHealthCov;
    @BeforeMethod
    public void init(){ cignaHealthCov = PageFactory.initElements(driver, CignaHealthCov.class);}
    @Test(priority = 5)
    public void setindivfamilyHI(){
        cignaHealthCov.setIndivFamilyHealthInsurance();
    }
    @Test(priority = 6)
    public void setdentalinsuarnce(){
        cignaHealthCov.setDentalInsurance();
    }
    @Test(priority = 7)
    public void setmedicalplan(){
        cignaHealthCov.setMedicarePlan();
    }
    @Test(priority = 8)
    public void setmedicaresuplemplan(){
        cignaHealthCov.setMedicareSuplemPlan();
    }
    @Test(priority = 9)
    public void setinternationalahealthplan(){
        cignaHealthCov.setInternationHealthInsurance();
    }


}


