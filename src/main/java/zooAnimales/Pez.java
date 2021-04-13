package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal  {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();

	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas) {
	
		super.nombre =nombre;
		super.edad =edad;
		super.habitat =habitat;
		super.genero =genero;
		this.listado =listado;
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		super.totalAnimales++;
		listado.add(this);
		
		
	
	}
	
	public Pez(){
		listado.add(this);
	}
	
	
	public String movimiento(){
		return "nadar";
		
		
	}
	
	
	public static ArrayList<Pez> getPeces() {
		return listado;
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}

	public int getCantidadAletas() {
		return this.cantidadAletas;
	}

	public static Animal crearSalmon(String nombre, int edad, String genero){
		salmones++;
		return new Pez(nombre,edad,"oceano",genero,"rojo",6);
		
		
	}


	public static Animal crearBacalao(String nombre, int edad, String genero){
		bacalaos++;
		return new Pez(nombre,edad,"gris",genero,"rojo",6);
		
		
	}



}