import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class Thread1 extends Thread{
    @Override
    public void run() {
        FilePlayer fp  = new FilePlayer();
        try{
            fp.play("/Users/yihan/Desktop/Assignment5/src/Sounds/do.wav");
            System.out.println("do");
            Thread.sleep(1000);
            fp.play("/Users/yihan/Desktop/Assignment5/src/Sounds/mi.wav");
            System.out.println("mi");

            Thread.sleep(1000);
            fp.play("/Users/yihan/Desktop/Assignment5/src/Sounds/sol.wav");
            System.out.println("sol");

            Thread.sleep(1000);
            fp.play("/Users/yihan/Desktop/Assignment5/src/Sounds/si.wav");
            System.out.println("si");

            Thread.sleep(1000);
        } catch (Exception e) {

        }



    }
}
