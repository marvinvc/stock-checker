package page;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SoundPlayer;

public class NewEggPage extends BasePage {

    SoundPlayer soundPlayer = new SoundPlayer();

    public NewEggPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
    }

    public boolean newEggChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) throws InterruptedException {
        //Thread.sleep(1500);
        boolean addToCartPresent = checker(By.cssSelector
                (".product-buy-box .btn-primary"), company, product, url, discordAlert);
        boolean comboAddToCartPresent = checkerForMultiples(By.cssSelector
                ("[title=\"Add Combo to Cart\"]"), company, product, url, discordAlert);
        //This should go in a method Zero
        if ((addToCartPresent || comboAddToCartPresent) && soundAlert) {
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
