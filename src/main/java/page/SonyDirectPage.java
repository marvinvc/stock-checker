package page;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SoundPlayer;

public class SonyDirectPage extends BasePage {

    SoundPlayer soundPlayer = new SoundPlayer();

    public SonyDirectPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
    }

    public boolean sonyDirectChecker(String company, String product, String url, boolean
            soundAlert, boolean discordProductAlert, boolean discordQueueAlert) throws InterruptedException {
        Thread.sleep(2500);
        boolean addToCartPresent = !reverseCheckerForSonyDirect(By.cssSelector
                (".productHero-info button.hide"), company, product, url, discordProductAlert, discordQueueAlert);

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