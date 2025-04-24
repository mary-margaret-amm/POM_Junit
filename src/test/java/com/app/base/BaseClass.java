package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver= null;
	public static String value;
	
//	@BeforeClass
	//for selenium version 3.141.59
//	public static void browserLaunch() {
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://adactinhotelapp.com/");
//	}
	
	
	
	@BeforeClass
	public static void browserLaunch1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	
			
	}
	
	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void dropDown(WebElement element, String data) {
		Select sc= new Select(element);
		sc.selectByValue(data);
	}
	
	public static void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public static String excelRead_reuse(int i, int j) {
		try {
			File f= new File("E:\\JAVA\\ECLIPSE\\POM_Junit\\src\\test\\resources\\TestData\\Book2.xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet= wb.getSheet("Sheet1");
			Row row = sheet.getRow(i);
			Cell cell=row.getCell(j);
			int cellType = cell.getCellType();
			if(cellType==1) {
				value = cell.getStringCellValue();
			}else if (cellType==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCell = cell.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
					value = sim.format(dateCell);
				}else {
					double val = cell.getNumericCellValue();
					long number = (long)val;
					value = String.valueOf(number);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
			
	}
	
//	public static String prop_reuse(String val) {
//		
//		try {
//			File f= new File("E:\\JAVA\\ECLIPSE\\POM_Junit\\src\\test\\resources\\TestData\\config.properties");
//			FileReader read= new FileReader(f);
//			Properties prop = new Properties();
//			prop.load(read);
//			value = prop.getProperty(val);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return val;
//	}
	
	public static String property_Reuse(String data) {
		
		try {
			File f = new File("E:\\JAVA\\ECLIPSE\\POM_Junit\\src\\test\\resources\\TestData\\config.properties");
			FileReader read=new FileReader(f);
			Properties prop=new Properties();
			prop.load(read);
			value=prop.getProperty(data);
			System.out.println(value);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	
	}
	
	public static void excelWrite(String attribute, int i, int j) {
		
		try {
			File f= new File("E:\\JAVA\\ECLIPSE\\POM_Junit\\src\\test\\resources\\TestData\\Book2.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet= wb.createSheet("OrderNumberB");
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(j);
			cell.setCellValue(attribute);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void waitTime_11s() {
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static String getAttribute(WebElement element, String attribute) {
//		return element.getAttribute(attribute);
//	}
//	
	
	
	@AfterClass
	public static void screenShot1() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
			
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File path = new File("E:\\PROJECT\\Screenshots\\POM\\screenshot.jpg");
			FileHandler.copy(src, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
