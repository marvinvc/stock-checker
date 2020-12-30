package page;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SoundPlayer;

public class TargetPage extends BasePage {

    SoundPlayer soundPlayer = new SoundPlayer();

    public TargetPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
    }

    public boolean targetChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) throws InterruptedException {
        Thread.sleep(1500);
        boolean addToCartPresentStorePickup = checker(By.cssSelector
                ("[data-test=PDPFulfillmentSection] button.iyUhph"), company, product, url, discordAlert);
        boolean addToCartPresentScheduledDelivery = checkerForMultiples(By.cssSelector
                ("[data-test=scheduledDeliveryBlock] button.iyUhph"), company, product, url, discordAlert);
        boolean addToCartPresentShippingDelivery = checkerForMultiples(By.cssSelector
                ("[data-test=shippingBlock] button.iyUhph"), company, product, url, discordAlert);
        //This should go in a method Zero
        if ((addToCartPresentStorePickup || addToCartPresentScheduledDelivery || addToCartPresentShippingDelivery) && soundAlert) {
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
        return !(addToCartPresentStorePickup || addToCartPresentScheduledDelivery || addToCartPresentShippingDelivery);
    }
}