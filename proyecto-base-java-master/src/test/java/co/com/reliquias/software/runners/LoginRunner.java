package co.com.reliquias.software.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class) //-> Para trabajar con Cucumber y Serenity
//@RunWith(SerenityRunner.class)
//@RunWith(JUnit4.class)
@CucumberOptions(
        features = "src/test/resources/features/product/inicio_productos.feature",
        glue = "co.com.reliquias.software.definitions", //POM, copiamos la referencia de donte esta la definicion en main
//        glue = "co.com.reliquias.software.stepdefinitions", //Screenplay
        snippets = CucumberOptions.SnippetType.CAMELCASE, //navegarPaginaWeb, para que los metodos empiecen de esa manera
        plugin = "pretty",
        tags = "@SeleccionProductosExistoso or @SeleccionEliminarProductosExitoso" //El feature de SeleccionProductosExistoso, solo ejecuta lso que tengan este tag
)
public class LoginRunner {
}
