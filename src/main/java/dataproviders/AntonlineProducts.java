package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class AntonlineProducts {

    @DataProvider(name = "antonlineProducts")
    public Object[][] antonlineProducts() {
        List<Product> list = new ArrayList<>();

        Product ps5DiscBundle = new Product();
        ps5DiscBundle.setCompany(Companies.ANTONLINE);
        ps5DiscBundle.setName(Products.PS5_DISC_BUNDLE);
        ps5DiscBundle.setUrl("https://www.antonline.com/Sony/Electronics/Gaming_Devices/Gaming_Consoles/1413479");

        Product xboxDiscBundle = new Product();
        xboxDiscBundle.setCompany(Companies.ANTONLINE);
        xboxDiscBundle.setName(Products.XBOX_SERIES_X_BUNDLE);
        xboxDiscBundle.setUrl("https://www.antonline.com/Microsoft/Electronics/Gaming_Devices/Gaming_Consoles/1414487");

        Product xboxDigitalBundle = new Product();
        xboxDigitalBundle.setCompany(Companies.ANTONLINE);
        xboxDigitalBundle.setName(Products.XBOX_SERIES_S_BUNDLE);
        xboxDigitalBundle.setUrl("https://www.antonline.com/Microsoft/Electronics/Gaming_Devices/Gaming_Consoles/1409527");

        list.add(ps5DiscBundle);
        list.add(xboxDiscBundle);
        //list.add(xboxDigitalBundle);

        return new Object[][]{{list}};
    }

}
