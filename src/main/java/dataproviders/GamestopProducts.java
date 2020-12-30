package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class GamestopProducts {

    @DataProvider(name = "gamestopProducts")
    public Object[][] gamestopProducts() {
        List<Product> list = new ArrayList<>();

        Product ps5Disc = new Product();
        ps5Disc.setCompany(Companies.GAMESTOP);
        ps5Disc.setName(Products.PS5_DISC);
        ps5Disc.setUrl("https://www.gamestop.com/video-games/playstation-5/consoles/products/playstation-5/11108140.html?condition=New");

        Product ps5Digital = new Product();
        ps5Digital.setCompany(Companies.GAMESTOP);
        ps5Digital.setName(Products.PS5_DIGITAL);
        ps5Digital.setUrl("https://www.gamestop.com/video-games/playstation-5/consoles/products/playstation-5-digital-edition/11108141.html?condition=New");

        Product ps5DigitalBundle = new Product();
        ps5DigitalBundle.setCompany(Companies.GAMESTOP);
        ps5DigitalBundle.setName(Products.PS5_DIGITAL_BUNDLE);
        ps5DigitalBundle.setUrl("https://www.gamestop.com/video-games/playstation-5/consoles/products/playstation-5-ultimate-digital-launch-day-system-bundle/B225171E.html");

        Product ps5DigitalBundle2 = new Product();
        ps5DigitalBundle2.setCompany(Companies.GAMESTOP);
        ps5DigitalBundle2.setName(Products.PS5_DIGITAL_BUNDLE);
        ps5DigitalBundle2.setUrl("https://www.gamestop.com/video-games/playstation-5/consoles/products/playstation-5-ultimate-digital-launch-day-system-bundle/B225171E.html");

        Product ps5DiscBundle = new Product();
        ps5DiscBundle.setCompany(Companies.GAMESTOP);
        ps5DiscBundle.setName(Products.PS5_DISC_BUNDLE);
        ps5DiscBundle.setUrl("https://www.gamestop.com/video-games/playstation-5/consoles/products/playstation-5-ultimate-launch-day-system-bundle/B225169E.html");

        Product ps5DiscBundle2 = new Product();
        ps5DiscBundle2.setCompany(Companies.GAMESTOP);
        ps5DiscBundle2.setName(Products.PS5_DISC_BUNDLE);
        ps5DiscBundle2.setUrl("https://www.gamestop.com/video-games/playstation-5/consoles/products/playstation-5-exclusive-titles-system-bundle/B225169H.html");

        Product ps5DiscBundle3 = new Product();
        ps5DiscBundle3.setCompany(Companies.GAMESTOP);
        ps5DiscBundle3.setName(Products.PS5_DISC_BUNDLE);
        ps5DiscBundle3.setUrl("https://www.gamestop.com/video-games/playstation-5/consoles/products/playstation-5-spider-man-demons-souls-and-accessories-system-bundle/B225169G.html");

        Product xboxSeriesX = new Product();
        xboxSeriesX.setCompany(Companies.GAMESTOP);
        xboxSeriesX.setName(Products.XBOX_SERIES_X);
        xboxSeriesX.setUrl("https://www.gamestop.com/products/xbox-series-x/11108371.html");

        Product xBoxSeriesS = new Product();
        xBoxSeriesS.setCompany(Companies.GAMESTOP);
        xBoxSeriesS.setName(Products.XBOX_SERIES_S);
        xBoxSeriesS.setUrl("https://www.gamestop.com/video-games/xbox-series-x/consoles/products/xbox-series-s-digital-edition/11108372.html?condition=New");

        list.add(ps5Disc);
        list.add(ps5Digital);
        //list.add(ps5DigitalBundle);
        //list.add(ps5DigitalBundle2);
        //list.add(ps5DiscBundle);
        //list.add(ps5DiscBundle2);
        //list.add(ps5DiscBundle3);
        list.add(xboxSeriesX);
        //list.add(xBoxSeriesS);

        return new Object[][]{{list}};
    }

}
