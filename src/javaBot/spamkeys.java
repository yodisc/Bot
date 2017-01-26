package javaBot;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Yodisc on 2017-01-24.
 */
public class spamkeys {

    private static Robot r;

    public static void spam(){

        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        int count = 0;
        while (count <= 50){

            r.keyPress(KeyEvent.VK_D);
            r.keyRelease(KeyEvent.VK_D);
            count++;

        }



    }
}
