package co.com.reliquias.software.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At("https://www.floristeriamundoflor.com/carrito/")
public class MainPage extends PageObject {

    //Para comprobar que la interaccion fue exitosa

    @FindBy(xpath = "//h1[text()='Carrito']")
    public WebElementFacade txtTitleMainPage;

    @FindBy(xpath = "//p[text()='Tu carrito está vacío.']")
    public WebElementFacade txtTitleDeleteCarrito;

}
