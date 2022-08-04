package views;

import javax.swing.*;

public class ventana extends JFrame {

    public ventana(){
        this.setTitle("Ventana principal");
        this.setLocationRelativeTo(null);
        this.setSize(450,450);
    }
    private JPanel paneprincipal;
    private JTextField ingreseAlgoTextField;
    private JButton applyButton;
    private JLabel nombreLabel;
}
