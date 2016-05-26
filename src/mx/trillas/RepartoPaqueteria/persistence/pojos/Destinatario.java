package mx.trillas.RepartoPaqueteria.persistence.pojos;
// Generated 19/04/2016 10:31:08 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Destinatario generated by hbm2java
 */
public class Destinatario  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private Integer id;
     private Departamento departamento;
     private String nombre;
     private Set guias = new HashSet(0);

    public Destinatario() {
    }

	
    public Destinatario(Departamento departamento, String nombre) {
        this.departamento = departamento;
        this.nombre = nombre;
    }
    public Destinatario(Departamento departamento, String nombre, Set guias) {
       this.departamento = departamento;
       this.nombre = nombre;
       this.guias = guias;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getGuias() {
        return this.guias;
    }
    
    public void setGuias(Set guias) {
        this.guias = guias;
    }

    public String toString(){
    	return this.getNombre();
    }
}

