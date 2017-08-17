package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * @author Dmitry Nakhabtsev
 */
public class TestCase1 {

//TestNG execution	
@Test
public void test1() throws InterruptedException, IOException {
	// Parametrization data file
	// String csvFile = "./src/main/resources/Test.csv"; 
	

	String driverPath = "./src/main/resources/webdrivers/pc/geckodriver.exe";
	String url="http://www.dokkio.com";

	
    System.setProperty("webdriver.gecko.driver", driverPath);
    WebDriver driver = new FirefoxDriver();
    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();

    
	driver.get(url); //launch dokkio.com

	Thread.sleep(1000);
	driver.quit();

}
}


