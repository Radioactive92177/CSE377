package classassesment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
    private String link;
    WebDriver driver = new FirefoxDriver();

    App() {
        System.setProperty("webdriver.firefox.driver", "/usr/bin/geckodriver");
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void openSite() {
        this.driver.get(this.link);
    }

    public void closeSite() {
        this.driver.close();
    }
}
