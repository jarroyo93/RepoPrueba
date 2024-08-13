package com.testing.moviles.app.ui;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiPLP {

    public static final Target BTNS_ADD = Target.the("Botón Agregar").locatedForAndroid(AppiumBy.xpath("//*[@class='android.view.ViewGroup' and @content-desc='test-AÑADIR A CARRITO']")).locatedForIOS(By.id(""));
    public static final Target LBL_NAME_ARTICULOS = Target.the("Nombre de Artículos").locatedForAndroid(MobileBy.xpath("//*[@class='android.widget.TextView' and @content-desc='test-Titulo de articulo']")).locatedForIOS(By.id(""));
    public static final Target BTN_CARRITO = Target.the("Botón Carrito").locatedForAndroid(AppiumBy.xpath("//*[contains(@content-desc,'test-Carrito')]")).locatedForIOS(By.id(""));
    public static final Target BTN_CHECKOUT = Target.the("Botón Checkout").locatedForAndroid(AppiumBy.accessibilityId("test-CHECKOUT")).locatedForIOS(By.id(""));

    private UiPLP(){
        throw new IllegalStateException("Error UiPLP");
    }
}
