package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\New folder\\My Folder\\selenium app\\workspace\\subasam\\src\\test\\resources\\Features\\Feature.feature",glue="Loginpackage.java")

public class TestRunner {

}

