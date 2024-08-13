package com.testing.moviles.app.interactions.customize.builders;

import com.testing.moviles.app.interactions.customize.DeviceScreen;

import net.serenitybdd.screenplay.Actor;

public class SwipeBuilderFrom {
	
	private Actor actor;
	
	public SwipeBuilderFrom(Actor actor) {
		this.actor = actor;
	}
	
	public SwipeBuilderTo from (int inicialX, int inicialY) {
		return new SwipeBuilderTo(inicialX, inicialY,actor);
	}
	
	public SwipeBuilderTo fromRight () {
		return new SwipeBuilderTo(
				DeviceScreen.as(actor).getWidth() - 1
				, DeviceScreen.as(actor).getMiddleHeight() 
				, actor);
	}
	
	public SwipeBuilderTo fromLeft () {
		return new SwipeBuilderTo(
				1
				, DeviceScreen.as(actor).getMiddleHeight()
				, actor);
	}
	
	public SwipeBuilderTo fromTop () {
		return new SwipeBuilderTo(
				DeviceScreen.as(actor).getMiddleWidth()
				, 1
				,actor);
	}
	
	public SwipeBuilderTo fromBottom () {
		return new SwipeBuilderTo(
				DeviceScreen.as(actor).getMiddleWidth()
				, DeviceScreen.as(actor).getHeight() - 1
				, actor);
	}
}
