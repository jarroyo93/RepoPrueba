package com.testing.moviles.app.tasks;

import com.testing.moviles.app.interactions.customize.BusquedaDeProducto;
import com.testing.moviles.app.models.InfoCompra;
import com.testing.moviles.app.ui.UiPLP;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AgregaArticulos implements Task {

    List<InfoCompra> articulo;

    public AgregaArticulos(List<InfoCompra> articulosAcomprar) {
        articulo = articulosAcomprar;
    }

    public static AgregaArticulos alCarrito(List<InfoCompra> articulosAcomprar){return Tasks.instrumented(AgregaArticulos.class, articulosAcomprar);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(UiPLP.LBL_NAME_ARTICULOS, isPresent()).forNoMoreThan(15).seconds(),
                BusquedaDeProducto.aComprar(articulo)
        );
    }
}
