package NkUpdate;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateNaukariHome2 {

	@FindBy(css = "div[class*='quickLink '] ul li[class='collection-item']")
	private List<WebElement> quickLink4Update;
	@FindBy(xpath = "//div[@id='lazyResumeHead']//span[@class='edit icon']")
	private WebElement ResumeHeadEditBtn;
	@FindBy(xpath = "//div[@class='ltLayer open']")
	private WebElement layerofPopUp;
	@FindBy(xpath = "//form[@name='resumeHeadlineForm']//textarea")
	private WebElement ResumeHeadLineText;
	@FindBy(xpath = "//form[@name='resumeHeadlineForm']//button")
	private WebElement saveBtn;
	@FindBy(xpath = "//div[@id='lazyResumeHead']//div[@class='msgBox success']")
	private WebElement successMsgBox;
	Actions act;
	JavascriptExecutor js;

	public UpdateNaukariHome2(WebDriver driver) {

		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		js = ((JavascriptExecutor) driver);
	}

	public void ClickUpdateResumeHeadline(String UpdateWhat) throws InterruptedException {
		Thread.sleep(2000);
		for (int i = 0; i < quickLink4Update.size(); i++) {

			String x = quickLink4Update.get(i).getText();
			Thread.sleep(1500);
			if (x.equals(UpdateWhat)) {
				quickLink4Update.get(i).click();
				break;
			}
		}

	}

	public void clickonResumeHeadEditButton(WebDriverWait wait,String msgOne) throws InterruptedException {
		Thread.sleep(1500);
		// this will click on edit button of resume headline
		ResumeHeadEditBtn.click();
		Thread.sleep(1500);
		wait.until(ExpectedConditions.visibilityOf(layerofPopUp));

		act.moveToElement(ResumeHeadLineText).click().keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE)
				.keyUp(Keys.CONTROL).sendKeys(msgOne).build().perform();

		// act.moveToElement(ResumeHeadLineText).click().sendKeys(Keys.DELETE,
		// Keys.DELETE, Keys.DELETE).build().perform();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(saveBtn));
		saveBtn.click();

	}

	public void EditFinalUpdateResumeheading(WebDriverWait wait, String resumeHeadline) throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(successMsgBox));
		// this will click on edit button again of resume headline
		Thread.sleep(1500);
		ResumeHeadEditBtn.click();
		Thread.sleep(1500);
		act.moveToElement(ResumeHeadLineText).click().keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE)
				.keyUp(Keys.CONTROL).sendKeys(resumeHeadline).build().perform();

		// act.moveToElement(ResumeHeadLineText).click().sendKeys(Keys.DELETE,
		// Keys.DELETE, Keys.DELETE).build().perform();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(saveBtn));
		saveBtn.click();

	}

}
