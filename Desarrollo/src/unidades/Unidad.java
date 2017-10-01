package unidades;

public abstract class Unidad {

	protected int salud;
	protected int rangoInfAtqADistancia, rangoSupAtqADistancia;
	protected int da�o;
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
	
	protected void esAtacado(int da�oRecibido) {
		this.salud-=da�oRecibido;
	}

	public int getSalud() {
		return this.salud;
	}

	public int getDa�o() {
		return this.da�o;
	}

	public int getPosX() {
		return this.posX;
	}

	public int getPosY() {
		return this.posY;
	}
}
