package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class PCRichardProducts {


    @DataProvider(name = "pcRichardProducts")
    public Object[][] pcRichardProducts() {
        List<Product> list = new ArrayList<>();

        Product ps5DiscBundle = new Product();
        ps5DiscBundle.setCompany(Companies.PCRICHARD);
        ps5DiscBundle.setName(Products.PS5_DISC_BUNDLE);
        ps5DiscBundle.setUrl("https://www.pcrichard.com/Sony/Buy-the-PlayStation-5-console-w-DualSense-Controller-and-Demon-s-Souls-Game-and-other-bundles-at-PCRichard-com/PS5DS-DEMON.pcrp");

        Product xboxDiscBundle = new Product();
        xboxDiscBundle.setCompany(Companies.PCRICHARD);
        xboxDiscBundle.setName(Products.PS5_DISC_BUNDLE);
        xboxDiscBundle.setUrl("https://www.pcrichard.com/Sony/Buy-the-PlayStation-5-console-w-DualSense-Controller-and-Sackboy-a-Big-Adventure-and-other-bundles-at-PCRichard-com/PS5DS-SACKBY.pcrp");

        Product xboxDigitalBundle = new Product();
        xboxDigitalBundle.setCompany(Companies.PCRICHARD);
        xboxDigitalBundle.setName(Products.PS5_DISC_BUNDLE);
        xboxDigitalBundle.setUrl("https://www.pcrichard.com/Sony/Buy-the-PlayStation-5-console-w-DualSense-Controller-and-Spidermam-MM-Ultimate-and-other-bundles-at-PCRichard-com/PS5DSMSMMU.pcrp");

        list.add(ps5DiscBundle);
        list.add(xboxDiscBundle);
        //list.add(xboxDigitalBundle);

        return new Object[][]{{list}};
    }

}
