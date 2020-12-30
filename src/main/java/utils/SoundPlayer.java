package utils;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.URL;

public class SoundPlayer {

    protected static final String SOUND = "accessory.mp3";
    protected static final String SOUND_XBOX = "xbox.mp3";
    protected static final String SOUND_OTHER = "ps5.mp3";

    public void playPSSound(){
        JFXPanel fxPanel = new JFXPanel();
        URL file = SoundPlayer.class.getClassLoader().getResource(SOUND);
        final Media media = new Media(file.toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void playXBoxSound(){
        JFXPanel fxPanel = new JFXPanel();
        URL file = SoundPlayer.class.getClassLoader().getResource(SOUND_XBOX);
        final Media media = new Media(file.toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void playAccessorySound(){
        JFXPanel fxPanel = new JFXPanel();
        URL file = SoundPlayer.class.getClassLoader().getResource(SOUND_OTHER);
        final Media media = new Media(file.toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
