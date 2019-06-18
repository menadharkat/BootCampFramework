package CigmaTests.resources;

import CigmaClasses.CignaGlobalProduct;
import fameWork.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CignaGlobalProductTest extends CommonAPI {

  CignaGlobalProduct cignaGlobalProduct;
  public void init(){cignaGlobalProduct = PageFactory.initElements(driver, CignaGlobalProduct.class);
  }
  @Test(priority = 10)
  public void setinternationalahealthplan(){
    cignaGlobalProduct.setInternationHealthInsurance();
  }
  @Test(priority = 11)
  public void setIndividualinterPlan(){
    cignaGlobalProduct.setIndividuaINTERlPlan();
  }
  @Test(priority = 12)
  public void setEmployerINterPlan(){
    cignaGlobalProduct.setEmployerinterinsurance();
  }
  @Test(priority = 13)
  public void setProfessionalhealthcare(){
    cignaGlobalProduct.setProfessionalHealhcare();
  }
}













