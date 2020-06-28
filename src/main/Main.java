package hiit;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Main {
    public static void main(String args[]) throws IOException, InterruptedException {
        final Displayer displayer = new Displayer();
        displayer.display();
    }
}

@SuppressWarnings("serial")
class Displayer extends JFrame {

    static JFrame f;
    static JButton start, stop, set;
    static JLabel l;

    public void display() {
        f = new JFrame("HIIT Timer");

        l = new JLabel("High intensity interval training");

        start = new JButton("Start");
        stop = new JButton("Stop");
        set = new JButton("Set");

        JPanel p = new JPanel();

        int rows = 2, cols = 3;
        JPanel[][] panelHolder = new JPanel[rows][cols];
        p.setLayout(new GridLayout(rows, cols));

        // fill grid w empty jpanels and hold onto their references for later
        for(int r = 0; r < rows; r++)
            for(int c = 0; c < cols; c++) {
                panelHolder[r][c] = new JPanel();
                add(panelHolder[r][c]);
            }
        
        panelHolder[1][0].add(start);
        panelHolder[1][1].add(stop);
        panelHolder[1][2].add(set);

        p.setBackground(Color.green.darker);

        f.add(p);

        f.setSize(600, 600);

        f.setVisible(true);
    }
}