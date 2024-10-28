package co.com.reliquias.software.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.List;


//El @url Sirve para que busque la pagina
@DefaultUrl("https://www.floristeriamundoflor.com/")
public class IndexPage extends PageObject {

    //Categorias localizadas

    @FindBy(xpath = "//a[text()='Amor']")
    public List<WebElementFacade> btnAmor;  // Cambiamos a una lista

    //Para el campo ProductDeleteDefinitions

    @FindBy(xpath = "//a[text()='Cumpleaños']")
    public List<WebElementFacade> btnCumpleaños;

    // Método para hacer clic en el primer elemento


    @FindBy(xpath = "//div[@data-product-id='4100']//a[contains(@class, 'product-image')]")
    public List<WebElementFacade> txtProduct;  // Cambiamos a una lista

    @FindBy(xpath = "//button[text()='Añadir al carrito']")
    public WebElementFacade btnAddProduct;

    @FindBy(xpath = "//a[text()='Seguir comprando']")
    public WebElementFacade btnSeguirComprando;

    @FindBy(xpath = "//button[@data-target='#searchformshow-KWYfZ']")
    public WebElementFacade btnsearch;

    // btn eliminar
    @FindBy(xpath = "//a[@title='Remove this item']")
    public WebElementFacade eliminarIcono;


}
