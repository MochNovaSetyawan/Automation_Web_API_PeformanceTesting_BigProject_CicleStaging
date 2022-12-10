package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static MyStepdefs.bypass.driver;

public class blashPage {
    public blashPage() {
        super();
        PageFactory.initElements(driver, this);
    }


    //CREATE BLASH
    By novateambutton = By.xpath("//*[@class=\"DashboardPage_container__2bMGZ\"]/div[4]/a[last()]");
    By blashboxmenu = By.xpath("//h1[normalize-space()='Blast!']");
    By createblashbutton = By.cssSelector("div[class='GlobalActionButton_text__31ND7'] p");
    By typetitleblash = By.cssSelector("textarea[placeholder='Type a title...']");
    By typedescriptionblash = By.cssSelector("div[class='fr-element fr-view'] p");
    By publishbutton = By.xpath("//h1[normalize-space()='Publish']");

    public void Clicknovateambutton() {
        driver.findElement(novateambutton).click();
    }

    public void Clickblashboxmenu() {
        driver.findElement(blashboxmenu).click();
    }

    public void Clickcreateblashbutton() {
        driver.findElement(createblashbutton).click();
    }

    public void Typetitleblash() {
        driver.findElement(typetitleblash).sendKeys("ini title");
    }

    public void Typedescriptionblash() {
        driver.findElement(typedescriptionblash).sendKeys("ini deskripsi");
    }

    public void Clickpublishbutton() {
        driver.findElement(publishbutton).click();
    }

    //EDIT BLASH
    By chooseblash = By.xpath("//*[@class=\"Post_link__3u8eF\"][1]");
    By clickdot3icon = By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv\"][@data-testid=\"MoreVertOutlinedIcon\"]");
    By clickeditinblash = By.xpath("//*[contains(text(),'Edit')]");
    By savechangesinblash = By.xpath("//*[contains(text(),'Save Changes')]");
    By typeedittitleblash = By.cssSelector("textarea[placeholder='Type a title...']");
    By typeeditdescriptionblash = By.cssSelector("div[class='fr-element fr-view'] p");

    public void Chooseblash() {
        driver.findElement(chooseblash).click();
    }

    public void Clickdot3icon() {
        driver.findElement(clickdot3icon).click();
    }

    public void Clickeditbuttoninblash() {
        driver.findElement(clickeditinblash).click();
    }

    public void Clicksavechangesinblash() {
        driver.findElement(savechangesinblash).click();
    }

    public void Typeedittitle() {
        driver.findElement(typeedittitleblash).clear();
        driver.findElement(typeedittitleblash).sendKeys("ini edit title");

    }

    public void Typeeditdescription() {
        driver.findElement(typeeditdescriptionblash).clear();
        driver.findElement(typeeditdescriptionblash).sendKeys("ini edit deskripsi");
    }


    //ADD COMMENT IN BLASH
    By clickcommentcoloumninblash = By.xpath("//*[@class=\"Main_input__qq9k9 Main_secondary__2bXP3\"]");
    By typecommentinblash = By.xpath("//*[@class=\"fr-element fr-view\"]");
    By clickpostinblash = By.xpath("//*[contains(text(),'Post')]");

    public void Typecommentinblash() {
        driver.findElement(clickcommentcoloumninblash).click();
        driver.findElement(typecommentinblash).sendKeys("ini comment");
    }

    public void Clickpostinblash() {
        driver.findElement(clickpostinblash).click();
    }


    //CHEERS
    By clickcheersinblash = By.cssSelector(".PostBlastPage_cheersSection__1pXFk .CheersButton_buttonCheers__2mJix img");
    By typecheersinblash = By.xpath("//*[@placeholder=\"Give'em cheers!\"]");
    By clickcheklistbutton = By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium CheersButton_checkIcon__1ub7w css-vubbuv\"]");

    public void Clickcheersinblash() {
        driver.findElement(clickcheersinblash).click();
    }

    public void Typecheersinblash() {
        driver.findElement(typecheersinblash).sendKeys("ini cheers");
    }

    public void Clickcheklistbutton() {
        driver.findElement(clickcheklistbutton).click();
    }

    //EDIT COMMENT
    By clickdot3commentinblash = By.xpath("//*[@class=\"CommentItem_commentMenuSection__1dW17\"][last()]");
    By typeeditcommentblash = By.xpath("//div[@class='fr-element fr-view']//p");

    public void Clickdot3commentinblash() {
        driver.findElement(clickdot3commentinblash).click();
    }

    public void Typeeditcommentblash() {
        driver.findElement(typeeditcommentblash).clear();
        driver.findElement(typeeditcommentblash).sendKeys("ini edit comment");
    }

    //ADD SUBCRIBER
    By clickplusbuttoninblash = By.xpath("//div[@class='ShowLimitMembers_plusButton__8k3vj ShowLimitMembers_secondary__2lF80']//*[name()='svg']");
    By addmemberinblash = By.xpath("//div[@class='ManageSubscribersContainer_ManageSubscribersContainer__body__3lbqx']//div[2]//*[name()='svg']");
    By clickdoneinblash = By.xpath("//*[contains(text(),'Done')]");
    By clickallsubcriberinblash = By.xpath("//div[@class='ManageSubscribersContainer_ManageSubscribersContainer__SelectAll__1eO7d']//div//*[name()='svg']");

    public void Clickplusbuttoninblash() {
        driver.findElement(clickplusbuttoninblash).click();
    }

    public void Addmemberinblash() {
        driver.findElement(clickallsubcriberinblash).click();
        driver.findElement(addmemberinblash).click();
    }

    public void Clickdoneinblash() {
        driver.findElement(clickdoneinblash).click();
    }

