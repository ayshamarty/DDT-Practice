package com.bae.apache.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import constants.Constants;

public class DemoSiteApacheTest {

	public static WebDriver driver;

	@Before
	public void setup() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Administrator\\Downloads\\chromedriver_win32/chromedriver.exe");
		 * driver = new ChromeDriver();
		 */
	}

	@After
	public void teardown() {
		/* driver.quit(); */
	}

	@Test
	public void test1() throws IOException {
		/*
		 * driver.manage().window().maximize(); driver.get(Constants.URL1);
		 */
		System.out.println("test");
		FileInputStream file = null;
		try {
			file = new FileInputStream(Constants.FILE1);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		XSSFWorkbook workbook = null;
		workbook = new XSSFWorkbook(file);
		// workbook = new XSSFWorkbook(file);

		// XSSFSheet sheet = workbook.getSheetAt(0);
		// XSSFCell cell = sheet.getRow(0).getCell(0);
		// System.out.println(cell.getStringCellValue());

	}
}
