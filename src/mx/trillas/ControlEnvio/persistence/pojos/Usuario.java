package mx.trillas.ControlEnvio.persistence.pojos;
// Generated 19/04/2016 10:31:08 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
     private Tiposusuario tiposusuario;
     private String name;
     private String password;
     private String username;
     private Set guias = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(Tiposusuario tiposusuario, String name, String password, String username) {
        this.tiposusuario = tiposusuario;
        this.name = name;
        this.password = password;
        this.username = username;
    }
    public Usuario(Tiposusuario tiposusuario, String name, String password, String username, Set guias) {
       this.tiposusuario = tiposusuario;
       this.name = name;
       this.password = password;
       this.username = username;
       this.guias = guias;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Tiposusuario getTiposusuario() {
        return this.tiposusuario;
    }
    
    public void setTiposusuario(Tiposusuario tiposusuario) {
        this.tiposusuario = tiposusuario;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public Set getGuias() {
        return this.guias;
    }
    
    public void setGuias(Set guias) {
        this.guias = guias;
    }
}


