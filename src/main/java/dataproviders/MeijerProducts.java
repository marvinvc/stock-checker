package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class MeijerProducts {

    @DataProvider(name = "meijerProducts")
    public Object[][] meijerProducts() {
        List<Product> list = new ArrayList<>();

        Product ps5Disc = new Product();
        ps5Disc.setCompany(Companies.MEIJER);
        ps5Disc.setName(Products.PS5_DISC_BUNDLE);
        ps5Disc.setUrl("https://www.meijer.com/shop/en/video-games-consoles/playstation/gaming-systems/c/L4-2398");

        Product xboxDisc = new Product();
        xboxDisc.setCompany(Companies.MEIJER);
        xboxDisc.setName(Products.PS5_DISC_BUNDLE);
        xboxDisc.setUrl("https://www.meijer.com/shop/en/video-games-consoles/xbox/gaming-systems/c/L4-2401");

        list.add(ps5Disc);
        list.add(xboxDisc);

        return new Object[][]{{list}};
    }

}
