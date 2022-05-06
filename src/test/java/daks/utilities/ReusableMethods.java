package daks.utilities;

import daks.pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {

    static WebDriverWait wait = null;

    public static void getLogin(){

        Driver.getDriver().manage().deleteAllCookies();
        Driver.getDriver().get("http://192.168.103.20/");

        if (ReusableMethods.isAlertReady()){
            Driver.getDriver().switchTo().alert().accept();
        }else
            System.out.println("kein alert");

        wait= new WebDriverWait(Driver.getDriver(),20);

       LoginPage login = new LoginPage();

        login.weitereButton.click();
        login.smallLink.click();
        login.userName.sendKeys("sysadm");
        login.password.sendKeys("sysadm");
        login.loginButton.click();
    }


   public static boolean isAlertReady(){

       try {
       Driver.getDriver().switchTo().alert().accept();
   }catch (Exception e){
           return false;
       }
       return true;
   }


    public static WebElement getVisibilityOfWait(WebElement element){

        wait = new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.visibilityOf(element));

        return element;
    }


    public static void selectMethod(WebElement element){

        Select select = new Select(element);
        select.selectByIndex((int) (Math.random() * select.getOptions().size()));
    }


    public static void doubleClick(WebElement element){

        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }

    public static void scrollToElement(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public static void sleep(int miliseconds){

        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
