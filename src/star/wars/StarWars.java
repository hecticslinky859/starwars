
package star.wars;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author joey cammarano
 */
public class StarWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame j = new JFrame("Star Wars");
        Space c = new Space();
        j.add(c);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(1200, 960);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        j.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                c.keyPressed(e);
            }
        });
    }
    
}