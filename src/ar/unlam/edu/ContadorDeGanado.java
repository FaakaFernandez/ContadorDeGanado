package ar.unlam.edu;

public class ContadorDeGanado {

	private Integer cantidad;
	
	public ContadorDeGanado(){
		this.cantidad = 0;
	}
	
	public void contar() {
		cantidad = cantidad + 1;
		
	}
	
	public Integer mostrarCantidad(){
		return cantidad;
	}
	
	public void reiniciar(){
		cantidad = 0;
	}
	
}
