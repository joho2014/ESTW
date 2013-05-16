import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;



class DieGrafik 
{
    private static JFrame frame = new JFrame("Bahnhof Güterglück");
    private static JPanel panel = new Zeichner();
    private static Datenmodell datenmodell;
    private static int[][] signale = new int[25][2];
    public DieGrafik(Datenmodell d)
    {
        datenmodell = d;
        signale[0][0] = 620;
        signale[0][1] = 468;
        signale[1][0] = 848;
        signale[1][1] = 468;
        signale[2][0] = 1122;
        signale[2][1] = 468;
        signale[3][0] = 544;
        signale[3][1] = 498;
        signale[4][0] = 625;
        signale[4][1] = 484;
        signale[5][0] = 701;
        signale[5][1] = 482;
        signale[6][0] = 849;
        signale[6][1] = 484;
        signale[7][0] = 1114;
        signale[7][1] = 484;
        signale[8][0] = 701;
        signale[8][1] = 498;
        signale[9][0] = 1022;
        signale[9][1] = 498;
        signale[10][0] = 614;
        signale[10][1] = 450;
        signale[11][0] = 787;
        signale[11][1] = 416;
        signale[12][0] = 766;
        signale[12][1] = 432;
        signale[13][0] = 775;
        signale[13][1] = 451;
        signale[14][0] = 839;
        signale[14][1] = 418;
        signale[15][0] = 174;
        signale[15][1] = 581;
        signale[16][0] = 283;
        signale[16][1] = 567;
        signale[17][0] = 500;
        signale[17][1] = 581;
        signale[18][0] = 165;
        signale[18][1] = 600;
        signale[19][0] = 284;
        signale[19][1] = 585;
        signale[20][0] = 499;
        signale[20][1] = 600;
        signale[21][0] = 304;
        signale[21][1] = 602;
        signale[22][0] = 654;
        signale[22][1] = 602;
        signale[23][0] = 507;
        signale[23][1] = 616;
        signale[24][0] = 1058;
        signale[24][1] = 506;
    }
    public static void main(String[] s)
    {
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1280,985);
        frame.addKeyListener(new TastenListener());
        frame.addMouseListener(new MausListener());
        frame.setVisible(true);
    }
    private static void signalMalen(int signalNr)
    {
        
    }
    
    
    private static class KnopfListener implements ActionListener
    {
        public void actionPerformed(ActionEvent a)
        {
                
        }
    }
    
    private static class Zeichner extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            Graphics2D g2d = (Graphics2D) g;
            String pName = "Gleise 1280x985.jpg";
            ImageIcon ii;
            if (new File("../img/" + pName).exists()) {
                ii = new ImageIcon("../img/" + pName);
            }
            else{
                ii = new ImageIcon(getClass().getResource(pName));
            }
            ii.paintIcon(this, g2d, 0, 0);
            g2d.setPaint(Color.red);
            g2d.fillOval(620,468,8,8);// S1
            g2d.fillOval(848,468,8,8);// S2
            g2d.fillOval(1122,468,8,8);// S3
            g2d.fillOval(544,498,8,8);// S4
            g2d.fillOval(625,484,8,8);// S5
            g2d.fillOval(701,482,8,8);// S6
            g2d.fillOval(849,484,8,8);// S7
            g2d.fillOval(1114,484,8,8);// S8
            g2d.fillOval(701,498,8,8);// S9
            g2d.fillOval(1022,498,8,8);// S10
            g2d.fillOval(614,450,8,8);// S11
            g2d.fillOval(787,416,8,8);// S12
            g2d.fillOval(766,432,8,8);// S13
            g2d.fillOval(775,451,8,8);// S14
            g2d.fillOval(839,418,8,8);// S15
            g2d.fillOval(174,581,8,8);// S16
            g2d.fillOval(283,567,8,8);// S17
            g2d.fillOval(500,581,8,8);// S18
            g2d.fillOval(165,600,8,8);// S20
            g2d.fillOval(284,585,8,8);// S21
            g2d.fillOval(499,600,8,8);// S22
            g2d.fillOval(304,602,8,8);// S25
            g2d.fillOval(654,602,8,8);// S28
            g2d.fillOval(507,616,8,8);// S30
            g2d.fillOval(1058,506,8,8);// S31
        }
    }
    
    private static class TastenListener implements KeyListener
    {
        public void keyPressed(KeyEvent k)
        {
            if(k.getKeyCode() == KeyEvent.VK_ENTER)
            {
                JFrame frame = new JFrame("Benutzeroberfläche");
                JPanel panel = new JPanel(new GridLayout(2,2,10,10));
                JButton button1 = new JButton("1");
                JButton button2 = new JButton("2");
                JButton button3 = new JButton("3");
                JButton button4 = new JButton("4");
                button1.addActionListener(new KnopfListener());
                button2.addActionListener(new KnopfListener());
                button3.addActionListener(new KnopfListener());
                button4.addActionListener(new KnopfListener());
                panel.add(button1);
                panel.add(button2);
                panel.add(button3);
                panel.add(button4);
                frame.getContentPane().add(panel);
                frame.setBounds(50,50,400,400);
                frame.repaint();
                frame.setVisible(true);
            }
            else if(k.getKeyCode() == KeyEvent.VK_ESCAPE)
            {
                System.exit(0);
            }
        }
        
        public void keyReleased(KeyEvent k)
        {
            
        }
        
        public void keyTyped(KeyEvent k)
        {
            
        }
    }
    
    private static class MausListener implements MouseListener
    {
        public void mouseEntered(MouseEvent m)
        {
        
        }
        
        public void mouseExited(MouseEvent m)
        {
            
        }
        
        public void mouseClicked(MouseEvent m)
        {
            System.out.println("("+m.getX()+"/"+m.getY()+")");
        }
        
        public void mousePressed(MouseEvent m)
        {}
        
        public void mouseReleased(MouseEvent m)
        {}
    }
}