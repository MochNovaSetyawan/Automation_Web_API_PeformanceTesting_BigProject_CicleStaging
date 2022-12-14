package page;

import MyStepdefs.bypass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class boardPage extends bypass {

    public boardPage() {

        PageFactory.initElements(driver,this);
    }

    //CREATE BOARD
    By clickboardboxmenu = By.xpath("//h1[normalize-space()='Board']");
    By clickaddnewlist = By.cssSelector("[class=\"CreateListButton_buttonBottom__16OpZ\"]");
    By typelistcoloumn = By.cssSelector("[class=\"form-control\"]");
    By clickcreatebutton = By.cssSelector("[class=\"btn btn-success btn-sm\"]");
    By verifycreatenewboard = By.xpath("//*[contains(text(),'Creating list is success')]");

    public void Clickboardboxmenu() {
        driver.findElement(clickboardboxmenu).click();
    }

    public void Clickaddnewlist() {
        driver.findElement(clickaddnewlist).click();
    }

    public void Typelistcoloumn() {
        driver.findElement(typelistcoloumn).sendKeys("ini board");
    }

    public void Clickcreatebutton() {
        driver.findElement(clickcreatebutton).click();
    }

    public void Verifycreatenewboard() {
        WebElement verifyCreatenewboard = driver.findElement(verifycreatenewboard);
        Assert.assertTrue(verifyCreatenewboard.isDisplayed());
    }

    //CREATE CARD
    By clickaddcard = By.xpath("//*[@class=\"List_List__30q9z\"][last()]/div/div/div[4]");
    By typecardname = By.xpath("//input[@placeholder='Card name']");
    By clickaddcardbutton = By.cssSelector("[class=\"btn btn-success btn-sm\"]");
    By Verifycreatenewcard = By.xpath("//*[contains(text(),'Creating card is success')]");

    public void Clickaddcard() {
        driver.findElement(clickaddcard).click();
    }

    public void Typecardname() {
        driver.findElement(typecardname).sendKeys("ini card");
    }

    public void Clickaddcardbutton() {
        driver.findElement(clickaddcardbutton).click();
    }

    public void Verifycreatenewcard() {
        WebElement verifyCreatenewcard = driver.findElement(Verifycreatenewcard);
        Assert.assertTrue(verifyCreatenewcard.isDisplayed());
    }

    //EDIT LIST
    By clicklistname = By.xpath("//*[@class=\"List_List__30q9z\"][last()]/div/div/div/div/div");
    By typeeditlistcoloumn = By.cssSelector("[class=\"form-control\"]");
    By verifyeditlist = By.xpath("//*[contains(text(),'Update list is success')]");

    public void Clicklistname() {
        driver.findElement(clicklistname).click();
    }

    public void Typeeditlistcoloumn() {
        driver.findElement(typeeditlistcoloumn).clear();
        driver.findElement(typeeditlistcoloumn).sendKeys("ini edit list");
        driver.findElement(typeeditlistcoloumn).sendKeys(Keys.ENTER);
    }

    public void Verifyeditlist() {
        WebElement verifyEditlist = driver.findElement(verifyeditlist);
        Assert.assertTrue(verifyEditlist.isDisplayed());
    }

    //EDIT CARD
    By choosecard = By.xpath("//*[@class=\"List_List__30q9z\"][last()]/div/div/div[3]/div/div/div/div/div[1]");
    By clickcardname = By.cssSelector("[class=\"modal-title h4\"]");
    By typeeditcardcoloumn = By.cssSelector("[class=\"ChangeNameForm_teamName__VbXNI form-control\"]");
    By verifyeditcard = By.xpath("//*[contains(text(),'Update card is success')]");

    public void Choosecard() {
        driver.findElement(choosecard).click();
    }

    public void Clickcardname() {
        driver.findElement(clickcardname).click();
    }

    public void Typeeditcardcoloumn() {
        driver.findElement(typeeditcardcoloumn).clear();
        driver.findElement(typeeditcardcoloumn).sendKeys("ini edit card");
        driver.findElement(typeeditcardcoloumn).sendKeys(Keys.ENTER);
    }

    public void Verifyeditcard() {
        WebElement verifyEditcard = driver.findElement(verifyeditcard);
        Assert.assertTrue(verifyEditcard.isDisplayed());
    }

    //EDIT DESCRIPTION
    By clicknotesbutton = By.xpath("//div[@class='ManageDesc_editIcon__1I0bY']//*[name()='svg']");
    By typeeditdescription = By.cssSelector("[class=\"fr-element fr-view\"]");
    By clicksavebutton = By.xpath("//*[contains(text(),'Save')]");
    By verifyeditdescription = By.xpath("//*[contains(text(),'Update card is success')]");

    public void Clicknotesbutton() {
        driver.findElement(clicknotesbutton).click();
    }

    public void Typeeditdescription() {
        driver.findElement(typeeditdescription).clear();
        driver.findElement(typeeditdescription).sendKeys("ini edit deskripsi");
    }

    public void ClickSavebutton() {
        driver.findElement(clicksavebutton).click();
    }

    public void Verifyeditdescription() {
        WebElement verifyEditdescription = driver.findElement(verifyeditdescription);
        Assert.assertTrue(verifyEditdescription.isDisplayed());
    }

    //ADD COMMENT
    By verifyaddcommentinboard = By.xpath("//*[contains(text(),'Create comment is success')]");

    public void Verifyaddcommenttinblash() {
        WebElement verifyAddcommentinboard = driver.findElement(verifyaddcommentinboard);
        Assert.assertTrue(verifyAddcommentinboard.isDisplayed());
    }

    //ADD ALL SUBCRIBER
    By clickplusbuttoninboard = By.cssSelector("[class=\"Members_plusButton__26WlU\"]");
    By clickapplymemberbutton = By.xpath("//*[contains(text(),'Apply Members')]");
    By verfyaddsubcriberinboard = By.xpath("//*[contains(text(),'Toggle members successful')]");

    public void Clickplusbuttoninboard() {
        driver.findElement(clickplusbuttoninboard).click();
    }

    public void Clickapplymemberbutton() {
        driver.findElement(clickapplymemberbutton).click();
    }

    public void Verfyaddsubcriberinboard() {
        driver.findElement(verfyaddsubcriberinboard).click();
    }

    //CREATE LABEL
    By clicklabelbutton = By.xpath("//div[@class='Button_container__1WNuB'][normalize-space()='Labels']");
    By clickaddlabelbutton = By.cssSelector("[class=\"ToggleLabels_plusButton__3YgnQ\"]");
    By typenamelabelcoloumn = By.cssSelector("[class=\"form-control\"]");
    By choosecolorlabel = By.xpath("//div[13]");
    By verifycreatelabel = By.xpath("//*[contains(text(),'Creating label for this board is success')]");

    public void Clicklabelbutton() {
        driver.findElement(clicklabelbutton).click();
    }

    public void Clickaddlabelbutton() {
        driver.findElement(clickaddlabelbutton).click();
    }

    public void Typenamelabelcoloumn() {
        driver.findElement(typenamelabelcoloumn).sendKeys("label");
    }

    public void Choosecolorlabel() {
        driver.findElement(choosecolorlabel).click();
    }

    public void Verifycreatelabel() {
        WebElement erifyCreatelabel = driver.findElement(verifycreatelabel);
        Assert.assertTrue(erifyCreatelabel.isDisplayed());
    }

    //ADD DESCRIPTION
    By clickdescriptioncoloumn = By.xpath("//div[@class='ManageDesc_sectionEmptyDesc__md0ll']");
    By typedescription = By.cssSelector("[class=\"fr-element fr-view\"]");

    public void Typedescription() {
        driver.findElement(clickdescriptioncoloumn).click();
        driver.findElement(typedescription).sendKeys("ini deskripsi");
    }

    //ADD LABEL
    By chooselabel = By.xpath("//*[@class=\"BoxPopOver_BoxPopOver__1vCj0\"]/div[5]/div[last()]/div");
    By clickapplylabels = By.xpath("//*[@class=\"BoxPopOver_BoxPopOver__1vCj0\"]/div[6]/button/div");
    By verifyaddlabel = By.xpath("//*[contains(text(),'toggle multiple labels card is success')]");

    public void Chooselabel() {
        driver.findElement(chooselabel).click();
    }

    public void Clickapplylabels() {
        driver.findElement(clickapplylabels).click();
    }

    public void Verifyaddlabel() {
        WebElement verifyAddlabel = driver.findElement(verifyaddlabel);
        Assert.assertTrue(verifyAddlabel.isDisplayed());
    }

    //DELETE LABEL
    By clickdeletebuttoninboard = By.xpath("//*[contains(text(),'Delete')]");
    By clickeditbutton = By.xpath("//div[@class='ToggleLabels_sectionLabel__28djQ']//*[name()='svg']//*[name()='path' and contains(@d,'M3 17.25V2')]");
    By verifydeletelabel = By.xpath("//*[contains(text(),'toggle label card is success')]");

    public void Clickeditbutton() {
        driver.findElement(clickeditbutton).click();
    }

    public void Clickdeletebuttoninboard() {
        driver.findElement(clickdeletebuttoninboard).click();
    }

    public void Verifydeletelabel() {
        WebElement verifyDeletelabel = driver.findElement(verifydeletelabel);
        Assert.assertTrue(verifyDeletelabel.isDisplayed());
    }

    //MOVE CARD
    By choosemovecard = By.xpath("//*[@class=\"List_List__30q9z\"][1]/div/div/div[3]/div/div/div/div/div[1]");
    By choosemovecard2 = By.xpath("//*[@class=\"List_List__30q9z\"][2]/div/div/div[3]/div/div/div/div/div[1]");
    By clickmovebutton = By.cssSelector("[data-testid=\"DoubleArrowIcon\"]");
    By clicklistbutton = By.xpath("//*[@class=\"ManageMoveCard_listSection__2sf4E\"]/div[1]");
    By chooseboardlist = By.xpath("//*[@class=\"ListNameOption_listSection__2cM1h\"][2]");
    By chooseboardlist2 = By.xpath("//*[@class=\"ListNameOption_listSection__2cM1h\"][1]");
    By clickmovebutoon = By.xpath("//div[contains(text(),'Move')]");
    By verifymovecard = By.xpath("//div[contains(text(),'Success!')]");
    By closecard = By.cssSelector("[class=\"close\"]");

    public void Choosemovecard() {
        driver.findElement(choosemovecard).click();
    }

    public void Clickmovebutton() {
        driver.findElement(clickmovebutton).click();
    }

    public void Clicklistbutton() {
        driver.findElement(clicklistbutton).click();
    }

    public void Chooseboardlist() {
        driver.findElement(chooseboardlist).click();
    }

    public void Clickmovebutoon() {
        driver.findElement(clickmovebutoon).click();
    }

    public void Verifymovecard() {
        WebElement VerifyMovecard = driver.findElement(verifymovecard);
        Assert.assertTrue(VerifyMovecard.isDisplayed());
    }

    public void Choosemovecard2() {
        driver.findElement(choosemovecard2).click();
    }

    public void Chooseboardlist2() {
        driver.findElement(chooseboardlist2).click();
    }

    public void Closecard() {
        driver.findElement(closecard).click();
    }

    //SEND ATTACHMENT
    By clickattachmentbutton = By.cssSelector(".ManageAttachments_askDropContainer__aTIyn");
    By sendattachment = By.xpath("//div[@class=\"AttachFileContainer_container__3U9Wh\"]/input[1]");
    By verifyattachment = By.xpath("//*[contains(text(),'Upload attachments is success')]");

    public void Clickattachmentbutton() {
        driver.findElement(clickattachmentbutton).click();

    }

    public void Sendattachment() {
        WebElement upload_file = driver.findElement(sendattachment);
        upload_file.sendKeys("C:\\Users\\62812\\OneDrive\\Pictures\\index.png");
    }

    public void Verifyattachment() {
        WebElement verifyAttachment = driver.findElement(verifyattachment);
        Assert.assertTrue(verifyAttachment.isDisplayed());
    }

    //EDIT ATTACHMENT
    By typelinkname = By.cssSelector(".form-control");
    By updatebutton = By.xpath("//*[@class=\"btn btn-success btn-sm\"]");
    By verifyeditattachment = By.xpath("//*[contains(text(),'Update attachment is success')]");

    public void Typelinkname() {
        driver.findElement(typelinkname).sendKeys(Keys.CONTROL + "a");
        driver.findElement(typelinkname).sendKeys("INIEDITATTACHMENT.png");
    }

    public void Updatebutton() {
        driver.findElement(updatebutton).click();
    }

    public void Verifyeditattachment() {
        WebElement verifyEditattachment = driver.findElement(verifyeditattachment);
        Assert.assertTrue(verifyEditattachment.isDisplayed());
    }

    //DELETE ATTACHMENT
    By clickdeletebuttoninattachment = By.xpath("//*[contains(text(),'Delete')]");
    By clickdelete = By.xpath("//*[@class=\"btn btn-danger btn-block btn-sm\"]");
    By verifydeleteattachment = By.xpath("//*[contains(text(),'Delete attachment is success')]");

    public void Clickdeletebuttoninattachment() {
        driver.findElement(clickdeletebuttoninattachment).click();
    }

    public void Clickdelete() {
        driver.findElement(clickdelete).click();
    }

    public void Verifydeleteattachment() {
        WebElement verifyDeleteattachment = driver.findElement(verifydeleteattachment);
        Assert.assertTrue(verifyDeleteattachment.isDisplayed());
    }

    //PRIVATE CARD
    By clickprivatecard = By.xpath("//div[@class=\"CardDetailContainer_CardDetailContainer__smallSectionContainer__3qfM5\"][2]/div[2]");
    By verifyprivatecard = By.xpath("//*[contains(text(),'Update card is success')]");

    public void clickprivatecard() {
        driver.findElement(clickprivatecard).click();
    }

    public void Verifyprivatecard() {
        WebElement verifyPrivatecard = driver.findElement(verifyprivatecard);
        Assert.assertTrue(verifyPrivatecard.isDisplayed());
    }

    //PUBLIC CARD
    By clickpubliccard = By.xpath("//div[@class=\"CardDetailContainer_CardDetailContainer__smallSectionContainer__3qfM5\"][2]/div[2]");
    By verifypubliccard = By.xpath("//*[contains(text(),'Update card is success')]");

    public void Clickpubliccard() {
        driver.findElement(clickpubliccard).click();
    }
    public void Verifypubliccard() {
        WebElement verifyPubliccard = driver.findElement(verifypubliccard);
        Assert.assertTrue(verifyPubliccard.isDisplayed());
    }

    //SET DUE DATE
    By clickduedatebutton = By.cssSelector("[data-testid=\"EventIcon\"]");
    By typedate = By.xpath("//*[@class=\"ManageDueDateContainer_datePicker__1LCTx\"]/div/div/input");
    By typetime = By.xpath("//*[@class=\"ManageDueDateContainer_timePicker__3MoTG\"]/div/div/input");
    By verifysetduedate = By.xpath("//*[contains(text(),'Update card is success')]");

    public void Clickduedatebutton() {
        driver.findElement(clickduedatebutton).click();
    }
    public void Typedate() {
        driver.findElement(typedate).sendKeys(Keys.CONTROL + "a");
        driver.findElement(typedate).sendKeys("2023/12/02");
    }
    public void Typetime() {
        driver.findElement(typetime).sendKeys(Keys.CONTROL + "a");
        driver.findElement(typetime).sendKeys("08:38 AM");
    }
    public void Verifysetduedate() {
        WebElement verifySetduedate = driver.findElement(verifysetduedate);
        Assert.assertTrue(verifySetduedate.isDisplayed());
    }

    //REMOVE DUE DATE
    By clickremovebutton = By.xpath("//*[contains(text(),'Remove')]");
    By verifyremoveduedate = By.xpath("//*[contains(text(),'Update card is success')]");

    public void Clickremovebutton() {
        driver.findElement(clickremovebutton).click();
    }
    public void Verifyremoveduedate() {
        WebElement verifyRemoveduedate = driver.findElement(verifyremoveduedate);
        Assert.assertTrue(verifyRemoveduedate.isDisplayed());
    }

}
