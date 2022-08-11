package testRunners;

import org.junit.runner.RunWith;

import com.rp.constants.Constants;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features={Constants.FEATURE_FILES},
						glue = {Constants.GLUE,Constants.APP_HOOKS},
						plugin = {
								"json:target/MyReports/report.json",
								"junit:target/MyReports/report.xml"}
					//	publish = true
	)


	public class TestRunner {

	}
