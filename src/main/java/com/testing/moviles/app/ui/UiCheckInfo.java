package com.testing.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiCheckInfo {

    public static final Target CHECK_NAME = Target.the("Nombre Cliente Checkout").locatedForAndroid(MobileBy.AccessibilityId("test-Nombre")).locatedForIOS(By.id(""));
    public static final Target CHECK_APELLIDO = Target.the("Apellido Cliente Checkout").locatedForAndroid(MobileBy.AccessibilityId("test-Apellido")).locatedForIOS(By.id(""));
    public static final Target CHECK_COD_POSTAL = Target.the("Código Postal Checkout").locatedForAndroid(MobileBy.AccessibilityId("test-Código postal")).locatedForIOS(By.id(""));
    public static final Target BTN_CHECK_CONTINUAR = Target.the("Botón Continuar del Checkout").locatedForAndroid(MobileBy.AccessibilityId("test-CONTINUAR")).locatedForIOS(By.id(""));
    public static final Target MSG_CHECK_RESUMEN = Target.the("Mensaje Resumen").locatedForAndroid(By.xpath("//*[@text='CHECKOUT: RESUMEN']")).locatedForIOS(By.id(""));
    public static final Target BTN_CHECK_RESUMEN = Target.the("Botón Terminar del Checkout").locatedForAndroid(MobileBy.AccessibilityId("test-TERMINAR")).locatedForIOS(By.id(""));
    public static final Target TXT_MENSAJE = Target.the("Mensaje de confirmación Checkout").locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='CHECKOUT: COMPLETADO!']")).locatedForIOS(By.id(""));

    private UiCheckInfo(){
        throw new IllegalStateException("Error UiCheckInfo");
    }
}
