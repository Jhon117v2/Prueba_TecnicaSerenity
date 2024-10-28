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

public class ProductDeleteSteps {

    //Traemos las instancias de las pages que creamos:
    @Page
    private IndexPage indexPage;

    @Page
    private MainPageInteraction mainPageInteraction;

    //El texto del @step es para que cuando se genere el reporte salga lo que se hizo en el paso
    @Step("user open index page")
    public void openIndexPage() {
        //Abre el navegador que ira a la url declarada en IndexPage
        indexPage.open();
    }


    @Step("Click Cumpleaños field")
    public void clickFieldCumpeanos() {
        List<WebElementFacade> btnCumpleañosList = indexPage.btnCumpleaños;
        if (btnCumpleañosList.size() > 1) {
            System.out.println("El tamaño de la lista es: " + btnCumpleañosList.size());
            try {
                WebElementFacade elementToClick = btnCumpleañosList.get(3);
                System.out.println("Esperando a que el elemento sea visible...");

                // Mover el cursor al elemento
                System.out.println("Elemento ahora debería ser visible.");
                elementToClick.waitUntilClickable().click();
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

    @Step("delete product in carrito")
    public void deleteProduct() {
        indexPage.eliminarIcono.waitUntilClickable().click();
    }

    @Step("validate carrito")
    public void validateSuccesfulDelete() {
        final String mensajeError = "carrito no está vacio. ";
        String titleActual = mainPageInteraction.getTitleCarritoEmpty();

        // Verificar si el título actual es igual al esperado
        if (titleActual.equals("Tu carrito está vacío.")) {
            System.out.println("El carrito vacio fue exitoso: " + titleActual);
        } else {

            System.out.println(mensajeError + " Se encontró: " + titleActual);
        }

        // Afirmar que el título es el esperado es decir: Tu carrito está vacío.
        assertThat(mensajeError, titleActual, is(equalTo("Tu carrito está vacío.")));
    }
}
