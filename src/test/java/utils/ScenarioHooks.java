package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.picocontainer.annotations.Inject;
import java.time.Duration;

public class ScenarioHooks {

    @Inject
    ChromeDriverWrapper chromeDriverWrapper;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        ChromeDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        chromeDriverWrapper.setChromeDriver(chromeDriver);
    }

    @After
    public void afterScenario() {
        chromeDriverWrapper.get().quit();
    }
}