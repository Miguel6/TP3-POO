package unidadesTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import items.Carcaj;
import items.CarcajException;
import posicion.Punto;
import unidades.Arquero;
import unidades.Caballero;

public class ArqueroTest {

	private Arquero a1;
	private Caballero c2;
	
	@Before
	public void setUp() {
		this.a1 = new Arquero(new Punto(0,0));
		this.c2 = new Caballero(new Punto(0,2));
		
	}
	
	@Test
	public void atacarFueraDeRango(){
		Caballero c3 = new Caballero(new Punto(20, 15));
		a1.atacarA(c3);
		Assert.assertEquals(200, c3.getSalud());
	}
	@Test
	public void muerteDeArquero(){
		c2.atacarA(a1);
		Assert.assertEquals(0, a1.getSalud());
	}
	@Test
	public void arqueroAtacaSinFlechas() throws CarcajException{
		for(int i=0;i<21;i++){
			a1.atacarA(c2);
			System.out.println(a1.getCantFlechas());
		}
		
		Assert.assertEquals(100, c2.getSalud());
	}
	@Test
	public void arqueroRecargaFlechas() throws CarcajException{
		Carcaj carcaj1 = new Carcaj(20);
		a1.recargarFechas(carcaj1);
		for(int i=0;i<40;i++)
			a1.atacarA(c2);
		
		Assert.assertEquals(0, c2.getSalud());
	}
}
