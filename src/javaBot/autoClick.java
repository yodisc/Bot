package javaBot;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * Created by Yodisc on 2017-01-24.
 */
public class autoClick {

    public static void leftClick(Robot r){

        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }

    public static void doubleClick(Robot r){

        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }



}
