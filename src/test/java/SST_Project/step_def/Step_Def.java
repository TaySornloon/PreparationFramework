package SST_Project.step_def;

import SST_Project.utillities.WebDriverFactory;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Step_Def {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @DisplayName("locate to the google page")
    @Test
    public void test1(){



    }

}
