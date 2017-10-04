package unidadesTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import posicion.Punto;
import unidades.Caballero;
import unidades.Lancero;

public class LanceroTest {

	private Lancero l1;
	private Caballero c1;
	private Caballero c2;

	@Before
	public void setUp() {
		this.l1 = new Lancero(new Punto(0, 0));
		this.c1 = new Caballero(new Punto(0, 2));
		this.c2 = new Caballero(new Punto(4, 4));
	}

	@Test
	public void matarCaballero() {
		for (int i = 0; i < 8; i++) {
			l1.atacarA(c1);
		}
		Assert.assertEquals(0, c1.getSalud());
	}

	@Test
	public void atacarCaballero() {
		l1.atacarA(c1);
		Assert.assertEquals(175, c1.getSalud());
	}
	
	@Test
	public void atacarFueraDeRango() {
		l1.atacarA(c2);
		Assert.assertEquals(200, c1.getSalud());
	}
}
