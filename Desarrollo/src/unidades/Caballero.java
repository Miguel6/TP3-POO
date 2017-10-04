package unidades;

import monturas.caballos.Caballo;
import monturas.caballos.Rebelde;
import posicion.Punto;

public class Caballero extends Unidad {

	private Caballo caballo = new Caballo();

	private int cantPocAgua = 1;

	public Caballero(final Punto posi) {
		this.salud = 200;
		this.danio = 50;
		this.rangoInfAtqADist = 1;
		this.rangoSupAtqADist = 2;
		this.posi = posi;

	}	

	public void darDeBeberACaballo() {
		if (this.cantPocAgua >= 1) {
			caballo.beber();
			this.cantPocAgua--;
		}

	}

	@Override
	protected boolean puedoAtacar(Unidad unit) {
		double distHastaUnid = posi.distanciaCon(unit.getPosi());

		if (distHastaUnid >= this.rangoInfAtqADist && distHastaUnid <= rangoSupAtqADist && unit.salud > 0
				&& !caballo.getEstado().equals(new Rebelde())) 
			return true;
		
		return false;
	}
}
