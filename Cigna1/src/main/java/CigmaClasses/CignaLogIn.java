package CigmaClasses;

import fameWork.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CignaLogIn extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a")
    WebElement longin;
    @FindBy(xpath ="//*[@id=\"username\"]")
    WebElement enteremail;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"csng-search-header\"]/search-header-bar/form/div/cigna-typeahead/input")
    WebElement searchmedicaltool;

    public void setLongin(){
        longin.click();
    }

  public void setEnteremail(){
        enteremail.sendKeys("roche87@gmail.com");
    }
    public void setPassword(){
        password.sendKeys("12345");
    }

    public void setSearchmedicaltool(){
        searchmedicaltool.sendKeys("medical tools");
    }
}



