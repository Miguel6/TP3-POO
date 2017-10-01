package monturas.caballos;


public class Caballo {

	private EstadoCaballo estado = new Normal();

	public void jineteAtaco() {
		estado.jineteAtaco();
	}
	
	public EstadoCaballo getEstado() {
		return estado;
	}
	public void beber() {
		estado = estado.tomar();
	}
}
