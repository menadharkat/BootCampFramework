package CigmaClasses;

import fameWork.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CignaNavigationTab  extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[1]/a")
    WebElement indivFamily;
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[2]/a")
    WebElement empBroker;
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[3]/a")
    WebElement healthprovider;
    @FindBy(xpath = "//*[@id=\"csng-search-header\"]/search-header-bar/form/div/cigna-typeahead/input")
    WebElement searchmedicaltool;

    public void setIndivFamily(){
        indivFamily.click();
    }
    public void setEmpBroker(){
        empBroker.click();
    }
    public void setHealthprovider(){
        healthprovider.click();
    }
    public void setSearchmedicaltool(){
        searchmedicaltool.sendKeys("medical tools");
    }
}
