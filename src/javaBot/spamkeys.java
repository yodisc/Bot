package javaBot;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Yodisc on 2017-01-24.
 */
public class spamkeys {

    private static Robot r;

    public static void spam() {
        Robot r = null;
        try {
            r = new Robot();
            for (int i = 0; i <= 500; i++) {

                r.keyPress(KeyEvent.VK_D);
                try {
                    Thread.sleep(30);
                } catch (InterruptedException w) {
                    w.printStackTrace();
                }

                r.keyRelease(KeyEvent.VK_D);

                r.keyPress(KeyEvent.VK_A);
                try {
                    Thread.sleep(30);
                } catch (InterruptedException w) {
                    w.printStackTrace();
                }

                r.keyRelease(KeyEvent.VK_A);

                r.keyPress(KeyEvent.VK_X);
                try {
                    Thread.sleep(30);
                } catch (InterruptedException w) {
                    w.printStackTrace();
                }

                r.keyRelease(KeyEvent.VK_Y);

                r.keyPress(KeyEvent.VK_A);
                try {
                    Thread.sleep(30);
                } catch (InterruptedException w) {
                    w.printStackTrace();
                }

                r.keyRelease(KeyEvent.VK_Y);


            }

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
