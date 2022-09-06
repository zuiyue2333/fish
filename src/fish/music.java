package fish;

import javax.sound.sampled.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;

public class music {
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
    };
}
