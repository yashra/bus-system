package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features={"F:\\Capgemini\\Selenium\\lpua2\\src\\test\\java\\features\\a.feature"}
		,glue="F:\\Capgemini\\Selenium\\lpua2\\src\\test\\java\\stepdef\\stepdef.java"
		,plugin = {"pretty", "html:target/TeamX-report"}
		,monochrome=true
		,dryRun = true		
		)
public class r
{    

}

 