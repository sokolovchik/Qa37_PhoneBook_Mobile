package tests;

import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SplachScreen;

public class LaunchTest extends AppiumConfig {
    @Test
    public void launch(){

      String version =  new SplachScreen(driver).getCurrentVersion();
        Assert.assertTrue(version.contains("1.0.0"));

    }
}
