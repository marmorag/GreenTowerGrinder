package greentower.hotkey;

import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

@SuppressWarnings("serial")
public class Hotkey extends JFrame {

    public Hotkey() {
    	// List of key 1
    	int[] Modifiers = {KeyEvent.CTRL_MASK, KeyEvent.ALT_MASK, KeyEvent.SHIFT_MASK};
    	// List of key 2
    	int[] KeyCodes = {KeyEvent.VK_ENTER, KeyEvent.VK_CAPS_LOCK, KeyEvent.VK_A, KeyEvent.VK_C, KeyEvent.VK_V};

    	// Random key 1 and 2
    	int modifier = Modifiers[new Random().nextInt(Modifiers.length)];
    	int keycode = KeyCodes[new Random().nextInt(KeyCodes.length)];

    	//Frame
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) { //Listen keyboard and mouse
                if ((ke.getModifiers()==modifier) && (ke.getKeyCode()==keycode)) {
                    System.out.println("OK");
                }else if((ke.getModifiers()==modifier) || (ke.getKeyCode()==keycode)){
                	System.out.println("Presque");
                }else{
                	System.out.println("Très loin");
                }
            }
        }
        );
    }
}