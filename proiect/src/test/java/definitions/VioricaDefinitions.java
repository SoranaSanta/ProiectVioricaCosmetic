package definitions;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VioricaDefinitions {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

//pasi care se repeta la mai multe teste

    @Given("the user opens the browser")
    public void userOpensBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        actions = new Actions(driver);
    }

    @Given("the user navigates to the homepage")
    public void userNavigatesToHomepage() {
        //accesam pagina
        driver.get("https://vioricacosmetic.ro/");
    }

    @Given("the user accepts cookies")
    public void userAcceptsCookies() {
        //acceptam cookies
        WebElement permiteTotul = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cs_preview_popup\"]/div/div/div[2]/div[1]/div/div/div[2]/div/button[2]")));
        permiteTotul.click();
    }

    @Given("the user closes newsletter popup")
    public void userClosesNewsletterPopup() {
        //inchidem newsletter pop-up
        WebElement inchiderePopup = driver.findElement(By.className("mc-closeModal"));
        //asteptam din nou sa se incarce pagina
        wait.until(ExpectedConditions.stalenessOf(inchiderePopup));
        //miscam mouse-ul ca sa apara popup newsletter
        actions.scrollByAmount(0, 10).build().perform();
        //luam din nou butonul si dam click pe el
        WebElement inchiderePopupDupaReincarcare = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mc-closeModal")));
        inchiderePopupDupaReincarcare.click();
    }

//@viorica1 - Register

    @When("the user opens the login popup")
    public void userOpensLoginPopup() {
        //deschidem pop-up de login/register
        WebElement loginRegister = driver.findElement(By.cssSelector("[href=\"https://vioricacosmetic.ro/contul-meu/\"]"));
        loginRegister.click();
    }

    @When("the user opens the register form")
    public void userOpensRegisterForm() {
        //deschidem formularul de register
        WebElement creatiUnCont = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Creați un cont")));
        creatiUnCont.click();
    }

    @When("the user completes all the mandatory fields")
    public void userCompletesAllMandatoryFields() {
        //completam formularul de register
        WebElement numeUtilizator = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nasa_reg_username")));
        numeUtilizator.sendKeys("SoranaSanta126");
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nasa_reg_email")));
        email.sendKeys("sorana.chiorean+126@gmail.com");
        WebElement parola = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nasa_reg_password")));
        parola.sendKeys("Parola126!");
        WebElement dataNasterii = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("account_dob")));
        dataNasterii.sendKeys("10101989");
        //debifam abonarea la newsletter
        WebElement abonareNewsletter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mailchimp_woocommerce_newsletter")));
        abonareNewsletter.click();
        //creem cont
        WebElement creeazaCont = driver.findElement(By.name("nasa_register"));
        creeazaCont.click();
    }

    @Then("the new account is created")
    public void newAccountIsCreated() {      
        WebElement loginRegister = driver.findElement(By.cssSelector("[href=\"https://vioricacosmetic.ro/contul-meu/\"]"));
        //asteptam din nou sa se incarce pagina
        wait.until(ExpectedConditions.stalenessOf(loginRegister));
        //luam din nou butonul si dam click pe el
        WebElement loginRegisterDupaReincarcare = driver.findElement(By.cssSelector("[href=\"https://vioricacosmetic.ro/contul-meu/\"]"));
        loginRegisterDupaReincarcare.click();
        //comparam titlul paginii
        String title = driver.getTitle();
        assertEquals("Contul meu - Viorica Cosmetic Romania", title);
    }

//@viorica2 - AdaugareProdusInCos

    String numeProdus;
    String pretProdus;

    @Given("the user navigates to the Creme page")
    public void userNavigatesToCreme() {
        //accesam pagina
        driver.get("https://vioricacosmetic.ro/ten/creme/");
    }

    @When("the user chooses the first product")
    public void userChoosesFirstProduct() {
        //gasim numele produsului
        WebElement elementNumeProdus = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"products\"]/div[1]/ul/li[1]/div/div[2]/a[1]/h2/small")));
        numeProdus = elementNumeProdus.getText();
        //gasim pretul produsului
        WebElement elementPretProdus = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"products\"]/div[1]/ul/li[1]/div/div[2]/span/span")));
        pretProdus = elementPretProdus.getText();
    }

    @When("the user adds the product to the cart")
    public void addToCart() {
        //gasim butonul de adaugare in cos
        WebElement butonAdaugareProdus = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"products\"]/div[1]/ul/li[1]/div/div[2]/a[2]")));
        //mutam mouse-ul pe buton si dam click - necesar pentru ca altfel nu se poate da click fiindca este un element deasupra
        actions.moveToElement(butonAdaugareProdus).click().perform();
    }

    @Then("the correct product name and price will be displayed in the cart")
    public void checkCorrectProduct() {
        //comparam numele primului produs din pagina cu numele primului produs din cos
        WebElement produsCos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart-sidebar\"]/div[2]/div[1]/div/div/div[2]/div/div[1]/a")));
        //pe pagina numele este cu majuscule, aducem la acelasi format
        assertEquals(numeProdus, produsCos.getText().toUpperCase());
        //verificam pretul
        WebElement pretCos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart-sidebar\"]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[1]/div[2]/span")));
        assertEquals(pretProdus, pretCos.getText());
        //verificam cantitatea
        WebElement cantitateCos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[14]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[1]/div[1]/input")));
        //nu putem folosi getText ca sa obtinem cantitatea din cos, o luam de pe atributul value
        assertEquals("1", cantitateCos.getDomAttribute("value"));
        //inchidem cosul
        WebElement butonInchidereCos = driver.findElement(By.xpath("//*[@id=\"cart-sidebar\"]/div[1]/a"));
        butonInchidereCos.click();
    }

