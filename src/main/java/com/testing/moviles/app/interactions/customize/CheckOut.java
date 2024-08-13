package com.testing.moviles.app.interactions.customize;

import com.testing.moviles.app.models.InfoCompra;
import com.testing.moviles.app.ui.UiCheckInfo;
import com.testing.moviles.app.ui.UiPLP;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class CheckOut implements Interaction {

    List<InfoCompra> datosCheck;

    public CheckOut(List<InfoCompra> datosCheck) {
        this.datosCheck = datosCheck;
    }

    public static CheckOut Completado(List<InfoCompra> datosCheck){
        return Tasks.instrumented(CheckOut.class, datosCheck);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(UiPLP.BTN_CARRITO, isEnabled()).forNoMoreThan(15).seconds(),
                Click.on(UiPLP.BTN_CARRITO),
                Click.on(UiPLP.BTN_CHECKOUT),
                Enter.theValue(datosCheck.get(0).getNombreCheck()).into(UiCheckInfo.CHECK_NAME),
                Enter.theValue(datosCheck.get(0).getApellidoCheck()).into(UiCheckInfo.CHECK_APELLIDO),
                Enter.theValue(datosCheck.get(0).getCodPostalCheck()).into(UiCheckInfo.CHECK_COD_POSTAL),
                Click.on(UiCheckInfo.BTN_CHECK_CONTINUAR),
                WaitUntil.the(UiCheckInfo.MSG_CHECK_RESUMEN, isPresent()).forNoMoreThan(15).seconds(),
                SwipeByCoordinates.scorll(532, 1600, 540, 505),
                Click.on(UiCheckInfo.BTN_CHECK_RESUMEN)
        );
    }
}
