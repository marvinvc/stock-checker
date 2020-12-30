package page;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SoundPlayer;

public class AmazonPage extends BasePage {

    WebDriver driver;
    SoundPlayer soundPlayer = new SoundPlayer();

    public AmazonPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
        this.driver = driver;
    }

    public boolean amazonChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) throws InterruptedException {

        boolean addToCartPresent = checker(By.id("add-to-cart-button"), company, product, url, discordAlert);
        boolean buyNowPresent = checkerForMultiples(By.id("buy-now-button"), company, product, url, discordAlert);

        //boolean availableFromTheseSellersPresent = checkerForMultiples(By.id("buybox-see-all-buying-choices-announce"), company, product, url);

        //This should go in a method Zero
        if ((addToCartPresent || buyNowPresent) && soundAlert /*|| availableFromTheseSellersPresent*/) {
            //Play sound
            if (product.contains("Playstation")) {
                soundPlayer.playPSSound();
            } else if(product.contains("XBox")) {
                soundPlayer.playXBoxSound();
            }
            else {
                soundPlayer.playAccessorySound();
            }
        }
        return !(addToCartPresent || buyNowPresent /*|| availableFromTheseSellersPresent*/);
    }


}
