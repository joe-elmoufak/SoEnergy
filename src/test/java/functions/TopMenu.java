package functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ChromeDriverWrapper;
public class TopMenu {

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement dressesLink;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")
    WebElement summerDresses;

    private ChromeDriver chromeDriverWrapper;
    public TopMenu(ChromeDriverWrapper chromeDriverWrapper) {
        this.chromeDriverWrapper = chromeDriverWrapper.get();
        PageFactory.initElements(chromeDriverWrapper.get(), this);
    }

    public void select_linkFromMenu() {
        Actions actions = new Actions(chromeDriverWrapper);
        actions.moveToElement(dressesLink).perform();
        summerDresses.click();
    }
}
