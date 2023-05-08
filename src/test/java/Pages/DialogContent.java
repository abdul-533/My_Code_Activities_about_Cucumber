package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

//POM: Page Object Model
public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement userName;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;


    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement succesmsg;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortNameInput;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement existMsg;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;


    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;


    @FindBy(xpath = "//input[@data-placeholder='Integration Code']")
    private WebElement integrationCode;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[2]")
    private WebElement priority;

    @FindBy(xpath = "(//mat-slide-toggle[@formcontrolname='active']")
    private WebElement toggleBar;

    @FindBy(xpath = "//mat-select//span[text()='Academic Period']")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option/span)[1]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "(//span[text()='Grade Level'])[1]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-option//span)[2]")
    private WebElement gradeLevel1;

    @FindBy(xpath = "( //input[@data-mat-calendar='mat-datepicker-4']")
    private WebElement regStart;

    @FindBy(xpath="//tr[contains(@class, 'mat-row')]/td[2]")
    public List<WebElement> nameList;



    public void deleteItem(String searchText) {
        sendKeysFunction(searchInput, searchText);
        clickFunction(searchButton);
        //beklet

        // stale element bayatlamish element hatasini cozmek icin yapicaz
        // wait.until(ExpectedConditions.elementToBeClickable(searchButton)); // bu tam ishimizi goremz

        //yukarda serche tiklandiqinda yuklenen bolumu aldik o null olanakadar bekleme yapicaz

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);
    }

    public WebElement getWebElement(String button) {
        switch (button) {
            case "addButton":
                return addButton;
            case "saveButton":
                return saveButton;
            case "nameInput":
                return nameInput;
            case "codeInput":
                return codeInput;
            case "integrationCode":
                return integrationCode;
            case "priority":
                return priority;
            case "toggleBar":
                return toggleBar;
            case "addPeriod":
                return academicPeriod;
            case "addPeriod1":
                return academicPeriod1;
            case "gradeLevel":
                return gradeLevel;

            case "gradeLevel1":
                return gradeLevel1;

        }
        return null;
    }

    //ms-text-field[@formcontrolname='shortName']/input


//    public void findAndSend(/*String strElemetAdi*/WebElement element, String text) {
//
////        WebElement myElement = null;
////        if (strElemetAdi == "username")
////            myElement = userName;
////
////        if (strElemetAdi == "password")
////            myElement = password;
////
////        sendKeysFunction(myElement, text);
//
//        sendKeysFunction(element, text);
//
//    }
//
//    public void findAndClick(WebElement element) {
//        clickFunction(element);
//
//    }


}
