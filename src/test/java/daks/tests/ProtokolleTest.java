package daks.tests;

import daks.pages.ProtokollePage;
import daks.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProtokolleTest {

    @BeforeMethod
    void beforeMethod() {
        ReusableMethods.getLogin();
    }

    ProtokollePage protokol = new ProtokollePage();


    @Test
    public void seitenListTest() {
        ReusableMethods.sleep(3000);
        ReusableMethods.getVisibilityOfWait(protokol.protokolleButton).click();
        ReusableMethods.sleep(1000);
        ReusableMethods.getVisibilityOfWait(protokol.rechterichtungTaste1).click();
        ReusableMethods.sleep(1000);
        for (int i = 1; i < 23; i++) {
            ReusableMethods.getVisibilityOfWait(protokol.rechterichtungTaste2).click();
            System.out.println((i));
            ReusableMethods.sleep(1000);

        }
    }


    @Test
    public void seitenGrenzenTest() {
        ReusableMethods.sleep(3000);
        ReusableMethods.getVisibilityOfWait(protokol.protokolleButton).click();
        ReusableMethods.sleep(1000);
        ReusableMethods.getVisibilityOfWait(protokol.rechterichtungTaste1).click();
        ReusableMethods.sleep(1000);

        for (int i = 1; i < 24; i++) { // i < protokol.richtungTasteList.size() umfasst 9 Seiten.
            ReusableMethods.getVisibilityOfWait(protokol.rechterichtungTaste2).click();
            ReusableMethods.sleep(1000);
            for (int j = 0; j < protokol.tabelleRow.size(); j++) {
                if (protokol.tabelleRow.size() == 200) {
                    System.out.println(i + " TabelleRow.size()= " + protokol.tabelleRow.size());
                    break;
                }
                if (protokol.tabelleRow.size() < 200) {
                    System.out.println(i + " TabeleRow.size() = " + protokol.tabelleRow.size());
                    break;
                } else {
                    System.out.println(i + "TabelleRow.size() = " + protokol.tabelleRow.size());
                    break;
                }
            }
        }
    }




// Das ist noch nicht fertig!
   @Test
   public void  bestimmteSeiteColontTest(){

        ReusableMethods.sleep(2000);
        ReusableMethods.getVisibilityOfWait(protokol.protokolleButton).click();
        ReusableMethods.sleep(1000);
        ReusableMethods.getVisibilityOfWait(protokol.richtungTaste5).click();
       for (int i = 0; i < protokol.tabelleRow.size(); i++) {
           System.out.println(i + " = " + protokol.tabelleRow.size());
       }
   }










}