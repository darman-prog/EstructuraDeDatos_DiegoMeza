/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apunab_proyectoestructuras.Utils;

/**
 *
 * @author damez
 */
public class ValidacionesRegistro {

    public static boolean validarCorreo(String correo) {
        String regex = "^[A-Za-z0-9._%+-]+@unab\\.edu\\.co$";
        return correo != null && correo.matches(regex);
    }

    public static boolean validarUsuario(String usuario) {
        return usuario != null && usuario.length() >= 8;
    }

    public static boolean validarContraseña(char[] contraseña) {
        return contraseña != null && contraseña.length >= 8;
    }
}
