package unidades;

import items.Consumible;
import posicion.Punto;

public class Lancero extends Unidad {

	public Lancero(final Punto posi) {
		this.salud = 150;
		this.danio = 25;
		this.rangoInfAtqADist = 1;
		this.rangoSupAtqADist = 3;
		this.posi = posi;
	}

	@Override
	protected boolean puedoAtacar(Unidad unit) {
		double distHastaUnid = this.posi.distanciaCon(unit.getPosi());
		
		if (distHastaUnid >= this.rangoInfAtqADist && distHastaUnid <= rangoSupAtqADist && unit.salud > 0) 
			return true;
		
		return false;
	}

	@Override
	public boolean puedeSerConsumido(Consumible item) {
		return false;
	}

	@Override
	public boolean usarConsumible(Consumible item) {
		return false;
	}
}
