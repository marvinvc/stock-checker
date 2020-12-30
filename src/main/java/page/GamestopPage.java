package page;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class GamestopPage extends BasePage{


    public GamestopPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
    }

    public boolean gamestopChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) throws InterruptedException {
        boolean addToCartPresent = checker(By.xpath
                ("//div[@class='primary-details-row ']//button[contains(@data-gtmdata, '\"availability\":\"Available\"')]"), company, product, url, discordAlert);
        //This should go in a method Zero
        if (addToCartPresent && soundAlert) {
            //Play sound
            JFXPanel fxPanel = new JFXPanel();
            URL file = GamestopPage.class.getClassLoader().getResource(SOUND);
            final Media media = new Media(file.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            Thread.sleep(10000);
        }
        return !(addToCartPresent);
    }
}