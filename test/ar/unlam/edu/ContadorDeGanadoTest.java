package ar.unlam.edu;

import junit.framework.Assert;

import org.junit.Test;

public class ContadorDeGanadoTest {

	@SuppressWarnings("deprecation")
	@Test
	public void queUnContadorInicieEnCero() {
		// 1. Preparaci�n
		ContadorDeGanado miContadorDeGanado = new ContadorDeGanado();
		Integer valorEsperado = 0;
		// 2. Ejecuci�n
		Integer cantidadActual = miContadorDeGanado.mostrarCantidad();
		// 3. Contrastaci�n
		Assert.assertEquals(valorEsperado, cantidadActual);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void queElcontadorCuenteUno() {
		ContadorDeGanado miContadorDeGanado = new ContadorDeGanado();
		Integer valorEsperado = 1;
		miContadorDeGanado.contar();
		Integer cantidadActual = miContadorDeGanado.mostrarCantidad();
		Assert.assertEquals(valorEsperado, cantidadActual);
		
	}

	
	@SuppressWarnings("deprecation")
	@Test
	public void queElContadorSeReinicie(){
		ContadorDeGanado miContadorDeGanado = new ContadorDeGanado();
		Integer valorEsperado = 0;
		miContadorDeGanado.contar();
		miContadorDeGanado.contar();
		miContadorDeGanado.reiniciar();
		Integer cantidadActual = miContadorDeGanado.mostrarCantidad();
		Assert.assertEquals(valorEsperado, cantidadActual);
		
	}
	
}
