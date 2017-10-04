package unidadesTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import posicion.Punto;
import unidades.Caballero;
import unidades.Soldado;


public class SoldadoTest {
	
	private Soldado s1;
	private Caballero c1;
	private Caballero c2;

	@Before
	public void setUp() {
		this.s1 = new Soldado(new Punto(0, 0));
		this.c1 = new Caballero(new Punto(0, 0));
		this.c2 = new Caballero(new Punto(4, 4));
	}
	@Test
	public void atacarSinEnergia(){
		for(int i=0;i<11;i++){
			s1.atacarA(c1);
		}
		Assert.assertEquals(100,c1.getSalud());
	}
	@Test
	public void atacarACaballero(){
		s1.atacarA(c1);
		Assert.assertEquals(190,c1.getSalud());
	}
	
	@Test
	public void atacarFueraDeRango(){
		s1.atacarA(c2);
		Assert.assertEquals(200, c2.getSalud());
	}
	
	@Test
	public void recuperarEnergia(){
		for(int i=0;i<10;i++){
			s1.atacarA(c1);
		}
		s1.beberPocion();
		Assert.assertEquals(25, s1.getEnergia());
	}
}
