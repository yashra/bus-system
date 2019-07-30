package stepdef;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POM.pomclass;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;		
public class stepdef 
{				
 	WebDriver d ;
  	pomclass pom;
	
	  @Given("^Open TeamX page$") public void open_conference_web_page() {
	  
	  System.setProperty("webdriver.gecko.driver",
	  "F:\\Capgemini\\geckodriver.exe"); d=new FirefoxDriver();
	  
	  d.get("http://localhost:4200/"); d.manage().window().maximize();
	  
	  }
	  
	  @Then("^verify title$") public void verify_title() throws Throwable { String
	  a=d.getTitle(); if(a.equalsIgnoreCase("TeamX")) {
	  System.out.println("Title is correct-No defect");
	  
	  } else { System.out.println("Title is not correct-A defect"); }
	  
	  }
	  
	  @When("^description blank and click next$") public void
	  description_blank_and_click_next(DataTable dt) throws Throwable {
	  List<List<String>> data = dt.raw();
	  
	  
	  pom=new pomclass(d);
	  
	  pom.description(data.get(0).get(0));
	  
	  pom.next(); }
	  
	  @Then("^alert message for entering comes$") public void
	  alert_message_for_entering_comes() throws Throwable { try { String
	  t=d.switchTo().alert().getText(); d.switchTo().alert().accept();
	  
	  System.out.println(t);
	  
	  if(t.equalsIgnoreCase("Please fill the description")) { System.out.
	  println("on not entering description and clicking next and alert appeared-No defect"
	  ); } else { System.out.
	  println("on not entering description and clicking next and alert did not appeared-A defect"
	  );
	  
	  } } catch(Exception e) { System.out.println("alert did not appear"); } }
	  
	  @When("^enter all \"(.*?)\"$") public void enter_all(String val) throws
	  Throwable { pom=new pomclass(d); pom.description(val); pom.next(); }
	  
	  
	  @Then("^check for messages$") public void check_for_messages() throws
	  Throwable { try { String t=d.switchTo().alert().getText();
	  System.out.println(t); d.switchTo().alert().accept();
	  if(t.equalsIgnoreCase("Thanks for filling feedback")) { System.out.
	  println("on entering all the fields and clicking next alert with text appeared-No defect"
	  ); } else { System.out.
	  println("on entering all the fields and clicking next alert with text did not appear-A defect"
	  );
	  
	  } } catch(Exception e) { System.out.println("alert did not appear"); } }
	 
 
 
 @After
 public void afterScenario1()
 {
    // System.out.println("This will run after the Scenario");
    d.close();
 }
 
}
