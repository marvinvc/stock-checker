package checkers;

//import constants.Discord;
import dataproviders.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import model.Product;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpStatus;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.*;
import page.mx.SanbornsPage;
import retry.RetryAnalyzer;
import retry.RetryCountIfFailed;
import utils.SoundPlayer;
import utils.UserAgents;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static io.restassured.path.xml.XmlPath.CompatibilityMode.HTML;
import static io.restassured.path.xml.XmlPath.CompatibilityMode.XML;
import static page.BasePage.*;

public class Checky {

    boolean abtInStock = true;
    boolean adoramaInStock = true;
    boolean amazonInStock = true;
    boolean antonlineInStock = true;
    boolean argosInStock = true;
    boolean bestbuyInStock = true;
    boolean lenovoInStock = true;
    boolean microsoftInStock = true;
    boolean meijerInStock = true;
    boolean newEggInStock = true;
    boolean pcRichardInStock = true;
    boolean sanbornsInStock = true;
    boolean targetInStock = true;
    boolean gamestopInStock = true;
    boolean walmartInStock = true;
    boolean sonyDirectInStock = true;
    boolean bhInStock = true;
    boolean costcoInStock = true;
    boolean samsClubInStock = true;

    boolean abtInStockDiscordAlert = true;
    boolean adoramaInStockDiscordAlert = true;
    boolean amazonInStockDiscordAlert = true;
    boolean antonlineInStockDiscordAlert = true;
    boolean argosInStockDiscordAlert = true;
    boolean bestbuyInStockDiscordAlert = true;
    boolean lenovoInStockDiscordAlert = true;
    boolean microsoftInStockDiscordAlert = true;
    boolean meijerInStockDiscordAlert = true;
    boolean newEggInStockDiscordAlert = true;
    boolean pcRichardInStockDiscordAlert = true;
    boolean sanbornsInStockDiscordAlert = false;
    boolean targetInStockDiscordAlert = true;
    boolean gamestopInStockDiscordAlert = true;
    boolean walmartInStockDiscordAlert = true;
    boolean sonyDirectProductInStockDiscordAlert = true;
    boolean sonyDirectQueueDiscordAlert = false;
    boolean bhInStockDiscordAlert = true;
    boolean costcoInStockDiscordAlert = true;
    boolean samsClubInStockDiscordAlert = true;

    boolean abtInStockSoundAlert = true;
    boolean adoramaInStockSoundAlert = true;
    boolean amazonInStockSoundAlert = true;
    boolean antonlineInStockSoundAlert = true;
    boolean argosInStockSoundAlert = true;
    boolean bestbuyInStockSoundAlert = true;
    boolean lenovoInStockSoundAlert = true;
    boolean microsoftInStockSoundAlert = false;
    boolean meijerInStockSoundAlert = true;
    boolean newEggInStockSoundAlert = true;
    boolean pcRichardInStockSoundAlert = true;
    boolean sanbornsInStockSoundAlert = false;
    boolean targetInStockSoundAlert = true;
    boolean gamestopInStockSoundAlert = true;
    boolean walmartInStockSoundAlert = true;
    boolean sonyDirectInStockSoundAlert = false;
    boolean bhInStockSoundAlert = true;
    boolean costcoInStockSoundAlert = true;
    boolean samsClubInStockSoundAlert = true;

    public DiscordApi api;

    SoundPlayer soundPlayer = new SoundPlayer();

    ChromeOptions chromeOptions = new ChromeOptions();

    @BeforeClass(alwaysRun = true)
    public void init() {
        WebDriverManager.chromedriver().setup();
        //chromeOptions.addArguments("--headless");
        //api = startDiscord();
    }

    @Test(dataProviderClass = ABTProducts.class, dataProvider = "abtProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void abtChecker(List<Product> listOfProducts) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        ABTPage abtPage = new ABTPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (abtInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    abtPage.abtChecker(product.getCompany(), product.getName(), product.getUrl(),
                            abtInStockSoundAlert, abtInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }

