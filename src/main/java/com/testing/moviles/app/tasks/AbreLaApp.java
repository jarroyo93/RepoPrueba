package com.testing.moviles.app.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import java.util.logging.Logger;

import com.testing.moviles.app.interactions.customize.TakeScreenshot;

public class AbreLaApp implements Task {

    public AbreLaApp(){}

    public static AbreLaApp swaglabs(){
        return Tasks.instrumented(AbreLaApp.class);
    }

    @Override
    @Step("App SwagLabs abierta")
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre app Swag Labs");
        actor.attemptsTo(TakeScreenshot.asEvidence());
    }
}