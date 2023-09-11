package Class20;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        MyCanvas c=new MyCanvas();
        frame.setSize(1000,1000);
        frame.add(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class MyCanvas extends Canvas{
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(600,200,300,300);
        g.setColor(Color.GREEN);
        g.fillOval(400,200,300,300);
        g.setColor(Color.YELLOW);
        g.fillOval(200,200,300,300);
        g.setColor(Color.BLUE);
        g.fillRect(550,200,300,300);
    }
}