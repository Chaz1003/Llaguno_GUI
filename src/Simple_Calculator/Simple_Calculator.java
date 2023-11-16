package Simple_Calculator;

import javax.swing.*;

public class Simple_Calculator extends JFrame {

    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JPanel jpanel;
    private JLabel Result;
    private JTextField lblResult;

    public Simple_Calculator(){
        btnCompute.addActionListener(e->{
            double num1 = Double.parseDouble(tfNumber1.getText());
            double num2 = Double.parseDouble(tfNumber2.getText());
            if(cbOperations.getSelectedIndex()==0){
                lblResult.setText(String.valueOf(num1+num2));
                return;
            } else if(cbOperations.getSelectedIndex()==1){
                lblResult.setText(String.valueOf(num1-num2));
                return;
            }else if(cbOperations.getSelectedIndex()==2){
                lblResult.setText(String.valueOf(num1*num2));
                return;
            }
            lblResult.setText(String.valueOf(num1/num2));

        });
    }

    public static void main(String[] args) {
        Simple_Calculator app = new Simple_Calculator();
        app.setContentPane(app.jpanel);
        app.setSize(700,300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");
    }

}
