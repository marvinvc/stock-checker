package dataproviders;

import constants.Companies;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class WalmartProducts {

    @DataProvider(name = "walmartProducts")
    public Object[][] walmartProducts() {
        List<Product> list = new ArrayList<>();

        Product ps5Disc = new Product();
        ps5Disc.setCompany(Companies.WALMART);
        ps5Disc.setName("Playstation 5 - Disc");
        ps5Disc.setUrl("https://www.walmart.com/ip/PlayStation-5-Console/363472942");

        Product ps5Digital = new Product();
        ps5Digital.setCompany(Companies.WALMART);
        ps5Digital.setName("Playstation 5 - Digital");
        ps5Digital.setUrl("https://www.walmart.com/ip/Sony-PlayStation-5-Digital-Edition/493824815");

        Product xboxSeriesX = new Product();
        xboxSeriesX.setCompany(Companies.WALMART);
        xboxSeriesX.setName("XBox - Series X");
        xboxSeriesX.setUrl("https://www.walmart.com/ip/Xbox-Series-X/443574645");

        Product xBoxSeriesS = new Product();
        xBoxSeriesS.setCompany(Companies.WALMART);
        xBoxSeriesS.setName("XBox - Series S");
        xBoxSeriesS.setUrl("https://www.walmart.com/ip/Xbox-Series-S/606518560");

        list.add(ps5Disc);
        list.add(ps5Digital);
        list.add(xboxSeriesX);
        list.add(xBoxSeriesS);

        return new Object[][]{{list}};
    }

}
