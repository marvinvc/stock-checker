package page;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.SoundPlayer;

public class SamsClubPage extends BasePage {

    WebDriver driver;
    SoundPlayer soundPlayer = new SoundPlayer();

    public SamsClubPage(DiscordApi api, WebDriver driver) {
        super(api, driver);
        this.driver = driver;
    }

    public boolean samsClubChecker(String company, String product, String url, boolean
            soundAlert, boolean discordAlert) throws InterruptedException {

        boolean addToCartPresent = false;

        try {
//            Actions action = new Actions(driver);
//            action.sendKeys(Keys.ESCAPE);
//            driver.findElement(By.id("Search")).sendKeys("telephone");
//            for(int x=0; x<=40; x++){
//                action.perform();
//            }
            //modalClicker(true);

            driver.findElement(By.id("full-description"));
            Thread.sleep(6000);
            addToCartPresent = reverseChecker(By.cssSelector
                    (".sc-pc-large-desktop-oos-card-out-of-stock-text"), company, product, url, discordAlert);
        }
        catch (Exception e){

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

    private void modalClicker(boolean isCaptchaPresent){

        boolean captchaPresent = isCaptchaPresent;

        while(captchaPresent){
            try{
                driver.findElement(By.cssSelector("[class=\"sc-alert sc-alert-error\"]")).click();
                modalClicker(true);
                Thread.sleep(2000);
            }
            catch (Exception e){
                captchaPresent = false;
            }
        }

    }
}