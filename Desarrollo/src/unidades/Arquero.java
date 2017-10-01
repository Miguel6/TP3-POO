package unidades;

public class Arquero extends Unidad {

	private int cantFlechas = 20;

	public Arquero(final int posX, final int posY) {
		this.salud = 50;
		this.da�o = 5;
		this.rangoInfAtqADist = 2;
		this.rangoSupAtqADist = 5;
		this.posX = posX;
		this.posY = posY;

	}

	@Override
	public void atacarA(Unidad otraUnidad) {
		double distanciaHastaUnidad = distanciaHasta(otraUnidad);
		if (distanciaHastaUnidad >= this.rangoInfAtqADist && distanciaHastaUnidad <= rangoSupAtqADist
				&& otraUnidad.salud > 0 && cantFlechas>=1) {
			otraUnidad.esAtacado(da�o);
			this.cantFlechas--;
		}

	}

}
