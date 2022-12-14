package page;

import MyStepdefs.bypass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class groupchatPage extends bypass {

    public groupchatPage() {

        PageFactory.initElements(driver,this);
    }


    //SEND CHAT
    By clickgroupchatboxmenu = By.xpath("//*[contains(text(),'Group Chat')]");
    By typechat = By.xpath("//div[@class='fr-element fr-view']//p");
    By sendchat = By.cssSelector("[class=\"CreateMessage_send__2f1ZQ\"]");
    By verifysendchat = By.xpath("//*[contains(text(),'ini groupchat')]");

    public void Clickgroupchatboxmenu() {
        driver.findElement(clickgroupchatboxmenu).click();
    }

    public void Typechat() {
        driver.findElement(typechat).sendKeys("ini groupchat");
    }

    public void Sendchat() {
        driver.findElement(sendchat).click();
    }
    public void Verifysendchat() {
        WebElement sendChatingroupchat = driver.findElement(verifysendchat);
        Assert.assertTrue(sendChatingroupchat.isDisplayed());
    }

//DELETE CHAT
    By messagehover = By.cssSelector(".Message_container__3maDl:nth-child(1) [class='Message_balloon__zRoXK']");
    By menumessage = By.cssSelector(".Message_container__3maDl:nth-child(1) [data-testid='ExpandMoreOutlinedIcon']");
    By deletemessage = By.cssSelector(".MessageMenuPopUp_menu__1rkRG");
    By deletebutton = By.cssSelector(".Button_container__1WNuB");
    By verifydeletechat = By.xpath("//*[contains(text(),\"Delete group chat message success\")]");

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
    public void Verifydeletechat() {
        WebElement verifyDelete = driver.findElement(verifydeletechat);
        Assert.assertTrue(verifyDelete.isDisplayed());
    }

//MENTION
    By typementionchat = By.xpath("//div[@class='fr-element fr-view']//p");
    By clickmentionuser = By.xpath("//*[@class=\"highlight\"][last()]/span/a");
    By verifysendmention = By.xpath("//*[contains(text(),'Testing Nova')]");

    public void Typementionchat() {
        driver.findElement(typementionchat).sendKeys("@");
    }

    public void Clickmentionuser() {
        driver.findElement(clickmentionuser).click();
    }
    public void Verifysendmention(){
        WebElement sendChatingroupchat = driver.findElement(verifysendmention);
        Assert.assertTrue(sendChatingroupchat.isDisplayed());
    }
}
