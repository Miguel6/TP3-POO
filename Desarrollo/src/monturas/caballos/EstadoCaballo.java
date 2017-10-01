package monturas.caballos;

public abstract class EstadoCaballo {

	protected int cantDeAtaques;
	public abstract EstadoCaballo tomar(); 
	
	public int getCantDeAtaques(){
		return this.cantDeAtaques;
	}
	public boolean equals(EstadoCaballo eC) {
		return (eC.cantDeAtaques ==this.cantDeAtaques);
	}
	public void jineteAtaco() {
		this.cantDeAtaques++;
	}
}
