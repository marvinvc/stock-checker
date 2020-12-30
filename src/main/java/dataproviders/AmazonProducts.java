package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class AmazonProducts {

    @DataProvider(name = "amazonProducts")
    public Object[][] amazonProducts() {
        List<Product> list = new ArrayList<>();

//        Product ryzen5950 = new Product();
//        ryzen5950.setName("Ryzen 5950X");
//        ryzen5950.setCompany(Companies.AMAZON);
//        ryzen5950.setUrl("https://www.amazon.com/DANIPEW-Sand-Man-Cotton-Performance-T-Shirt/dp/B0815Y8J9N?ref_=ast_sto_dp");
//
//        Product ryzen5900 = new Product();
//        ryzen5900.setName("Ryzen 5900X");
//        ryzen5900.setCompany(Companies.AMAZON);
//        ryzen5900.setUrl("https://www.amazon.com/DANIPEW-Sand-Man-Cotton-Performance-T-Shirt/dp/B08164VTWH?ref_=ast_sto_dp");
//
//        Product ryzen5800 = new Product();
//        ryzen5800.setName("Ryzen 5800X");
//        ryzen5800.setCompany(Companies.AMAZON);
//        ryzen5800.setUrl("https://www.amazon.com/DANIPEW-Sand-Man-Cotton-Performance-T-Shirt/dp/B0815XFSGK?ref_=ast_sto_dp");
//
//        Product ryzen5600 = new Product();
//        ryzen5600.setName("Ryzen 5600X");
//        ryzen5600.setCompany(Companies.AMAZON);
//        ryzen5600.setUrl("https://www.amazon.com/AMD-Ryzen-5600X-12-Thread-Processor/dp/B08166SLDF?ref_=ast_sto_dp");
//
//        list.add(ryzen5950);
//        list.add(ryzen5900);
//        list.add(ryzen5800);
//        list.add(ryzen5600);

        Product ps5Disc = new Product();
        ps5Disc.setCompany(Companies.AMAZON);
        ps5Disc.setName(Products.PS5_DISC);
        ps5Disc.setUrl("https://www.amazon.com/dp/B08FC5L3RG");

        Product ps5Digital = new Product();
        ps5Digital.setCompany(Companies.AMAZON);
        ps5Digital.setName(Products.PS5_DIGITAL);
        ps5Digital.setUrl("https://www.amazon.com/PlayStation-5-Console/dp/B08FC6MR62");

        Product xboxSeriesX = new Product();
        xboxSeriesX.setCompany(Companies.AMAZON);
        xboxSeriesX.setName(Products.XBOX_SERIES_X);
        xboxSeriesX.setUrl("https://www.amazon.com/Xbox-X/dp/B08H75RTZ8?th=1");

        Product xBoxSeriesS = new Product();
        xBoxSeriesS.setCompany(Companies.AMAZON);
        xBoxSeriesS.setName(Products.XBOX_SERIES_S);
        xBoxSeriesS.setUrl("https://www.amazon.com/Xbox-X/dp/B08G9J44ZN?th=1");

//        Product ps5DiscUK = new Product();
//        ps5DiscUK.setCompany(Companies.AMAZON+" - UK");
//        ps5DiscUK.setName(Products.PS5_DISC);
//        ps5DiscUK.setUrl("https://www.amazon.co.uk/PlayStation-9395003-5-Console/dp/B08H95Y452");
//
//        Product ps5DigitalUK = new Product();
//        ps5DigitalUK.setCompany(Companies.AMAZON+" - UK");
//        ps5DigitalUK.setName(Products.PS5_DIGITAL);
//        ps5DigitalUK.setUrl("https://www.amazon.co.uk/PlayStation-9395003-5-Console/dp/B08H95Y452");
//
//        Product ps5DiscMX = new Product();
//        ps5DiscMX.setCompany(Companies.AMAZON+" - MX");
//        ps5DiscMX.setName(Products.PS5_DISC);
//        ps5DiscMX.setUrl("https://www.amazon.com.mx/Consola-PlayStation-Standard-entrega-diciembre/dp/B08BQ9X5CN/ref=sr_1_1?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=Playstation+5&qid=1607064100&s=videogames&sr=1-1");
//
//        Product ps5DigitalMX = new Product();
//        ps5DigitalMX.setCompany(Companies.AMAZON+" - MX");
//        ps5DigitalMX.setName(Products.PS5_DIGITAL);
//        ps5DigitalMX.setUrl("https://www.amazon.com.mx/Consola-PlayStation-Edici%C3%B3n-Digital-diciembre/dp/B089MKQ9Z2/ref=sr_1_2?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=Playstation+5&qid=1607064100&s=videogames&sr=1-2");
//
//        Product ps5DiscIt = new Product();
//        ps5DiscIt.setCompany(Companies.AMAZON+" - IT");
//        ps5DiscIt.setName(Products.PS5_DISC);
//        ps5DiscIt.setUrl("https://www.amazon.it/Sony-PlayStation-5/dp/B08KKJ37F7");
//
//        Product ps5DigitalIt = new Product();
//        ps5DigitalIt.setCompany(Companies.AMAZON+" - IT");
//        ps5DigitalIt.setName(Products.PS5_DIGITAL);
//        ps5DigitalIt.setUrl("https://www.amazon.it/PlayStation-console-Digital-blu-ray-player/dp/B08NTRNDPW");

        Product pulsePS5Headset = new Product();
        pulsePS5Headset.setCompany(Companies.AMAZON);
        pulsePS5Headset.setName(Products.PS5_PULSE_HEADSET);
        pulsePS5Headset.setUrl("https://www.amazon.com/PULSE-3D-Wireless-Headset-PlayStation-5/dp/B08FC6QLKN");

        Product chargingStationPS5Headset = new Product();
        chargingStationPS5Headset.setCompany(Companies.AMAZON);
        chargingStationPS5Headset.setName(Products.PS5_CHARGING_STATION);
        chargingStationPS5Headset.setUrl("https://www.amazon.com/DualSense-Charging-Station-PlayStation-5/dp/B08FC6Y4VG");


        list.add(ps5Disc);
        list.add(ps5Digital);
        list.add(pulsePS5Headset);
        list.add(chargingStationPS5Headset);
        list.add(xboxSeriesX);


        return new Object[][]{{list}};
    }

}
