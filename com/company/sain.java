import javax.swing.JFrame;
import javax.swing.JWindow;
/* ww  w  .  j a v a  2s.c  om*/
public class sain {
  public static void main(String[] args) {
    JFrame f = new JFrame("The Frame");
    f.setSize(300, 300);
    f.setLocation(100, 100);

    JWindow w = new JWindow();
    w.setSize(300, 300);
    w.setLocation(500, 100);

    f.setVisible(true);
    w.setVisible(true);
  }
}