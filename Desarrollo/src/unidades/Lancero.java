package unidades;

public class Lancero extends Unidad {

	public Lancero(final int posX, final int posY) {
		this.salud = 150;
		this.danio = 25;
		this.rangoInfAtqADist = 1;
		this.rangoSupAtqADist = 3;
		this.posX = posX;
		this.posY = posY;

	}

	@Override
	public void atacarA(Unidad otraUnidad) {
		double distHastaUnid = distanciaHasta(otraUnidad);
		if (distHastaUnid >= this.rangoInfAtqADist && distHastaUnid <= rangoSupAtqADist && otraUnidad.salud > 0) {
			otraUnidad.esAtacado(danio);
		}

	}

}
