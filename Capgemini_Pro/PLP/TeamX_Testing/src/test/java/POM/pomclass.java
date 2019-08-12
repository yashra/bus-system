package POM;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class pomclass
{
	WebDriver driver;
	   @FindBy(how = How.XPATH,using="//*[@id=\"feedback\"]") 
	   public static WebElement description;
	 
	   @FindBy(how = How.XPATH,using="/html/body/app-root/add/html/body/div/div[1]/form/div/div/div[4]/div/input") 
	   public static WebElement submit;
	   
	   public pomclass(WebDriver driver)
	   {
	       this.driver = driver;
	       PageFactory.initElements(driver, this);
	       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   }
	    
	     public void description(String n)
	     {
	    	 description.sendKeys(n);
	     }
	     
	     
	     
	     public void next()
	     {
	    	 submit.click();
	     }	   
	   
   
}
