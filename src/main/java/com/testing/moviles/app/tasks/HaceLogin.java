package com.testing.moviles.app.tasks;

import com.testing.moviles.app.ui.UiLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class HaceLogin implements Task {

    //CredencialesLogin credLog;

    String user;
    String pass;

    public HaceLogin(String user, String pass){
        this.user = user;
        this.pass = pass;
    }

    public static HaceLogin correctamenteEnLaApp(String user, String pass){
        return Tasks.instrumented(HaceLogin.class, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(UiLogin.TXT_USUARIO),
                Enter.theValue(pass).into(UiLogin.TXT_PASS),
                Click.on(UiLogin.BTN_LOGIN)
        );
    }
}
