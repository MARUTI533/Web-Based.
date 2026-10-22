
import javax.swing.*;

class GUI4 {

  public static void main(String[] args) {
    JFrame fobj = new JFrame("marvellouse PPA");
    JButton bobj = new JButton("submit");

    bobj.setBounds(100, 100, 150, 50);

    fobj.add(bobj);

    fobj.setSize(400, 300);

    fobj.setVisible(true);

    fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}