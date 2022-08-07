package ec.cloudtek.fs.api.dao;

import ec.cloudtek.fs.api.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getUsers() {

        String query = "FROM Usuario";

        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void createUser() {

    }
}
