package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	//private final String propertyFilePath = System.getProperty("/data.properties");
	static Properties properties = new Properties();
	
	public Properties getProperties() throws IOException {
		try (InputStream readResource = getClass().getResourceAsStream("/data.properties")) {
			properties.load(readResource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}

	public WebDriver initializeDriver() throws IOException {
		String browserName = properties.getProperty("browser");

		if (browserName == "chrome") {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\0027RQ744\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}
         return driver;
	}
}
