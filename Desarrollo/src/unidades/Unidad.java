package unidades;

public abstract class Unidad {

	protected int salud;
	protected int energia;
	protected int rangoInfAtqADistancia, rangoSupAtqADistancia;
	protected int daño;
	protected int posX;
	protected int posY;

	// Metodos Abstractos
	protected abstract void atacarA(Unidad otraUnidad);

	// Metodos Implementados
	protected double distanciaHasta(Unidad otraUnidad) {
		double difEX=Math.pow(otraUnidad.getPosX()-this.posX,2);
		double difEY=Math.pow(otraUnidad.getPosY()-this.posY,2);
		return Math.sqrt(difEX+difEY);		
	}

	public int getSalud() {
		return this.salud;
	}

	public int getDaño() {
		return this.daño;
	}

	public int getEnergia() {
		return this.energia;
	}

	public int getPosX() {
		return this.posX;
	}

	public int getPosY() {
		return this.posY;
	}
}
