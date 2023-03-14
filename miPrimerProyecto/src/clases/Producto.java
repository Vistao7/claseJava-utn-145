package clases;

import java.time.LocalDate;

public class Producto {

	private String nombre;
	private String descripcion;
	private float precio;
	private LocalDate fechaAlta;
	private float pesoKg;
	
	private static final float precioMin = 0.1f;
	private static final float pesoKgMin = 0.1f;
	
	public Producto(String nombre) {
		this.nombre = nombre;
		this.setFechaAlta(LocalDate.now());
		this.setPrecio(precioMin);
		
	}
	
	// Setters
	
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	// Getters
	
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	
	public float getPrecio() {
		return precio;
	}
	
}
