package co.com.reliquias.software.steps;

import co.com.reliquias.software.pages.interacciones.MainPageInteraction;
import co.com.reliquias.software.pages.mapeos.IndexPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class IndexSteps {

    //Traemos las instancias de las pages que creamos:
    @Page
    private IndexPage indexPage;

    @Page
    private MainPageInteraction mainPageInteraction;

    //El texto del @step es para que cuando se genere el reporte salga lo que se hizo en el paso
    @Step("user open index page")
    public void openIndexPage() {
        //Abre el navegador que ira a la url declarada en loginpage
        indexPage.open();
    }


    @Step("Click Amor field")
    public void clickFieldsAmor() {
        List<WebElementFacade> btnAmorList = indexPage.btnAmor;
        if (btnAmorList.size() > 1) {
            System.out.println("El tamaño de la lista es: " + btnAmorList.size());
            try {
                WebElementFacade elementToClick = btnAmorList.get(3);
                System.out.println("Esperando a que el elemento sea visible...");

                // Mover el cursor al elemento
                System.out.println("Elemento ahora debería ser visible.");
                elementToClick.waitUntilClickable().click(); // Espera y hace clic
            } catch (Exception e) {
                System.out.println("Error al intentar hacer clic en el elemento: " + e.getMessage());
            }
        } else {
            System.out.println("No se encontraron suficientes productos con el texto 'Amor'.");
        }
    }

    @Step("click product")
    public void clickOnProduct() {
        List<WebElementFacade> btnProductList = indexPage.txtProduct;

        if (btnProductList.size() >= 1) {
            System.out.println("El tamaño de la lista es: " + btnProductList.size());
            try {
                WebElementFacade elementToClick = btnProductList.get(0);
                System.out.println("Esperando a que el elemento sea visible...");

                // Mover el cursor al elemento
                System.out.println("Elemento ahora debería ser visible.");
                elementToClick.waitUntilClickable().click(); // Espera y hace clic
            } catch (Exception e) {
                System.out.println("Error al intentar hacer clic en el elemento: " + e.getMessage());
            }
        } else {
            System.out.println("No se encontraron suficientes productos con el texto 'MDF 0001'.");
        }
    }

    @Step("add product in carrito")
    public void addProduct() {
        indexPage.btnAddProduct.waitUntilClickable().click();
    }

    @Step("Continuar Comprando")
    public void continueComprando() {
        indexPage.btnSeguirComprando.waitUntilClickable().click();
    }

    @Step("add product 2 in carrito")
    public void addProduct2() {
        indexPage.btnAddProduct.waitUntilClickable().click();
    }

    @Step("validate carrito")
    public void validateSuccesfulLogin() {
        final String mensajeError = "carrito no está. ";
        String titleActual = mainPageInteraction.getTitleMainPage();


        if (titleActual.equals("Carrito")) {
            System.out.println("El carrito fue exitoso: " + titleActual);
        } else {
            // Si hay un fallo, mostrar el mensaje de error
            System.out.println(mensajeError + " Se encontró: " + titleActual);
        }

        // Afirmar que el título de la página es el esperado
        assertThat(mensajeError, titleActual, is(equalTo("CARRITO")));
    }


}

