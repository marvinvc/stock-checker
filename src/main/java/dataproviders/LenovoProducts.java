package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class LenovoProducts {

    @DataProvider(name = "lenovoProducts")
    public Object[][] lenovoProducts() {
        List<Product> list = new ArrayList<>();

        Product xboxDiscBundle = new Product();
        xboxDiscBundle.setCompany(Companies.LENOVO);
        xboxDiscBundle.setName(Products.XBOX_SERIES_X);
        xboxDiscBundle.setUrl("https://www.lenovo.com/us/en/accessories-and-monitors/consumer-electronics/gaming-consoles/Microsoft-Xbox-Series-X-game-console-1-TB-SSD/p/78015889");

        Product xboxDigitalBundle = new Product();
        xboxDigitalBundle.setCompany(Companies.LENOVO);
        xboxDigitalBundle.setName(Products.XBOX_SERIES_S);
        xboxDigitalBundle.setUrl("https://www.lenovo.com/us/en/accessories-and-monitors/consumer-electronics/gaming-consoles/Microsoft-Xbox-Series-S-game-console-512-GB-SSD/p/78015888");

        list.add(xboxDiscBundle);
        //list.add(xboxDigitalBundle);

        return new Object[][]{{list}};
    }

}
