package utils;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWrapper {
    private ChromeDriver chromeDriver;

    public void setChromeDriver(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public ChromeDriver get() {
        return chromeDriver;
    }
}
