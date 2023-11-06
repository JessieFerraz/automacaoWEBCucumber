package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMaps {
    @FindBy(id="usuario")
    public WebElement inpLogin;
    @FindBy(id="senha")
    public WebElement inpSenha;
    @FindBy(css="button")
    public WebElement btnEntrar;
    @FindBy(css="#nav-mobile > li:nth-child(1) > a")
    public WebElement linkBoasVindas;
}
