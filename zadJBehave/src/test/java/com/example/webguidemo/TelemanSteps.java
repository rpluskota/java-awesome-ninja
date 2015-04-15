package com.example.webguidemo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

public class TelemanSteps {
	
	private final Pages pages;

	public TelemanSteps(Pages pages) {
		this.pages = pages;
	}
	
	@Given("user is on Home page")
    public void userIsOnHomePage(){        
        pages.home().open();        
    }
 
    @When("user opens Sport link")
    public void userClicksOnSportLink(){        
        pages.home().findElement(By.linkText("SPORT")).click();
    }
 
    @Then("Sport page is shown")
    public void sportPageIsShown(){
       assertEquals("Sport w Programie TV - Program telewizyjny Teleman.pl", pages.sport().getTitle());
    }	
    
    @When("user opens Teraz link")
    public void userClicksOnTerazLink(){        
        pages.home().findElement(By.linkText("TERAZ W TV")).click();
    }
 
    @Then("Teraz page is shown")
    public void terazPageIsShown(){
       assertEquals("Teraz i za Chwilê w Programie TV - Aktualny Program TV - Program telewizyjny Teleman.pl", pages.sport().getTitle());
    }	
}
