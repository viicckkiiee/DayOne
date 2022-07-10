package com.today;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;
	
	
	//1.
	public void implicitWait(Duration duration) {
		driver.manage().timeouts().implicitlyWait(duration);
	}
	
	//2.
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//3.
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	//4.
	public String getText(WebElement element) {
		String text = element.getText(); return text;
	}
	
	//5.
	public void send(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	//6.
	public static void click(WebElement element) {
		element.click();
	}
	
	//7.
	public WebElement findElementById(String id) {
		return driver.findElement(By.id(id));
	}
	/**
	 * 
	 * @param element
	 * @CreationDate 30/06/2022
	 * @Description To highlight a WebElement in yellow colour
	 */
	public void jsHighlight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='yellow'", element);
	}
	
	//8.
	public WebElement findElementByName(String name) {
		return driver.findElement(By.name(name));
	}
	
	//9.
	public WebElement findElementClassname(String className) {
		return driver.findElement(By.className(className));
	}
	
	//10.
	public WebElement findElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	//11.
	public WebElement findElementByTagName(String tagName) {
		return driver.findElement(By.tagName(tagName));
	}
	
	//12.
	public WebElement findElementByText(String tagName, String text) {
		return driver.findElement(By.xpath("//" + tagName + "[text()='" + text + "']"));
	}
	
	//13.
	public WebElement findElementByPartialText(String tagName, String partialText) {
		return driver.findElement(By.xpath("//" + tagName + "[contains(text(),'"+partialText+"')]"));
	}
	
	//14.
	public WebElement findElementByAttribute(String tagName, String attributeName, String attriValue) {
		return driver.findElement(By.xpath("//"+tagName+"[@"+attributeName+"='"+attriValue+"']"));
	}
	
	//15.
	public WebElement findElementBypartialAttributeValue(String tagName, String attributeName, String partialAttriValue) {
		return driver.findElement(By.xpath("//"+tagName+"[contains(@"+attributeName+"='"+partialAttriValue+"')]"));
	}
	
	//16.
	public static String getAttribute(WebElement element) {
		return element.getAttribute("value");
	}
	
	//17.
	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	//18.
	public boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}
	
	//19.
	public boolean isSelected(WebElement element) {
		return element.isSelected();
	}
	
	//20.
	public void sleep(long milliSeconds) throws InterruptedException {
		Thread.sleep(milliSeconds);
	}
	
	//21.
	public void selectByValue(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	//22.
	public void selectByText(WebElement element, String text ) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	//23.
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	//24.
	public void deSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	
	//25.
	public void deSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	
	//26.
	public void deSelectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
	
	//27.
	public void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}
	
	//28.
	public void mouseOver(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	//29.
	public void rightclick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	
	//30.
	public void pressEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	//31.
	public static String getdata(String filePath,String sheetName, int rowIndex, int cellIndex) throws IOException {
		File file = new File(filePath);
		FileInputStream in = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(in);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING: 
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				String format = sdf.format(dateCellValue);
				return format;
			} else {
				double numericCellValue = cell.getNumericCellValue();
				BigInteger valueOf = BigInteger.valueOf((long)numericCellValue);
				String string = valueOf.toString();
				return string;
			}
		default:
			break;
		}
		FileOutputStream out = new FileOutputStream(file);
		wb.write(out);
		return null;
	}

	//32.
	public static void insertValue(String filepath, String sheetName, int rowNo, int cellNo, String copy) throws IOException {
		File file = new File(filepath);
		FileInputStream in = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(in);
		Sheet sheet = wb.getSheet(sheetName);
		Row createRow = sheet.createRow(rowNo);
		Cell cell = createRow.createCell(cellNo);
		cell.setCellValue(copy);
		FileOutputStream out = new FileOutputStream(file);
		wb.write(out);
	}



}
