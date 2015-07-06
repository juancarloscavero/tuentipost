import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by juancarlos.cavero on 06/07/2015.
 */
public class TuentiPost {
@Test
    public void test(){
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.tuenti.com/?m=Login");
    WebDriverWait wait = new WebDriverWait(driver,10);

    WebElement email = driver.findElement(By.id("email"));
    WebElement pass = driver.findElement(By.id("input_password"));
    WebElement login =driver.findElement(By.id("submit_button"));

    email.sendKeys("enrique+pedobear@tuenti.com");
    pass.sendKeys("tuentitest");
    login.click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sharebox_commentfield_75042979")));

    WebElement text =driver.findElement(By.id("sharebox_commentfield_75042979"));
    WebElement coment =driver.findElement(By.id("sharebox_savebutton_75042979"));

    text.sendKeys("Hola ni\u00f1os, \u00f1am \u00f1am");
    coment.click();

}
}
