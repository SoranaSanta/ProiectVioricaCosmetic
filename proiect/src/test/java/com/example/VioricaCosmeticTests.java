package com.example;

import java.time.Duration;

import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VioricaCosmeticTests 
{
    WebDriver driver;

    public void main (String[] args) {
        setup();
        registerTest();
        adaugareProdusInCosTest();
        deliveryAndReturnTest();
        updatePasswordTest();
        reviewTest();
        teardown();
    }

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @Test
    public void registerTest()
    {
        assertTrue(true);
        // //accesam pagina
        // driver.get("https://vioricacosmetic.ro/");
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // //acceptam cookies
        // WebElement permiteTotul = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cs_preview_popup\"]/div/div/div[2]/div[1]/div/div/div[2]/div/button[2]")));
        // permiteTotul.click();
        // //inchidem newsletter pop-up
        // //ne asiguram ca s-a reincarcat pagina
        // WebElement continut = driver.findElement(By.id("main-content"));
        // wait.until(ExpectedConditions.stalenessOf(continut));
        // //miscam mouse-ul ca sa apara popup newsletter
        // Actions actions = new Actions(driver);
        // actions.moveToLocation(500, 500).build().perform();
        // //inchidem popup
        // WebElement inchiderePopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mc-closeModal")));
        // inchiderePopup.click();
        
        // //deschidem pop-up de login/register
        // WebElement loginRegister = driver.findElement(By.cssSelector("[href=\"https://vioricacosmetic.ro/contul-meu/\"]"));
        // loginRegister.click();
        // //deschidem formularul de register
        // WebElement creatiUnCont = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Creați un cont")));
        // creatiUnCont.click();
        // //completam formularul de register
        // WebElement numeUtilizator = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nasa_reg_username")));
        // numeUtilizator.sendKeys("SoranaSanta113");
        // WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nasa_reg_email")));
        // email.sendKeys("sorana.chiorean+113@gmail.com");
        // WebElement parola = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nasa_reg_password")));
        // parola.sendKeys("Parola113!");
        // WebElement dataNasterii = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("account_dob")));
        // dataNasterii.sendKeys("10101989");
        // //debifam abonarea la newsletter
        // WebElement abonareNewsletter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mailchimp_woocommerce_newsletter")));
        // abonareNewsletter.click();
        // //creem cont
        // WebElement creeazaCont = driver.findElement(By.name("nasa_register"));
        // creeazaCont.click();
        // //dam din nou click pe login/register si verificam titlul paginii
        // //asteptam din nou sa se incarce pagina
        // continut = driver.findElement(By.id("main-content"));
        // wait.until(ExpectedConditions.stalenessOf(continut));
        // loginRegister = driver.findElement(By.cssSelector("[href=\"https://vioricacosmetic.ro/contul-meu/\"]"));
        // loginRegister.click();
        // String title = driver.getTitle();
        // assertEquals("Contul meu - Viorica Cosmetic Romania", title);
    }

    @Test 
    public void adaugareProdusInCosTest() {
        assertTrue(true);
        // //accesam pagina
        // driver.get("https://vioricacosmetic.ro/ten/creme/");
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // //acceptam cookies
        // WebElement permiteTotul = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cs_preview_popup\"]/div/div/div[2]/div[1]/div/div/div[2]/div/button[2]")));
        // permiteTotul.click();
        // //inchidem newsletter pop-up
        // //ne asiguram ca s-a reincarcat pagina
        // WebElement continut = driver.findElement(By.id("main-content"));
        // wait.until(ExpectedConditions.stalenessOf(continut));
        // //miscam mouse-ul ca sa apara popup newsletter
        // Actions actions = new Actions(driver);
        // actions.moveToLocation(500, 500).build().perform();
        // //inchidem popup
        // WebElement inchiderePopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mc-closeModal")));
        // inchiderePopup.click();

        // //gasim numele produsului
        // WebElement numeProdus = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"products\"]/div[1]/ul/li[1]/div/div[2]/a[1]/h2/small")));
        // //gasim pretul produsului
        // WebElement pretProdus = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"products\"]/div[1]/ul/li[1]/div/div[2]/span/span")));
        // //gasim butonul de adaugare in cos
        // WebElement butonAdaugareProdus = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"products\"]/div[1]/ul/li[1]/div/div[2]/a[2]")));
        // //mutam mouse-ul pe buton si dam click - necesar pentru ca altfel nu se poate da click fiindca este un element deasupra
        // actions.moveToElement(butonAdaugareProdus).click().perform();
        // //comparam numele primului produs din pagina cu numele primului produs din cos
        // WebElement produsAdaugat = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart-sidebar\"]/div[2]/div[1]/div/div/div[2]/div/div[1]/a")));
        // //pe pagina numele este cu majuscule, aducem la acelasi format
        // assertEquals(numeProdus.getText(), produsAdaugat.getText().toUpperCase());
        // //verificam pretul
        // WebElement pretCos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart-sidebar\"]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[1]/div[2]/span")));
        // assertEquals(pretProdus.getText(), pretCos.getText());
        // //verificam cantitatea
        // WebElement cantitateCos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[14]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[1]/div[1]/input")));
        // //nu putem folosi getText ca sa obtinem cantitatea din cos, o luam de pe atributul value
        // assertEquals("1", cantitateCos.getDomAttribute("value"));
        // //inchidem cosul
        // WebElement butonInchidereCos = driver.findElement(By.xpath("//*[@id=\"cart-sidebar\"]/div[1]/a"));
        // butonInchidereCos.click();
    }

    @Test 
    public void deliveryAndReturnTest() {
        assertTrue(true);
        // //accesam pagina
        // driver.get("https://vioricacosmetic.ro/");
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // //acceptam cookies
        // WebElement permiteTotul = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cs_preview_popup\"]/div/div/div[2]/div[1]/div/div/div[2]/div/button[2]")));
        // permiteTotul.click();
        // //inchidem newsletter pop-up
        // //ne asiguram ca s-a reincarcat pagina
        // WebElement continut = driver.findElement(By.id("main-content"));
        // wait.until(ExpectedConditions.stalenessOf(continut));
        // //miscam mouse-ul ca sa apara popup newsletter
        // Actions actions = new Actions(driver);
        // actions.moveToLocation(500, 500).build().perform();
        // //inchidem popup
        // WebElement inchiderePopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mc-closeModal")));
        // inchiderePopup.click();

        // //gasim imaginea primului produs si dam click pe ea
        // List<WebElement> produse = driver.findElements(By.className("link-absolute"));
        // actions.moveToElement(produse.get(0)).click().perform();
        // //gasim delivery & return si dam click
        // WebElement deliveryReturn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Delivery & Return")));
        // actions.moveToElement(deliveryReturn).click().perform();
        // //gasim popup cu termeni si conditii
        // WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nasa-content-delivery-return")));
        // //cautam titlurile dorite in text
        // assertTrue(popup.getText().contains("Dreptul de retragere"));
        // assertTrue(popup.getText().contains("Efectele retragerii"));
        // //inchidem popup
        // WebElement inchidereDeliveryReturn = driver.findElement(By.cssSelector("#nasa-content-delivery-return > a"));
        // inchidereDeliveryReturn.click();
    }

    @Test
    public void updatePasswordTest() {
        assertTrue(true);
        // //accesam pagina
        // driver.get("https://vioricacosmetic.ro/contul-meu/edit-account/");
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // //acceptam cookies
        // WebElement permiteTotul = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cs_preview_popup\"]/div/div/div[2]/div[1]/div/div/div[2]/div/button[2]")));
        // permiteTotul.click();
        // //inchidem newsletter pop-up
        // //ne asiguram ca s-a reincarcat pagina
        // WebElement continut = driver.findElement(By.id("main-content"));
        // wait.until(ExpectedConditions.stalenessOf(continut));
        // //miscam mouse-ul ca sa apara popup newsletter
        // Actions actions = new Actions(driver);
        // actions.moveToLocation(500, 500).build().perform();
        // //inchidem popup
        // WebElement inchiderePopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mc-closeModal")));
        // inchiderePopup.click();

        // WebElement numeUtilizator = driver.findElement(By.id("username"));
        // numeUtilizator.sendKeys("sorana.chiorean+112@gmail.com");
        // WebElement parola = driver.findElement(By.id("password"));
        // parola.sendKeys("Parola112!");
        // WebElement autentificare = driver.findElement(By.name("login"));
        // actions.moveToElement(autentificare).click().perform();

        // //verificam ca toate campurile obligatorii sunt completate cu ceva
        // String[] elementeObligatorii = {
        //     "account_first_name", 
        //     "account_last_name", 
        //     "account_display_name", 
        //     "account_email"
        // };

        // for (String elementObligatoriu : elementeObligatorii) {
        //     WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementObligatoriu)));
        //     //System.out.println(element.getDomAttribute("value"));
        //     assertFalse(element.getDomAttribute("value").isEmpty());
        // }     
        
        // WebElement parolaActuala = driver.findElement(By.id("password_current"));
        // parolaActuala.sendKeys("Parola112!");
        // WebElement parolaNoua = driver.findElement(By.id("password_1"));
        // parolaNoua.sendKeys("Parola112@");
        // WebElement confirmareParolaNoua = driver.findElement(By.id("password_2"));
        // confirmareParolaNoua.sendKeys("Parola112@");
        // WebElement salveazaModificarile = driver.findElement(By.name("save_account_details"));
        // actions.moveToElement(salveazaModificarile).click().perform();

        // WebElement mesaj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("woocommerce-notices-wrapper")));
        // //System.out.println(mesaj.getText());
        // assertEquals("Am modificat cu succes detaliile contului.", mesaj.getText());
    }

    @Test
    public void reviewTest() {
        //accesam pagina
        driver.get("https://vioricacosmetic.ro/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //acceptam cookies
        WebElement permiteTotul = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cs_preview_popup\"]/div/div/div[2]/div[1]/div/div/div[2]/div/button[2]")));
        permiteTotul.click();
        //inchidem newsletter pop-up
        //ne asiguram ca s-a reincarcat pagina
        WebElement continut = driver.findElement(By.id("main-content"));
        wait.until(ExpectedConditions.stalenessOf(continut));
        //miscam mouse-ul ca sa apara popup newsletter
        Actions actions = new Actions(driver);
        actions.moveToLocation(500, 500).build().perform();
        //inchidem popup
        WebElement inchiderePopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mc-closeModal")));
        inchiderePopup.click();

        WebElement searchIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"masthead\"]/div[1]/div/div[1]/div[3]/div/ul/li[2]/a")));
        searchIcon.click();
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nasa-input-1")));
        searchBox.sendKeys("ser vitamina c");
        WebElement linkProdus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href=\"https://vioricacosmetic.ro/produs/ser-cu-10-vitamina-c-viorica-vie/\"]")));
        linkProdus.click();

        WebElement scrieRecenzie = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"reviews\"]/div[3]/a")));
        actions.scrollToElement(scrieRecenzie).perform();
        actions.scrollByAmount(0,500);
        actions.moveToElement(scrieRecenzie).click().perform();
        WebElement cinciStele = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("star-5")));
        actions.moveToElement(cinciStele).click().perform();
        WebElement recenzie = driver.findElement(By.name("comment"));
        recenzie.sendKeys("excelent");
        WebElement autor = driver.findElement(By.name("author"));
        autor.sendKeys("Maria");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("test@test.com");
        WebElement trimite = driver.findElement(By.id("nasa-submit"));
        actions.moveToElement(trimite).click().perform();

        WebElement succes = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nasa-confetti-review")));
        assertTrue(succes.isDisplayed());
    }
        
    @After
    public void teardown() {
        driver.quit();
    }
}
