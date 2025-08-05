package gui;

import javax.swing.*;
import java.awt.*;
import logica.ValidadorIP;

public class VentanaPrincipal extends JFrame {
    private JTextField txtIpInicio, txtIpFin;
    private JButton btnEscanear, btnLimpiar;

    public VentanaPrincipal() {
        setTitle("Escáner de Red - TP");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("IP de inicio:"));
        txtIpInicio = new JTextField();
        add(txtIpInicio);

        add(new JLabel("IP de fin:"));
        txtIpFin = new JTextField();
        add(txtIpFin);

        btnEscanear = new JButton("Escanear");
        btnEscanear.addActionListener(e -> escanear());
        add(btnEscanear);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(e -> limpiar());
        add(btnLimpiar);

        setVisible(true);
    }
    
    

    private void escanear() {
        String ipInicio = txtIpInicio.getText();
        String ipFin = txtIpFin.getText();

        if (!ValidadorIP.esValida(ipInicio) || !ValidadorIP.esValida(ipFin)) {
            JOptionPane.showMessageDialog(this, "Una o ambas IPs son inválidas.");
            return;
        }

        // En la entrega final: realizar escaneo real aquí
        JOptionPane.showMessageDialog(this, "IPs válidas. Escaneo no implementado aún.");
    }

    private void limpiar() {
        txtIpInicio.setText("");
        txtIpFin.setText("");
    }
}
