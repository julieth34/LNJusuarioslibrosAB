/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuarioslnj;

/**
 *
 * @author Asus
 */
public class UsuariosLNJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    usuarioslnj.dao.UsuarioDAO dao = new usuarioslnj.dao.UsuarioDAO();

    // Insertar un nuevo usuario
    usuarioslnj.model.Usuario nuevo = new usuarioslnj.model.Usuario("Carlos", "carlos@email.com");
    dao.insertar(nuevo);

    // Listar todos los usuarios
    for (usuarioslnj.model.Usuario u : dao.listar()) {
        System.out.println(u.getId() + " - " + u.getNombre() + " - " + u.getCorreo());
    }
}

    }
    

