package page;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SoundPlayer;

public class WalmartPage extends BasePage {

    SoundPlayer soundPlayer = new SoundPlayer();

    public WalmartPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
    }

    public boolean walmartChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) throws InterruptedException {
        Thread.sleep(1500);
        boolean addToCartPresent = checker(By.cssSelector
                (".primaryProductCTA-marker button[data-tl-id=\"ProductPrimaryCTA-cta_add_to_cart_button\"]"), company, product, url, discordAlert);
        //This should go in a method Zero
        if (addToCartPresent && soundAlert) {
            //Play sound
            if (product.contains("Playstation")) {
                soundPlayer.playPSSound();
            } else {
                soundPlayer.playXBoxSound();
            }

        }
        return !(addToCartPresent);
    }
}