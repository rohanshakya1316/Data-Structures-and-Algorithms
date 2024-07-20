import java.awt.*;
import javax.swing.*;

class InternalFrame extends JFrame {
static JFrame f;
static JLabel l, l1;

public static void main(String[] args){	
f = new JFrame("frame");

f.setLayout(new FlowLayout());
JInternalFrame in = new JInternalFrame("frame 1", true, true, true, true);
JInternalFrame in1 = new JInternalFrame("frame 2", true, true, true, true);

JButton b = new JButton("button");
JButton b1 = new JButton("button1");


l = new JLabel("This is a JInternal Frame no 1 ");
l1 = new JLabel("This is a JInternal Frame no 2 ");

JPanel p = new JPanel();
JPanel p1 = new JPanel();

p.add(l);
p.add(b);
p1.add(l1);
p1.add(b1);

in.setVisible(true);
in1.setVisible(true);

in.add(p);
in1.add(p1);

f.add(in);
f.add(in1);
f.setSize(300, 300);

f.show();
   }
}
