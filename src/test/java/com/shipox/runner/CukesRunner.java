package com.shipox.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt" ,
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber/cucumber.json"
        },

        features = "src/test/resources",
        glue = "com/shipox/step_definitions",
        dryRun = false,
        tags = "@w",
        publish = false
)
public class CukesRunner {
}
