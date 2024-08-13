package com.testing.moviles.app.interactions.customize;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;

public class GetDriver {

	private Actor actor;

	public GetDriver(Actor actor) {
		this.actor = actor;
	}

	public static GetDriver as(Actor actor) {
		return new GetDriver(actor);
	}

	public AppiumDriver appiumDriver() {
		return (AppiumDriver) webDriver();
	}

	public AppiumDriver androidDriver() {
		return (AppiumDriver) webDriver();
	}

	public AppiumDriver iosDriver() {
		return (AppiumDriver) webDriver();
	}

	public WebDriver webDriver() {
		return ((WebDriverFacade) BrowseTheWeb.as(actor)
				.getDriver())
				.getProxiedDriver();
	}
}