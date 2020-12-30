package page;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SoundPlayer;

public class AdoramaPage extends BasePage {

    SoundPlayer soundPlayer = new SoundPlayer();

    public AdoramaPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
    }

    public boolean adoramaChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) {
        boolean addToCartPresent = checker(By.cssSelector
                (".primary-actions [data-action=\"addToCart\"]"), company, product, url, discordAlert);

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