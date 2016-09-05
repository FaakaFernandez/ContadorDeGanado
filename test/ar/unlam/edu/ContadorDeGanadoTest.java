package ar.unlam.edu;

import junit.framework.Assert;

import org.junit.Test;

public class ContadorDeGanadoTest {

	@SuppressWarnings("deprecation")
	@Test
	public void queUnContadorInicieEnCero() {
		// 1. Preparación
		ContadorDeGanado miContadorDeGanado = new ContadorDeGanado();
		Integer valorEsperado = 0;
		// 2. Ejecución
		Integer cantidadActual = miContadorDeGanado.mostrarCantidad();
		// 3. Contrastación
		Assert.assertEquals(valorEsperado, cantidadActual);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void queElcontadorPuedaContar() {
		ContadorDeGanado miContadorDeGanado = new ContadorDeGanado();
		
		Integer valorInicial = 0;
		Integer cantidadInicial = miContadorDeGanado.mostrarCantidad();
		
		Assert.assertEquals(valorInicial, cantidadInicial);
		
		miContadorDeGanado.contar();
		
		Integer valorEsperado = 1;
		Integer cantidadFinal = miContadorDeGanado.mostrarCantidad();
		
		Assert.assertEquals(valorEsperado, cantidadFinal);
		
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
