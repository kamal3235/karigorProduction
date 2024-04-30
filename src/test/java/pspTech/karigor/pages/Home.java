package pspTech.karigor.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pspTech.karigor.baseClass.BaseClass;

public class Home  extends BaseClass {

	public Home() {
		super(driver);
	}

@FindBy(xpath="(//a[@href='/about'][2]")
public WebElement clickExploreKarigor;

@FindBy(how = How.XPATH, using ="(//a[@href='/about'][1]") 
public WebElement ClickAboutUsInNavigationBar;

@FindBy(xpath="(//a[@href='/about'][3]")
public WebElement clickAboutUsFooter;
}
