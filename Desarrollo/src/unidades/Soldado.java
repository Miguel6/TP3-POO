package unidades;

public class Soldado extends Unidad {

	public Soldado(final int posX, final int posY) {
		this.salud = 200;
		this.energia = 100;
		this.daño = 10;
		this.rangoInfAtqADistancia = 0;
		this.rangoSupAtqADistancia = 0;
		this.posX = posX;
		this.posY = posY;
	}

	@Override
	public void atacarA(Unidad otraUnidad) {
		if (distanciaHasta(otraUnidad) == 0 && otraUnidad.salud > 0 && this.energia >= 10) {
			otraUnidad.esAtacado(daño);
			this.energia-=10;
		}
	}

}
