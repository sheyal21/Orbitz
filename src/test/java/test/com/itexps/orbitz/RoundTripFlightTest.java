package test.com.itexps.orbitz;


import org.openqa.selenium.By;
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
public class RoundTripFlightTest extends BaseTest {
    
    @Test
    public void testOrbitzRoundTrip() throws Exception {
        driver.get("https://www.orbitz.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stays'])[2]/following::*[name()='svg'][1]")).click();
        driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("location-field-leg1-origin")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("location-field-leg1-origin")).sendKeys("ord");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']/div[2]/ul/li/button/div/div/span/strong")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("location-field-leg1-destination")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("location-field-leg1-destination")).sendKeys("las veg");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/div[2]/ul/li/button/div/div/span/strong")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("d1-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='wizard-flight-tab-roundtrip']/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[3]/td[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='wizard-flight-tab-roundtrip']/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[3]/td[4]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='wizard-flight-tab-roundtrip']/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
}