//COMPLETE POST

    By choosesetdoudatemanualy = By.xpath("//*[contains(text(),'Auto complete')]");
    By clicksetdoudatemanualy = By.xpath("//*[contains(text(),'Set due date manually')]");
    By clickcompletepost = By.cssSelector(".SubAction_container__ejtbG");

    public void Clicksetdoudatemanualy() {
        driver.findElement(choosesetdoudatemanualy).click();
        driver.findElement(clicksetdoudatemanualy).click();
    }

    public void Clickcompletepost() {
        driver.findElement(clickcompletepost).click();
    }

    //ARCHIVE BLASH
    By clickarchivebutton = By.cssSelector("[data-testid=\"ArchiveOutlinedIcon\"]");
    By choosearchive = By.cssSelector("[class=\"Main_iconText__f-xVC Main_iconBlueAquamarine__1b129 Main_iconPositionStart__IWQqT\"]");

    public void Clickarchivebutton() {
        driver.findElement(clickarchivebutton).click();
    }

    public void Choosearchive() {
        driver.findElement(choosearchive).click();
    }

    //REMOVE ALL SUBCRIBER
    By removeallsubcriber = By.xpath("//div[@class='ManageSubscribersContainer_ManageSubscribersContainer__SelectAll__1eO7d']//div//*[name()='svg']");

    public void Removeallsubcriber() {
        driver.findElement(removeallsubcriber).click();
    }

    //COMMENT WITHOUT WORD
    By clickcommentcoloumnwithoutwords = By.xpath("//*[@class=\"CreateCommentForm_inputComment__2G2m9\"][last()]");

    public void Clickcommentcoloumnwithoutwords() {
        driver.findElement(clickcommentcoloumnwithoutwords).sendKeys("");
    }

    //CHEERS WITHOUT WORD
    By clickcheersinblashwithoutword = By.cssSelector(".PostBlastPage_cheersSection__1pXFk .CheersButton_buttonCheers__2mJix img");

    public void Clickcheersinblashwithoutword() {
        driver.findElement(clickcheersinblashwithoutword).sendKeys("");
    }
}