package kachanovich.myTest;

import javax.swing.*;
import java.awt.*;

public class WorkImages extends JPanel{
//    Image img = new ImageIcon("cat2.jpg").getImage();
    public static void main(String[] args) {
    JFrame fr = new JFrame();
        fr.setSize(1920, 1040);
        fr.setVisible(true);
        fr.add(new WorkImages());
        fr.setResizable(false);
}
    public void paint(Graphics g) {
        for (int i = 0; i < 100; i++) {


            Image img1 = new ImageIcon("cat2.jpg").getImage();
            g.drawImage(img1, i, i, null);//выводим линию
        g.drawLine(20, 20, 200, 200);

        }
        Image img2 = new ImageIcon("kitten.jpg").getImage();
        g.drawImage(img2, 0, 0, 800,600,null);
    }
}
