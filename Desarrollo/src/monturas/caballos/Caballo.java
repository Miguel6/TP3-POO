package monturas.caballos;


public class Caballo {

	private int cantDeAtaques;
	private EstadoCaballo estado = new Normal();

	public Caballo() {
		this.cantDeAtaques = 0;
	}
	public void jineteAtaco() {

		if(cantDeAtaques == 3)
			this.estado = new Rebelde();
		else
			cantDeAtaques++;
	}
	public EstadoCaballo getEstado() {
		return estado;
	}
	public void beber() {
		estado = estado.tomar();
	}
	
}
