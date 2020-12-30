package dataproviders;

import constants.Companies;
import constants.Products;
import model.Product;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class AdoramaProducts {

    @DataProvider(name = "adoramaProducts")
    public Object[][] adoramaProducts() {
        List<Product> list = new ArrayList<>();

        Product ps5DiscBundle1 = new Product();
        ps5DiscBundle1.setCompany(Companies.ADORAMA);
        ps5DiscBundle1.setName(Products.PS5_DISC_BUNDLE);
        ps5DiscBundle1.setUrl("https://www.adorama.com/SO3005718.html");

        Product ps5DiscBundle2 = new Product();
        ps5DiscBundle2.setCompany(Companies.ADORAMA);
        ps5DiscBundle2.setName(Products.PS5_DISC_BUNDLE);
        ps5DiscBundle2.setUrl("https://www.adorama.com/SO3005718A.html");

        Product ps5DiscBundle3 = new Product();
        ps5DiscBundle3.setCompany(Companies.ADORAMA);
        ps5DiscBundle3.setName(Products.PS5_DISC_BUNDLE);
        ps5DiscBundle3.setUrl("https://www.adorama.com/SO3005718B.html");

        Product ps5DigitalBundle = new Product();
        ps5DigitalBundle.setCompany(Companies.ADORAMA);
        ps5DigitalBundle.setName(Products.PS5_DIGITAL_BUNDLE);
        ps5DigitalBundle.setUrl("https://www.adorama.com/SO3005719.html");


        Product xboxDiscBundle1 = new Product();
        xboxDiscBundle1.setCompany(Companies.ADORAMA);
        xboxDiscBundle1.setName(Products.XBOX_SERIES_X);
        xboxDiscBundle1.setUrl("https://www.adorama.com/XBRRT00001C.html");

        Product xboxDiscBundle2 = new Product();
        xboxDiscBundle2.setCompany(Companies.ADORAMA);
        xboxDiscBundle2.setName(Products.XBOX_SERIES_X);
        xboxDiscBundle2.setUrl("https://www.adorama.com/XBRRT00001B.html");

        Product xboxDiscBundle3 = new Product();
        xboxDiscBundle3.setCompany(Companies.ADORAMA);
        xboxDiscBundle3.setName(Products.XBOX_SERIES_X);
        xboxDiscBundle3.setUrl("https://www.adorama.com/XBRRT00001A.html");

        Product xboxDigitalBundle1 = new Product();
        xboxDigitalBundle1.setCompany(Companies.ADORAMA);
        xboxDigitalBundle1.setName(Products.XBOX_SERIES_S);
        xboxDigitalBundle1.setUrl("https://www.adorama.com/XBRRS00001C.html");

        Product xboxDigitalBundle2 = new Product();
        xboxDigitalBundle2.setCompany(Companies.ADORAMA);
        xboxDigitalBundle2.setName(Products.XBOX_SERIES_S);
        xboxDigitalBundle2.setUrl("https://www.adorama.com/XBRRS00001A.html");

        Product xboxDigitalBundle3 = new Product();
        xboxDigitalBundle3.setCompany(Companies.ADORAMA);
        xboxDigitalBundle3.setName(Products.XBOX_SERIES_S);
        xboxDigitalBundle3.setUrl("https://www.adorama.com/XBRRS00001B.html");

        list.add(ps5DiscBundle1);
        list.add(ps5DiscBundle2);
        list.add(ps5DiscBundle3);
        list.add(ps5DigitalBundle);

        list.add(xboxDiscBundle1);
        list.add(xboxDiscBundle2);
        list.add(xboxDiscBundle3);
        list.add(xboxDigitalBundle1);
        list.add(xboxDigitalBundle2);
        list.add(xboxDigitalBundle3);

        return new Object[][]{{list}};
    }

}
