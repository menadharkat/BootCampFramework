package CigmaClasses;

import fameWork.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CignaHealthCov extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[1]/div[2]/a")
    WebElement IndivFamilyHealthInsurance;
    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[2]/div[2]/a")
    WebElement DentalInsurance;
    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[3]/div[2]/a")
    WebElement MedicarePlan;
    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[3]/div[2]/a")
    WebElement MedicareSuplemPlan;
    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[6]/div[2]/a")
    WebElement InternationHealthInsurance;


    public void setIndivFamilyHealthInsurance(){
        IndivFamilyHealthInsurance.click();

    }
    public void setDentalInsurance(){
        DentalInsurance.click();
    }
    public void setMedicarePlan(){
        MedicarePlan.click();
    }
    public void setMedicareSuplemPlan(){
        MedicareSuplemPlan.click();
    }
    public void setInternationHealthInsurance(){
        InternationHealthInsurance.click();
    }
}





