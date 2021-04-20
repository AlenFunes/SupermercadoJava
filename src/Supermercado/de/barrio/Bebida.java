package Supermercado.de.barrio;

public class Bebida extends Productos{

	public Bebida(String nombre , String contenido , double cantidad , double precio) {
		super(nombre, contenido, cantidad, precio);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre : "+this.getNombre()+" /// "+ this.getContenido()+": "+String.format("%.0f",this.getCantidad())+" ///  Precio : "+" $"+String.format("%.0f", this.getPrecio());
	}
	


}
