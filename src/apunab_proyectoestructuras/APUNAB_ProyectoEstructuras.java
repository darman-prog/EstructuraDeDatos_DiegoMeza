/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apunab_proyectoestructuras;

import java.awt.Dimension;
import java.awt.Toolkit;
/**
 *
 * @author damez
 */
public class APUNAB_ProyectoEstructuras extends LoginApunab{

    public static void main(String[] args) {
        LoginApunab Modificador = new LoginApunab();
        Modificador.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Modificador.setSize(pantalla.width, pantalla.height);
        Modificador.setTitle("APUNAB");
        Modificador.setVisible(true);

        
    }
    
}
