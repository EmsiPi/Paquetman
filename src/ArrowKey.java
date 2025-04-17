import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class ArrowKey {

    public static void ArrowKey(BouleJaune bouleJaune, Grille grille) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setFocusable(true);

        JPanel panel = new JPanel((new GridLayout(6,6)));
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        break;
                    case KeyEvent.VK_DOWN:
                        break;
                    case KeyEvent.VK_RIGHT:
                        break;
                    case KeyEvent.VK_LEFT:
                        break;
                }
                System.out.println(grille);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        Border blackline = BorderFactory.createLineBorder(Color.black,1);
        for(int i = 0; i<36;i++){
            JPanel ptest = new JPanel();
            ptest.setBorder(blackline);
            panel.add(ptest);
        }
        panel.setBorder(blackline);
        frame.add(panel);
        frame.setVisible(true);
    }
}
