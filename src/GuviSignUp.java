import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviSignUp {
	public GuviSignUp() {
		//set system property for the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FELCY\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	}
		
	public void guviSignupProcess() {
		//initialize chrome driver 
		WebDriver driver = new ChromeDriver();
		//Maximizing the window 
		driver.manage().window().maximize();
				
		//Navigating the URL
		driver.get("https://www.guvi.in/register");
		//Using ImplicitlyWait for page to wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
        //using classname locator for name field 
		driver.findElement(By.className("form-control")).sendKeys("Felcy");
		//using id locator for email id 
		driver.findElement(By.id("email")).sendKeys("felcygrace0011@gmail.com");
		//using xpath for password 
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Felcy@12s");
        //using cssselctor locator for mobile number
        driver.findElement(By.cssSelector("input[id='mobileNumber']")).sendKeys("6381698553");
        driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
		//Using tagName locator for Current Profile
		driver.findElement(By.tagName("select")).sendKeys("Students");
		
		//Using id locator for Degree and Year
		driver.findElement(By.id("degreeDrpDwn")).sendKeys("Higher Secondary");
		driver.findElement(By.id("year")).sendKeys("2016");

		//Closing the driver
		driver.close();


	}
	
	public static void main(String []args) {
		GuviSignUp guvisignup = new GuviSignUp();
		guvisignup.guviSignupProcess();
	}

}
