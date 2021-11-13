package automation_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Justdial 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Vishakha\\Edubridge\\Selenium_jar\\chromedriver_win32 (9)\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		
		w.get("https://www.justdial.com/");
        
		
        //What's New tab
		
		w.findElement(By.linkText("What's New")).click();
		
		//for setting option
		
		w.findElement(By.tagName("span")).click();
		
		//For Search Text field and Search Box
		
		w.findElement(By.id("srchbx")).sendKeys("Courier Services For Pune");//Remark - After clicking Search box it take too much time to load
		
		w.findElement(By.cssSelector("#srIcon")).click();
		
		//To close that pop up
		
		//w.findElement(By.xpath("/html/body/section[15]/section/span")).click();
		
		//For about us
		
		w.findElement(By.xpath("//*[@id=\"abtli\"]/a/span")).click();
		
		//For Media 
		
		//w.findElement(By.id("media_sel")).click();
		
		w.findElement(By.xpath("//*[@id=\"media_li\"]/a/span")).click();
		
		//for Market News
		
		w.findElement(By.className("tlftmdnws")).click();
		
		//For Invester Relations
		
		w.findElement(By.className("tlftinvrln")).click();
		
		//For TV Ads
		
		w.findElement(By.className("tlftads")).click();
		
		w.findElement(By.id("dropdownMenu1")).click();
		
		w.findElement(By.linkText("Marathi")).click();
		
		//w.findElement(By.xpath("//*[@id=\"movie_player\"]/div[4]/button")).submit();  //An An error occurred while processing your request. Reference #97.44b72c31.1635818301.81c6711c
		
        //for navigate to back page
		
		//w.navigate().to("https://www.justdial.com/cms/investor-relations/whats-new");
		//w.navigate().back();
		//w.navigate().refresh();
		
		w.navigate().to("https://www.justdial.com/");
		
		//*********************************************************************************************************
        //For Advertise Tab
        //w.navigate().to("https://www.justdial.com/Advertise");
        w.findElement(By.linkText("Advertise")).click();
        
        //w.findElement(By.id("h_adv")).click();
		
		w.findElement(By.id("fcom")).sendKeys("Mansukh Tea");
		
		w.findElement(By.className("slct")).click();
		
		w.findElement(By.xpath("//*[@id=\"salopt\"]/li[3]")).click();
		
		w.findElement(By.name("mn[]")).sendKeys("9191919191");
		
		w.findElement(By.xpath("//*[@id=\"add_div0\"]/div[3]/button")).click();
		
		w.navigate().back();

		w.navigate().to("https://www.justdial.com/");
		
		
		//********************************************************************************************************
		//For English Language
		
		
		w.findElement(By.xpath("/html/body/div[2]/header/section/div/div[2]/ul/li[3]/span/span")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/header/section/div/div[2]/ul/li[3]/ul/li[1]/a")).click();
		
		
//**************************************************************************************************************************		
		//For Free listing
		
				w.findElement(By.linkText("Free Listing")).click();
				
				//For list Detail
				
				w.findElement(By.id("fcom")).sendKeys("Mansukh Tea");
				//w.findElement(By.id("flcity")).clear();
			  // w.findElement(By.id("flcity")).sendKeys("Pune");     //Defect
				
				w.findElement(By.className("slct")).click();
				
				w.findElement(By.xpath("//*[@id=\"salopt\"]/li[3]")).click();
				
				w.findElement(By.name("fname")).sendKeys("Vishakha");
				w.findElement(By.id("lname")).sendKeys("ABC");
		        w.findElement(By.name("mn[]")).sendKeys("9191919191");
		        w.findElement(By.tagName("button")).click();                    
		        
		        //After clicking Submit button
		      
		        //w.findElement(By.linkText("Login / Sign Up")).click();
		        //w.findElement(By.id("lgn_names")).sendKeys("Vishakha");
		        //w.findElement(By.id("lgn_mobs")).sendKeys("9191919191");
		        w.navigate().to("https://www.justdial.com/");                 
		        
//****************************************************************************************************************
		      //For login Button
				
		        w.findElement(By.id("h_login")).click();
		        
		        w.findElement(By.id("lgn_name")).sendKeys("Vishakha");
		        
		        w.findElement(By.id("lgn_mob")).sendKeys("9130482120");
		        
		        
		        w.findElement(By.id("lgn_smtn")).click();
		        
		        Thread.sleep(15000);
		        
		        w.findElement(By.id("otp_submit")).click();
		        
		        w.navigate().to("https://www.justdial.com/");
		        
		      //For Sign up button
		        
		        w.findElement(By.id("h_sin_up")).click();
		        
                w.findElement(By.id("lgn_name")).sendKeys("Vishakha");
		        
		        w.findElement(By.id("lgn_mob")).sendKeys("9130482120");
		        
		        
		        w.findElement(By.id("lgn_smtn")).click();
		        
		        Thread.sleep(15000);
		        
		        w.findElement(By.id("otp_submit")).click();
		
		w.close();
		
		
		
		
	}

}
