package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class loginpage {
    public WebDriver driver ;
    public void OpenBrowser() throws InterruptedException {

       // System.setProperty("webdriver.chrome.driver","src/test/resources/chrome.exe");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("http://41.32.3.212:5001/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }

    public void userName(WebDriver driver,String e_mail ,String pasword){
        driver.findElement(By.id("login-email")).sendKeys(e_mail);
        driver.findElement(By.id("login-password")).sendKeys(pasword);

    }


    public void loginButton(WebDriver driver){

        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

}
