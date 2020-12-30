package page;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SoundPlayer;

public class MicrosoftPage extends BasePage {

    SoundPlayer soundPlayer = new SoundPlayer();

    public MicrosoftPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
    }

    public boolean microsoftChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) throws InterruptedException {

        boolean addToCartPresent = checkerForDisabledElement(By.cssSelector
                ("button[aria-label=\"Checkout bundle\"]"), company, product, url, discordAlert);

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
