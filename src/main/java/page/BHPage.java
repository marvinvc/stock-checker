package page;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class BHPage extends BasePage{


    public BHPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
    }

    public boolean bhChecker(String company, String product, String url, boolean soundAlert,
                             boolean discordAlert) throws InterruptedException {
        Thread.sleep(1500);
        boolean addToCartPresentStorePickup = checker(By.cssSelector
                ("[data-selenium=\"addToCartButton\"]"), company, product, url, discordAlert);

        //This should go in a method Zero
        if (addToCartPresentStorePickup && soundAlert) {
            //Play sound
            JFXPanel fxPanel = new JFXPanel();
            URL file = BHPage.class.getClassLoader().getResource(SOUND);
            final Media media = new Media(file.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            Thread.sleep(10000);
        }
        return !(false);
    }
}