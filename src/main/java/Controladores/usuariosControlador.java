package Controladores;

import Views.Login;
import Views.MenuUsuario;
import modelo.Usuarios;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class usuariosControlador {

    private Login vista;

    public usuariosControlador(Login vista) {
        this.vista = vista;
    }


    public void actionPerformed(ActionEvent e) {
        String nombre = vista.getNombree();
        String contraseña = vista.getContraseña();

        if(Usuarios.validarUsuario(nombre, contraseña)){
            MenuUsuario menu = new MenuUsuario();
            menu.setVisible(true);
            vista.dispose();
        }else {
            JOptionPane.showMessageDialog(vista, "Usuario o Contraseña no validos");
        }
    }

}
