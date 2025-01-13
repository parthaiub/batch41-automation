package com.testrun;


	


	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.cucumber.java.Before;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;



	@CucumberOptions(
		
		plugin = {"json:target/cucumber.json"},
		features = {"src/main/resources/PositiveLoginTest.feature"},
		glue= {"com.generic"},
		tags= { "@smoke" ,"@positive"},

		dryRun=false,
		strict=true,
		monochrome=true
		)
				
		public class Runner extends AbstractTestNGCucumberTests{
		
		
		@Before
		public void setup1() {
			
		}
			
		@BeforeTest
		public void setup2() {
		}
		
		@Test
		void setup3() {
				
			
	}}


