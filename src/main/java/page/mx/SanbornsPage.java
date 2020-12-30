package page.mx;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.BasePage;
import utils.SoundPlayer;

public class SanbornsPage extends BasePage {

    SoundPlayer soundPlayer = new SoundPlayer();

    public SanbornsPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
    }

    public boolean sanbornsChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) {
        boolean addToCartPresent = checker(By.id
                ("comprar"), company, product, url, discordAlert);

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