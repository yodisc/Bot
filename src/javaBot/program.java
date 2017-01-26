package javaBot;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;

/**
 * Created by Yodisc on 2017-01-24.
 */
public class program {

    private Robot r;
    private autoClick AutoClick;
    private Runtime runtime;

    public void drawSine(){

        int xSet = 800;
        int ySet = 500;
        int x = 0;
        int y = 0;

        double alpha = 0;
        runtime = Runtime.getRuntime();

        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        try {
            runtime.exec("mspaint.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }

        r.delay(1000);
        r.mouseMove(xSet, ySet);
        autoClick.leftClick(r);

        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        for(int i = 0; i < 360; i++){

            r.mouseMove(x + xSet, y + ySet);
            y = (int) Math.round(100*Math.sin(alpha));
            x++;

            alpha += 2*Math.PI/360*1;

            r.delay(15);

        }

        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }

}
