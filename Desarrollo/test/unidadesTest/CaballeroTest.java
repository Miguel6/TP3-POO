package unidadesTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import unidades.Caballero;

public class CaballeroTest {
	
	private Caballero c1;
	private Caballero c2;
	
	@Before
	public void setUp() {
		this.c1 = new Caballero(0,0);
		this.c2 = new Caballero(0,1);
	}
	
	@Test
	public void caballeroVsCaballero() {
		this.c1.atacarA(this.c2);
		Assert.assertEquals(150, c2.getSalud());
	}
	
	@Test
	public void caballeroCaballoRebelde() {
		this.c1.atacarA(this.c2);
		this.c1.atacarA(this.c2);
		this.c1.atacarA(this.c2);
		this.c1.atacarA(this.c2);
		
		Assert.assertEquals(50, c2.getSalud());
	}

	@Test
	public void caballoRebeldeANormal() {
		this.c1.atacarA(this.c2);
		this.c1.atacarA(this.c2);
		this.c1.atacarA(this.c2);
		this.c1.darDeBeberACaballo();
		this.c1.atacarA(this.c2);
		
		Assert.assertEquals(0, c2.getSalud());
	}
	
	@Test
	public void caballeroVsCaballeroFueraDeRango(){
		Caballero c3 = new Caballero(3, 4);
		c1.atacarA(c3);
		Assert.assertEquals(200,c3.getSalud());
	}
	
	@Test
	public void caballoQuePasaDeRebeldeANormalYDevueltaARebelde(){
		Caballero c3 = new Caballero(1,0);
		c1.atacarA(c3);
		c1.atacarA(c3);
		c1.atacarA(c3);
		c1.darDeBeberACaballo();
		c1.atacarA(c3);
		
		c1.atacarA(c2);
		c1.atacarA(c2);
		c1.atacarA(c2);
		Assert.assertEquals(0, c3.getSalud());
		Assert.assertEquals(100, c2.getSalud());
	}
}
