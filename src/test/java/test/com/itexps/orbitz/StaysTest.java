package test.com.itexps.orbitz;


import static java.awt.SystemColor.text;
import static org.apache.poi.hssf.usermodel.HeaderFooter.tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
public class StaysTest extends BaseTest {

    

    @Test
    public void testStay() throws Exception {

        driver.get("https://www.orbitz.com/");

        driver.findElement(By.xpath("//div[@id='location-field-destination-menu']/div/button")).click();

        driver.findElement(By.id("location-field-destination")).clear();

        driver.findElement(By.id("location-field-destination")).sendKeys("New York");

        driver.findElement(By.xpath("//div[@id='location-field-destination-menu']/div[2]/ul/li/button/div/div[2]")).click();

        driver.findElement(By.id("d1-btn")).click();

        Thread.sleep(500);

        driver.findElement(By.xpath("//form[@id='wizard-hotel-pwa-v2-1']/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[4]/button")).click();

        driver.findElement(By.xpath("//form[@id='wizard-hotel-pwa-v2-1']/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[3]/td[6]/button")).click();

        driver.findElement(By.xpath("//form[@id='wizard-hotel-pwa-v2-1']/div/div[2]/div/div/div/div/div[2]/div/div[3]/button")).click();

        Thread.sleep(500);

        driver.findElement(By.xpath("//div[@id='adaptive-menu']/div/button")).click();

        Thread.sleep(500);

        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Adults'])[1]/following::*[name()='svg'][1]")).click();

        driver.findElement(By.xpath("//div[@id='adaptive-menu']/div[2]/div/div[2]/button")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();

//        driver.findElement(By.linkText("More information about The Westin New York at Times Square, Opens in a new window")).click();

    }

//    @Test // one way flight to las vegas
    public void testOrbitzOneWayFlight() throws Exception {
        driver.get("https://www.orbitz.com/");
        driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/li[2]/a/span")).click();
        driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/div/li[2]/a/span")).click();
        driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']/div/button")).click();
        driver.findElement(By.id("location-field-leg1-origin")).clear();
        driver.findElement(By.id("location-field-leg1-origin")).sendKeys("ord");
        driver.findElement(By.id("wizard-flight-pwa-1")).submit();
        driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']/div/button")).click();
        driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']/div[2]/ul/li/button/div/div[2]")).click();
        driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/div/button")).click();
        driver.findElement(By.id("location-field-leg1-destination")).clear();
        driver.findElement(By.id("location-field-leg1-destination")).sendKeys("las");
        driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/div[2]/ul/li/button/div/div/span/strong")).click();
        driver.findElement(By.id("d1-btn")).click();
        driver.findElement(By.xpath("//div[@id='wizard-flight-tab-oneway']/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[7]/button")).click();
        driver.findElement(By.xpath("//form[@id='wizard-flight-pwa-1']/div[3]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

//    @FindBy(name ="Stays")
//    WebElement Stays;
//    
//    @FindBy(id = "location-field-destination")
//    WebElement txtdesination;
//    @FindBy(id = ".//*[@id='location-field-destination'= clear)       
////  
//    
//   (By.xpath("//div[@id='location-field-destination-menu']/div/button")).click(); 
//   
//    @FindBy(xpath = ".//*[@name='userName']")
////    private WebElement userName;
//
}

//<span class="uitk-tab-text">Stays</span>
//
//     <span class="uitk-tab-text">Flights</span>
//<span class="uitk-tab-text">Roundtrip</span>
//<span class="uitk-tab-text">One-way</span>
//<span class="uitk-tab-text">Things to do</span>
//  driver.findElement(By.xpath("//div[@id='location-field-destination-menu']/div/button")).click();
//
//    driver.findElement(By.id("location-field-destination")).clear();
//
//    driver.findElement(By.id("location-field-destination")).sendKeys("New York");
