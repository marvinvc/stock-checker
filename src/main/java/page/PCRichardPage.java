package page;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SoundPlayer;

public class PCRichardPage extends BasePage {

    SoundPlayer soundPlayer = new SoundPlayer();

    public PCRichardPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
    }

    public boolean pcRichardChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) {
        boolean addToCartPresent = checker(By.cssSelector
                ("[title=\"Add to Cart\"]"), company, product, url, discordAlert);
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