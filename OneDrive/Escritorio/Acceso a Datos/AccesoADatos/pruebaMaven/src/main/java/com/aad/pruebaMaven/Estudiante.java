package com.aad.pruebaMaven;

public class Estudiante {

	private int id;
	private String Nombre;
	private String Apellido;
	private String Modulo;
	
	public Estudiante(Integer id, String Nombre, String Apellido, String Modulo) {
		this.id = id;
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Modulo = Modulo;
	}
	
	public Estudiante()	{
		super();
	}
	
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return Nombre;
	}
 
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getApellido() {
		return Nombre;
	}
 
	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}

	public String getModulo() {
		return Modulo;
	}
 
	public void setModulo(String Modulo) {
		this.Modulo = Modulo;
	}
}