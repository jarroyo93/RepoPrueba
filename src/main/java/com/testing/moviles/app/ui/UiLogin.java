package com.testing.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiLogin {

    public static final Target TXT_USUARIO = Target.the("Campo Usuario").locatedForAndroid(MobileBy.AccessibilityId("test-Usuario")).locatedForIOS(By.id(""));
    public static final Target TXT_PASS = Target.the("Campo Password").locatedForAndroid(MobileBy.AccessibilityId("test-Contraseña")).locatedForIOS(By.id(""));
    public static final Target BTN_LOGIN = Target.the("Campo Password").locatedForAndroid(MobileBy.AccessibilityId("test-LOGIN")).locatedForIOS(By.id(""));
    public static final Target MSG_PRODUCTOS = Target.the("Mensaje Productos").locatedForAndroid(MobileBy.xpath("//*[@text='PRODUCTOS']")).locatedForIOS(By.id(""));

    private UiLogin(){
        throw new IllegalStateException("Error UiLogin");
    }

}
