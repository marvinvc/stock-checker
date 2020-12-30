package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class BestBuyProducts {

    @DataProvider(name = "bestBuyProducts")
    public Object[][] bestBuyProducts() {
        List<Product> list = new ArrayList<>();

//        Product ryzen5950 = new Product();
//        ryzen5950.setCompany(Companies.BESTBUY);
//        ryzen5950.setName("Ryzen 5950X");
//        ryzen5950.setUrl("https://www.bestbuy.com/site/amd-ryzen-9-5950x-4th-gen-16-core-32-threads-unlocked-desktop-processor-without-cooler/6438941.p?skuId=6438941");
//
//        Product ryzen5900 = new Product();
//        ryzen5900.setCompany(Companies.BESTBUY);
//        ryzen5900.setName("Ryzen 5900X");
//        ryzen5900.setUrl("https://www.bestbuy.com/site/amd-ryzen-9-5900x-4th-gen-12-core-24-threads-unlocked-desktop-processor-without-cooler/6438942.p?skuId=6438942");
//
//        Product ryzen5800 = new Product();
//        ryzen5800.setCompany(Companies.BESTBUY);
//        ryzen5800.setName("Ryzen 5800X");
//        ryzen5800.setUrl("https://www.bestbuy.com/site/amd-ryzen-7-5800x-4th-gen-8-core-16-threads-unlocked-desktop-processor-without-cooler/6439000.p?skuId=6439000");
//
//
//        Product ryzen5600 = new Product();
//        ryzen5600.setCompany(Companies.BESTBUY);
//        ryzen5600.setName("Ryzen 5600X");
//        ryzen5600.setUrl("https://www.bestbuy.com/site/amd-ryzen-5-5600x-4th-gen-6-core-12-threads-unlocked-desktop-processor-with-wraith-stealth-cooler/6438943.p?skuId=6438943");

//        list.add(ryzen5950);
//        list.add(ryzen5900);
//        list.add(ryzen5800);
//        list.add(ryzen5600);

        Product ps5Disc = new Product();
        ps5Disc.setCompany(Companies.BESTBUY);
        ps5Disc.setName(Products.PS5_DISC);
        ps5Disc.setUrl("https://www.bestbuy.com/site/sony-playstation-5-console/6426149.p?skuId=6426149");

        Product ps5Digital = new Product();
        ps5Digital.setCompany(Companies.BESTBUY);
        ps5Digital.setName(Products.PS5_DIGITAL);
        ps5Digital.setUrl("https://www.bestbuy.com/site/sony-playstation-5-digital-edition-console/6430161.p?skuId=6430161");

        Product xboxSeriesX = new Product();
        xboxSeriesX.setCompany(Companies.BESTBUY);
        xboxSeriesX.setName(Products.XBOX_SERIES_X);
        xboxSeriesX.setUrl("https://www.bestbuy.com/site/microsoft-xbox-series-x-1tb-console-black/6428324.p?skuId=6428324");

        Product xBoxSeriesS = new Product();
        xBoxSeriesS.setCompany(Companies.BESTBUY);
        xBoxSeriesS.setName(Products.XBOX_SERIES_S);
        xBoxSeriesS.setUrl("https://www.bestbuy.com/site/microsoft-xbox-series-s-512-gb-all-digital-console-disc-free-gaming-white/6430277.p?skuId=6430277");

        Product pulsePS5Headset = new Product();
        pulsePS5Headset.setCompany(Companies.BESTBUY);
        pulsePS5Headset.setName(Products.PS5_PULSE_HEADSET);
        pulsePS5Headset.setUrl("https://www.bestbuy.com/site/searchpage.jsp?st=pulse+3d&_dyncharset=UTF-8&_dynSessConf=&id=pcat17071&type=page&sc=Global&cp=1&nrp=&sp=&qp=&list=n&af=true&iht=y&usc=All+Categories&ks=960&keys=keys");

        Product chargingStationPS5Headset = new Product();
        chargingStationPS5Headset.setCompany(Companies.BESTBUY);
        chargingStationPS5Headset.setName(Products.PS5_CHARGING_STATION);
        chargingStationPS5Headset.setUrl("https://www.bestbuy.com/site/sony-playstation-5-dualsense-charging-station-white/6430165.p?skuId=6430165");

        list.add(ps5Disc);
        list.add(ps5Digital);
        list.add(pulsePS5Headset);
        list.add(xboxSeriesX);
        //list.add(xBoxSeriesS);

        return new Object[][]{{list}};
    }

}
