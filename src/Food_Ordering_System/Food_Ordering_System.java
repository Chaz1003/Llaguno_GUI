package Food_Ordering_System;

import javax.swing.*;

public class Food_Ordering_System extends JFrame{

    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JPanel jpanel;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    public Food_Ordering_System() {
        btnOrder.addActionListener(e->{
            double price = 0;
            if(cBurger.isSelected()){
                price+=80;
            }
            if(cPizza.isSelected()){
                price+=100;
            }
            if(cFries.isSelected()){
                price+=65;
            }
            if(cSoftDrinks.isSelected()){
                price+=55;
            }
            if(cTea.isSelected()){
                price+=50;
            }
            if(cSundae.isSelected()){
                price+=40;
            }
            if(rb5.isSelected()){
                price-=(price*0.05);
            }else if(rb10.isSelected()){
                price-=(price*0.1);
            }else if(rb15.isSelected()){
                price-=(price*0.15);
            }else{
                price*=1;
            }
            JOptionPane.showMessageDialog(this,"The total price is " + String.format("%.2f",price));
        });

    }

    public static void main(String[] args) {
        Food_Ordering_System app = new Food_Ordering_System();
        app.setContentPane(app.jpanel);
        app.setSize(500,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
}
