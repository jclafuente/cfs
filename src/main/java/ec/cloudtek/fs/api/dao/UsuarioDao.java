package ec.cloudtek.fs.api.dao;

import ec.cloudtek.fs.api.models.Usuario;

import java.util.List;

public interface UsuarioDao {


    public List<Usuario> getUsers();

    public void createUser();


}
