import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;
import java.awt.event.*;

public class StartPage extends JFrame implements ActionListener {

   private JFrame framee = new JFrame();
   private JButton buttton1 = new JButton("Start the app");
   private JButton buttton2 = new JButton("End the App");
   private JPanel paneel = new JPanel();
   private JPanel paneel2 = new JPanel();
   private JPanel paneel3 = new JPanel();
   private JLabel label = new JLabel("Welcome");
   private JLabel label2 = new JLabel("This an app to calculate age.");

    StartPage() {

        framee.setTitle("Age Calculator");
        framee.setSize(300, 300);
        framee.setLayout(new BorderLayout());
        framee.setDefaultCloseOperation(framee.EXIT_ON_CLOSE);
        framee.add(paneel, BorderLayout.NORTH);
        framee.add(paneel2, BorderLayout.CENTER);
        framee.add(paneel3, BorderLayout.SOUTH);


        buttinSetting();
        labelSetiing();
        panelSetting();

        framee.setVisible(true);
    }

    // -----------button setting-------------//
    public void buttinSetting() {

  
        buttton1.addActionListener(this);
        buttton2.addActionListener(this);
    }
    // -----------button setting-------------//

    // -----------------------------------------------------------------//
    public void labelSetiing() {
        // -----------label setting -------------//

        label.setFont(new Font("Verdana", 5, 20));
        label.setForeground(new ColorUIResource(0,0,0));
        label2.setFont(new Font("A", 2, 18));
        label2.setForeground(new ColorUIResource(110,150,160));
        label2.setLayout(new BorderLayout());
        
        
    }
    // -----------label setting -------------//

    // -----------------------------------------------------------------//

    // -----------panel setting -------------//
    public void panelSetting() {
        JPanel subpanel1 = new JPanel();
        JPanel subpanel2 = new JPanel();
        
        subpanel1.add(label2);
        subpanel1.setSize(200, 200);
        subpanel2.add(buttton1);
        subpanel2.add(buttton2);
        subpanel2.setSize(200, 200);



        paneel.add(label);
        paneel.setPreferredSize(new Dimension(100, 50));
        paneel.setBackground(new ColorUIResource(200, 200, 200));


        
        paneel2.setPreferredSize(new Dimension(100, 100));
        paneel2.setBackground(Color.gray);
        paneel2.setLayout(new BorderLayout());
        paneel2.setSize(200, 200);
        paneel2.add(subpanel1,BorderLayout.NORTH);
        paneel2.add(subpanel2,BorderLayout.CENTER);

      
        

        

    }
    // -----------panel setting -------------//

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttton1) {
            SecondPage Frame1 = new SecondPage();
            framee.dispose();
        }

        if (e.getSource() == buttton2) {
            framee.dispose();
            
            
        }
    }
}
