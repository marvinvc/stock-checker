package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class SanbornsProducts {


    @DataProvider(name = "sanbornsProducts")
    public Object[][] sanbornsProducts() {
        List<Product> list = new ArrayList<>();

        Product ps5Disc = new Product();
        ps5Disc.setCompany(Companies.SANBORNS+"MX");
        ps5Disc.setName(Products.PS5_DISC);
        ps5Disc.setUrl("https://www.sanborns.com.mx/producto/149872/consola-playstation-5/");

        Product ps5Digital = new Product();
        ps5Digital.setCompany(Companies.SANBORNS+"MX");
        ps5Digital.setName(Products.PS5_DIGITAL);
        ps5Digital.setUrl("https://www.sanborns.com.mx/producto/149865/preventa-playstation-5-edicion-digital-fase-2-entrega-11122020/");

        list.add(ps5Disc);
        list.add(ps5Digital);

        return new Object[][]{{list}};
    }

}
