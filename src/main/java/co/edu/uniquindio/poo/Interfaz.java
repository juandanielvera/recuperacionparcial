package co.edu.uniquindio.poo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Interfaz extends JFrame {
final private Font mainFont = new Font("Segos print", Font.BOLD, 18);
JTextField tfFristName, tfLastName, tfAccountNumber, tfBalance;
JLabel lbWelcome;


    public void initialize(){
      // Etiquetas
 
        JLabel lblFirstName = new JLabel("Nombres:");
        lblFirstName.setFont(mainFont);

        tfFristName = new JTextField();
        tfFristName.setFont(mainFont);    

        JLabel lblLastName = new JLabel("Apellidos:");
        lblLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JLabel lblAccountNumber = new JLabel("Numero de cuenta:");
        lblAccountNumber.setFont(mainFont);

        tfAccountNumber = new JTextField();
        tfAccountNumber.setFont(mainFont);

        JLabel lblBalance = new JLabel("Saldo");
        lblBalance.setFont(mainFont);

        tfBalance = new JTextField("0");
        tfBalance.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(8,1,5,5));
        formPanel.add(lblFirstName);
        formPanel.add(tfFristName);
        formPanel.add(lblLastName);
        formPanel.add(tfLastName);
        formPanel.add(lblAccountNumber);
        formPanel.add(tfAccountNumber);
        formPanel.add(lblBalance);
        formPanel.add(tfBalance);

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);


        JButton btnCrearCuenta = new JButton("Crear cuenta");
        btnCrearCuenta.setFont(mainFont);
        btnCrearCuenta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 String firstName = tfFristName.getText();
                 String lastName = tfLastName.getText();
                 lbWelcome.setText("Hola" + " " + firstName + " " + lastName + ", su cuenta ha sido creada. ");
            }
            
        });

        JPanel buttoPanel = new JPanel();
        buttoPanel.setLayout(new GridLayout(1, 1, 5, 5));
        buttoPanel.add(btnCrearCuenta);

        JPanel maiPanel = new JPanel();
        maiPanel.setLayout(new BorderLayout());
        maiPanel.setBackground(new Color(128, 128, 128));
        maiPanel.setBorder(BorderFactory.createEmptyBorder());
        maiPanel.add(formPanel, BorderLayout.NORTH);
        maiPanel.add(lbWelcome, BorderLayout.CENTER);
        maiPanel.add(buttoPanel, BorderLayout.SOUTH);

        add(maiPanel);

        // Propiedades de la interfaz 
        setTitle("Cuenta");
        setSize(500, 600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){ 
        Interfaz myInterface = new Interfaz();
        myInterface.initialize();
    }
}