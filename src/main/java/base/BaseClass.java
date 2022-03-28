package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;

	// to read from properties file
	public void loadConfig() throws IOException
	{
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
				+ "C:\\Users\\Yamini Rahul\\eclipse-workspace\\E-commerse\\src\\main\\java\\configuration\\Config.properties");
		prop.load(ip);
	}
	
	//
	public void lauchApp() {
		String browserName = prop.getProperty("browser");

	if (browserName.equalsIgnoreCase("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Obsqura\\JAVA\\chromedriver_win32 Latest Version\\chromedriver.exe");
		driver = new ChromeDriver();
			
	}

	else if (browserName.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver", "D:\\Obsqura\\JAVA\\msedgedriver.exe");
		driver = new EdgeDriver();
	
	} 
	driver.manage().window().maximize();
}
}
