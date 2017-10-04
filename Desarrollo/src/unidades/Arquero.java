package unidades;

import items.Consumible;
import posicion.Punto;

public class Arquero extends Unidad {

	private int cantFlechas = 20;

	
	/**
	 * Crea un arquero en la posicion indicada
	 * @param posX
	 * @param posY
	 */
	public Arquero(final Punto posi) {
		this.salud = 50;
		this.danio = 5;
		this.rangoInfAtqADist = 2;
		this.rangoSupAtqADist = 5;
		this.posi = posi;

	}
	
	@Override
	public boolean atacarA(Unidad otraUnidad) {
		if( super.atacarA(otraUnidad) )
		{
			this.cantFlechas--;
			return true;
		}
		return false;
	}

	@Override
	protected boolean puedoAtacar(Unidad unit) {
		double distHastaUnid = this.posi.distanciaCon(unit.getPosi());
		if (distHastaUnid >= this.rangoInfAtqADist && distHastaUnid <= rangoSupAtqADist && unit.salud > 0
				&& cantFlechas >= 1)
			return true;
		
		return false;
	}

	@Override
	public boolean puedeSerConsumido(Consumible item) {
		if(item == Consumible.PACK_DE_FLECHAS)
			return true;
		return false;
	}

	@Override
	public boolean usarConsumible(Consumible item) {
		if( ! puedeSerConsumido(item))
			return false;
		if(item == Consumible.PACK_DE_FLECHAS)
			cantFlechas+=6;
		return true;
	}
}
