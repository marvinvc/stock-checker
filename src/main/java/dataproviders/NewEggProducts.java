package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class NewEggProducts {

    @DataProvider(name = "newEggProducts")
    public Object[][] newEggProducts() {
        List<Product> list = new ArrayList<>();

//        Product ryzen5950 = new Product();
//        ryzen5950.setCompany(Companies.NEWEGG);
//        ryzen5950.setName("Ryzen 5950X");
//        ryzen5950.setUrl("https://www.newegg.com/Product/Product.aspx?Item=N82E16819113663&Tpk=19-113-663");
//
//        Product ryzen5900 = new Product();
//        ryzen5900.setCompany(Companies.NEWEGG);
//        ryzen5900.setName("Ryzen 5900X");
//        ryzen5900.setUrl("https://www.newegg.com/Product/Product.aspx?Item=N82E16819113664&Tpk=19-113-664");
//
//        Product ryzen5800 = new Product();
//        ryzen5800.setCompany(Companies.NEWEGG);
//        ryzen5800.setName("Ryzen 5800X");
//        ryzen5800.setUrl("https://www.newegg.com/Product/Product.aspx?Item=N82E16819113665&Tpk=19-113-665");
//
//        Product ryzen5600 = new Product();
//        ryzen5600.setCompany(Companies.NEWEGG);
//        ryzen5600.setName("Ryzen 5600X");
//        ryzen5600.setUrl("https://www.newegg.com/Product/Product.aspx?Item=N82E16819113666&Tpk=19-113-666");
//
//        list.add(ryzen5950);
//        list.add(ryzen5900);
//        list.add(ryzen5800);
//        list.add(ryzen5600);

        Product ps5Disc1 = new Product();
        ps5Disc1.setCompany(Companies.NEWEGG);
        ps5Disc1.setName(Products.PS5_DISC_BUNDLE);
        ps5Disc1.setUrl("https://www.newegg.com/p/N82E16868110291");

        Product ps5Disc2 = new Product();
        ps5Disc2.setCompany(Companies.NEWEGG);
        ps5Disc2.setName(Products.PS5_DISC_BUNDLE);
        ps5Disc2.setUrl("https://www.newegg.com/p/N82E16868110292");

        Product ps5Disc3 = new Product();
        ps5Disc3.setCompany(Companies.NEWEGG);
        ps5Disc3.setName(Products.PS5_DISC_BUNDLE);
        ps5Disc3.setUrl("https://www.newegg.com/p/N82E16868110293");

        Product xboxSeriesX = new Product();
        xboxSeriesX.setCompany(Companies.NEWEGG);
        xboxSeriesX.setName(Products.XBOX_SERIES_X);
        xboxSeriesX.setUrl("https://www.newegg.com/p/N82E16868105273?Description=Xbox%20series&cm_re=Xbox_series-_-68-105-273-_-Product");

        Product xBoxSeriesS = new Product();
        xBoxSeriesS.setCompany(Companies.NEWEGG);
        xBoxSeriesS.setName(Products.XBOX_SERIES_S);
        xBoxSeriesS.setUrl("https://www.newegg.com/p/N82E16868105274?Description=Xbox%20series&cm_re=Xbox_series-_-68-105-274-_-Product");

        Product xboxSeriesXBundle = new Product();
        xboxSeriesXBundle.setCompany(Companies.NEWEGG);
        xboxSeriesXBundle.setName(Products.XBOX_SERIES_X_BUNDLE);
        xboxSeriesXBundle.setUrl("https://www.newegg.com/Product/ComboDealDetails?ItemList=Combo.4205033");

        Product xBoxSeriesSBundle = new Product();
        xBoxSeriesSBundle.setCompany(Companies.NEWEGG);
        xBoxSeriesSBundle.setName(Products.XBOX_SERIES_S_BUNDLE);
        xBoxSeriesSBundle.setUrl("https://www.newegg.com/Product/ComboDealDetails?ItemList=Combo.4205036&quicklink=true");

        list.add(ps5Disc1);
        list.add(ps5Disc2);
        list.add(ps5Disc3);
        list.add(xboxSeriesX);
        list.add(xboxSeriesXBundle);
        //list.add(xBoxSeriesS);
        //list.add(xBoxSeriesSBundle);

        return new Object[][]{{list}};
    }

}
