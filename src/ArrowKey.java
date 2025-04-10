import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class ArrowKey {

    public ArrowKey(BouleJaune boulejaune){

        new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch(keyCode){
                    case KeyEvent.VK_UP: Deplacement.up(boulejaune);
                        break;
                    case KeyEvent.VK_DOWN: Deplacement.down(boulejaune);
                        break;
                    case KeyEvent.VK_RIGHT: Deplacement.right(boulejaune);
                        break;
                    case KeyEvent.VK_LEFT: Deplacement.left(boulejaune);
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
    }
    public static void ArrowKey(BouleJaune bouleJaune) {
        new ArrowKey(bouleJaune);
    }
}
