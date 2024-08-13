package com.testing.moviles.app.questions;

import com.testing.moviles.app.interactions.customize.TakeScreenshot;
import com.testing.moviles.app.ui.UiCheckInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class MensajeCompra implements Question<String> {

    public static MensajeCompra Exitosa(){return new MensajeCompra();}

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(UiCheckInfo.TXT_MENSAJE, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds(),
                TakeScreenshot.asEvidence()
        );
        return Text.of(UiCheckInfo.TXT_MENSAJE).asString().answeredBy(actor);
    }
}
