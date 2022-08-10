package daks.pages;

import daks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProtokollePage {
    public ProtokollePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='WICButton CWebMainMenuButton'][11]")
    public WebElement protokolleButton;

    @FindAll({@FindBy(xpath = "(//table)[3]//tr")})
    public List<WebElement> tabelleRow;

    @FindAll({@FindBy(xpath = "(//table)[3]//td")})
    public List<WebElement> tabelleTd;

    @FindAll ({@FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV ProtocolTable']/a")})
    public List<WebElement> richtungTasteList;

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV ProtocolTable']/a[1]")
    public WebElement richtungTaste1;

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV ProtocolTable']/a[2]")
    public WebElement richtungTaste2;

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV ProtocolTable']/a[3]")
    public WebElement richtungTaste3;

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV ProtocolTable']/a[4]")
    public WebElement richtungTaste4;

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV ProtocolTable']/a[5]")
    public WebElement richtungTaste5;

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV ProtocolTable']/a[6]")
    public WebElement rechterichtungTaste1;

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV ProtocolTable']/a[8]")
    public WebElement rechterichtungTaste2;

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV ProtocolTable']/a[7]")
    public WebElement rechterichtungTasteEnde1;

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV ProtocolTable']/a[9]")
    public WebElement rechterichtungTasteEnde2;

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV ProtocolTable']/a[1]")
    public WebElement LinkeRichtungTaste1; // Am Anfang gibt es keine Diese Locator  und es hat gleich Locator der richtungTaste1

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV ProtocolTable']/a[2]")
    public WebElement LinkeRichtungTaste2; // Am Anfang gibt es keine Diese Locator  und es hat gleich Locator der richtungTaste2

}
