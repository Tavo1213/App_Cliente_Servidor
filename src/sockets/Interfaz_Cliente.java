package sockets;

import javax.swing.*;
import sockets.Connection;

import java.io.IOException;

public class Interfaz_Cliente extends JFrame {
    private JPanel jPanel;
    public JLabel lb1;
    private JButton btnEnviar;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel lbMonto;

    public Interfaz_Cliente(){
        setContentPane(jPanel);
        setTitle("Prueba");
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

    }

}
