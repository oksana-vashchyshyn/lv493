package com.softserve.edu.greencity.pages.guest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MainMenuDropdown {

	private WebDriver driver;
	//
	private WebElement naviconButton;
	//
	private WebElement menuHome;
	private WebElement menuEcoNews;
	private WebElement menuTipsTricks;
	private WebElement menuMap;
	private WebElement menuMyCabinet;
	private WebElement menuAbout;
	//
	private WebElement footerHome;
	private WebElement footerEcoNews;
	private WebElement footerTipsTricks;
	private WebElement footerMap;
	private WebElement footerMyCabinet;
	private WebElement footerAbout;
	
	public MainMenuDropdown(WebDriver driver) {
		this.driver = driver;
		initElements();
		//System.out.println("*****Constructor MainMenuDropdown");
	}

	private void initElements() {
		// init elements
		naviconButton = driver.findElement(By.cssSelector("span.navicon"));
		menuHome = driver.findElement(By.cssSelector("ul.menu > li:first-child > a[href*='/welcome']"));
		menuEcoNews = driver.findElement(By.cssSelector("ul.menu > li > a[href*='/news']"));
		menuTipsTricks = driver.findElement(By.xpath("//ul[@class='menu']/li/a[contains(@href, '/news')]/../following-sibling::li/a[contains(@href, '/welcome')]"));
		menuMap = driver.findElement(By.cssSelector("ul.menu > li > a[href*='/map']"));
		menuMyCabinet = driver.findElement(By.cssSelector("ul.menu > li > a[href*='/habits']"));
		menuAbout = driver.findElement(By.cssSelector("ul.menu > li > a[href*='/about']"));
		//
		footerHome = driver.findElement(By.cssSelector("a.small-screen-size > img"));
		footerEcoNews = driver.findElement(By.cssSelector("ul.list-of-site-links > li > a[href*='/news']"));
		footerTipsTricks = driver.findElement(By.xpath("//ul[@class='list-of-site-links']/li/a[contains(@href, '/news')]/../following-sibling::li/a[@href='']"));
		footerMap = driver.findElement(By.cssSelector("ul.list-of-site-links > li > a[href*='/map']"));
		footerMyCabinet = driver.findElement(By.cssSelector("ul.list-of-site-links > li > a[href*='/habits']"));
		footerAbout = driver.findElement(By.cssSelector("ul.list-of-site-links > li > a[href*='/about']"));
	}

	// Page Object
	
	// naviconButton
	
	public WebElement getNaviconButton() {
        return naviconButton;
    }

    public String getNaviconButtonText() {
        return getNaviconButton().getText();
    }

    public void clickNaviconButton() {
    	if (isDisplayedNaviconButton()) {
    		getNaviconButton().click();
    	}
    }
    
    public boolean isDisplayedNaviconButton() {
        return getNaviconButton().isDisplayed();
    }
    
    // menuHome
    
    public WebElement getMenuHome() {
    	if (!isDisplayedMenuHome()) {
    		clickNaviconButton();
    	}
        return menuHome;
    }

    public String getMenuHomeText() {
        return getMenuHome().getText();
    }

    public void clickMenuHome() {
    	getMenuHome().click();
    }

    public boolean isDisplayedMenuHome() {
        //return getMenuHome().isDisplayed();
    	return menuHome.isDisplayed();
    }
    
    // menuEcoNews
    
    public WebElement getMenuEcoNews() {
    	if (!isDisplayedMenuHome()) {
    		clickNaviconButton();
    	}
        return menuEcoNews;
    }

    public String getMenuEcoNewsText() {
        return getMenuEcoNews().getText();
    }

    public void clickMenuEcoNews() {
    	getMenuEcoNews().click();
    }

    public boolean isDisplayedMenuEcoNews() {
        //return getMenuEcoNews().isDisplayed();
    	return menuEcoNews.isDisplayed();
    }
    
    // menuTipsTricks
    
    public WebElement getMenuTipsTricks() {
    	if (!isDisplayedMenuTipsTricks()) {
    		clickNaviconButton();
    	}
        return menuTipsTricks;
    }

    public String getMenuTipsTricksText() {
        return getMenuTipsTricks().getText();
    }

    public void clickMenuTipsTricks() {
    	getMenuTipsTricks().click();
    }

    public boolean isDisplayedMenuTipsTricks() {
        //return getMenuTipsTricks().isDisplayed();
    	return menuTipsTricks.isDisplayed();
    }

    // menuMap
    
    public WebElement getMenuMap() {
    	if (!isDisplayedMenuMap()) {
    		clickNaviconButton();
    	}
        return menuMap;
    }

    public String getMenuMapText() {
        return getMenuMap().getText();
    }

    public void clickMenuMap() {
    	getMenuMap().click();
    }

    public boolean isDisplayedMenuMap() {
        //return getMenuMap().isDisplayed();
    	return menuMap.isDisplayed();
    }

    // menuMyCabinet
    
    public WebElement getMenuMyCabinet() {
    	//System.out.println("isDisplayedMenuMyCabinet() = " + isDisplayedMenuMyCabinet());
    	if (!isDisplayedMenuMyCabinet()) {
    		clickNaviconButton();
    		//System.out.println("clickNaviconButton() DONE");
    	}
    	//System.out.println("isDisplayedMenuMyCabinet() = " + isDisplayedMenuMyCabinet());
        return menuMyCabinet;
    }

    public String getMenuMyCabinetText() {
        return getMenuMyCabinet().getText();
    }

    public void clickMenuMyCabinet() {
    	getMenuMyCabinet().click();
    }

    public boolean isDisplayedMenuMyCabinet() {
        //return getMenuMycabinet().isDisplayed();
    	return menuMyCabinet.isDisplayed();
    }

    // menuAbout
    
    public WebElement getMenuAbout() {
    	if (!isDisplayedMenuAbout()) {
    		clickNaviconButton();
    	}
        return menuAbout;
    }

    public String getMenuAboutText() {
        return getMenuAbout().getText();
    }

    public void clickMenuAbout() {
    	getMenuAbout().click();
    }

    public boolean isDisplayedMenuAbout() {
        //return getMenuAbout().isDisplayed();
    	return menuAbout.isDisplayed();
    }

	// footerHome

	public WebElement getFooterHome() {
		return footerHome;
	}

	public String getFooterHomeText() {
		return getFooterHome().getText();
	}

	public void clickFooterHome() {
		getFooterHome().click();
	}
 
    // footerEcoNews

	public WebElement getFooterEcoNews() {
		return footerEcoNews;
	}

	public String getFooterEcoNewsText() {
		return getFooterEcoNews().getText();
	}

	public void clickFooterEcoNews() {
		getFooterEcoNews().click();
	}
     
    // footerTipsTricks

	public WebElement getFooterTipsTricks() {
		return footerTipsTricks;
	}

	public String getFooterTipsTricksText() {
		return getFooterTipsTricks().getText();
	}

	public void clickFooterTipsTricks() {
		getFooterTipsTricks().click();
	}
         
    // footerMap

	public WebElement getFooterMap() {
		return footerMap;
	}

	public String getFooterMapText() {
		return getFooterMap().getText();
	}

	public void clickFooterMap() {
		getFooterMap().click();
	}
             
    // footerMyCabinet

	public WebElement getFooterMyCabinet() {
		return footerMyCabinet;
	}

	public String getFooterMyCabinetText() {
		return getFooterMyCabinet().getText();
	}

	public void clickFooterMyCabinet() {
		getFooterMyCabinet().click();
	}                
    
    // footerAbout

	public WebElement getFooterAbout() {
		return footerAbout;
	}

	public String getFooterAboutText() {
		return getFooterAbout().getText();
	}

	public void clickFooterAbout() {
		getFooterAbout().click();
	}                     
    
    // Functional
	
	public void closeNaviconButton() {
		if (isDisplayedNaviconButton() 
				&& (isDisplayedMenuHome() || isDisplayedMenuEcoNews())) {
			clickNaviconButton();
		}
	}

	// Business Logic
}
