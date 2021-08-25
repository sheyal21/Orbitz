
import org.junit.Test;
import org.openqa.selenium.By;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sheya
 */
public class ThingsToDo extends BaseTest {
    
     @Test
  public void testOrbitz1() throws Exception {
    driver.get("https://www.orbitz.com/");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='gc-custom-header-tool-bar-shop-menu']/div/div/a[6]/div")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='location-field-location-menu']/div/button")).click();
    driver.findElement(By.id("location-field-location")).clear();
    Thread.sleep(3000);
    driver.findElement(By.id("location-field-location")).sendKeys("o");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='location-field-location-menu']/div[2]/ul/li/button/div/div[2]")).click();
    driver.findElement(By.id("d1-btn")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//form[@id='wizard-lx-pwa-1']/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[6]/button")).click();
    driver.findElement(By.xpath("//form[@id='wizard-lx-pwa-1']/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[3]/td[2]/button")).click();
    driver.findElement(By.xpath("//form[@id='wizard-lx-pwa-1']/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/button")).click();
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("1. Walt Disney World® Resort Theme Park TicketsOpens in a new window")).click();
    Thread.sleep(8000);
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
  }
}
