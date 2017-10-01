package unidades;

import monturas.caballos.Caballo;
import monturas.caballos.Normal;

public class Caballero extends Unidad {

	private Caballo caballo = new Caballo();

	private int cantPocAgua = 1;

	public Caballero(final int posX, final int posY) {
		this.salud = 200;
		this.daño = 50;
		this.rangoInfAtqADist = 1;
		this.rangoSupAtqADist = 2;
		this.posX = posX;
		this.posY = posY;

	}

	@Override
	public void atacarA(Unidad otraUnidad) {
		double distHastaUnid = distanciaHasta(otraUnidad);
		if (distHastaUnid >= this.rangoInfAtqADist && distHastaUnid <= rangoSupAtqADist && otraUnidad.salud > 0
				&& caballo.getEstado() instanceof Normal) {
			otraUnidad.esAtacado(daño);
			this.caballo.jineteAtaco();
		}

	}

	public void darDeBeberA(Caballo caballo) {
		if (this.cantPocAgua >= 1) {
			caballo.beber();
			this.cantPocAgua--;
		}

	}

}
