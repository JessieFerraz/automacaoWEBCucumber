package steps;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;

import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class LoginSteps {
    private LoginPage loginPage;
    private String usuario;

    @Dado("que esteja na página da lojinha")
    public void queEstejaNaPáginaDaLojinha() {
        Driver.getDriver().get("http://165.227.93.41/lojinha-web/v2/");
        loginPage = new LoginPage();
    }
    @Quando("o login for realizado com os seguintes dados")
    public void oLoginForRealizadoComOsSeguintesDados(Map<String, String> map) {
        loginPage.realizarLogin(map.get("usuario"), map.get("senha"));
        usuario = map.get("usuario");
    }
    @Entao("valido que o login foi realizado")
    public void validoQueOLoginFoiRealizado() {
        assertEquals("Boas vindas, Jéssica Ferraz!", loginPage.getBoasVindas());
    }


    @Before
    public void inicializaTeste(){
        Driver.inicializaNavegador();
    }

    @After
    public void finalizaTeste(){
        Driver.getDriver().quit();
    }
}
