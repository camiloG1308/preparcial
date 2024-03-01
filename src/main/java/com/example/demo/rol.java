package com.example.demo;
import java.util.List;

import jakarta.persistence.*;
@Entity

public class rol {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "rol")
    private List<usuario> usuario;
    

	public rol(Long id, String nombre, List<usuario> usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.usuario = usuario;
	}


	public rol() {
		super();
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


	public List<usuario> getUsuario() {
		return usuario;
	}


	public void setUsuario(List<usuario> usuario) {
		this.usuario = usuario;
	}
	
	
	
    
}
