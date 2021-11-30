package com.aad.pruebaMaven;

public class Empleado {

	private String dni;
	private String NomEmp;
	
	public Empleado(String dni, String NomEmp)	{
		this.dni = dni;
		this.NomEmp = NomEmp;
	}
	
	public Empleado()	{
		super();
	}
	
	public String getDni()	{
		return dni;
	}
	
	public void setDni(String dni)	{
		this.dni = dni;
	}
	
	public String getNomEmp()	{
		return NomEmp;
	}
	
	public void setNomEmp(String NomEmp)	{
		this.NomEmp = NomEmp;
	}
}