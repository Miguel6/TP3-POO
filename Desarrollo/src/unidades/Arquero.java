package unidades;

public class Arquero extends Unidad {

	private int cantFlechas = 20;

	public Arquero(final int posX, final int posY) {
		this.salud = 50;
		this.danio = 5;
		this.rangoInfAtqADist = 2;
		this.rangoSupAtqADist = 5;
		this.posX = posX;
		this.posY = posY;

	}

	@Override
	public void atacarA(Unidad otraUnidad) {
		double distHastaUnid = distanciaHasta(otraUnidad);
		if (distHastaUnid >= this.rangoInfAtqADist && distHastaUnid <= rangoSupAtqADist && otraUnidad.salud > 0
				&& cantFlechas >= 1) {
			otraUnidad.esAtacado(danio);
			this.cantFlechas--;
		}

	}

}
