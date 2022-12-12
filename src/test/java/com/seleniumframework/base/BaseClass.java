package com.seleniumframework.base;

import com.seleniumframework.constants.IConstants;
import com.seleniumframework.logs.Log;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass implements IConstants {
    public static WebDriver driver;

    public static WebDriver selectDriver(String browser) {

        switch (browser) {
            case "chrome": //chrome driver
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");
                Log.info("chrome browser is selected");
                driver = new ChromeDriver(options);
                break;
            case "firefox"://firefox driver
                WebDriverManager.firefoxdriver().setup();
                Log.info("firefox browser is selected");
                driver = new FirefoxDriver();
                break;
            case "edge"://edge driver
                WebDriverManager.edgedriver().setup();
                Log.info("edge browser is selected");
                driver = new EdgeDriver();
                break;
            case "opera"://opera driver
                WebDriverManager.operadriver().setup();
                Log.info("opera browser is selected");
                driver = new OperaDriver();
                break;
            default: System.out.println("Please provide browser name");
        }

        return driver;
    }

    public Properties readProperties() {

            Properties prop = new Properties();
            try {
                File file = new File("IConstants.CONFIG_FILE");
                if (!file.exists()) {
                    throw new FileNotFoundException("File doesn't exits");
                }
                FileInputStream fis = new FileInputStream(file);

                prop.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return prop;
    }
    public static void openBrowser(String url){
        driver.get(url);
    }

}
