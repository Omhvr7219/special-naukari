package NkUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityData {

	public static String getExceldata(int rowNum, int cellNum) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\TestData\\NaukariLoginDetails.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("naukaridata");

		String value = sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;

	}

	public static void captureScreenShot(WebDriver driver) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(
				System.getProperty("user.dir") + "\\Screenshots\\Screenshot_" + RandomString.make() + ".jpg");
		FileHandler.copy(source, destination);

	}

}
