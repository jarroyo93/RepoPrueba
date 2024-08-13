package com.testing.moviles.app.interactions.customize;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class Tap {
	
	public static TapByTarget on(Target target) {
		return Tasks.instrumented(TapByTarget.class, target);
	}
	
	public static TapByCoordinates on(int x, int y) {
		return Tasks.instrumented(TapByCoordinates.class, x, y);
	}
}