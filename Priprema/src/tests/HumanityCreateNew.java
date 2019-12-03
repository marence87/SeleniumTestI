package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pages.DashboardPage;
import pages.EmployeePage;
import pages.HumanityEditStaff;
import pages.HumanityHome;
import pages.HumanityMenu;
import pages.HumanityProfile;
import pages.LoginPage;
import pages.TitlePage;

public class HumanityCreateNew extends BasicTest {

	private String baseUrl = "https://www.humanity.com/";

	/*
	 * @Test public void basic() throws InterruptedException {
	 * 
	 * this.driver.get(baseUrl); Thread.sleep(2000);
	 * 
	 * HumanityHome hH = new HumanityHome(driver);
	 * 
	 * 
	 * hH.getName().sendKeys("Mika Pera"); hH.getName().sendKeys(Keys.ENTER);
	 * 
	 * hH.getEmail().sendKeys("lopor69048@tmailcloud.com");
	 * hH.getEmail().sendKeys(Keys.ENTER);
	 * 
	 * hH.getSubmit().click();
	 * 
	 * 
	 * }
	 */

	@Test(priority = 0)
	public void basicLogin() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		HumanityHome hp = new HumanityHome(driver);
		hp.getLoginBtn().click();
		Thread.sleep(2000);
		
		File file = new File("nalog.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		LoginPage lg = new LoginPage(driver);

		String email = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		
//		lg.singIn("balrog444@gmail.com", "testtest");
		
		lg.singIn(email, password);
		Thread.sleep(2000);
		
		wb.close();
		
		TitlePage tp = new TitlePage(driver);
		
		Assert.assertTrue(tp.getPageTitle().contains("Dashboard"));
	}
	
	@Test(priority = 1)
	public void dashboardTest() throws InterruptedException {

		DashboardPage dp = new DashboardPage(driver);
		System.out.print("dashboardTest" + dp.getNavLinks().size());
		Assert.assertTrue(dp.getNavLinks().size() > 0);
	}
	
	/*@Test(priority = 2)
	public void profileTest() throws InterruptedException {
		HumanityProfile hP = new HumanityProfile(driver);
		hP.getProfile().click();
		
		hP.getProfileB().click();
		Thread.sleep(2000);

	}*/
	
	
	/*@Test(priority = 3)
	public void pictureTest() throws InterruptedException {
		HumanityEditStaff hES = new HumanityEditStaff(driver);
		hES.getDetails().click();

	}*/
	
	@Test(priority = 4)
	public void menuPage() throws InterruptedException {
		HumanityMenu hM = new HumanityMenu(driver);
		hM.getLeave().click();

	}

/*	@Test(priority = 20)
	public void addEmployeeTest() throws Exception {
		driver.get("https://sdn1.humanity.com/app/dashboard/");
		Thread.sleep(2000);

		DashboardPage dp = new DashboardPage(driver);
		System.out.print("addEmployeeTest" + dp.getNavLinks().size());
		dp.getNavLinks().get(5).click(); // Staff link
		Thread.sleep(2000);

		EmployeePage ep = new EmployeePage(driver);
		ep.getAddEmployeeBtn().click();
		Thread.sleep(2000);

		File file = new File("radnici.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			String name = sheet.getRow(i).getCell(0).getStringCellValue();
			String lastName = sheet.getRow(i).getCell(1).getStringCellValue();
			String email = sheet.getRow(i).getCell(2).getStringCellValue();
			ep.addEmploy(name, lastName, email);
		}

		ep.getSaveBtn().click();
		Thread.sleep(2000);
//		
//		dp.getNavLinks().get(5).click(); 
//		
//		Assert.assertTrue(ep.employAdded("233343232332@email.com"));
//		Assert.assertTrue(ep.employAdded("ewd34334@email.com"));
//		Assert.assertTrue(ep.employAdded("09238732k32m@email.com"));

	}*/

}
