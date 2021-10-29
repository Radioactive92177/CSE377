package classassesment;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    void checkTitle() {
        App app = new App();
        app.setLink("https://wikipedia.org");
        app.openSite();

        AssertJUnit.assertEquals("Wikipedia", app.driver.getTitle());
        app.closeSite();
    }

}
