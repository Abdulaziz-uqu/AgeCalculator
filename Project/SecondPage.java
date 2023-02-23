import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;

public class SecondPage extends JFrame implements ActionListener {
   private JFrame MainFrame;
   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JButton button4;
   private JPanel panl1;
   private JPanel panl2;
   private JPanel subPanel1;
   private JLabel label1;
   

    SecondPage() {
        MainFrame = new JFrame();

        buttonSetting();
        labelSetiing();
        panlSetting();
        // frame methods

        this.setTitle("Age Calculator"); // this is the title of the page
        this.setSize(300, 300); // this size of page (x,y)
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); // close the page when click on X

        this.getContentPane().setBackground(Color.DARK_GRAY); // the color of background

        // add things to the page

        this.add(panl1, BorderLayout.NORTH);
        this.add(panl2, BorderLayout.CENTER);

        this.setVisible(true); // make you see the page
    }

    public void buttonSetting() {

        button1 = new JButton("What is my age ?");
        button1.addActionListener(this);

        button2 = new JButton("when I will reach -- ?");
        button2.addActionListener(this);

        button3 = new JButton("who is older between the two ?");
        button3.addActionListener(this);

        button4 = new JButton("Close the app");
        button4.addActionListener(this);

    }

    public void panlSetting() {

        panl1 = new JPanel();
        panl2 = new JPanel();
        subPanel1 = new JPanel();

        subPanel1.setBackground(Color.LIGHT_GRAY);
        subPanel1.add(button1);
        subPanel1.add(button2);
        subPanel1.add(button3);
        subPanel1.add(button4);
        subPanel1.setPreferredSize(new Dimension(300, 100));

        panl1.setBackground(Color.LIGHT_GRAY);
        panl1.setPreferredSize(new Dimension(100, 50));
        panl1.add(label1);

        panl2.setBackground(Color.LIGHT_GRAY);
        panl2.setPreferredSize(new Dimension(50, 100));
        panl2.setLayout(new FlowLayout());
        panl2.add(subPanel1, BorderLayout.NORTH);

    }

    public void labelSetiing() {
        label1 = new JLabel("Choose one of the following.");
        label1.setFont(new Font("A", 5, 18));
        label1.setForeground(new ColorUIResource(0, 0, 0));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String DoB = JOptionPane.showInputDialog("Enter your birth day: !!! it must be YYYY-MM-DD");

            JOptionPane.showMessageDialog(null, Helper.GetAge(DoB), "your age", JOptionPane.INFORMATION_MESSAGE);

        }

        if (e.getSource() == button2) {
            String DoB = JOptionPane.showInputDialog("Enter your birth day: !!! it must be YYYY-MM-DD");
            int Age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age ")) ;


            AgeCalculator A = new AgeCalculator(DoB);
            

            JOptionPane.showMessageDialog(null, Helper.Timeuntil(A, Age), "your age", JOptionPane.INFORMATION_MESSAGE);
        }

        if (e.getSource() == button3) {
            String Name1 = JOptionPane.showInputDialog("Enter the first Name");
            String DoB1 = JOptionPane.showInputDialog("Enter the first birth day: !!! it must be YYYY-MM-DD");

            String Name2 = JOptionPane.showInputDialog("Enter the second Name");
            String DoB2 = JOptionPane.showInputDialog("Enter the second birth day: !!! it must be YYYY-MM-DD");

            String A = Helper.whoIsOlder(Helper.TakeData(Name1, DoB1), Helper.TakeData(Name2, DoB2));

            JOptionPane.showMessageDialog(null, A, "your age", JOptionPane.INFORMATION_MESSAGE);
        }

        if (e.getSource() == button4) {
            new StartPage();
            System.exit(ABORT);
        }

    }
}
