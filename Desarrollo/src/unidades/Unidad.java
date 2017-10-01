package unidades;

public abstract class Unidad {
	
	protected int salud;
	protected int rangoInfAtqADist, rangoSupAtqADist;
	protected int danio;
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
	
	protected void esAtacado(int danioRecibido) {
		this.salud-=danioRecibido;
	}

	public int getSalud() {
		return this.salud;
	}

	public int getDa�o() {
		return this.danio;
	}

	public int getPosX() {
		return this.posX;
	}

	public int getPosY() {
		return this.posY;
	}
}
