package NkUpdate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateNaukariHome1 {

	@FindBy(xpath = "//div[@class='updateProfile']/div[@class='mb10']/div")
	private WebElement updateBtn;

	public UpdateNaukariHome1(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void clickOnUpdateProfile() throws InterruptedException {

		Thread.sleep(2000);
		updateBtn.click();

	}

}
