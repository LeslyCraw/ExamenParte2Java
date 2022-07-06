package com.ids.examenjava.examen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "empleados")
public class Empleados {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)// indica que id es autoincrementable
	@Column(unique = true, nullable = false)
    private int id;
	private String nombre;
	private String apellido;
	
	// relación  con la tabla de Ciudades
//	@OneToOne
//	@JoinColumn(name = "idciudad")
//	private Ciudades ciudad;
	
	//relacion co la tabla Lenguas
//	@ManyToMany
//	@JoinColumn(name="idlengua")
//	private Lenguas lengua;
//	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
//	public Ciudades getCiudad() {
//		return ciudad;
//	}
//	public void setCiudad(Ciudades ciudad) {
//		this.ciudad = ciudad;
//	}
//	public Lenguas getLengua() {
//		return lengua;
//	}
//	public void setLengua(Lenguas lengua) {
//		this.lengua = lengua;
//	}
	
	
}