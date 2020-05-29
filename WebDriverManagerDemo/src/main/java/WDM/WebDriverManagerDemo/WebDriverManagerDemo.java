package WDM.WebDriverManagerDemo;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo 
{
	public static void main(String[] args) 
	{
		//Below line is responsible for downloading any browser's executable.exe file from maven global repository to- 
		//- maven local repository i.e .m2
		//We need not to download browserdriver.exe file, below line will automatically do the job
		WebDriverManager.chromedriver().setup();
		
		//to get the path of driver.exe file which is downloaded in maven local repository
		String path = WebDriverManager.chromedriver().getBinaryPath();
		System.out.println("Path of driver.exe file -> "+path);
		
		//to get the downloaded version of driver.exe
		String version = WebDriverManager.chromedriver().getDownloadedVersion();
		System.out.println("Downloaded Version -> "+version);
		
		//Below method allows to remove all binaries previously downloaded by WebDriverManager
		WebDriverManager.chromedriver().clearCache();
		
		//Below line will give you the list of all available versions of driver.exe 
		//List<String> versions = WebDriverManager.chromedriver().getDriverVersions();
		//for (String v : versions) 
		//{
		//			System.out.println(v);
		//}
	
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
	}
}
