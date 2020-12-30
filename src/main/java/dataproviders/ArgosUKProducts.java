package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class ArgosUKProducts {

    @DataProvider(name = "argosProducts")
    public Object[][] argosProducts() {
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
        ps5Disc.setCompany(Companies.ARGOS);
        ps5Disc.setName(Products.PS5_DISC);
        ps5Disc.setUrl("https://www.argos.co.uk/product/6795199");

        Product xboxSeriesX = new Product();
        xboxSeriesX.setCompany(Companies.ARGOS);
        xboxSeriesX.setName(Products.XBOX_SERIES_X);
        xboxSeriesX.setUrl("https://www.argos.co.uk/product/8448262");

        Product xboxSeriesS = new Product();
        xboxSeriesS.setCompany(Companies.ARGOS);
        xboxSeriesS.setName(Products.XBOX_SERIES_X);
        xboxSeriesS.setUrl("https://www.argos.co.uk/product/8448248");

        list.add(ps5Disc);

        return new Object[][]{{list}};
    }

}

