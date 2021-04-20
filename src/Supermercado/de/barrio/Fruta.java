package Supermercado.de.barrio;

public class Fruta extends Productos{

	public Fruta(String nombre , String contenido , double cantidad , double precio) {
		super(nombre, contenido, cantidad, precio );
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre : " + this.getNombre() +" /// Precio :" +" $"+String.format("%.0f", this.getPrecio()) + " /// " + this.getContenido()+ ": "+ String.format("%.0f",this.getCantidad())+" Kilo";
	}

}
