package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static MyStepdefs.bypass.driver;

public class groupchatPage {
    public groupchatPage() {
        super();
        PageFactory.initElements(driver, this);
    }
    //SEND CHAT
    By clickgroupchatboxmenu = By.xpath("//*[contains(text(),'Group Chat')]");
    By typechat = By.xpath("//div[@class='fr-element fr-view']//p");
    By sendchat = By.cssSelector("[class=\"CreateMessage_send__2f1ZQ\"]");

    public void Clickgroupchatboxmenu() {
        driver.findElement(clickgroupchatboxmenu).click();
    }

    public void Typechat() {
        driver.findElement(typechat).sendKeys("ini groupchat");
    }

    public void Sendchat() {
        driver.findElement(sendchat).click();
    }
//DELETE CHAT
    By messagehover = By.cssSelector(".Message_container__3maDl:nth-child(1) [class='Message_balloon__zRoXK']");
    By menumessage = By.cssSelector(".Message_container__3maDl:nth-child(1) [data-testid='ExpandMoreOutlinedIcon']");
    By deletemessage = By.cssSelector(".MessageMenuPopUp_menu__1rkRG");
    By deletebutton = By.cssSelector(".Button_container__1WNuB");
    public void Clickmenuoption() {
        Actions action = new Actions(driver);
        WebElement Messagehover = driver.findElement(messagehover);
        action.moveToElement(Messagehover).perform();
        driver.findElement(menumessage).click();
    }
    public void Deletemessage() {
        driver.findElement(deletemessage).click();
    }
    public void Deletebutton() {
        driver.findElement(deletebutton).click();
    }

//MENTION
    By typementionchat = By.xpath("//div[@class='fr-element fr-view']//p");
    By clickmentionuser = By.xpath("//*[@class=\"highlight\"][last()]/span/a");

    public void Typementionchat() {
        driver.findElement(typementionchat).sendKeys("@");
    }

    public void Clickmentionuser() {
        driver.findElement(clickmentionuser).click();
    }
}
