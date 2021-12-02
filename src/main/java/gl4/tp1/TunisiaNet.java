package gl4.tp1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TunisiaNet {
	public static void main(String args[]) throws InterruptedException {
		  
    	 WebDriverManager.chromedriver().setup();
    	 WebDriver driver = new ChromeDriver();
    	 
    	 // Ajouter votre e-mail et mot de passe de votre compte TunisiaNet
    	 String email = "XXX";
    	 String password = "XXX";
    	 String productName = "PC portable MacBook M1 13.3";
    	 
    	 driver.get("https://www.tunisianet.com.tn/");
    	 
    	 // Ouvrir page connexion 
    	 Thread.sleep(2000);
    	 WebElement userIcon = driver.findElement(By.cssSelector("#_desktop_user_info > div > div > svg"));
    	 userIcon.click();
    	 Thread.sleep(500);
    	 WebElement connexion = driver.findElement(By.cssSelector(".user-down > li > a > span"));
    	 connexion.click();
    	 
    	 
    	 //  Faire une authentification
    	 Thread.sleep(500);
    	 WebElement userEmail = driver.findElement(By.name("email"));
    	 userEmail.sendKeys(email);
    	 Thread.sleep(500);
    	 WebElement userPassword = driver.findElement(By.name("password"));
    	 userPassword.sendKeys(password);
    	 
    	 Thread.sleep(2000);
    	 WebElement buttonConnexion = driver.findElement(By.id("submit-login"));
    	 buttonConnexion.click();
    	 
    	 // Rechercher d'un produit
    	 Thread.sleep(500);
    	 WebElement searchName = driver.findElement(By.name("s"));
    	 searchName.sendKeys(productName);
    	 
    	 Thread.sleep(1000);
    	 WebElement buttonSearch = driver.findElement(By.cssSelector(".button-search > svg "));
    	 buttonSearch.click();
    	 
    	 
    	 Thread.sleep(1000);
         List<WebElement> products = driver.findElements(By.className("product-title"));
         products.get(0).click();
    	 
         // Ajouter le produit au panier
    	 Thread.sleep(1000);
    	 WebElement addToCartBtn = driver.findElement(By.cssSelector(".add > button"));
    	 addToCartBtn.click();
    	 
    	  // Finaliser le process d�achat
    	  Thread.sleep(2000);
    	  WebElement commandBtn = driver.findElement(By.cssSelector(".cart-content-btn > a"));
    	  commandBtn.click();   	 
    	 
    	 Thread.sleep(1500);
    	 driver.quit();
    	 
    	 
	}

}
