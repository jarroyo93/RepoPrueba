package com.testing.moviles.app.interactions.customize;

import com.testing.moviles.app.interactions.customize.builders.SwipeBuilderFrom;

import net.serenitybdd.screenplay.Actor;

public class Swipe {
	
	public static SwipeBuilderFrom as (Actor actor) {
		return new SwipeBuilderFrom(actor);
	}
}
