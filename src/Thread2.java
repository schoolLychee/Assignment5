import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class Thread2 extends Thread{
    @Override
    public void run() {
        FilePlayer fp  = new FilePlayer();
try{
    Thread.sleep(1000);
    fp.play("/Users/yihan/Desktop/Assignment5/src/Sounds/re.wav");
    System.out.println("re");

    Thread.sleep(1000);
    fp.play("/Users/yihan/Desktop/Assignment5/src/Sounds/fa.wav");
    System.out.println("fa");

    Thread.sleep(1000);
    fp.play("/Users/yihan/Desktop/Assignment5/src/Sounds/la.wav");
    System.out.println("la");

    Thread.sleep(1000);

} catch (Exception e) {

}


    }
}
