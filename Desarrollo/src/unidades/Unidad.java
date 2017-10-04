package unidades;

import items.UsarConsumible;
import posicion.Punto;

public abstract class Unidad implements UsarConsumible {
	
	protected int salud;
	protected int rangoInfAtqADist, rangoSupAtqADist;
	protected int danio;
	protected Punto posi; 
	

	// Metodos Abstractos
	protected abstract boolean puedoAtacar(Unidad unit);

	
	// Metodos Implementados
	public boolean atacarA(Unidad otraUnidad){
		if(puedoAtacar(otraUnidad)){
			otraUnidad.recibirDanio( this.calcularDanioPropio() );
			return true;
		}
		return false;
	}
	
	
	protected int calcularDanioPropio(){
		return this.danio;
	}
	
	
	protected int calcularDanioRecibido(int danioOponente){
		return danioOponente;
	}
	

	protected void recibirDanio(int danioOponente){
		int danioNeto= this.calcularDanioRecibido( danioOponente );
		
		if(this.salud - danioNeto <= 0)
			this.salud = 0;
		else
			this.salud -= danioNeto;
	}
		

	public int getSalud() {
		return this.salud;
	}

	public int getDanio() {
		return this.danio;
	}

	public Punto getPosi(){
		return this.posi;
	}
}