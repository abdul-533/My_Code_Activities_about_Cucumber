package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath="(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExam1;

    @FindBy(xpath = "//span[text()='States']")
    private WebElement states;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement country;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    public WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    public WebElement fee;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement exSetup;

    @FindBy(xpath="(//span[text()='Entrance Exams'])[2]")
    private WebElement enterExam;






    public WebElement getWebElement(String strbutton) {

        switch (strbutton) {
            case "setup":
                return setup;
            case "parameters":
                return parameters;
            case "countries":
                return country;
            case "citizenShip":
                return citizenShip;
            case "nationalities":
                return nationalities;
            case "fee":
                return fee;
            case "entranceExam":return entranceExam1;
            case "exSetup": return exSetup;
            case "enterExam":return enterExam;
            case "states":return states;
        }
        return null;
    }


}
