package page;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SoundPlayer;

public class CostcoPage extends BasePage {

    WebDriver driver;
    SoundPlayer soundPlayer = new SoundPlayer();

    public CostcoPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
        this.driver = driver;
    }

    public boolean costcoChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) throws InterruptedException {

        boolean addToCartPresent = false;

        try {
            driver.findElement(By.id("cart-d"));
            addToCartPresent = checker(By.cssSelector
                    (".oos-overlay.hide"), company, product, url, discordAlert);
        } catch (Exception e) {

        }

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