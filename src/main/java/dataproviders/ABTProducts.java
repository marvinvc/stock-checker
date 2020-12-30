package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class ABTProducts {


    @DataProvider(name = "abtProducts")
    public Object[][] abtProducts() {
        List<Product> list = new ArrayList<>();

        Product ps5DiscBundle = new Product();
        ps5DiscBundle.setCompany(Companies.ABT);
        ps5DiscBundle.setName(Products.PS5_DISC_BUNDLE);
        ps5DiscBundle.setUrl("https://www.abt.com/product/155781/Sony-PlayStation-5-PS5-White-Game-Console-with-Extra-Controller-3005718.html");

        Product xboxDiscBundle = new Product();
        xboxDiscBundle.setCompany(Companies.ABT);
        xboxDiscBundle.setName(Products.XBOX_SERIES_X);
        xboxDiscBundle.setUrl("https://www.abt.com/product/153585/Microsoft-Xbox-Series-X-1TB-Game-Console-with-Extra-Controller-889842640724.html");

        Product xboxDigitalBundle = new Product();
        xboxDigitalBundle.setCompany(Companies.ABT);
        xboxDigitalBundle.setName(Products.XBOX_SERIES_S);
        xboxDigitalBundle.setUrl("https://www.abt.com/product/153583/Microsoft-Xbox-Series-S-512GB-Game-Console-With-Extra-Controller-889842651317.html");

        list.add(ps5DiscBundle);
        list.add(xboxDiscBundle);
        //list.add(xboxDigitalBundle);

        return new Object[][]{{list}};
    }

}
