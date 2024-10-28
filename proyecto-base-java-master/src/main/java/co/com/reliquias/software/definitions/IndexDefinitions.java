package co.com.reliquias.software.definitions;

import co.com.reliquias.software.steps.IndexSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;


public class IndexDefinitions {

    //Le decimos a serenity que debe administrar la instancia que debe crear del objeto
    @Steps
    private IndexSteps indexSteps;


    @Dado("que el usuario esta en la categoria amor de la pagina")
    public void queElUsuarioEstaEnLaCategoriaAmorDeLaPagina() {
        indexSteps.openIndexPage();
        indexSteps.clickFieldsAmor();
    }

    @Cuando("añade el primer producto al carrito")
    public void anadeElPrimerProductoAlCarrito() {
        indexSteps.clickOnProduct();
        indexSteps.addProduct();
    }

    @Entonces("continua comprando")
    public void continuaComprando() {
        indexSteps.continueComprando();

    }

    @Y("el usuario añade el segund producto al carrito")
    public void elUsuarioAnadeElSegundProductoAlCarrito() {
        indexSteps.addProduct();

    }

    @Entonces("termina el proceso")
    public void terminaElProceso() {
        indexSteps.validateSuccesfulLogin();
    }
}
