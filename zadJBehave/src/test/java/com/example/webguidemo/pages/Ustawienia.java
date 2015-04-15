package com.example.webguidemo.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

public class Ustawienia extends WebDriverPage{
	
	public Ustawienia(WebDriverProvider driverProvider) {
		super(driverProvider);		
	}

	public void open() {
		get("http://www.teleman.pl/moje-stacje");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
