package page;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SoundPlayer;

public class BestBuyPage extends BasePage {

    SoundPlayer soundPlayer = new SoundPlayer();

    public BestBuyPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
    }

    public boolean bestBuyChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) throws InterruptedException {
        Thread.sleep(5000);
        boolean addToCartPresent = checker(By.cssSelector
                (".v-m-top-m > div > .fulfillment-add-to-cart-button .btn-primary"), company, product, url, discordAlert);

        //This should go in a method Zero
        if (addToCartPresent && soundAlert) {
            //Play sound
            if (product.contains("Playstation")) {
                soundPlayer.playPSSound();
            } else if(product.contains("XBox")) {
                soundPlayer.playXBoxSound();
            }
            else {
                //soundPlayer.playAccessorySound();
            }
        }
        return !(addToCartPresent);
    }
}
