package com.bookit.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/report.html",
                "rerun:target/rerun.txt"
                },
        features = "src/test/resources/features",
        glue = "com/bookit/stepdefinition",
        tags = "",
        dryRun = false



)


public class Runner {
}
