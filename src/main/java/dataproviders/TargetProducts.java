package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class TargetProducts {

    @DataProvider(name = "targetProducts")
    public Object[][] targetProducts() {

        List<Product> list = new ArrayList<>();

        Product ps5Disc = new Product();
        ps5Disc.setCompany(Companies.TARGET);
        ps5Disc.setName(Products.PS5_DISC);
        ps5Disc.setUrl("https://www.target.com/p/playstation-5-console/-/A-81114595");

        Product ps5Digital = new Product();
        ps5Digital.setCompany(Companies.TARGET);
        ps5Digital.setName(Products.PS5_DIGITAL);
        ps5Digital.setUrl("https://www.target.com/p/playstation-5-digital-edition-console/-/A-81114596");

        Product xboxSeriesX = new Product();
        xboxSeriesX.setCompany(Companies.TARGET);
        xboxSeriesX.setName(Products.XBOX_SERIES_X);
        xboxSeriesX.setUrl("https://www.target.com/p/xbox-series-x-console/-/A-80790841");

        Product xBoxSeriesS = new Product();
        xBoxSeriesS.setCompany(Companies.TARGET);
        xBoxSeriesS.setName(Products.XBOX_SERIES_S);
        xBoxSeriesS.setUrl("https://www.target.com/p/xbox-series-s-console/-/A-80790842");

        Product pulsePS5Headset = new Product();
        pulsePS5Headset.setCompany(Companies.TARGET);
        pulsePS5Headset.setName(Products.PS5_PULSE_HEADSET);
        pulsePS5Headset.setUrl("https://www.target.com/p/sony-pulse-3d-wireless-gaming-headset-for-playstation-5/-/A-81114474");

        Product chargingStationPS5Headset = new Product();
        chargingStationPS5Headset.setCompany(Companies.TARGET);
        chargingStationPS5Headset.setName(Products.PS5_CHARGING_STATION);
        chargingStationPS5Headset.setUrl("https://www.target.com/p/dualsense-charging-station-for-playstation-5/-/A-81114475");


        list.add(ps5Disc);
        list.add(ps5Digital);
        list.add(pulsePS5Headset);
        list.add(chargingStationPS5Headset);
        list.add(xboxSeriesX);
        //list.add(xBoxSeriesS);

        return new Object[][]{{list}};
    }

}
