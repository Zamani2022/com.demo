import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class SeleniumAutomationChallenge {

    public static void main(String[] args) throws Exception{

        //setting the driver executable
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        //Initiating your chromedriver
        WebDriver driver=new ChromeDriver();

        //Applied wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //open browser with desired URL
        driver.get("https://www.saucedemo.com/");
        //maximize window
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");

        loginButton.click();
        WebElement addToCartBackpack = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        addToCartBackpack.click();
        WebElement addToCartBikeLight = driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
        addToCartBikeLight.click();
        WebElement addToCartBoltTShirt = driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCartBoltTShirt.click();
        WebElement addToCartFleeceJacket = driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket"));
        addToCartFleeceJacket.click();
        WebElement addToCartOnesie = driver.findElement(By.name("add-to-cart-sauce-labs-onesie"));
        addToCartOnesie.click();
        WebElement addToCartAllThings = driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)"));
        addToCartAllThings.click();
        WebElement shoppingCartLink = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartLink.click();

        WebElement removeBackpack = driver.findElement(By.name("remove-sauce-labs-backpack"));
        removeBackpack.click();
        WebElement removeBikeLight = driver.findElement(By.name("remove-sauce-labs-bike-light"));
        removeBikeLight.click();
        WebElement removeBolt = driver.findElement(By.name("remove-sauce-labs-bolt-t-shirt"));
        removeBolt.click();
        WebElement removeFleece = driver.findElement(By.name("remove-sauce-labs-fleece-jacket"));
        removeFleece.click();
        WebElement removeOnesie = driver.findElement(By.name("remove-sauce-labs-onesie"));
        removeOnesie.click();
        WebElement removeAllTShirt = driver.findElement(By.name("remove-test.allthethings()-t-shirt-(red)"));
        removeAllTShirt.click();
        shoppingCartLink.clear();
        //closing the browser
        driver.close();

    }

}