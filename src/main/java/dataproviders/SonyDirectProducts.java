package dataproviders;

import constants.Companies;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class SonyDirectProducts {

    @DataProvider(name = "sonyDirectProducts")
    public Object[][] sonyDirectProducts() {
        List<Product> list = new ArrayList<>();

        Product ps5Disc = new Product();
        ps5Disc.setCompany(Companies.SONYDIRECT);
        ps5Disc.setName("Playstation 5 - Disc");
        ps5Disc.setUrl("https://api.direct.playstation.com/commercewebservices/ps-direct-us/users/anonymous/products/productList/?fields=BASIC&productCodes=3005816");
        //ps5Disc.setUrl("https://direct.playstation.com/en-us/consoles/console/playstation5-console.3005816");

        Product ps5Digital = new Product();
        ps5Digital.setCompany(Companies.SONYDIRECT);
        ps5Digital.setName("Playstation 5 - Digital");
        ps5Digital.setUrl("https://api.direct.playstation.com/commercewebservices/ps-direct-us/users/anonymous/products/productList/?fields=BASIC&productCodes=3005817");
        //ps5Digital.setUrl("https://direct.playstation.com/en-us/consoles/console/playstation5-digital-edition-console.3005817");

        list.add(ps5Disc);
        list.add(ps5Digital);

        return new Object[][]{{list}};
    }

}
