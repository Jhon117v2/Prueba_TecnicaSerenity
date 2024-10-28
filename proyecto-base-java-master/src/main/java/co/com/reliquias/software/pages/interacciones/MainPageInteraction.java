package co.com.reliquias.software.pages.interacciones;

import co.com.reliquias.software.pages.mapeos.MainPage;
import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;

public class MainPageInteraction extends PageObject {

    //Instancia de mainpage
    @Page
    private MainPage mainPage;

    public String getTitleMainPage() {

        //metodo que retorna el texto que queremos
        return mainPage.txtTitleMainPage.waitUntilVisible().getText();

    }

    public String getTitleCarritoEmpty() {

        //metodo que retorna el texto que queremos
        return mainPage.txtTitleDeleteCarrito.waitUntilVisible().getText();

    }
}
