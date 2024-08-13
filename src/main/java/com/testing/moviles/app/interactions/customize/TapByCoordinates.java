package com.testing.moviles.app.interactions.customize;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class TapByCoordinates implements Interaction{

	private int x;
	private int y;
	
	public TapByCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	@SuppressWarnings("rawtypes")
	@Step("{0} taps on coordinate (#x, #y)")
	public <T extends Actor> void performAs(T actor) {
		new TouchAction((PerformsTouchActions) GetDriver.as(actor).appiumDriver())
		.tap(new TapOptions()
				.withPosition(
						new PointOption<>().withCoordinates(x, y)))
		.perform()
		.release();

	}
	
}
