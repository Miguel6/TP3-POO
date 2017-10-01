package monturas.caballos;

public class Rebelde extends EstadoCaballo{

	@Override
	public EstadoCaballo tomar() {
		return new Normal();
	}

}
