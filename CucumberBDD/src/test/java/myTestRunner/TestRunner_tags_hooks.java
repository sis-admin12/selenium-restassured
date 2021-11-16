package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="Features",
		//features="C:/Users/admin/eclipse-workspace/CucumberAMBatch/Features/Tagging.feature",
		features="C:/Users/admin/eclipse-workspace/CucumberAMBatch/Features/Hooks.feature",
		glue="stepDefinitions",
		format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
		dryRun=false,
		monochrome=true,
		strict=false
		//tags={"@SanityTest"} // execute only Sanity Tests
		//tags={"@SanityTest, @RegressionTest"} // execute only sceanrios which are comes under sanity OR regression
		//tags={"@RegressionTest","@End2End"} //execute sceanrios comes under both Regressions and End2End
		//tags={"@SanityTest","@End2End"} //execute sceanrios comes under both Sanity and End2End
		//tags={"~@End2End"}   // This will ignore End2End scenarios
		//tags={"~@End2End","~@SanityTest"} // This will ignore Sanity & End2End
		)
public class TestRunner_tags_hooks {

}
