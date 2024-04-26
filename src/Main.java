//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();

        try {
            // 等待 t1 和 t2 线程执行完毕
            t1.join();
            t2.join();

            // 当 t1 和 t2 线程都执行完毕后，播放 "do-octave" 音调
            FilePlayer fp = new FilePlayer();
            fp.play("/Users/yihan/Desktop/Assignment5/src/Sounds/do-octave.wav");
            System.out.println("do-octave");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}