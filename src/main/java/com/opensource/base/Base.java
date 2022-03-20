package com.opensource.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {

	private WebDriver driver;

	/*
	 * Constructor
	 * 
	 * @author Cristian Cossio
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */
	public Base(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * Reporter
	 * 
	 * @author Cristian Cossio
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */
	public void reporter(String log) {
		Reporter.log(log);
	}

	/*
	 * Set WebDriver
	 * 
	 * @author Cristian Cossio
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */
	public WebDriver chromeDriver() {
		System.setProperty(GlobalVariables.CHROME_DRIVER_KEY, GlobalVariables.CHROME_DRIVER_NAME);
		driver = new ChromeDriver();
		return driver;
	}

	/*
	 * Implicitly wait
	 * 
	 * @author Cristian Cossio
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */
	public void implicitlyWait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Launch browser
	 * 
	 * @author Cristian Cossio
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */
	public void launchBrowser(String url) {
		reporter("Launch Browser... " + url);
		driver.get(url);
		driver.manage().window().maximize();
		implicitlyWait();
		takeScreenshot("launchBrowser");
	}

	/*
	 * Constructor
	 * 
	 * @author Cristian Cossio
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */

	/*
	 * Constructor
	 * 
	 * @author Cristian Cossio
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */

	/*
	 * Constructor
	 * 
	 * @author Cristian Cossio
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */

	/*
	 * Constructor
	 * 
	 * @author Cristian Cossio
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */

	/*
	 * Constructor
	 * 
	 * @author Cristian Cossio
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */

}
