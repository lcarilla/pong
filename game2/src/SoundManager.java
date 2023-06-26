import javax.sound.sampled.*;
import java.io.File;

public class SoundManager {
    private File bounceSoundFile;
    private File musicFile;
    private File startSoundFile;
    private File loseSoundFile;
    public SoundManager(){
        try {
            startSoundFile = new File("/home/harald/Programming/pong/game2/src/start.wav");
            loseSoundFile = new File("/home/harald/Programming/pong/game2/src/lose.wav");
            bounceSoundFile = new File("/home/harald/Programming/pong/game2/src/bounce.wav");
            musicFile = new File("/home/harald/Programming/pong/game2/src/music.wav");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void playBackgroundMusic(){
        new Thread(() -> {
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
                Clip audioClip = AudioSystem.getClip();
                audioClip.open(audioStream);
                audioClip.loop(Clip.LOOP_CONTINUOUSLY);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }).start();
    }
    public void playBounceSound(){
        new Thread(() -> {
        try {
            AudioInputStream bounceSound = AudioSystem.getAudioInputStream(bounceSoundFile);
            Clip audioClip = AudioSystem.getClip();
            audioClip.open(bounceSound);
            audioClip.loop(0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        }).start();
    }
    public void playLoseSound(){
        new Thread(() -> {
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(loseSoundFile);
                Clip audioClip = AudioSystem.getClip();
                audioClip.open(audioStream);
                audioClip.loop(0);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }).start();
    }
    public void playStartSound(){
        new Thread(() -> {
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(startSoundFile);
                Clip audioClip = AudioSystem.getClip();
                audioClip.open(audioStream);
                audioClip.loop(0);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }).start();
    }
}