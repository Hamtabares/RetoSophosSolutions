package com.plazavea.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\com\\plazavea\\www\\features\\PlazaVea.feature",
				 glue ="com.plazavea.www.definitions",
				 snippets = SnippetType.CAMELCASE)
public class PlazaveaRunnerTestSite {

}
