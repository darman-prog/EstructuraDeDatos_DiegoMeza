/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apunab_proyectoestructuras;

import apunab_proyectoestructuras.PanelsPadiluck.LoginApunabPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class APUNAB_ProyectoEstructuras {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("PadiLuck");
        LoginApunabPanel panelLogin = new LoginApunabPanel();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        ventana.setSize(pantalla.width, pantalla.height);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setUndecorated(false); 
        ventana.getContentPane().add(panelLogin);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

}
