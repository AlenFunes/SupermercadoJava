package Supermercado.de.barrio;

public abstract class Productos implements Comparable<Productos>{
	private String nombre;
	private String contenido;
	private double cantidad;
	private double precio;

public Productos(String nombre , String contenido , double cantidad , double precio) {
	this.nombre = nombre;
	this.contenido = contenido ;
	this.cantidad = cantidad ;
	this.precio = precio;	
}
public String getNombre() {
	return nombre;
}
public String getContenido() {
	return contenido;
}
public double getCantidad() {
	return cantidad;
}
public double getPrecio() {
	return precio;
}
public abstract String toString();

@Override
public int compareTo(Productos arg0) {
	int comparable = 0;
	if(this.getPrecio()>arg0.getPrecio()) {
		comparable=1;
	}
	else if (this.getPrecio()<arg0.getPrecio()) {
		comparable=-1;
	}
	return comparable;
	}
}