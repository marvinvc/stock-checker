package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class CostcoProducts {

    @DataProvider(name = "costcoProducts")
    public Object[][] costcoProducts() {
        List<Product> list = new ArrayList<>();

        Product ps5Disc = new Product();
        ps5Disc.setCompany(Companies.COSTCO);
        ps5Disc.setName(Products.PS5_DISC_BUNDLE);
        ps5Disc.setUrl("https://www.costco.com/sony-playstation-5-gaming-console-bundle.product.100691489.html");

        Product xboxDisc = new Product();
        xboxDisc.setCompany(Companies.COSTCO);
        xboxDisc.setName(Products.XBOX_SERIES_X_BUNDLE);
        xboxDisc.setUrl("https://www.costco.com/xbox-series-x-1tb-console-with-additional-controller.product.100691493.html");

        Product xboxDigital = new Product();
        xboxDigital.setCompany(Companies.COSTCO);
        xboxDigital.setName(Products.XBOX_SERIES_S_BUNDLE);
        xboxDigital.setUrl("https://www.costco.com/xbox-series-s-with-additional-controller.product.100699182.html");

        list.add(ps5Disc);
        list.add(xboxDisc);
        list.add(xboxDigital);

        return new Object[][]{{list}};
    }

}
