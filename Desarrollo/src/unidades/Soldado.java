package unidades;

import items.Consumible;
import posicion.Punto;

public class Soldado extends Unidad {

	private int energia;
	private int cantPocAgua = 1;

	public Soldado(final Punto posi) {
		this.salud = 200;
		this.energia = 100;
		this.danio = 10;
		this.rangoInfAtqADist = 0;
		this.rangoSupAtqADist = 0;
		this.posi = posi;
	}

	@Override
	public boolean atacarA(Unidad otraUnidad) {
		if( super.atacarA(otraUnidad) )
		{
			this.energia-=10;
			return true;
		}
		return false;
	}

	public int getEnergia() {
		return this.energia;
	}
	
	public void beberPocion() {
		if (this.cantPocAgua > 0)
		{
			this.cantPocAgua--;
			this.energia+=25;
		}
	}

	@Override
	protected boolean puedoAtacar(Unidad unit) {
		if (this.posi.distanciaCon(unit.getPosi()) == 0 && unit.salud > 0 && this.energia >= 10)
			return true;
		return false;
	}

	@Override
	public boolean puedeSerConsumido(Consumible item) {
		if( item == Consumible.POCION_DE_AGUA )
			return true;
		return false;
	}

	@Override
	public boolean usarConsumible(Consumible item) {
		if( ! puedeSerConsumido(item))
			return false;
		
		if( item == Consumible.POCION_DE_AGUA )
			this.energia+=25;
		return true;
	}

}
