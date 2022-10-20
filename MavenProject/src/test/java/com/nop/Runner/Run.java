package com.nop.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = { "src/test/resources/Features/" }, // feature file or folder name
	glue = { "stepDefination" }, 
	dryRun = false,//html:Reports/reports1.html
	plugin= {"html:Reports/reports1.html"},
	monochrome = true, publish = true)
public class Run extends AbstractTestNGCucumberTests{

}
