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
public class MulticityFlightTest extends BaseTest {
    
//     
  
   @Test
  public void testMulticity() throws Exception {
    driver.get("https://www.orbitz.com/");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/li[2]/a/span")).click();
    driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/div/li[3]/a/span")).click();
    driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']/div/button")).click();
    driver.findElement(By.id("location-field-leg1-origin")).clear();
    driver.findElement(By.id("location-field-leg1-origin")).sendKeys("ord");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']/div[2]/ul/li/button/div/div/span/strong")).click();
    driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/div/button")).click();
    driver.findElement(By.id("location-field-leg1-destination")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("location-field-leg1-destination")).sendKeys("new york");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/div[2]/ul/li/button/div/div[2]")).click();
    driver.findElement(By.id("d1-btn")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='wizard-flight-tab-multicity']/div[2]/div/fieldset/div/div[3]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[5]/button")).click();
    driver.findElement(By.xpath("//div[@id='wizard-flight-tab-multicity']/div[2]/div/fieldset/div/div[3]/div/div/div/div/div[2]/div/div[3]/button")).click();
    driver.findElement(By.xpath("//div[@id='location-field-leg2-origin-menu']/div/button")).click();
    driver.findElement(By.xpath("//div[@id='location-field-leg2-destination-menu']/div/button")).click();
    driver.findElement(By.id("location-field-leg2-destination")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("location-field-leg2-destination")).sendKeys("Las Vegas");
    driver.findElement(By.xpath("//div[@id='location-field-leg2-destination-menu']/div[2]/ul/li/button/div/div[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='wizard-flight-tab-multicity']/div[2]/div/fieldset[2]/div/div[3]/div/div/div/div/div/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='wizard-flight-tab-multicity']/div[2]/div/fieldset[2]/div/div[3]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[3]/td/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='wizard-flight-tab-multicity']/div[2]/div/fieldset[2]/div/div[3]/div/div/div/div/div[2]/div/div[3]/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    //driver.findElement(By.xpath("//li[@id='AQrZAgrDAnY1LXNvcy0yZmVkMDQzMTk4MmU0ZWY5OWJlZDVjMGQ5YzY0MDE5Ni0zMC0yMC0xfjIuU35BUW9FQ0xta0JCSUhDTlFFRUE0WVZ5QUhJQUVnRENBTklBa29BbElFd1lnQ0FGZ0VjQUF-QVFwQUNoMEl6cFlCRWdFekdLNGNJT1ZhS1AzcjlnRXd1TzMyQVRoWFFBQllBUW9mQ002V0FSSUROekV3R09WYUlNc0JLUGZ0OWdFd3NPXzJBVGhYUUFGWUFRcERDaDhJenBZQkVnTTNNRFVZeXdFZzVWb292b18zQVREOWtQY0JPRmRBQUZnQkNpQUl6cFlCRWdNM056Y1k1Vm9naTVBQktMS1Q5d0V3N1pYM0FUaFhRQUZZQVJJS0NBRVFBUmdCS2dKT1N4Z0JJZ1FJQVJBQktBSW9BeWdFTUEwET0K16NwnVtAIgEBKgUSAwoBMRI_ChYKCjIwMjEtMDktMDkSA09SRBoDTllDChYKCjIwMjEtMDktMTISA05ZQxoDTEFTEgcSBUNPQUNIGgIQASAD']/div/div/div/button")).click();
  }
}
