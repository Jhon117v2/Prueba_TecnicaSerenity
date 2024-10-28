package co.com.reliquias.software.definitions;

import co.com.reliquias.software.steps.ProductDeleteSteps;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class ProductDeleteDefinitions {
    @Steps
    private ProductDeleteSteps productDeleteSteps;

    @Dado("que el usuario está en la categoría cumpleaños de la página")
    public void queElUsuarioEstaEnLaCategoriaResponsableDeLaPagina() {
        productDeleteSteps.openIndexPage();
        productDeleteSteps.clickFieldCumpeanos();

    }

    @Cuando("añade el primer producto de cumpleaños al carrito")
    public void agregaElPrimerProductoDeCumpleanosAlCarrito() {
        productDeleteSteps.clickOnProduct();

    }

    @Y("el usuario navega al carrito")
    public void elUsuarioNavegaAlCarrito() {
        productDeleteSteps.addProduct();
    }

    @Entonces("elimina el producto del carrito")
    public void eliminaElProductoDelCarrito() {
        productDeleteSteps.deleteProduct();
    }

    @Y("el usuario observa el mensaje de carrito vacio")
    public void elUsuarioObservaElMensaje() {
        productDeleteSteps.validateSuccesfulDelete();
    }
}
