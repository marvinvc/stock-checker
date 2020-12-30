package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class SamsClubProducts {

    @DataProvider(name = "samsClubProducts")
    public Object[][] samsClubProducts() {
        List<Product> list = new ArrayList<>();

        Product ps5Disc = new Product();
        ps5Disc.setCompany(Companies.SAMSCLUB);
        ps5Disc.setName(Products.PS5_DISC_BUNDLE);
        ps5Disc.setUrl("https://www.samsclub.com/p/ps5-bundle/prod24980178?xid=plp_product_3");

        list.add(ps5Disc);

        return new Object[][]{{list}};
    }

}
