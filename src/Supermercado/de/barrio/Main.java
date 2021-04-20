package Supermercado.de.barrio;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static 	List<Productos> listaProductos  = new ArrayList<Productos>();
	public static void main(String[] args) {
		
		cargarLista();
		mostrarLista();		
		System.out.println("========================================================");		
		productoCaroyBarato(listaProductos);
	}
	
	public static void mostrarLista() {
		

		for(Productos producto : listaProductos) {
			System.out.println(producto);
		}
	}
	
	public static void cargarLista(){
		
		listaProductos.add(new Bebida("Coca-Cola zero", "Litros", 1.5, 20));
		listaProductos.add(new Bebida("Coca-Cola", "Litros", 1.5, 18));
		listaProductos.add(new Shampoo("Shampoo Sedal", "Contenido", 500, 19));
		listaProductos.add(new Fruta("Frutilla", "Unidad de venta", 1, 64));		
		}
	
	public static void productoCaroyBarato(List<Productos> listaProductos) {		
		Productos max;
		Productos min;		
		max = listaProductos.get(0);
		min = listaProductos.get(0);
		for(Productos producto : listaProductos) {
			if(max.compareTo(producto)<1){
				max = producto;
			}
			if(max.compareTo(producto)>1){
				min = producto;
			}
		}		
		System.out.println("Producto más caro: "+max.getNombre());
		System.out.println("Producto mas barato.: "+min.getNombre());
	}
	

}
