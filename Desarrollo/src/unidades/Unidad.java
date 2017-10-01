package unidades;

public abstract class Unidad {

	protected int salud;
	protected int distanciaDeAtaque;
	public abstract void atacarA(Unidad otraUnidad);
	
	public int getSalud() {
		return salud;
	}
}
