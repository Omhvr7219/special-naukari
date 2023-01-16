package NkUpdate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadResume {

	@FindBy(xpath = "//div[@id='lazyAttachCV']//div[@class='cvPreview']//a")
	private WebElement resumeDeleteBtn;

	@FindBy(xpath = "//div[contains(@class,'flipOpen')]//div[contains(@class,'profileSummaryConfirmation')]//button")
	private WebElement confirmDeletBtn;

	@FindBy(xpath = "//input[@id='attachCV']")
	private WebElement attachResumeBtn;

	@FindBy(xpath = "//span[@id='attachCVMsgBox']//div[@class='msgBox success']")
	private WebElement confirmMsgBox;

	public UploadResume(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void updateResume(WebDriverWait wait, String pathResume) throws InterruptedException {

		Thread.sleep(1500);
		attachResumeBtn.sendKeys(pathResume);
	}

}
