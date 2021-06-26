import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class LoginTests {
    private String mail;
    private String contrasenia;
    private String mailIngresado;
    private String contraseniaIngresada;
    private String loginExitoso = "Login exitoso";
    private String loginFallido = "Mail o contrasenia incorrecta, vuelva a intentar";
    private String respuesta;

    String verificoCredenciales (String mailIngresado, String contraseniaIngresada) {
        if (mailIngresado.equals(mail) && contraseniaIngresada.equals(contrasenia)) return loginExitoso;
        return loginFallido;
    }

    @Given("^Me registro con el mail: \"([^\"]*)\" y contrasenia: \"([^\"]*)\"$")
    public void meRegistroConElMailYContrasenia(String arg0, String arg1) throws Throwable {
        mail = arg0;
        contrasenia = arg1;
    }

    @When("^Me logueo con \"([^\"]*)\" y \"([^\"]*)\"$")
    public void meLogueoConY(String arg0, String arg1) throws Throwable {
        mailIngresado = arg0;
        contraseniaIngresada = arg1;
        respuesta = verificoCredenciales(arg0,arg1);
    }


    @Then("^Se me indica \"([^\"]*)\"$")
    public void seMeIndica(String respuestaObtenida) throws Throwable {
        assertEquals(respuesta,respuestaObtenida);
    }
}
