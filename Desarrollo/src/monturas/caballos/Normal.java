package monturas.caballos;

public class Normal extends EstadoCaballo {

	@Override
	public EstadoCaballo tomar() {
		return new Normal();
	}

}
