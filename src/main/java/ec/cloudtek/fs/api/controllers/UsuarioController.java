package ec.cloudtek.fs.api.controllers;

import ec.cloudtek.fs.api.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "prueba")
    public List<String> prueba() {
        return List.of("Manzana", "Kiwi");
    }

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario user = new Usuario();
        user.setId(id);
        user.setNombre("Juan");
        user.setApellido("Apellido");
        user.setTelefono("564654");
        user.setMail("jlafuente@cloudtek.ec");
        return user;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {

        List<Usuario> users = new ArrayList<>();

        Usuario user1 = new Usuario();
        user1.setId(1L);
        user1.setNombre("Juan");
        user1.setApellido("Lafuente");
        user1.setTelefono("564654");
        user1.setMail("jlafuente@cloudtek.ec");

        Usuario user2 = new Usuario();
        user2.setId(2L);
        user2.setNombre("Carlos");
        user2.setApellido("Perz");
        user2.setTelefono("564654");
        user2.setMail("cperez@cloudtek.ec");

        Usuario user3 = new Usuario();
        user3.setId(3L);
        user3.setNombre("Alberto");
        user3.setApellido("Lampito");
        user3.setTelefono("564654");
        user3.setMail("alampito@cloudtek.ec");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }

    @RequestMapping(value = "usuario2")
    public Usuario updateUser() {
        Usuario user = new Usuario();
        user.setNombre("Juan");
        user.setApellido("Apellido");
        user.setTelefono("564654");
        user.setMail("jlafuente@cloudtek.ec");
        user.setPass("Pass123");
        return user;
    }

    @RequestMapping(value = "usuario3")
    public Usuario deleteUser() {
        Usuario user = new Usuario();
        user.setNombre("Juan");
        user.setApellido("Apellido");
        user.setTelefono("564654");
        user.setMail("jlafuente@cloudtek.ec");
        user.setPass("Pass123");
        return user;
    }

}
