package page;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SoundPlayer;

//
public class AntonlinePage extends BasePage {

    SoundPlayer soundPlayer = new SoundPlayer();

    public AntonlinePage(DiscordApi api, WebDriver driver) {
        super(api, driver);
    }

    public boolean antonlineChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) {
        boolean addToCartPresent = checker(By.cssSelector
                ("button.addToCart"), company, product, url, discordAlert);
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
