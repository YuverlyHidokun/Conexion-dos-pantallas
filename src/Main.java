import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                miformulario dojo = new miformulario();
                dojo.setSize(400,500);
                dojo.setVisible(true);
                dojo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

    }
}