package LeapYear;

import javax.swing.*;

public class LeapYear extends JFrame{
    private JPanel jpanel;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JLabel InputYear;
    public LeapYear(){
        btnCheckYear.addActionListener(e->{
        int year = Integer.parseInt(tfYear.getText());
            if(year%4==0){
                if(year%400!=0){
                    JOptionPane.showMessageDialog(this,"Not a leap year");
                    return;
                }
                JOptionPane.showMessageDialog(this,"Leap year");
                return;
            }
            JOptionPane.showMessageDialog(this,"Not a leap year");
            return;
        });
    }

    public static void main(String[] args){
        LeapYear app = new LeapYear();
        app.setContentPane(app.jpanel);
        app.setSize(500,300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}

