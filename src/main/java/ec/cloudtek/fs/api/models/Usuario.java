package ec.cloudtek.fs.api.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "user")
public class Usuario {


    @Id
    @Getter
    @Setter
    @Column(name = "id", nullable = false)
    private Long id;

    @Getter
    @Setter
    @Column(name = "nombre")
    private String nombre;

    @Getter
    @Setter
    @Column(name = "apellido")
    private String apellido;

    @Getter
    @Setter
    @Column(name = "telefono")
    private String telefono;

    @Getter
    @Setter
    @Column(name = "mail")
    private String mail;

    @Getter
    @Setter
    @Column(name = "pass")
    private String pass;

}
