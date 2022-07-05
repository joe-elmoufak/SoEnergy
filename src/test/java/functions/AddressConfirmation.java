package functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ChromeDriverWrapper;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AddressConfirmation {

    @FindBy(css = "ul[id='address_delivery'] li[class='address_firstname address_lastname']")
    WebElement deliveryName;
    @FindBy(css = "ul[id='address_invoice'] li[class='address_firstname address_lastname']")
    WebElement invoiceName;

    @FindBy(css = "ul[id='address_delivery'] li[class='address_address1 address_address2']")
    WebElement deliveryRoad;
    @FindBy(css = "ul[id='address_invoice'] li[class='address_firstname address_lastname']")
    WebElement invoiceRoad;

    @FindBy(css = "ul[id='address_delivery'] li[class='address_city address_state_name address_postcode']")
    WebElement deliveryCityAndZip;
    @FindBy(css = "ul[id='address_invoice'] li[class='address_city address_state_name address_postcode']")
    WebElement invoiceCityAndZip;

    @FindBy(css = "ul[id='address_delivery'] li[class='address_country_name']")
    WebElement deliveryCountry;
    @FindBy(css = "ul[id='address_invoice'] li[class='address_country_name']")
    WebElement invoiceCountry;

    @FindBy(css = "ul[id='address_delivery'] li[class='address_phone_mobile']")
    WebElement deliveryMobile;
    @FindBy(css = "ul[id='address_invoice'] li[class='address_phone_mobile']")
    WebElement invoiceMobile;

    @FindBy(css = "button[name='processAddress']")
    WebElement proceedToCheckout;

    private final ChromeDriver chromeDriverWrapper;

    private static final Map<String, String> ADDRESS = Map.of(
            "name", "blah blah",
            "road", "blah road",
            "city_and_zip", "London, Hawaii 00000",
            "country", "United States",
            "mobile", "07907 777 222"
    );

    public AddressConfirmation(ChromeDriverWrapper chromeDriverWrapper) {
        this.chromeDriverWrapper = chromeDriverWrapper.get();
        PageFactory.initElements(chromeDriverWrapper.get(), this);
    }

    public void confirmAddressInformationAndProceed() {
        assertEquals(ADDRESS.get("name"), deliveryName.getText());
        assertEquals(ADDRESS.get("road"), deliveryRoad.getText());
        assertEquals(ADDRESS.get("city_and_zip"), deliveryCityAndZip.getText());
        assertEquals(ADDRESS.get("country"), deliveryCountry.getText());
        assertEquals(ADDRESS.get("mobile"), deliveryMobile.getText());
        assertEquals(ADDRESS.get("name"), invoiceRoad.getText());
        assertEquals(ADDRESS.get("city_and_zip"), invoiceCityAndZip.getText());
        assertEquals(ADDRESS.get("country"), invoiceCountry.getText());
        assertEquals(ADDRESS.get("mobile"), invoiceMobile.getText());
        proceedToCheckout.click();
    }
}
