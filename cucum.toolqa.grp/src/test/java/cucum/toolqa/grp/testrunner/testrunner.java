package cucum.toolqa.grp.testrunner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"cucum.toolqa.grp.stepdef"},
        monochrome = true,         
        dryRun = false
        )
 
public class testrunner extends AbstractTestNGCucumberTests {

	

    @DataProvider(parallel = false)
    public  Object[][] scenarios(){
        return super.scenarios();
    }
}
