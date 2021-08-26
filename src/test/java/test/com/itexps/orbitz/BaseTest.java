package test.com.itexps.orbitz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 *
 * @author sheya
 */
public class BaseTest {
    
    public String baseURl ="https://www.orbitz.com/";
    public static WebDriver driver;
    
    public BaseTest() {
    }
    
     public BaseTest(WebDriver driver) {
        this.driver = driver;
    }
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\chromedriver.exe");
        driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "C:\\Data\\geckodriver.exe");
        //driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @AfterClass
    public static void tearDownClass() {
        driver.quit();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
