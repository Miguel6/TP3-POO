package monturas.caballos;

public class Normal extends EstadoCaballo {

	public Normal() {
		this.cantDeAtaques=0;
	}
	@Override
	public EstadoCaballo tomar() {
		return new Normal();
	}

}
