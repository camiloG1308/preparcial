package com.example.demo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class usuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name ="nombre")
    private String nombre;
	@Column(name ="email")
    private String email;

    @ManyToOne
    @JoinColumn (name = "rol_id", referencedColumnName= "id")
    private rol rol;
    

	public usuario() {
		super();
	}


	public usuario(Long id, String nombre, String email, com.example.demo.rol rol) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.rol = rol;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public rol getRol() {
		return rol;
	}


	public void setRol(rol rol) {
		this.rol = rol;
	}
	

   
	

}
