package test.com.itexps.orbitz;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sheya
 */
public class OnewayFlightTest extends BaseTest {

    @Test
    public void testOrbitzOneWayFlight() throws Exception {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            FileInputStream inputStream = new FileInputStream(new File("c:\\data\\flights.xls"));
            Workbook workbook = new HSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);

            for (int i = 0; i < 3; i++) {
                Row r = firstSheet.getRow(i);
                Cell c = r.getCell(0); //password value
                String departingCity = c.getStringCellValue();
                //System.out.println(departingCity);
                c = r.getCell(1);
                String destinationCity = c.getStringCellValue();

                Thread.sleep(3000);
                driver.get("https://www.orbitz.com/");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/li[2]/a")).click();
                driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/div/li[2]/a/span")).click();
                driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']/div/button")).click();
                Thread.sleep(1000);
                //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("location-field-leg1-origin")));
                driver.findElement(By.id("location-field-leg1-origin")).clear();
                Thread.sleep(3000);
                driver.findElement(By.id("location-field-leg1-origin")).sendKeys(departingCity);
                driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']/div[2]/ul/li/button/div/div/span/strong")).click();
                driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/div/button")).click();
                Thread.sleep(1000);
                //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("location-field-leg1-destination")));
                driver.findElement(By.id("location-field-leg1-destination")).clear();
                Thread.sleep(3000);
                driver.findElement(By.id("location-field-leg1-destination")).sendKeys(destinationCity);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/div[2]/ul/li/button/div/div/span/strong")).click();
                Thread.sleep(3000);
                //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("d1-btn")));
                driver.findElement(By.id("d1-btn")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//div[@id='wizard-flight-tab-oneway']/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[4]/td[3]/button")).click();
                driver.findElement(By.xpath("//div[@id='wizard-flight-tab-oneway']/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/button")).click();
                driver.findElement(By.xpath("//button[@type='submit']")).click();
                //String getTitle = driver.getTitle();
                //Assert.assertEquals("Orbitz", getTitle);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    //   @Test

    public void testOrbitzOneWayFlight1() throws Exception {
        driver.get("https://www.orbitz.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/li[2]/a")).click();
        driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/div/li[2]/a/span")).click();
        driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']/div/button")).click();
        driver.findElement(By.id("location-field-leg1-origin")).clear();
        driver.findElement(By.id("location-field-leg1-origin")).sendKeys("New york");
        driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']/div[2]/ul/li/button/div/div/span/strong")).click();
        driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/div/button")).click();
        driver.findElement(By.id("location-field-leg1-destination")).clear();
        driver.findElement(By.id("location-field-leg1-destination")).sendKeys("las");
        driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/div[2]/ul/li/button/div/div/span/strong")).click();
        driver.findElement(By.id("d1-btn")).click();
        driver.findElement(By.xpath("//div[@id='wizard-flight-tab-oneway']/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[4]/td[3]/button")).click();
        driver.findElement(By.xpath("//div[@id='wizard-flight-tab-oneway']/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/button")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
