package dataproviders;

import constants.Companies;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class BHProducts {

    @DataProvider(name = "bhProducts")
    public Object[][] bhProducts() {
        List<Product> list = new ArrayList<>();

        Product ps5Disc = new Product();
        ps5Disc.setCompany(Companies.BH);
        ps5Disc.setName("Playstation 5 - Disc");
        ps5Disc.setUrl("https://www.bhphotovideo.com/c/product/1595083-REG/sony_3005718_playstation_5_gaming_console.html");

        Product ps5Digital = new Product();
        ps5Digital.setCompany(Companies.BH);
        ps5Digital.setName("Playstation 5 - Digital");
        ps5Digital.setUrl("");

        list.add(ps5Disc);
        //list.add(ps5Digital);

        return new Object[][]{{list}};
    }

}
