package com.testing.moviles.app.questions;

import com.testing.moviles.app.interactions.customize.TakeScreenshot;
import com.testing.moviles.app.ui.UiLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class MensajeProductos implements Question<String> {

    public static MensajeProductos EnHome(){return new MensajeProductos();}

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(UiLogin.MSG_PRODUCTOS, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds(),
                TakeScreenshot.asEvidence()
        );
        return Text.of(UiLogin.MSG_PRODUCTOS).asString().answeredBy(actor);
    }
}
