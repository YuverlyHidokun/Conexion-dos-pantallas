import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class operaciones extends JFrame {
    private JTextField val1sum;
    private JTextField val1res;
    private JButton SumBtn;
    private JButton ResBtn;
    private JTextField val2sum;
    private JTextField val2res;
    private JTextField val3sum;
    private JTextField val3res;
    private JPanel JPane2;

    public operaciones(){
        super("Operaciones");
        setContentPane(JPane2);

        SumBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor1sum = val1sum.getText();
                String valor2sum = val2sum.getText();
                try{
                    double num1 = Double.parseDouble(valor1sum);
                    double num2 = Double.parseDouble(valor2sum);
                    double res = num1 + num2;
                    val3sum.setText(String.valueOf(res));
                }catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Ingrese números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        ResBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor1res = val1res.getText();
                String valor2res = val2res.getText();

                try {
                    double num3 = Double.parseDouble(valor1res);
                    double num4 = Double.parseDouble(valor2res);
                    double respu = num3-num4;
                    val3res.setText(String.valueOf(respu));
                }catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,"Ingrese numeros validos", "Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }
}
