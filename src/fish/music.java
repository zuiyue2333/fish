package fish;

import javax.sound.sampled.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;

public class music {
    private static Clip bgm;
    private static Clip eat;
    private static AudioInputStream ais;
    music(){}
    public static void eat_play(){
        try {
            eat= AudioSystem.getClip();
            InputStream is=music.class.getClassLoader().getResourceAsStream("eat.wav");
            if(is !=null){
                ais=AudioSystem.getAudioInputStream(is);
            }
            eat.open(ais);
        }catch (LineUnavailableException | IOException | UnsupportedAudioFileException e){
            e.printStackTrace();
        }
        eat.start();
    }
    public static void eat_stop(){
        if(ais!=null){
            eat.close();
        }
    }
    public static void sea_play(){
        try {
            bgm= AudioSystem.getClip();
            InputStream is=music.class.getClassLoader().getResourceAsStream("sea.wav");
            if(is !=null){
                ais=AudioSystem.getAudioInputStream(is);
            }
            bgm.open(ais);
        }catch (LineUnavailableException | IOException | UnsupportedAudioFileException e){
            e.printStackTrace();
        }
        bgm.start();
        bgm.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public static void sea_stop(){
        if(ais!=null){
            bgm.close();
        }
    };
}
