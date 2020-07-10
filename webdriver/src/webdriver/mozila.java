package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mozila {

	public static void main(String[] args) throws InterruptedException {
		//instantiate mozila firefox  browser driver
				System.setProperty("webdriver.gecko.driver","C:/Users/Infosys/Downloads/eclipse/geckodriver.exe");
				
				//create mozila firefox browser driver
				WebDriver driver = new FirefoxDriver();//launches the browser
		        driver.manage().window().maximize();//maximize the browser
			 
		        driver.get("https://auth.testproject.io/auth/realms/TP/protocol/openid-connect/auth?client_id=tp.app&redirect_uri=https%3A%2F%2Fapp.testproject.io%2Fcallback.html&response_type=id_token%20token&scope=openid%20profile&state=bdce8d047b2a4106a80b1b5eb2db878f&nonce=5c24e5c1250f46498e0dc8b5f82ab94a");
			    driver.findElement(By.name("username")).sendKeys("dktaak23@gmail.com");
			    driver.findElement(By.name("password")).sendKeys("Dktaak@1993");
			    //driver.findElement(By.id("tp-checkbox-input-view")).click();
			    driver.findElement(By.id("tp-sign-in")).click();
			    Thread.sleep(10000);//provide a delay of 4 second before capture url, so if syatem is slow so login can be successful before capture url
			    
			    String url=driver.getCurrentUrl();
			    System.out.println(url);
			    
			    //check whether we have logged in or not by camparing loginned url with captured url
			    if (url.equals("https://app.testproject.io/#/home"))    
			    {
			    	System.out.println("Login Succesful");
			    }
			    else
			    {
			    	System.out.println("Login Fail");
			    }
			    driver.close();//close the browser window window

	}

}
