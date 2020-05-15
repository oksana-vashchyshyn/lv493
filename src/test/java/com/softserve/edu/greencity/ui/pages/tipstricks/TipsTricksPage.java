package com.softserve.edu.greencity.ui.pages.tipstricks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.softserve.edu.greencity.ui.data.Languages;

import com.softserve.edu.greencity.ui.pages.cabinet.MyCabinetPage;
import com.softserve.edu.greencity.ui.pages.common.TopPart;
import com.softserve.edu.greencity.ui.pages.econews.EconewsPage;
import com.softserve.edu.greencity.ui.pages.map.MapPage;
import com.softserve.edu.greencity.ui.tools.NumberItems;
import com.softserve.edu.greencity.ui.tools.QuantityItems;

public class TipsTricksPage extends TopPart {

    private TipsCardsContainer tipsCardsContainer;
    // private ItemComponent itemComponent;

    // Buttons on the TipsTricksPage
    private WebElement startHabitTop;
    private WebElement startHabitCenter;
    private WebElement startHabitBelow;
    private WebElement subscribeOnTipsTricks;

    // field for email for subscribe
    private WebElement enterEmailTipsTricks;

    // Text about amountPeople, quantityBags, quantityCups
    private WebElement amountPeople;
    private WebElement amountBags;
    private WebElement amountCups;
    // private WebElement qrCode;

    // link to MapPage
    private WebElement linkBags;
    private WebElement linkCups;

    // link to EcoNews
    private WebElement mainEcoNewsLink;
    private WebElement other1EcoNewsLink;
    private WebElement other2EcoNewsLink;
    private WebElement allNewsLink;
    
    //Error message
    private WebElement validationError;
    private WebElement subscriptionError;

    // logo GreenCity
    private WebElement logoCreenCity;

    public TipsTricksPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {

        tipsCardsContainer = new TipsCardsContainer(driver);
        // init elements
        startHabitTop = driver
                .findElement(By.xpath("//div[@id='header-left']//button[@class='button primary-global-button']"));
        startHabitCenter = driver
                .findElement(By.cssSelector(".stat-row-content.ng-star-inserted:nth-child(2)> div> button"));
        startHabitBelow = driver
                .findElement(By.cssSelector(".stat-row-content.ng-star-inserted:nth-child(1) > div >button"));
        subscribeOnTipsTricks = driver
                .findElement(By.xpath("//div[@id='form-wrapper']/button[@class='primary-global-button']"));
        enterEmailTipsTricks = driver.findElement(By.xpath("//input[@type='email']"));
        amountPeople = driver.findElement(By.cssSelector("#stats>h2"));
        amountBags = driver.findElement(By.xpath("//app-stat-row/div/div[2]/div/h3"));
        amountCups = driver.findElement(By.cssSelector(".stat-row-content.ng-star-inserted:nth-child(1) > div >h3"));
        // qrCode =
        // driver.findElement(By.xpath("//div[@id='qr-code-wrapper']/img"));
        linkBags = driver.findElement(
                By.xpath(".//div[@class='stat-row-image ng-star-inserted']//following-sibling::div/div/div/a"));
        linkCups = driver.findElement(By.xpath(
                ".//div[@class='stat-row-image ng-star-inserted']//preceding-sibling::div[@class='stat-row-content ng-star-inserted']/div/div/a"));
        mainEcoNewsLink = driver.findElement(By.cssSelector("div#main-event-content > a"));
        other1EcoNewsLink = driver.findElement(By.cssSelector("div#other-events > div:nth-child(1) > a"));
        other2EcoNewsLink = driver.findElement(By.cssSelector("div#other-events > div:nth-child(3) > a"));
        allNewsLink = driver.findElement(By.cssSelector("div#eco-events > a"));
        
        validationError = driver.findElement(By.id("validation-error"));
        subscriptionError =driver.findElement(By.id("subscription-error"));

        // logo GreenCity
        logoCreenCity = driver.findElement(By.cssSelector("div.logo > a[href='#/welcome']"));
    }

