package Nklogout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NkLogout {

	
	@FindBy(xpath = "//div[@id='ni-gnb-header-section']//div[@class='nI-gNb-drawer']")
	private WebElement profileMenu;
	@FindBy(xpath = "//div[@id='ni-gnb-header-section']//div[@class='nI-gNb-drawer']/div[2]//div[@class='nI-gNb-de__list']//a[@data-type='logoutLink']")
	private WebElement logoutBtn;
	
	public NkLogout(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	public void clickLogout() throws InterruptedException {
		Thread.sleep(1000);
		profileMenu.click();
		Thread.sleep(1500);
		logoutBtn.click();
		
		
	}

}
