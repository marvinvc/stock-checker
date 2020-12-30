package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class MicrosoftProducts {

    @DataProvider(name = "microsoftProducts")
    public Object[][] microsoftProducts() {
        List<Product> list = new ArrayList<>();

        Product xboxDisc = new Product();
        xboxDisc.setCompany(Companies.MICROSOFT);
        xboxDisc.setName(Products.XBOX_SERIES_X);
        xboxDisc.setUrl("https://www.xbox.com/en-us/configure/8WJ714N3RBTL");

        Product xboxDigital = new Product();
        xboxDigital.setCompany(Companies.MICROSOFT);
        xboxDigital.setName(Products.XBOX_SERIES_S);
        xboxDigital.setUrl("https://www.xbox.com/en-us/configure/942J774TP9JN");

        list.add(xboxDisc);
        //list.add(xboxDigital);

        return new Object[][]{{list}};
    }

}