    // Page Object

    // Button 'Start forming a habit'

    public WebElement getStartHabitTop() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", startHabitTop);
        return startHabitTop;
    }

    public void clickStartHabitTop() {
        getStartHabitTop().click();
    }

    public boolean isDisplayedStartHabitTop() {
        return getStartHabitTop().isDisplayed();
    }

    // ButtonCenter 'Start forming a habit'

    public WebElement getStartHabitCenter() {
        return startHabitCenter;
    }

    public void clickStartHabitCenter() {
        getStartHabitCenter().click();
    }

    public boolean isDisplayedStartHabitCenter() {
        return getStartHabitCenter().isDisplayed();
    }

    // ButtonBelow 'Start forming a habit'

    public WebElement getStartHabitBelow() {
        return startHabitBelow;
    }

    public void clickStartHabitBelow() {
        getStartHabitBelow().click();
    }

    public boolean isDisplayedStartHabitBelow() {
        return getStartHabitBelow().isDisplayed();
    }

    // Button 'Subscribe'

    public WebElement getSubscribeOnTipsTricks() {
        return subscribeOnTipsTricks;
    }

    public void clickSubscribeOnTipsTricks() {
        getSubscribeOnTipsTricks().click();

    }

    public boolean isDisplayedSubscribeOnTipsTricks() {
        return getSubscribeOnTipsTricks().isDisplayed();
    }

    // Enter email for Subscribe

    public WebElement getEmailTipsTricks() {
        return enterEmailTipsTricks;
    }

    public String getEmailTipsTricksText() {
        return getEmailTipsTricks().getText();
    }

    public void clickEmailTipsTricks() {
        getEmailTipsTricks().click();
    }

    public void setEmailTipsTricks(String email) {
        getEmailTipsTricks().sendKeys(email);
    }


    public void clearEmailTipsTricks() {
        getEmailTipsTricks().clear();
    }

    // amount People

    public WebElement getAmountPeople() {
        return amountPeople;
    }

    public String getAmountPeopleText() {
        return getAmountPeople().getText();
    }

    public boolean isDesplayedAmountPeople() {
        return getAmountPeople().isDisplayed();
    }

    // amount Bags

    public WebElement getAmountBags() {
        return amountBags;
    }

    public String getAmountBagsText() {
        return amountBags.getText();
    }

    // amount Cups

    public WebElement getAmountCups() {
        return amountCups;
    }

    public String getAmountCupsText() {
        return amountCups.getText();
    }

    // link bellow Bags to MapPage

    public WebElement getBagsLink() {
        return linkBags;
    }

    public void clickBagsLink() {
        getBagsLink().click();
    }

    // link bellow Cups to MapPage

    public WebElement getCupsLink() {
        return linkCups;
    }

    public void clickCupsLink() {
        getCupsLink().click();
    }

    // link mainEcoNewsLink

    public WebElement getMainEcoNewsLink() {
        return mainEcoNewsLink;
    }

    public void clickMainEcoNewsLink() {
        getMainEcoNewsLink().click();
    }
    
    public boolean isDesplayedMainEcoNewsLink() {
        return getMainEcoNewsLink().isDisplayed();
    }
    // link other1EcoNewsLink

    public WebElement getOther1EcoNewsLink() {
        return other1EcoNewsLink;
    }

    public void clickOther1EcoNewsLink() {
        getOther1EcoNewsLink().click();
    }
    public boolean isDesplayedOther1EcoNewsLink() {
        return getOther1EcoNewsLink().isDisplayed();
    }

    // link other2EcoNewsLink

    public WebElement getOther2EcoNewsLink() {
        return other2EcoNewsLink;
    }

    public void clickOther2EcoNewsLink() {
        getOther2EcoNewsLink().click();
    }
    public boolean isDesplayedOther2EcoNewsLink() {
        return getOther2EcoNewsLink().isDisplayed();
    }

    // link to allNewsLink

    public WebElement getAllNewsLink() {
        return allNewsLink;
    }

    public void clickAllNewsLink() {
        getAllNewsLink().click();
    }
    public boolean isDesplayedgetAllNewsLink() {
        return getAllNewsLink().isDisplayed();
    }

    // logoGreenCity

    public WebElement getLogoCreenCity() {
        return logoCreenCity;
    }

    public void clickLogoCreenCity() {
        getLogoCreenCity().click();
    }

    public boolean isDisplayedLogoGreenCity() {
        return logoCreenCity.isDisplayed();
    }

    // Container
    public TipsCardsContainer getTipsCardsContainer() {
        return tipsCardsContainer;
    }
    
    //validationError
    
    public WebElement getValidationError() {
        return validationError;
    }
    public String getValidationErrorText() {
     return getValidationError().getText();
    }
    
    //subscriptionError
    
    public WebElement getSubscriptionError() {
        return subscriptionError;
    }
    public String getSubscriptionErrorText() {
     return getSubscriptionError().getText();
    }
    // Functional

    /**
     * quantityPeople() - reads the text that contains about the number of
     * people
     * 
     * @return number People, who signed to GreenCity
     */
    public int quantityPeople() {
        return new QuantityItems().quantityItems(getAmountPeopleText());
    }
    
    public int numberPeople() {
        return new NumberItems().numberItems(getAmountPeopleText());
    }

    /**
     * @return quantity Bags, which we used
     */
    public int quantityBags() {
        return new QuantityItems().quantityItems(getAmountBagsText());
    }
    public int numberBags() {
        return new NumberItems().numberItems(getAmountBagsText());
    }
    /**
     * @return quantity Cups, which we used
     */

    public int quantityCups() {
        return new QuantityItems().quantityItems(getAmountCupsText());
    }
    
    public int numberCups() {
        return new NumberItems().numberItems(getAmountCupsText());
    }
    // Business Logic
    
    public TipsTricksPage subscrintion(String email) {
       clickEmailTipsTricks();
       setEmailTipsTricks(email);
       clickSubscribeOnTipsTricks();
       return new TipsTricksPage(driver);
    }

    public TipsTricksPage switchLanguage(Languages language) {
        chooseLanguage(language);
        return new TipsTricksPage(driver);
    }

    /**
     * Create habit on page GreenCity using button on top "Start forming a
     * habit"
     * 
     * @return open My cabinet
     */
    public MyCabinetPage navigateMyCabinet() {
        clickStartHabitTop();
        return new MyCabinetPage(driver);
    }

    // Button "Start forming a habit" isn't active for bags
    // public MyCabinetPage navigateCenterMyCabinet() {
    // clickStartHabitCenter();
    // return new MyCabinetPage(driver);
    // }

    // Button "Start forming a habit" isn't active for cups
    // public MyCabinetPage navigateHabitBellowMyCabinet() {
    // clickStartHabitBelow();
    // return new MyCabinetPage(driver);
    // }

    /**
     * @return on page Map using link bellow Bags
     */
    public MapPage moveBagsToMap() {
        clickBagsLink();
        return new MapPage(driver);
    }

    /**
     * @return on page Map using link bellow Cups
     */
    public MapPage moveCupsToMap() {
        clickCupsLink();
        return new MapPage(driver);

    }

    public EconewsPage moveMainEcoNewsLink() {
        clickMainEcoNewsLink();
        return new EconewsPage(driver);
    }

    public EconewsPage moveOther1EcoNewsLink() {
        clickOther1EcoNewsLink();
        return new EconewsPage(driver);
    }

    public EconewsPage moveOther2EcoNewsLink() {
        clickOther2EcoNewsLink();
        return new EconewsPage(driver);
    }

    public EconewsPage moveAllNewsLink() {
        clickAllNewsLink();
        return new EconewsPage(driver);
    }

    /**
     * @return Page Top (TipsTricksPage)
     */
    public TipsTricksPage toGreenCity() {
        clickLogoCreenCity();
        return new TipsTricksPage(driver);

    }

  
    
    

}
