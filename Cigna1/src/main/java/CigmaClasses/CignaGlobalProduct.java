package CigmaClasses;

import fameWork.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CignaGlobalProduct extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[6]/div[2]/a")
    WebElement InternationHealthInsurance;
    @FindBy(xpath = "//*[@id=\"1438512008862\"]/div/div[5]/header/div/nav/div/ul/li[1]/a")
    WebElement IndividuaINTERlPlan;
    @FindBy(xpath = "//*[@id=\"1438512008862\"]/div/div[5]/header/div/nav/div/ul/li[2]/a" )
    WebElement Employerinterinsurance;
    @FindBy(xpath = "//*[@id=\"1438512008862\"]/div/div[5]/header/div/nav/div/ul/li[3]/a")
    WebElement ProfessionalHealhcare;


    public void setInternationHealthInsurance(){
        InternationHealthInsurance.click();
    }
    public void setIndividuaINTERlPlan(){
        IndividuaINTERlPlan.click();
    }
    public void setEmployerinterinsurance(){
        Employerinterinsurance.click();
    }
    public void setProfessionalHealhcare(){
        ProfessionalHealhcare.click();
    }
}