import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class miformulario extends JFrame {
    private JTextField valusuario;
    private JTextField valcontraseña;
    private JButton ingresarButton;
    private JButton limpiarButton;
    private JPanel JPane1;
    private JLabel validar;

    public miformulario(){
        super("Prueba");
        setContentPane(JPane1);

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String validarusu = valusuario.getText();
                String validarcontra= valcontraseña.getText();

                String usuario = "Yuverly";
                String contraseña = "Hidokun2003.y";

                if (validarusu.equals(usuario) && validarcontra.equals(contraseña)){
                    validar.setText("Credenciales correctas");
                    operaciones oper = new operaciones();
                    oper.setSize(900,600);
                    oper.setVisible(true);
                    oper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }else{
                    validar.setText("Credenciales incorrectas");
                }
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valusuario.setText("");
                valcontraseña.setText("");
            }
        });
    }
}