//@viorica3 - DeliveryAndReturn

    @When("the user chooses the first best-seller product")
    public void chooseFirstBestseller() {
        //gasim toate imaginile de produse  
        List<WebElement> produse = driver.findElements(By.className("link-absolute"));
        //alegem prima imagine si dam click pe ea 
        WebElement primulProdus = produse.get(0);
        actions.moveToElement(primulProdus).click().perform();
    }

    @When("the user opens the delivery and return popup")
    public void openDeliveryPopup() {
        //gasim delivery & return si dam click
        WebElement deliveryReturn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Delivery & Return")));
        actions.moveToElement(deliveryReturn).click().perform();    
    }

    @Then("the correct information is displayed")
    public void correctInfoDisplayed() {
        //gasim popup cu termeni si conditii
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nasa-content-delivery-return")));
        //cautam titlurile dorite in text
        assertTrue(popup.getText().contains("Dreptul de retragere"));
        assertTrue(popup.getText().contains("Efectele retragerii"));
        //inchidem popup
        WebElement inchidereDeliveryReturn = driver.findElement(By.cssSelector("#nasa-content-delivery-return > a"));
        inchidereDeliveryReturn.click();
    }

//@viorica4 - UpdatePassword

    @Given("the user navigates to the edit account page")
    public void editAccountPage() {
        //accesam pagina
        driver.get("https://vioricacosmetic.ro/contul-meu/edit-account/");
    }

    @When("the user logins")
    public void login() {
        WebElement numeUtilizator = driver.findElement(By.id("username"));
        numeUtilizator.sendKeys("sorana.chiorean+126@gmail.com");
        WebElement parola = driver.findElement(By.id("password"));
        parola.sendKeys("Parola126!");
        WebElement autentificare = driver.findElement(By.cssSelector("button[name=\"login\"]"));
        actions.moveToElement(autentificare).click().perform();
    }

    @When("the user completes all the necessary fields")
    public void completeNecessaryFields() {
        //completam campurile obligatorii care sunt goale
        WebElement prenume = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("account_first_name")));
        prenume.sendKeys("Sorana");
        WebElement nume = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("account_last_name")));
        nume.sendKeys("Santa");

        //completam parola actuala si cea noua
        WebElement parolaActuala = driver.findElement(By.id("password_current"));
        parolaActuala.sendKeys("Parola126!");
        WebElement parolaNoua = driver.findElement(By.id("password_1"));
        parolaNoua.sendKeys("Parola126@");
        WebElement confirmareParolaNoua = driver.findElement(By.id("password_2"));
        confirmareParolaNoua.sendKeys("Parola126@");

        WebElement salveazaModificarile = driver.findElement(By.name("save_account_details"));
        actions.moveToElement(salveazaModificarile).click().perform();
    }

    @Then("the password is updated successfully")
    public void passwordUpdated() {
        WebElement mesaj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("woocommerce-notices-wrapper")));
        //System.out.println(mesaj.getText());
        assertEquals("Am modificat cu succes detaliile contului.", mesaj.getText());
    }
    
//@viorica5 - Review

    @When("the user finds the product using the search box")
    public void findProduct() {
        //gasim produsul folosind search box
        WebElement searchIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"masthead\"]/div[1]/div/div[1]/div[3]/div/ul/li[2]/a")));
        searchIcon.click();
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nasa-input-1")));
        searchBox.sendKeys("ser vitamina c");
        WebElement linkProdus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href=\"https://vioricacosmetic.ro/produs/ser-cu-10-vitamina-c-viorica-vie/\"]")));
        linkProdus.click();
    }

    @When("the user opens the review popup")
    public void openReviewPopup() {
        //deschidem popup review
        WebElement scrieRecenzie = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"reviews\"]/div[3]/a")));
        //avem un cos plutitor care se pune deasupra butonului si intercepteaza clickul
        actions.scrollToElement(scrieRecenzie).perform();
        actions.scrollByAmount(0,500);
        actions.moveToElement(scrieRecenzie).click().perform();
    }

    @When("the user completes the message and leaves score empty")
    public void completeMessage() {
        //completam formularul
        WebElement recenzie = driver.findElement(By.name("comment"));
        recenzie.sendKeys("foarte bun");
        WebElement autor = driver.findElement(By.name("author"));
        autor.sendKeys("Mariana");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("test2@test.com");
        WebElement trimite = driver.findElement(By.id("nasa-submit"));
        trimite.click();
    }

    @Then("the review is not added and error message appears")
    public void reviewNotAdded() {
        WebElement eroare = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"commentform\"]/p[2]/span")));
        assertEquals("This field is required.", eroare.getText());
    }

//pas care se repeta la toate testele

    @Then("the user closes the browser")
    public void userClosesBrowser() {
        driver.quit();
    }
}