        driver.quit();
        Assert.assertFalse(abtInStock);
    }

    @Test(dataProviderClass = AdoramaProducts.class, dataProvider = "adoramaProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void adoramaChecker(List<Product> listOfProducts) {
        WebDriver driver = new ChromeDriver();
        AdoramaPage adoramaPage = new AdoramaPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (adoramaInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    adoramaPage.adoramaChecker(product.getCompany(), product.getName(), product.getUrl(),
                            adoramaInStockSoundAlert, adoramaInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }

        driver.quit();
        Assert.assertFalse(adoramaInStock);
    }

    @Test(dataProviderClass = AmazonProducts.class, dataProvider = "amazonProducts", groups = "ui", enabled = true, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void amazonChecker(List<Product> listOfProducts) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        AmazonPage amazonPage = new AmazonPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (amazonInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    amazonPage.amazonChecker(product.getCompany(), product.getName(), product.getUrl(),
                            amazonInStockSoundAlert, amazonInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        driver.quit();
        Assert.assertFalse(amazonInStock);
    }

    @Test(dataProviderClass = AntonlineProducts.class, dataProvider = "antonlineProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void antonlineChecker(List<Product> listOfProducts) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        AntonlinePage antonlinePage = new AntonlinePage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (antonlineInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    antonlinePage.antonlineChecker(product.getCompany(), product.getName(), product.getUrl(),
                            antonlineInStockSoundAlert, antonlineInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }

        driver.quit();
        Assert.assertFalse(antonlineInStock);
    }

    @Test(dataProviderClass = ArgosUKProducts.class, dataProvider = "argosProducts", groups = "ui", enabled = false)
    @RetryCountIfFailed(50)
    public void argosUKChecker(List<Product> listOfProducts) {
        WebDriver driver = new ChromeDriver();
        ArgosPage argosPage = new ArgosPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (argosInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    argosPage.argosChecker(product.getCompany(), product.getName(), product.getUrl(),
                            argosInStockSoundAlert, argosInStockDiscordAlert);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        driver.quit();
        Assert.assertFalse(argosInStock);
    }

    @Test(dataProviderClass = BHProducts.class, dataProvider = "bhProducts", groups = "ui", enabled = false)
    public void bhChecker(List<Product> listOfProducts) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        BHPage bhPage = new BHPage(api, driver);

        while (bhInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    bhPage.bhChecker(product.getCompany(), product.getName(), product.getUrl(),
                            bhInStockSoundAlert, bhInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator(50000,30000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        driver.quit();
        Assert.assertFalse(bhInStock);
    }

    @Test(dataProviderClass = BestBuyProducts.class, dataProvider = "bestBuyProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void bestBuyChecker(List<Product> listOfProducts) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        BestBuyPage bestBuyPage = new BestBuyPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (bestbuyInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    bestBuyPage.bestBuyChecker(product.getCompany(), product.getName(), product.getUrl(),
                            bestbuyInStockSoundAlert, bestbuyInStockDiscordAlert);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        driver.quit();
        Assert.assertFalse(bestbuyInStock);
    }

    @Test(dataProviderClass = CostcoProducts.class, dataProvider = "costcoProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void costcoChecker(List<Product> listOfProducts) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        CostcoPage costcoPage = new CostcoPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (costcoInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    costcoPage.costcoChecker(product.getCompany(), product.getName(), product.getUrl(), costcoInStockSoundAlert, costcoInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        driver.quit();
        Assert.assertFalse(costcoInStock);
    }

    @Test(dataProviderClass = GamestopProducts.class, dataProvider = "gamestopProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void gamestopChecker(List<Product> listOfProducts) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        GamestopPage gamestopPage = new GamestopPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (gamestopInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    gamestopPage.gamestopChecker(product.getCompany(), product.getName(), product.getUrl(),
                            gamestopInStockSoundAlert, gamestopInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        driver.quit();
        Assert.assertFalse(gamestopInStock);
    }

    @Test(dataProviderClass = LenovoProducts.class, dataProvider = "lenovoProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void lenovoChecker(List<Product> listOfProducts) {
        WebDriver driver = new ChromeDriver();
        LenovoPage lenovoPage = new LenovoPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (lenovoInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    lenovoPage.lenovoChecker(product.getCompany(), product.getName(), product.getUrl(),
                            lenovoInStockSoundAlert, lenovoInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }

        driver.quit();
        Assert.assertFalse(lenovoInStock);
    }

    @Test(dataProviderClass = MicrosoftProducts.class, dataProvider = "microsoftProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void microsoftChecker(List<Product> listOfProducts) {
        WebDriver driver = new ChromeDriver();
        MicrosoftPage microsoftPage = new MicrosoftPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (microsoftInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    microsoftPage.microsoftChecker(product.getCompany(), product.getName(), product.getUrl(),
                            microsoftInStockSoundAlert, microsoftInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }

        driver.quit();
        Assert.assertFalse(microsoftInStock);
    }

    @Test(dataProviderClass = MeijerProducts.class, dataProvider = "meijerProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void meijerChecker(List<Product> listOfProducts) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        MeijerPage meijerPage = new MeijerPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (meijerInStock) {
            for (Product product : listOfProducts) {
                driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                meijerPage.meijerChecker(product.getCompany(), product.getName(), product.getUrl(),
                        meijerInStockSoundAlert, meijerInStockDiscordAlert);
                Thread.sleep(randomIntGenerator());
            }
        }

        driver.quit();
        Assert.assertFalse(meijerInStock);
    }

    @Test(dataProviderClass = NewEggProducts.class, dataProvider = "newEggProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void newEggChecker(List<Product> listOfProducts) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        NewEggPage newEggPage = new NewEggPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (newEggInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    newEggPage.newEggChecker(product.getCompany(), product.getName(), product.getUrl(),
                            newEggInStockSoundAlert, newEggInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        driver.quit();
        Assert.assertFalse(newEggInStock);
    }

    @Test(dataProviderClass = PCRichardProducts.class, dataProvider = "pcRichardProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void pcRichardChecker(List<Product> listOfProducts) {
        WebDriver driver = new ChromeDriver();
        PCRichardPage pcRichardPage = new PCRichardPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (pcRichardInStock) {
            listOfProducts.forEach(product -> {
                driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    pcRichardPage.pcRichardChecker(product.getCompany(), product.getName(), product.getUrl(),
                            pcRichardInStockSoundAlert, pcRichardInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        driver.quit();
        Assert.assertFalse(pcRichardInStock);
    }

    @Test(dataProviderClass = SamsClubProducts.class, dataProvider = "samsClubProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void samsClubChecker(List<Product> listOfProducts) {
        WebDriver driver = new ChromeDriver();
        SamsClubPage samsClubPage = new SamsClubPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (samsClubInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    samsClubPage.samsClubChecker(product.getCompany(), product.getName(),
                            product.getUrl(), samsClubInStockSoundAlert, samsClubInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }

        driver.quit();
        Assert.assertFalse(samsClubInStock);
    }

    @Test(dataProviderClass = SanbornsProducts.class, dataProvider = "sanbornsProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void sanbornsClubChecker(List<Product> listOfProducts) {
        WebDriver driver = new ChromeDriver();
        SanbornsPage sanbornsPage = new SanbornsPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (sanbornsInStock) {
            listOfProducts.forEach(product -> {
                driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    sanbornsPage.sanbornsChecker(product.getCompany(), product.getName(),
                            product.getUrl(), sanbornsInStockSoundAlert, sanbornsInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }

        driver.quit();
        Assert.assertFalse(sanbornsInStock);
    }

    @Test(dataProviderClass = TargetProducts.class, dataProvider = "targetProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(50)
    public void targetChecker(List<Product> listOfProducts) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        TargetPage targetPage = new TargetPage(api, driver);
        driver.manage().window().setPosition(new Point(2000, 33));

        while (targetInStock) {
            listOfProducts.forEach(product -> {
                //driver.manage().deleteAllCookies();
                driver.get(product.getUrl());
                try {
                    targetPage.targetChecker(product.getCompany(), product.getName(), product.getUrl(),
                            targetInStockSoundAlert, targetInStockDiscordAlert);
                    Thread.sleep(randomIntGenerator());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        driver.quit();
        Assert.assertFalse(targetInStock);
    }

    @Test(dataProviderClass = SonyDirectProducts.class, dataProvider = "sonyDirectProducts", groups = "ui", enabled = false, retryAnalyzer = RetryAnalyzer.class)
    @RetryCountIfFailed(5000)
    public void sonyDirectChecker(List<Product> listOfProducts) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        SonyDirectPage sonyDirectPage = new SonyDirectPage(api, driver);

        while (sonyDirectInStock) {
            for (Product listOfProduct : listOfProducts) {
                Response response =
                        given().
                                header("User-Agent", UserAgents.getRandomUserAgent()).
                                header("Accept-Encoding", "gzip, deflate, br").
                                header("Connection", "keep-alive").
                                header("Accept", "*/*").
                                header(randomGenerator(), randomGenerator()).
                                when().
                                get(listOfProduct.getUrl()).
                                then().
                                statusCode(HttpStatus.SC_OK).
                                contentType(ContentType.JSON).extract().
                                response();

                JsonPath jsonPath = new JsonPath(response.getBody().asString());
                String stockStatus = jsonPath.getString("products.stock.stockLevelStatus");
                String time = new SimpleDateFormat("hh:mm:ss a").format(new Date());
                if (stockStatus.contains("[outOfStock]")) {
//                  String pageText = response.getBody().asPrettyString();
//                  System.out.println(pageText);
                    System.out.print(ANSI_BLUE + "[" + time + " PST] ==> ");
                    System.out.print(ANSI_RED + "OUT OF STOCK: ");
                    System.out.print(ANSI_BLUE + "[" + listOfProduct.getName() + "] :: ");
                    System.out.print(ANSI_PURPLE + "(" + listOfProduct.getCompany() + ")\n" + ANSI_RESET);
                } else {

                    System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "[" + time + "] IN STOCK! Company: " + listOfProduct.getCompany() + ", " +
                            "Product: " + listOfProduct.getName() + ANSI_RESET);
                }
            }
            Thread.sleep(randomIntGenerator(5000,2000));
        }

//        while (sonyDirectInStock) {
//            listOfProducts.forEach(product -> {
//                //driver.manage().deleteAllCookies();
//                driver.get(product.getUrl());
//                try {
//                    sonyDirectPage.sonyDirectChecker(product.getCompany(), product.getName(), product.getUrl(),
//                            sonyDirectInStockSoundAlert, sonyDirectProductInStockDiscordAlert, sonyDirectQueueDiscordAlert);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//
//        driver.quit();
//        Assert.assertFalse(sonyDirectInStock);

    }

    //THE REJECTS LOL
    //BH Sucks, Walmart and SD have ReCAPTCHA
    @Test(dataProvider = "walmartProducts", groups = "ui", enabled = false)
    public void walmartChecker(List<Product> listOfProducts) throws InterruptedException {

        while (walmartInStock) {
            for (Product listOfProduct : listOfProducts) {
                Response response =
                        given().
                                //header("Cookie", "DL=93534%2C%2C%2Cip%2C93534%2C%2C; vtc=VODXNDQ8wUhGLYYIOQvpoY; location-data=93534%3ALancaster%3ACA%3A%3A1%3A1|17f%3B%3B1.52%2C29z%3B%3B2.83%2C1a4%3B%3B5.74%2C4e1%3B%3B6.32%2C29y%3B%3B11.24%2C2pv%3B%3B28.16%2C3ze%3B%3B29.91%2C1rt%3B%3B32.23%2C3bx%3B%3B35.05%2C4bp%3B%3B36.13||7|1|1y6i%3B16%3B6%3B29.89%2C1yjb%3B16%3B9%3B33.33%2C1y7e%3B16%3B12%3B36.59%2C1ypk%3B16%3B13%3B37.76%2C1y7c%3B16%3B14%3B37.9; bstc=d6-9d8I8ZuC1uqyUWA_LSw; mobileweb=0; xpa=; xpm=3%2B1605770352%2BVODXNDQ8wUhGLYYIOQvpoY~%2B0; TS01b0be75=01538efd7cf6ce85a7f2cf564f17b90ba5d4ebdc1288465a3a1f69ad65ef72dd0ecc1bb41a3eacedfeb58855fe2d2726894cd315bc; TS013ed49a=01538efd7cf6ce85a7f2cf564f17b90ba5d4ebdc1288465a3a1f69ad65ef72dd0ecc1bb41a3eacedfeb58855fe2d2726894cd315bc; akavpau_p8=1605771125~id=b14df975a46582d0967f76d61a2a90ab").
//                            header("User-Agent", "PostmanRuntime/7.26.5").
        header("User-Agent", UserAgents.getRandomUserAgent()).
                                header("Accept-Encoding", "gzip, deflate, br").
                                header("Connection", "keep-alive").
                                header("Accept", "*/*").
                                header(randomGenerator(), randomGenerator()).
                                // param("SKU",randomGenerator()).
                                        when().
                                get(listOfProduct.getUrl()).
                                then().
                                contentType(ContentType.HTML).extract().response();

                XmlPath htmlPath = new XmlPath(HTML, response.getBody().asString());
                String pageTitle = htmlPath.getString("html.head.title");

                if (pageTitle.contains("Verify")) {
                    //System.out.println("ReCAPTCHA'ed");
                    pageTitle = htmlPath.getString("html.head.title");
                } else {
                    System.out.println("Sneaking In");
                    String pageText = response.getBody().asPrettyString();
                    if (pageText.contains("prod-ProductCTA--primary")) {
                        System.out.println("IN STOCK!!!");
                    } else {
                        System.out.println(listOfProduct.getName() + " is out of stockerzzz");
                    }
                }
                Thread.sleep(randomIntGenerator());
            }

//        Assert.assertEquals(htmlPath.getString("html.head.title"), "PlayStation 5 Console - Walmart.com - Walmart.com");
        }
//        WebDriver driver = new ChromeDriver();
//        WalmartPage walmartPage = new WalmartPage(api, driver);
//        while (walmartInStock) {
//            listOfProducts.forEach(product -> {
//                //driver.manage().deleteAllCookies();
//                driver.get(product.getUrl());
////                try {
////                    takeSnapShot(driver,"src/main/resources/snapshots/test.png");
////                } catch (Exception e) {
////                    System.out.println(e.getStackTrace());
////                }
////                if (driver.getPageSource().contains("Verify your identity")) {
////                    try {
////                        //Thread.sleep(40000);
////                    } catch (Exception e) {
////                        e.printStackTrace();
////                    }
////                }
//                try {
//                    walmartPage.walmartChecker(product.getCompany(), product.getName(), product.getUrl(),
//                            walmartInStockSoundAlert, walmartInStockDiscordAlert);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//
//        driver.quit();
//        Assert.assertFalse(walmartInStock);
    }


    private void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile = new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

    }

//    private DiscordApi startDiscord() {
//        api = new DiscordApiBuilder().setToken(Discord.TOKEN).login().join();
//
//        // Add a listener which answers with "Pong!" if someone writes "!ping"
//        api.addMessageCreateListener(event -> {
//            /*
//            System.out.println(event.getMessageAuthor().getRoleColor());
//            Optional[java.awt.Color[r=52,g=152,b=219]]
//            Optional.empty
//             */
//
//            String messageAuthorDisplayName = event.getMessageAuthor().getDisplayName();
//
//            if (messageAuthorDisplayName.equals("Captain Gurdy") || messageAuthorDisplayName.equals("Momo") || messageAuthorDisplayName.equals("Grey Fox")) {
//
//                if (event.getMessageContent().equalsIgnoreCase("!awooga")) {
//                    event.getChannel().sendMessage("Sounding the alarms in Twitch Officer "+messageAuthorDisplayName);
//                    soundPlayer.playPSSound();
//                }
//
//                if (event.getMessageContent().equalsIgnoreCase("!toggleSonyDirectQueueDiscord")) {
//                    sonyDirectQueueDiscordAlert = flagSwitcher(sonyDirectQueueDiscordAlert);
//                    event.getChannel().sendMessage("Changing discord notifications to " + sonyDirectQueueDiscordAlert);
//                }
//
//                if (event.getMessageContent().equalsIgnoreCase("!toggleSonyDirectSoundAlert")) {
//                    sonyDirectInStockSoundAlert = flagSwitcher(sonyDirectInStockSoundAlert);
//                    event.getChannel().sendMessage("Changing sound notifications to " + sonyDirectInStockSoundAlert);
//                }
//
//
//            }
//
//            if (event.getMessageAuthor().getRoleColor().isPresent()) {
//                if (event.getMessageContent().equalsIgnoreCase("!ping")) {
//                    event.getChannel().sendMessage("Pong!");
//                }
//                if (event.getMessageContent().equalsIgnoreCase("!captain")) {
//                    event.getChannel().sendMessage("Gurdy!");
//                }
//                if (event.getMessageContent().equalsIgnoreCase("!thanksIris")) {
//                    event.getChannel().sendMessage("No problemo " + event.getMessageAuthor().getDisplayName() + "!!!");
//                }
//                if (event.getMessageContent().equalsIgnoreCase("!twitch")) {
//                    event.getChannel().sendMessage("Here you go " + event.getMessageAuthor().getDisplayName() + "! https://www.twitch.tv/captaingurdy");
//                }
//                if (event.getMessageContent().equalsIgnoreCase("!donate")) {
//                    event.getChannel().sendMessage("Thanks for supporting the cause " + event.getMessageAuthor().getDisplayName() + "! https://streamlabs.com/captaingurdy/tip");
//                }
//                if (event.getMessageContent().equalsIgnoreCase("!commands")) {
//                    event.getChannel().sendMessage("!twitch \n !donate \n !captain \n !thanksIris \n !ping");
//                }
//            } else {
//                if (event.getMessageContent().equalsIgnoreCase("!thanksIris")) {
//                    event.getChannel().sendMessage("No problemo " + event.getMessageAuthor().getDisplayName() + "!!!");
//                }
//                if (event.getMessageContent().equalsIgnoreCase("!twitch")) {
//                    event.getChannel().sendMessage("Here you go " + event.getMessageAuthor().getDisplayName() + "! https://www.twitch.tv/captaingurdy");
//                }
//                if (event.getMessageContent().equalsIgnoreCase("!donate")) {
//                    event.getChannel().sendMessage("Thanks for supporting the cause " + event.getMessageAuthor().getDisplayName() + "! https://streamlabs.com/captaingurdy/tip");
//                }
//            }
//        });
//
////        new MessageBuilder()
////                .append("Second Mate Iris Reporting Captain Gurdy!",
////                MessageDecoration.BOLD)
////                .send(api.getTextChannelById(Discord.GENERAL_CHANNEL_ID).get());
//
//        return api;
//    }

//    public boolean flagSwitcher(boolean flagToBeSwitched) {
//        return !flagToBeSwitched;
//    }

    public String randomGenerator() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 300;


        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

    }

    public int randomIntGenerator() {
        Random r = new Random();
        int low = 3000;
        int high = 5000;
        int result = r.nextInt(high-low) + low;
        return result;
    }

    public int randomIntGenerator(int maxSeconds, int minSeconds) {
        Random r = new Random();
        int low = minSeconds;
        int high = maxSeconds;
        int result = r.nextInt(high-low) + low;
        return result;
    }
}
